package jp.co.kunisys.member.security;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import jp.co.kunisys.member.common.util.SUtil;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.AuthFunctionRecord;
import jp.co.kunisys.member.query.tables.records.UserAuthRecord;
import jp.co.kunisys.member.query.tables.records.UserInfoRecord;

/**
 * ユーザ認証プロバイダ
 */
@Component
public class AuthenticationProviderImpl implements AuthenticationProvider {

	/** ロガー */
	private static final Logger log = LoggerFactory.getLogger(AuthenticationProviderImpl.class);

	/** DSLContext */
	@Autowired
	private DSLContext create;

	/**
	 * ユーザ認証処理
	 */
	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		String account = auth.getName();
		String password = auth.getCredentials().toString();
		log.debug(String.format("ログイン処理:account=%s password=%s", account, password));

		//アカウント・パスワード入力チェック
		if (SUtil.isBlank(account) || SUtil.isBlank(password)) {
			throw new AuthenticationCredentialsNotFoundException("ログイン情報に不備があります。");
		}

		//ユーザ情報の検索
		List<UserInfoRecord> userList = this.create.selectFrom(Tables.USER_INFO)
													.where(Tables.USER_INFO.ACCOUNT.eq(account))
													.fetch();
		if (userList.isEmpty()) {
			throw new AuthenticationCredentialsNotFoundException("ログイン情報に不備があります。");
		}

		UserInfoRecord user = userList.get(0);
		//パスワードチェック
		if (!password.equals(user.getPassword())) {
			throw new AuthenticationCredentialsNotFoundException("ログイン情報に不備があります。");
		}

		List<SimpleGrantedAuthority> authorities = createAuthorities(user);
		LoginUser login = new LoginUser(user, authorities);
		return new UsernamePasswordAuthenticationToken(login, password, authorities);
	}

	/**
	 * 権限情報を作成する
	 * @param user ユーザ情報
	 * @return 権限情報
	 */
	private List<SimpleGrantedAuthority> createAuthorities(UserInfoRecord user) {
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		//権限情報取得
		UserAuthRecord authRec = this.create.selectFrom(Tables.USER_AUTH)
											.where(Tables.USER_AUTH.USER_ID.eq(user.getUserId()))
											.fetchOne();
		if (authRec == null) {
			return authorities;
		}
		//権限割当１
		createAssign(authRec.getAuthCd1(), authorities);
		//権限割当２
		createAssign(authRec.getAuthCd2(), authorities);
		//権限割当３
		createAssign(authRec.getAuthCd3(), authorities);
		//権限割当４
		createAssign(authRec.getAuthCd4(), authorities);
		//権限割当５
		createAssign(authRec.getAuthCd5(), authorities);

		return authorities;
	}

	/**
	 * 権限割当・機能権限を検索し、権限を追加する
	 * @param authCd 権限ID
	 * @param authorities 権限リスト
	 */
	private void createAssign(String authCd, List<SimpleGrantedAuthority> authorities) {
		if (SUtil.isBlank(authCd)) {
			return;
		}
		//権限割当・機能権限を検索し、権限を追加する
		this.create.select()
					//権限割当
					.from(Tables.AUTH_ASSIGN)
					//機能権限
					.innerJoin(Tables.AUTH_FUNCTION)
						.on(Tables.AUTH_ASSIGN.AUTH_FUNCTION_CD.eq(Tables.AUTH_FUNCTION.AUTH_FUNCTION_CD))
					.where(Tables.AUTH_ASSIGN.AUTH_CD.eq(authCd))
					.fetch().stream()
					.forEach(r -> {
						AuthFunctionRecord func = r.into(Tables.AUTH_FUNCTION);
						String className = SUtil.upperCase(SUtil.left(func.getClassName(), 6));
						String methodName = SUtil.upperCase(func.getActionName());
						String authName = String.format("ROLE_%s_%s", className, methodName);
						boolean exist = authorities.stream().anyMatch(a -> SUtil.equals(a.getAuthority(), authName));
						if (!exist) {
							authorities.add(new SimpleGrantedAuthority(authName));
						}
					});
	}

	@Override
	public boolean supports(Class<?> token) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(token);
	}

}

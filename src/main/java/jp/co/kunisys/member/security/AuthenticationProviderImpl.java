package jp.co.kunisys.member.security;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import jp.co.kunisys.member.query.tables.records.UserInfoRecord;
import jp.co.kunisys.member.repository.UserInfoRepository;

/**
 * ユーザ認証プロバイダ
 */
@Component
public class AuthenticationProviderImpl implements AuthenticationProvider {

	/** ロガー */
	private static final Logger log = LoggerFactory.getLogger(AuthenticationProviderImpl.class);

	/** ユーザ情報リポジトリ */
	@Autowired
	private UserInfoRepository userInfoRepository;

	/**
	 * ユーザ認証処理
	 */
	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		String account = auth.getName();
		String password = auth.getCredentials().toString();
		log.debug(String.format("ログイン処理:account=%s password=%s", account, password));

		if ("".equals(account) || "".equals(password)) {
			throw new AuthenticationCredentialsNotFoundException("ログイン情報に不備があります。");
		}

		List<UserInfoRecord> userList = this.userInfoRepository.findByAccount(account);
		if (userList.isEmpty()) {
			throw new AuthenticationCredentialsNotFoundException("ログイン情報に不備があります。");
		}

		UserInfoRecord user = userList.get(0);
		if (!password.equals(user.getPassword())) {
			throw new AuthenticationCredentialsNotFoundException("ログイン情報に不備があります。");
		}

		return new UsernamePasswordAuthenticationToken(new LoginUser(user, (List<? extends GrantedAuthority>) auth.getAuthorities()), password, auth.getAuthorities());
	}

	@Override
	public boolean supports(Class<?> token) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(token);
	}

}

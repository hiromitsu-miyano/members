package jp.co.kunisys.member.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import jp.co.kunisys.member.query.tables.records.UserInfoRecord;

/**
 * 認証ユーザ情報
 */
public class LoginUser implements UserDetails {

	/** ユーザID */
	private int userId;
	/** ユーザ名 */
	private String username;
	/** パスワード */
	private String password;

	private List<? extends GrantedAuthority> authorities;


	/**
	 * 現在ログイン中のユーザを返す
	 * @return ログインユーザ情報
	 */
	public static LoginUser getUser() {
		return (LoginUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

	/**
	 * コンストラクタ
	 * @param userInfo ユーザ情報
	 * @param authorityList 権限リスト
	 */
	public LoginUser(UserInfoRecord userInfo, List<? extends GrantedAuthority> authorityList) {
		this.userId = userInfo.getUserId();
		this.username = String.format("%s %s", userInfo.getLastname(), userInfo.getFirstname());
		this.password = userInfo.getPassword();
		this.authorities = authorityList;
	}

	/**
	 * ユーザIDを返す
	 * @return
	 */
	public int getUserId() {
		return this.userId;
	}

	/**
	 * ユーザ名を返す
	 */
	@Override
	public String getUsername() {
		return this.username;
	}

	/**
	 * パスワードを返す
	 */
	@Override
	public String getPassword() {
		return this.password;
	}

	/**
	 * 権限を返す
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}

package jp.co.kunisys.member.security;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import jp.co.kunisys.member.entity.UserInfo;

/**
 * 認証ユーザ情報
 */
public class LoginUser extends User {

	/**
	 * コンストラクタ
	 * @param userInfo ユーザ情報
	 * @param authorityList 権限リスト
	 */
	public LoginUser(UserInfo userInfo, List<? extends GrantedAuthority> authorityList) {
		super(userInfo.getAccount(), userInfo.getPassword(),true, true, true, true, authorityList);
	}
}

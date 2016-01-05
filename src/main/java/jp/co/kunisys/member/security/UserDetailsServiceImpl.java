package jp.co.kunisys.member.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import jp.co.kunisys.member.entity.UserInfo;
import jp.co.kunisys.member.repository.UserInfoRepository;

/**
 * 認証ユーザサービス
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

	/** ユーザ情報リポジトリ */
	@Autowired
	private UserInfoRepository userInfoRepository;

	/**
	 * ユーザ情報取得
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<UserInfo> userList = this.userInfoRepository.findByAccount(username);
		if (userList.isEmpty()) {
			throw new UsernameNotFoundException("ユーザが見つかりません。");
		}
		List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
		return new LoginUser(userList.get(0), authorityList);
	}

}

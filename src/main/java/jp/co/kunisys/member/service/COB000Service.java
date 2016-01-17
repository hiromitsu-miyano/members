package jp.co.kunisys.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import jp.co.kunisys.member.form.COB000Form;
import jp.co.kunisys.member.repository.UserInfoRepository;
import jp.co.kunisys.member.security.LoginUser;

@Service
public class COB000Service {

	@Autowired
	private UserInfoRepository userInfoRepository;


	/**
	 * パスワード変更処理
	 * @return
	 */
	public boolean changePassword(COB000Form form) {
		LoginUser login = (LoginUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (login.getPassword().equals(form.getOldPassword())) {
			return false;
		}

		return true;
	}
}

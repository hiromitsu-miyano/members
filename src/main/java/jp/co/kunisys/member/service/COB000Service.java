package jp.co.kunisys.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.kunisys.member.form.COB000Form;
import jp.co.kunisys.member.repository.TopMessageRepository;
import jp.co.kunisys.member.repository.UserInfoRepository;
import jp.co.kunisys.member.security.LoginUser;

@Service
public class COB000Service {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Autowired
	private TopMessageRepository topMessageRepository;

	public void searchMessageListLimit() {
		this.topMessageRepository.findAll();
	}

	/**
	 * パスワード変更処理
	 * @return
	 */
	public boolean changePassword(COB000Form form) {
		if (LoginUser.getUser().getPassword().equals(form.getOldPassword())) {
			return false;
		}

		return true;
	}
}

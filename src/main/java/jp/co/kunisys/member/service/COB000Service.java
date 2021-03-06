package jp.co.kunisys.member.service;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.kunisys.member.form.COB000Form;
import jp.co.kunisys.member.repository.TopMessageRepository;
import jp.co.kunisys.member.security.LoginUser;

@Transactional
@Service
public class COB000Service {

	@Autowired
	private TopMessageRepository topMessageRepository;

	@Autowired
	private DSLContext create;

	public void searchMessageListLimit() {
		this.topMessageRepository.findAllOrderById();
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

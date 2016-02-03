package jp.co.kunisys.member.service;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.kunisys.member.form.MTA020Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.AuthRecord;

/**
 * 権限情報一覧画面サービス
 */
@Service
public class MTA020Service {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * 権限の検索処理
	 * @param form フォーム
	 */
	public void searchAuthList(MTA020Form form) {
		List<AuthRecord> recList = this.create.selectFrom(Tables.AUTH)
												.orderBy(Tables.AUTH.SORTKEY.asc())
												.fetch();
		form.setAuthList(recList);
	}
}

package jp.co.kunisys.member.service;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.kunisys.member.form.MTC010Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.PostRecord;

/**
 * 職位メンテナンスサービス
 */
@Transactional
@Service
public class MTC010Service {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * 職位一覧の検索処理
	 * @param form フォーム
	 */
	public void searchPostList(MTC010Form form) {
		List<PostRecord> recList = this.create.selectFrom(Tables.POST)
													.fetch();
		form.setPostList(recList);
	}
}

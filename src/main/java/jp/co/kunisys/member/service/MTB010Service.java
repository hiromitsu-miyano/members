package jp.co.kunisys.member.service;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.kunisys.member.form.MTB010Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.DepartmentRecord;

/**
 * 部署メンテナンスサービス
 */
@Transactional
@Service
public class MTB010Service {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * 部署一覧の検索処理
	 * @param form フォーム
	 */
	public void searchDepartmentList(MTB010Form form) {
		List<DepartmentRecord> recList = this.create.selectFrom(Tables.DEPARTMENT)
													.where(Tables.DEPARTMENT.DELETED.isNull())
													.fetch();
		form.setDeptList(recList);
	}
}

package jp.co.kunisys.member.service;

import java.sql.Timestamp;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import jp.co.kunisys.member.common.util.ChkUtil;
import jp.co.kunisys.member.common.util.DUtil;
import jp.co.kunisys.member.common.util.SUtil;
import jp.co.kunisys.member.form.MTB020Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.DepartmentRecord;
import jp.co.kunisys.member.security.LoginUser;

/**
 * 部署情報編集サービス
 */
@Transactional
@Service
public class MTB020Service {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * 部署情報の検索処理
	 * @param form フォーム
	 */
	public void searchDepartment(MTB020Form form) {
		DepartmentRecord rec = this.create.selectFrom(Tables.DEPARTMENT)
											.where(Tables.DEPARTMENT.DEPT_CD.eq(form.getParamDeptCd()))
											.fetchOne();
		if (rec != null) {
			//部署コード
			form.setDeptCd(rec.getDeptCd());
			//部署名
			form.setName(rec.getName());
			//バージョン
			form.setVersion(rec.getVersion());
		}
	}


	/**
	 * 画面の入力チェック
	 * @param form フォーム
	 * @param result BindingResult
	 */
	public void checkInput(MTB020Form form, BindingResult result) {
		ChkUtil.isRequire(result, "deptCd", "部署コード", form.getDeptCd());
		ChkUtil.isRequire(result, "name", "部署名", form.getName());

		ChkUtil.isMaxChar(result, "deptCd", "部署コード", form.getDeptCd(), 8);
		ChkUtil.isMaxChar(result, "name", "部署名", form.getName(), 100);

		if (SUtil.isBlank(form.getParamDeptCd())) {
			DepartmentRecord rec = this.create.selectFrom(Tables.DEPARTMENT)
												.where(Tables.DEPARTMENT.DEPT_CD.eq(form.getDeptCd()))
												.fetchOne();
			if (rec != null) {
				String msg = "入力された部署コードは使用済です。";
				result.rejectValue("deptCd", null, msg);
			}
		}
	}


	/**
	 * 部署情報の登録処理
	 * @param form フォーム
	 */
	public void insertDepartment(MTB020Form form) {
		Timestamp now = DUtil.getTimestamp();

		DepartmentRecord rec = this.create.newRecord(Tables.DEPARTMENT);
		//部署コード
		rec.setDeptCd(form.getDeptCd());
		//部署名
		rec.setName(form.getName());
		//登録日時
		rec.setCreated(now);
		//登録ユーザ
		rec.setCreatedUser(LoginUser.getUser().getUserId());
		//バージョン
		rec.setVersion(1);

		//登録実行
		rec.store();
	}


	/**
	 * 部署情報の更新処理
	 * @param form フォーム
	 */
	public void updateDepartment(MTB020Form form) {
		Timestamp now = DUtil.getTimestamp();

		DepartmentRecord rec = this.create.selectFrom(Tables.DEPARTMENT)
											.where(Tables.DEPARTMENT.DEPT_CD.eq(form.getParamDeptCd()))
											.fetchOne();
		if (rec == null) {
			return;
		}

		//部署名
		rec.setName(form.getName());
		//更新日時
		rec.setUpdated(now);
		//更新ユーザ
		rec.setUpdatedUser(LoginUser.getUser().getUserId());
		//バージョン
		rec.setVersion(form.getVersion());

		//更新実行
		rec.store();
	}


	/**
	 * 部署情報の削除処理
	 * @param form フォーム
	 */
	public void deleteDepartment(MTB020Form form) {
		Timestamp now = DUtil.getTimestamp();

		DepartmentRecord rec = this.create.selectFrom(Tables.DEPARTMENT)
											.where(Tables.DEPARTMENT.DEPT_CD.eq(form.getParamDeptCd()))
											.fetchOne();
		if (rec == null) {
			return;
		}

		//削除日時
		rec.setDeleted(now);
		//削除ユーザ
		rec.setDeletedUser(LoginUser.getUser().getUserId());
		//バージョン
		rec.setVersion(form.getVersion());

		//更新実行
		rec.store();
	}

}

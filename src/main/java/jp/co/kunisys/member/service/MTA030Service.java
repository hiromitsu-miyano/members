package jp.co.kunisys.member.service;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import jp.co.kunisys.member.bean.mta.AuthFuncBean;
import jp.co.kunisys.member.common.util.ChkUtil;
import jp.co.kunisys.member.form.MTA030Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.AuthRecord;

/**
 * 権限情報編集画面サービス
 */
@Service
public class MTA030Service {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * 権限情報の検索処理
	 * @param form フォーム
	 */
	public void searchAuth(MTA030Form form) {
		AuthRecord rec = this.create.selectFrom(Tables.AUTH)
										.where(Tables.AUTH.AUTH_CD.eq(form.getParamAuthCd()))
										.fetchOne();
		if (rec == null) {
			return;
		}
		//権限コード
		form.setAuthCd(rec.getAuthCd());
		//権限名
		form.setName(rec.getName());
		//バージョン
		form.setVersion(rec.getVersion());
	}


	/**
	 * 機能権限一覧の検索処理
	 * @param form フォーム
	 */
	public void searchAuthFunctionList(MTA030Form form) {

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT");
        sql.append(" a.auth_function_cd AS auth_function_cd,");
        sql.append(" a.name             AS name,");
        sql.append(" a.class_name       AS class_name,");
        sql.append(" a.action_name      AS action_name,");
        sql.append(" a.comment          AS comment,");
        sql.append(" a.sortkey          AS sortkey,");
        sql.append(" b.auth_assign      AS auth_assign ");
        sql.append(" FROM");
        sql.append(" auth_function a ");
        sql.append(" LEFT JOIN (");
        sql.append("   SELECT");
        sql.append("    c.auth_function_cd");
        sql.append("   ,d.auth_assign");
        sql.append("   FROM");
        sql.append("    auth_function c");
        sql.append("   ,auth_assign d");
        sql.append("   WHERE");
        sql.append("       c.auth_function_cd = d.auth_function_cd ");
        sql.append("   AND d.auth_cd = '").append(form.getParamAuthCd()).append("'");
        sql.append(" ) b ");
        sql.append(" ON a.auth_function_cd = b.auth_function_cd");
        sql.append(" ORDER BY");
        sql.append(" a.sortkey");

        List<AuthFuncBean> beanList = this.create.fetch(sql.toString()).into(AuthFuncBean.class);
        beanList.stream().filter(b -> b.getAuthAssign() == null).forEach(b -> b.setAuthAssign("0"));
        form.setAuthFunctionList(beanList);
	}


	/**
	 * 登録時の入力チェック
	 * @param form フォーム
	 * @param result バリデート結果
	 */
	public void checkInsert(MTA030Form form, BindingResult result) {
		ChkUtil.isRequire(result, "authCd", "権限コード", form.getAuthCd());
		ChkUtil.isRequire(result, "name", "権限名", form.getName());

		if (result.hasErrors()) return;

		//権限コード重複チェック
		AuthRecord auth = this.create.selectFrom(Tables.AUTH)
										.where(Tables.AUTH.AUTH_CD.eq(form.getAuthCd()))
										.fetchOne();
		if (auth != null) {
			result.rejectValue("authCd", null, "コードが重複しています。");
		}
	}


	/**
	 * 更新時の入力チェック
	 * @param form フォーム
	 * @param result バリデート結果
	 */
	public void checkUpdate(MTA030Form form, BindingResult result) {
		ChkUtil.isRequire(result, "authCd", "権限コード", form.getAuthCd());
		ChkUtil.isRequire(result, "name", "権限名", form.getName());

		if (result.hasErrors()) return;

		//権限コード重複チェック
		AuthRecord auth = this.create.selectFrom(Tables.AUTH)
										.where(Tables.AUTH.AUTH_CD.eq(form.getAuthCd()))
										.fetchOne();
		if (auth == null) {
			result.reject(null, "ほかの端末で削除済みです。");
		}
	}
}

package jp.co.kunisys.member.service;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import jp.co.kunisys.member.common.util.ChkUtil;
import jp.co.kunisys.member.common.util.SUtil;
import jp.co.kunisys.member.form.MTC020Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.PostRecord;

/**
 * 職位情報編集サービス
 */
@Transactional
@Service
public class MTC020Service {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * 職位情報の検索処理
	 * @param form フォーム
	 */
	public void searchPost(MTC020Form form) {
		PostRecord rec = this.create.selectFrom(Tables.POST)
									.where(Tables.POST.POST_CD.eq(form.getParamPostCd()))
									.fetchOne();
		if (rec != null) {
			//職位コード
			form.setPostCd(rec.getPostCd());
			//職位名
			form.setName(rec.getName());
		}
	}


	/**
	 * 画面の入力チェック
	 * @param form フォーム
	 * @param result BindingResult
	 */
	public void checkInput(MTC020Form form, BindingResult result) {
		ChkUtil.isRequire(result, "postCd", "職位コード", form.getPostCd());
		ChkUtil.isRequire(result, "name", "職位名", form.getName());

		ChkUtil.isMaxChar(result, "postCd", "職位コード", form.getPostCd(), 8);
		ChkUtil.isMaxChar(result, "name", "職位名", form.getName(), 100);

		if (SUtil.isBlank(form.getParamPostCd())) {
			PostRecord rec = this.create.selectFrom(Tables.POST)
										.where(Tables.POST.POST_CD.eq(form.getPostCd()))
										.fetchOne();
			if (rec != null) {
				String msg = "入力された職位コードは使用済です。";
				result.rejectValue("postCd", null, msg);
			}
		}
	}


	/**
	 * 職位情報の登録処理
	 * @param form フォーム
	 */
	public void insertPost(MTC020Form form) {

		PostRecord rec = this.create.newRecord(Tables.POST);
		//職位コード
		rec.setPostCd(form.getPostCd());
		//職位名
		rec.setName(form.getName());

		//登録実行
		rec.store();
	}


	/**
	 * 職位情報の更新処理
	 * @param form フォーム
	 */
	public void updatePost(MTC020Form form) {

		PostRecord rec = this.create.selectFrom(Tables.POST)
									.where(Tables.POST.POST_CD.eq(form.getParamPostCd()))
									.fetchOne();
		if (rec == null) {
			return;
		}

		//職位名
		rec.setName(form.getName());

		//更新実行
		rec.store();
	}


	/**
	 * 職位情報の削除処理
	 * @param form フォーム
	 */
	public void deletePost(MTC020Form form) {

		PostRecord rec = this.create.selectFrom(Tables.POST)
									.where(Tables.POST.POST_CD.eq(form.getParamPostCd()))
									.fetchOne();
		if (rec == null) {
			return;
		}

		//削除実行
		rec.delete();
	}

}

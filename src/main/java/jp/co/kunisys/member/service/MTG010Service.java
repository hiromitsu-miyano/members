package jp.co.kunisys.member.service;

import static org.jooq.impl.DSL.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import jp.co.kunisys.member.common.BeanMap;
import jp.co.kunisys.member.common.Code;
import jp.co.kunisys.member.common.util.ChkUtil;
import jp.co.kunisys.member.common.util.DUtil;
import jp.co.kunisys.member.common.util.SUtil;
import jp.co.kunisys.member.form.MTG010Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.Kubun;
import jp.co.kunisys.member.query.tables.records.KubunRecord;
import jp.co.kunisys.member.query.tables.records.SchoolRecord;
import jp.co.kunisys.member.security.LoginUser;

/**
 * 学校マスタメンテナンス サービスクラス
 */
@Service
public class MTG010Service {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * 学校一覧の検索処理
	 * @param form フォーム
	 */
	public void searchSchoolList(MTG010Form form) {
		Kubun pref = Tables.KUBUN.as("pref");
		Kubun schoolType = Tables.KUBUN.as("schoolType");

		SelectQuery<Record> query = this.create
				.select()
				//学校
				.from(Tables.SCHOOL)
				//区分(都道府県)
				.leftJoin(pref)
					.on(Tables.SCHOOL.PREF_CD.eq(pref.CODE))
					.and(pref.TYPE_CODE.eq(Code.PREF.TYPE))
				//区分(学校区分)
				.leftJoin(schoolType)
					.on(Tables.SCHOOL.SCHOOL_TYPE.eq(schoolType.CODE))
					.and(schoolType.TYPE_CODE.eq(Code.SCHOOL_TYPE.TYPE))
				.where(Tables.SCHOOL.DELETED.isNull())
				.orderBy(
					Tables.SCHOOL.PREF_CD.asc(),
					Tables.SCHOOL.SCHOOL_TYPE.asc(),
					Tables.SCHOOL.SCHOOL_NAME.asc()
				)
				.getQuery();
		//都道府県
		if (SUtil.isNotBlank(form.getSelectPref())) {
			query.addConditions(Tables.SCHOOL.PREF_CD.eq(val(form.getSelectPref())));
		}
		//学校区分
		if (SUtil.isNotBlank(form.getSelectSchoolType())) {
			query.addConditions(Tables.SCHOOL.SCHOOL_TYPE.eq(val(form.getSelectSchoolType())));
		}

		List<BeanMap> beanList = query.fetch().stream().map(r -> {
			BeanMap map = new BeanMap();
			//学校
			SchoolRecord school = r.into(Tables.SCHOOL);
			map.put("schoolId", school.getSchoolId());
			map.put("schoolName", school.getSchoolName());
			map.put("schoolType", school.getSchoolType());
			map.put("prefCd", school.getPrefCd());
			map.put("comment", school.getComment());
			map.put("version", school.getVersion());
			//区分(都道府県)
			KubunRecord prefRec = r.into(pref);
			map.put("prefCdName", prefRec.getName());
			//区分(学校区分)
			KubunRecord schoolTypeRec = r.into(schoolType);
			map.put("schoolTypeName", schoolTypeRec.getName());
			return map;
		}).collect(Collectors.toList());
		form.setSchoolList(beanList);
	}


	/**
	 * 学校の選択処理
	 * @param form フォーム
	 */
	public void selectSchool(MTG010Form form) {
		SchoolRecord rec = this.create.selectFrom(Tables.SCHOOL)
										.where(Tables.SCHOOL.SCHOOL_ID.eq(form.getSelectSchoolId()))
										.fetchOne();
		if (rec == null) {
			return;
		}

		//学校コード
		form.setInputSchoolId(rec.getSchoolId());
		//学校名
		form.setInputSchoolName(rec.getSchoolName());
		//学校区分
		form.setInputSchoolType(rec.getSchoolType());
		//都道府県
		form.setInputPrefCd(rec.getPrefCd());
		//コメント
		form.setInputComment(rec.getComment());
		//バージョン
		form.setInputVersion(rec.getVersion());
	}


	/**
	 * 画面の入力チェック
	 * @param form フォーム
	 * @param result BindingResult
	 */
	public void checkInput(MTG010Form form, BindingResult result) {
		ChkUtil.isRequire(result, "inputSchoolName", "学校名", form.getInputSchoolName());
		ChkUtil.isRequire(result, "inputSchoolType", "学校区分", form.getInputSchoolType());
		ChkUtil.isRequire(result, "inputPrefCd", "所在県", form.getInputPrefCd());

		ChkUtil.isMaxChar(result, "inputSchoolName", "学校名", form.getInputSchoolName(), 100);
		ChkUtil.isMaxChar(result, "inputComment", "コメント", form.getInputComment(), 100);
	}


	/**
	 * 学校の登録処理
	 * @param form フォーム
	 */
	public void insertSchool(MTG010Form form) {
		Timestamp now = DUtil.getTimestamp();

		SchoolRecord rec = this.create.newRecord(Tables.SCHOOL);
		//学校コード
		Integer schoolId = createNewNumber();
		rec.setSchoolId(schoolId);
		//学校名
		rec.setSchoolName(form.getInputSchoolName());
		//学校区分
		rec.setSchoolType(form.getInputSchoolType());
		//都道府県
		rec.setPrefCd(form.getInputPrefCd());
		//コメント
		rec.setComment(form.getInputComment());
		//作成日時
		rec.setCreated(now);
		//作成ユーザ
		rec.setCreatedUser(LoginUser.getUser().getUserId());
		//更新日時
		rec.setUpdated(now);
		//更新ユーザ
		rec.setUpdatedUser(LoginUser.getUser().getUserId());
		//バージョン
		rec.setVersion(form.getInputVersion());

		//登録処理実行
		rec.store();
	}

	/**
	 * 学校コードを発番する
	 * @return 発番された学校コード
	 */
	private Integer createNewNumber() {
		Integer maxId = this.create
				.select(max(Tables.SCHOOL.SCHOOL_ID))
				.from(Tables.SCHOOL)
				.fetchOneInto(Integer.class);
		if (maxId == null) {
			maxId = 0;
		}
		maxId++;
		return maxId;
	}


	/**
	 * 学校の更新処理
	 * @param form フォーム
	 */
	public void updateSchool(MTG010Form form) {
		Timestamp now = DUtil.getTimestamp();

		SchoolRecord rec = this.create.selectFrom(Tables.SCHOOL)
										.where(Tables.SCHOOL.SCHOOL_ID.eq(form.getInputSchoolId()))
										.fetchOne();
		if (rec == null) {
			return;
		}

		//学校名
		rec.setSchoolName(form.getInputSchoolName());
		//学校区分
		rec.setSchoolType(form.getInputSchoolType());
		//都道府県
		rec.setPrefCd(form.getInputPrefCd());
		//コメント
		rec.setComment(form.getInputComment());

		//更新日時
		rec.setUpdated(now);
		//更新ユーザ
		rec.setUpdatedUser(LoginUser.getUser().getUserId());
		//バージョン
		rec.setVersion(form.getInputVersion());

		//登録処理実行
		rec.store();
	}


	/**
	 * 学校の削除処理
	 * @param form フォーム
	 */
	public void deleteSchool(MTG010Form form) {
		Timestamp now = DUtil.getTimestamp();

		SchoolRecord rec = this.create.selectFrom(Tables.SCHOOL)
										.where(Tables.SCHOOL.SCHOOL_ID.eq(form.getInputSchoolId()))
										.fetchOne();
		if (rec == null) {
			return;
		}

		//バージョン
		rec.setVersion(form.getInputVersion());

		//削除日時
		rec.setDeleted(now);
		//削除ユーザ
		rec.setDeletedUser(LoginUser.getUser().getUserId());
		//更新処理実行
		rec.store();
	}

}

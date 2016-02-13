package jp.co.kunisys.member.service;

import static org.jooq.impl.DSL.*;

import java.util.List;
import java.util.stream.Collectors;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.kunisys.member.bean.mth.MemberBean;
import jp.co.kunisys.member.common.util.SUtil;
import jp.co.kunisys.member.form.MTH010Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.AnalysisMemberRecord;
import jp.co.kunisys.member.query.tables.records.DepartmentRecord;
import jp.co.kunisys.member.query.tables.records.PostRecord;
import jp.co.kunisys.member.query.tables.records.RelateUserRecord;
import jp.co.kunisys.member.query.tables.records.UserInfoRecord;

/**
 * 連携用ユーザ情報 サービスクラス
 */
@Transactional
@Service
public class MTH010Service {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * 部署リストの検索処理
	 * @param form フォーム
	 */
	public void searchDeptList(MTH010Form form) {
		List<DepartmentRecord> recList = this.create.selectFrom(Tables.DEPARTMENT)
													.orderBy(Tables.DEPARTMENT.DEPT_CD)
													.fetch();
		form.setDeptList(recList);
	}


	/**
	 * 職位リストの検索処理
	 * @param form フォーム
	 */
	public void searchPostList(MTH010Form form) {
		List<PostRecord> recList = this.create.selectFrom(Tables.POST)
												.orderBy(Tables.POST.POST_CD)
												.fetch();
		form.setPostList(recList);
	}


	/**
	 * 連携用ユーザリストの検索処理
	 * @param form フォーム
	 */
	public void searchRelateUserList(MTH010Form form) {
		List<AnalysisMemberRecord> recList = this.create.selectFrom(Tables.ANALYSIS_MEMBER)
														.orderBy(Tables.ANALYSIS_MEMBER.MEMBER_CODE)
														.fetch();
		form.setUserList(recList);
	}


	/**
	 * 社員一覧を検索する
	 * @param form フォーム
	 */
	public void searchMemberList(MTH010Form form) {

		SelectQuery<Record> query = this.create
				.select()
				//ユーザ情報
				.from(Tables.USER_INFO)
				//部署
				.leftJoin(Tables.DEPARTMENT)
					.on(Tables.USER_INFO.DEPT_CD.eq(Tables.DEPARTMENT.DEPT_CD))
				//職位
				.leftJoin(Tables.POST)
					.on(Tables.USER_INFO.POST_CD.eq(Tables.POST.POST_CD))
				//連携用ユーザ情報
				.leftJoin(Tables.RELATE_USER)
					.on(Tables.USER_INFO.USER_ID.eq(Tables.RELATE_USER.USER_ID))
				.getQuery();
		//部署コード
		if (SUtil.isNotBlank(form.getSrchDeptCd())) {
			query.addConditions(Tables.USER_INFO.DEPT_CD.eq(val(form.getSrchDeptCd())));
		}
		//職位コード
		if (SUtil.isNotBlank(form.getSrchPostCd())) {
			query.addConditions(Tables.USER_INFO.POST_CD.eq(val(form.getSrchPostCd())));
		}

		//社員一覧の検索
		List<MemberBean> beanList = query.fetch().stream().map(r -> {
			MemberBean bean = new MemberBean();
			//ユーザ情報
			UserInfoRecord user = r.into(Tables.USER_INFO);
			bean.setUserId(user.getUserId());
			bean.setMemberName(user.getLastname() + " " + user.getFirstname());
			//部署
			DepartmentRecord dept = r.into(Tables.DEPARTMENT);
			bean.setDeptName(dept.getName());
			//職位
			PostRecord post = r.into(Tables.POST);
			bean.setPostName(post.getName());
			//連携用ユーザ情報
			RelateUserRecord relate = r.into(Tables.RELATE_USER);
			bean.setRelateId(relate.getId());
			bean.setRelateUserId(relate.getZaimuUserId());
			return bean;
		}).collect(Collectors.toList());

		form.setMemberList(beanList);
		form.setMemberCountStr(String.format("件数: %s 件", beanList.size()));
	}


	/**
	 * 連携用ユーザ情報の更新処理
	 * @param form フォーム
	 */
	public void updateRelateUser(MTH010Form form) {

		for (MemberBean bean : form.getMemberList()) {
			RelateUserRecord rec = null;
			if (bean.getRelateId() == null) {
				rec = this.create.newRecord(Tables.RELATE_USER);
				Integer id = createNewNumber();
				rec.setId(id);
			} else {
				//連携用ユーザ情報の削除
				rec = this.create.selectFrom(Tables.RELATE_USER)
									.where(Tables.RELATE_USER.ID.eq(bean.getRelateId()))
									.fetchOne();
				if (rec != null) {
					rec.delete();
				}
				rec.setId(bean.getRelateId());
			}

			//ユーザID
			rec.setUserId(bean.getUserId());
			//財務ユーザID
			rec.setZaimuUserId(bean.getRelateUserId());
			//登録処理実行
			rec.store();
		}
	}

	/**
	 * 連携用ユーザ情報のIDを採番する
	 * @return ID
	 */
	private Integer createNewNumber() {
		Integer maxId = this.create.select(max(Tables.RELATE_USER.ID))
									.from(Tables.RELATE_USER)
									.fetchOneInto(Integer.class);
		if (maxId == null) {
			maxId = 0;
		}
		maxId++;
		return maxId;
	}
}

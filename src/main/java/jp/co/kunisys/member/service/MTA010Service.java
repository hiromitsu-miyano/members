package jp.co.kunisys.member.service;

import java.util.List;
import java.util.stream.Collectors;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.kunisys.member.bean.CodeBean;
import jp.co.kunisys.member.bean.mta.EmpBean;
import jp.co.kunisys.member.common.SUtil;
import jp.co.kunisys.member.form.MTA010Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.DepartmentRecord;
import jp.co.kunisys.member.query.tables.records.PostRecord;
import jp.co.kunisys.member.query.tables.records.UserAuthRecord;
import jp.co.kunisys.member.query.tables.records.UserInfoRecord;

/**
 * 権限割当画面サービス
 */
@Service
public class MTA010Service {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * 画面情報の検索処理
	 * @param form フォーム
	 */
	public void searchAuthAssign(MTA010Form form) {
		//部署リストの作成
		List<CodeBean> deptList = this.create.selectFrom(Tables.DEPARTMENT)
												.where(Tables.DEPARTMENT.DELETED.isNull())
												.orderBy(Tables.DEPARTMENT.DEPT_CD)
												.stream().map(r -> new CodeBean(r.getDeptCd(), r.getName()))
												.collect(Collectors.toList());
		form.setDeptList(deptList);
		//職位リストの生成
		List<CodeBean> postList = this.create.selectFrom(Tables.POST)
												.orderBy(Tables.POST.POST_CD)
												.stream().map(r -> new CodeBean(r.getPostCd(), r.getName()))
												.collect(Collectors.toList());
		form.setPostList(postList);
		//権限リストの生成
		List<CodeBean> authList = this.create.selectFrom(Tables.AUTH)
												.orderBy(Tables.AUTH.AUTH_CD)
												.stream().map(r -> new CodeBean(r.getAuthCd(), r.getName()))
												.collect(Collectors.toList());
		form.setAuthList(authList);
		//社員一覧を取得
		SelectQuery<Record> query = this.create
				.select()
				.from(Tables.USER_INFO)
				//部署
				.leftJoin(Tables.DEPARTMENT).on(Tables.USER_INFO.DEPT_CD.eq(Tables.DEPARTMENT.DEPT_CD))
				//職位
				.leftJoin(Tables.POST).on(Tables.USER_INFO.POST_CD.eq(Tables.POST.POST_CD))
				//ユーザ権限
				.leftJoin(Tables.USER_AUTH).on(Tables.USER_INFO.USER_ID.eq(Tables.USER_AUTH.USER_ID))
				//退職情報
				.leftJoin(Tables.USER_INFO_RETIRE).on(Tables.USER_INFO.USER_ID.eq(Tables.USER_INFO_RETIRE.USER_ID))
				.where(Tables.USER_INFO.DELETED.isNull())
				.and(Tables.USER_INFO_RETIRE.USER_ID.isNull())
				.orderBy(Tables.USER_INFO.DEPT_CD.asc(),
						Tables.USER_INFO.LASTNAME_KANA.asc(),
						Tables.USER_INFO.FIRSTNAME_KANA.asc())
				.getQuery();
		//条件：部署コード
		if (SUtil.isNotBlank(form.getDeptCd())) {
			query.addConditions(Tables.USER_INFO.DEPT_CD.eq(form.getDeptCd()));
		}
		//条件：職位コード
		if (SUtil.isNotBlank(form.getPostCd())) {
			query.addConditions(Tables.USER_INFO.POST_CD.eq(form.getPostCd()));
		}
		List<EmpBean> empList = query.fetch().stream().map(r -> {
			EmpBean bean = new EmpBean();
			UserInfoRecord user = r.into(Tables.USER_INFO);
			bean.setUserId(user.getUserId());
			bean.setFirstname(user.getFirstname());
			bean.setLastname(user.getLastname());
			bean.setFirstnameKana(user.getFirstnameKana());
			bean.setLastnameKana(user.getLastnameKana());
			DepartmentRecord dept = r.into(Tables.DEPARTMENT);
			bean.setDeptName(dept.getName());
			PostRecord post = r.into(Tables.POST);
			bean.setPostName(post.getName());
			UserAuthRecord auth = r.into(Tables.USER_AUTH);
			bean.setAuthCd1(auth.getAuthCd1());
			bean.setAuthCd2(auth.getAuthCd2());
			bean.setAuthCd3(auth.getAuthCd3());
			bean.setAuthCd4(auth.getAuthCd4());
			bean.setAuthCd5(auth.getAuthCd5());
			bean.setVersion(auth.getVersion());
			return bean;
		}).collect(Collectors.toList());
		form.setEmpList(empList);
		form.setEmpFlag(empList.isEmpty());
	}
}

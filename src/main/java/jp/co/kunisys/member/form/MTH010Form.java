package jp.co.kunisys.member.form;

import java.util.List;

import jp.co.kunisys.member.bean.mth.MemberBean;
import jp.co.kunisys.member.query.tables.records.AnalysisMemberRecord;
import jp.co.kunisys.member.query.tables.records.DepartmentRecord;
import jp.co.kunisys.member.query.tables.records.PostRecord;
import lombok.Data;

/**
 * 連携用ユーザ情報 フォーム
 */
@Data
public class MTH010Form {

	/** 部署リスト */
	private List<DepartmentRecord> deptList;
	/** 職位リスト */
	private List<PostRecord> postList;
	/** 連携用ユーザリスト */
	private List<AnalysisMemberRecord> userList;

	/** 検索条件：部署コード */
	private String srchDeptCd;
	/** 検索条件：職位コード */
	private String srchPostCd;

	/** ユーザ情報一覧 */
	private List<MemberBean> memberList;
	/** ユーザ情報一覧件数 */
	private String memberCountStr;
}

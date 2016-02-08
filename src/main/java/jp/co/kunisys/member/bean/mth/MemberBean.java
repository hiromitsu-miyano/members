package jp.co.kunisys.member.bean.mth;

import java.io.Serializable;

import lombok.Data;

/**
 * 連携用ユーザ情報
 */
@Data
public class MemberBean implements Serializable {

	/** 社員名. */
	private String memberName;
	/** 部署名. */
	private String deptName;
	/** 職位名 */
	private String postName;
	/** ID. */
	private Integer relateId;
	/** ユーザID. */
	private Integer userId;
	/** 連携用ユーザID. */
	private String relateUserId;
}

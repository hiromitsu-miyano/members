package jp.co.kunisys.member.form;

import lombok.Data;

/**
 * 部署情報編集フォーム
 */
@Data
public class MTB020Form {

	/** パラメータ：部署コード */
	private String paramDeptCd;

	/** 部署コード */
	private String deptCd;
	/** 部署名 */
	private String name;
	/** バージョン */
	private Integer version;
}

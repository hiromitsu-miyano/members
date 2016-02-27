package jp.co.kunisys.member.form;

import lombok.Data;

/**
 * 職位情報編集フォーム
 */
@Data
public class MTC020Form {

	/** パラメータ：職位コード */
	private String paramPostCd;

	/** 職位コード */
	private String postCd;
	/** 職位名 */
	private String name;
}

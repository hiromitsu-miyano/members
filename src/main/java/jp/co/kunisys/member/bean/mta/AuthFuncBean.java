package jp.co.kunisys.member.bean.mta;

import java.io.Serializable;

import lombok.Data;

/**
 * 権限情報編集画面：機能権限情報Bean
 */
@Data
public class AuthFuncBean implements Serializable {

	/** 機能名 */
	private String name;
	/** 機能コメント */
	private String comment;
	/** 機能割当 */
	private String authAssign;
}

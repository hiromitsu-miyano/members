package jp.co.kunisys.member.bean.mta;

import java.io.Serializable;

import lombok.Data;

/**
 * 権限割当画面：社員情報Bean
 */
@Data
public class EmpBean implements Serializable {

	/** ユーザID */
	private Integer userId;
	/** 姓 */
	private String lastname;
	/** 名 */
	private String firstname;
	/** 姓カナ */
	private String lastnameKana;
	/** 名カナ */
	private String firstnameKana;
	/** 部署名 */
	private String deptName;
	/** 職位名 */
	private String postName;
	/** 権限１ */
	private String authCd1;
	/** 権限２ */
	private String authCd2;
	/** 権限３ */
	private String authCd3;
	/** 権限４ */
	private String authCd4;
	/** 権限５ */
	private String authCd5;
	/** バージョン */
	private Integer version;

}

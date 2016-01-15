package jp.co.kunisys.member.form;

import java.io.Serializable;

import lombok.Data;

/**
 * トップ画面フォーム
 */
@Data
public class COB000Form implements Serializable {

	/** 現在のパスワード */
	private String oldPassword;
	/** 新パスワード */
	private String newPassword;
	/** 新パスワード(再入力) */
	private String newRePassword;
}

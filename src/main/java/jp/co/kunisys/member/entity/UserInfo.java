package jp.co.kunisys.member.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * ユーザ情報
 */
@Entity
@Data
public class UserInfo {

	/** ユーザID */
	@Id
	private Integer userId;

	/** アカウント */
	@Column
	private String account;

	/** パスワード */
	@Column
	private String password;

	/** 姓 */
	@Column
	private String lastname;

	/** 名 */
	@Column
	private String firstname;
}

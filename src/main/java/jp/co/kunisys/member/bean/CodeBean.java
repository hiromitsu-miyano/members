package jp.co.kunisys.member.bean;

import lombok.Data;

/**
 * コードBean
 */
@Data
public class CodeBean {

	/** コード */
	private String code;
	/** 名称 */
	private String name;


	/**
	 * 複製を返却する
	 */
	@Override
	public CodeBean clone() {
		CodeBean clone = new CodeBean();
		clone.setCode(this.code);
		clone.setName(this.name);
		return clone;
	}
}

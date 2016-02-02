package jp.co.kunisys.member.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * パンくずBean
 */
@Data
@AllArgsConstructor
public class BreadCrumbBean {

	/** 画面名 */
	private String name;
	/** アクション名 */
	private String action;
}

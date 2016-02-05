package jp.co.kunisys.member.bean.mta;

import java.io.Serializable;

import lombok.Data;

/**
 * コントローラBean
 */
@Data
public class ControllerBean implements Serializable {

	/** コントローラ名 */
	private String controllerName;
	/** 画面名 */
	private String viewName;
}

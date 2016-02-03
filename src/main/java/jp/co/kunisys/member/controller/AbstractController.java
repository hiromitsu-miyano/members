package jp.co.kunisys.member.controller;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;

import jp.co.kunisys.member.bean.BreadCrumbBean;

/**
 * コントローラ共通クラス
 */
public class AbstractController {

	/** パンくずリスト */
	protected List<BreadCrumbBean> breadCrumbTrails;
	/** 画面名 */
	protected String viewName;

	/**
	 * パンくずリストを返す
	 * @return パンくずリスト
	 */
	@ModelAttribute("trails")
	public List<BreadCrumbBean> getTrails() {
		return this.breadCrumbTrails;
	}

	/**
	 * 画面名を返す
	 * @return 画面名
	 */
	@ModelAttribute("viewName")
	public String getViewName() {
		return this.viewName;
	}

}

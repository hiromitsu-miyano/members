package jp.co.kunisys.member.controller;

import java.util.ArrayList;

import org.jooq.exception.DataChangedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import jp.co.kunisys.member.bean.BreadCrumbBean;
import jp.co.kunisys.member.form.MTB020Form;
import jp.co.kunisys.member.service.MTB020Service;

/**
 * 部署情報編集コントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/MTB020")
public class MTB020Controller extends AbstractController {

    /** 画面名. */
    public static final String NAME = "部署情報編集";

    /** 自画面テンプレート. */
    private static final String MY_VIEW = "mtb/mtb020main";

    /** サービスクラス */
    @Autowired
    private MTB020Service service;


    /**
     * コンストラクタ
     */
    public MTB020Controller() {
    	//パン屑リスト生成
    	this.breadCrumbTrails = new ArrayList<>();
    	this.breadCrumbTrails.add(new BreadCrumbBean(COB000Controller.NAME, COB000Controller.INIT));
    	this.breadCrumbTrails.add(new BreadCrumbBean(MTB010Controller.NAME, MTB010Controller.INIT));
    	//画面名設定
    	this.viewName = NAME;
    }

    /**
     * フォームの生成
     * @return フォーム
     */
    @ModelAttribute("mtb020Form")
    public MTB020Form getForm() {
    	return new MTB020Form();
    }


    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(value = "/init")
    public String init(@ModelAttribute("mtb020Form") MTB020Form form,
    					@RequestParam("paramDeptCd") String paramDeptCd) {
    	//初回検索
    	form.setParamDeptCd(paramDeptCd);
    	this.service.searchDepartment(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 登録処理
     * @param form フォーム
     * @param result BindingResult
     * @param model モデル
     * @return 一覧画面
     */
    @RequestMapping(params = "insertDept")
    public String insertDept(@ModelAttribute("mtb020Form") MTB020Form form, BindingResult result, Model model) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW;
    	}
    	//部署情報の登録処理
    	this.service.insertDepartment(form);
    	return "redirect:" + MTB010Controller.INIT;
    }


    /**
     * 更新処理
     * @param form フォーム
     * @param result BindingResult
     * @param model モデル
     * @return 一覧画面
     */
    @RequestMapping(params = "updateDept")
    public String updateDept(@ModelAttribute("mtb020Form") MTB020Form form, BindingResult result, Model model) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW;
    	}
    	//部署情報の更新処理
    	try {
    		this.service.updateDepartment(form);
    	} catch (DataChangedException e) {
    		//排他エラー時
    		result.reject("warning.optimistic");
    		return MY_VIEW;
    	}
    	return "redirect:" + MTB010Controller.INIT;
    }


    /**
     * 削除処理
     * @param form フォーム
     * @param result BindingResult
     * @param model モデル
     * @return 一覧画面
     */
    @RequestMapping(params = "deleteDept")
    public String deleteDept(@ModelAttribute("mtb020Form") MTB020Form form, BindingResult result, Model model) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW;
    	}
    	//部署情報の論理削除処理
    	try {
    		this.service.deleteDepartment(form);
    	} catch (DataChangedException e) {
    		//排他エラー時
    		result.reject("warning.optimistic");
    		return MY_VIEW;
    	}
    	return "redirect:" + MTB010Controller.INIT;
    }
}

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
import jp.co.kunisys.member.form.MTC020Form;
import jp.co.kunisys.member.service.MTC020Service;

/**
 * 職位情報編集コントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/MTC020")
public class MTC020Controller extends AbstractController {

    /** 画面名. */
    public static final String NAME = "職位情報編集";

    /** 自画面テンプレート. */
    private static final String MY_VIEW = "mtc/mtc020main";

    /** サービスクラス */
    @Autowired
    private MTC020Service service;


    /**
     * コンストラクタ
     */
    public MTC020Controller() {
    	//パン屑リスト生成
    	this.breadCrumbTrails = new ArrayList<>();
    	this.breadCrumbTrails.add(new BreadCrumbBean(COB000Controller.NAME, COB000Controller.INIT));
    	this.breadCrumbTrails.add(new BreadCrumbBean(MTC010Controller.NAME, MTB010Controller.INIT));
    	//画面名設定
    	this.viewName = NAME;
    }

    /**
     * フォームの生成
     * @return フォーム
     */
    @ModelAttribute("mtc020Form")
    public MTC020Form getForm() {
    	return new MTC020Form();
    }


    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(value = "/init")
    public String init(@ModelAttribute("mtc020Form") MTC020Form form,
    					@RequestParam("paramPostCd") String paramPostCd) {
    	//初回検索
    	form.setParamPostCd(paramPostCd);
    	this.service.searchPost(form);
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
    @RequestMapping(params = "insertPost")
    public String insertPost(@ModelAttribute("mtc020Form") MTC020Form form, BindingResult result, Model model) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW;
    	}
    	//職位情報の登録処理
    	this.service.insertPost(form);
    	return "redirect:" + MTC010Controller.INIT;
    }


    /**
     * 更新処理
     * @param form フォーム
     * @param result BindingResult
     * @param model モデル
     * @return 一覧画面
     */
    @RequestMapping(params = "updatePost")
    public String updatePost(@ModelAttribute("mtc020Form") MTC020Form form, BindingResult result, Model model) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW;
    	}
    	//職位情報の更新処理
    	try {
    		this.service.updatePost(form);
    	} catch (DataChangedException e) {
    		//排他エラー時
    		result.reject("warning.optimistic");
    		return MY_VIEW;
    	}
    	return "redirect:" + MTC010Controller.INIT;
    }


    /**
     * 削除処理
     * @param form フォーム
     * @param result BindingResult
     * @param model モデル
     * @return 一覧画面
     */
    @RequestMapping(params = "deletePost")
    public String deletePost(@ModelAttribute("mtc020Form") MTC020Form form, BindingResult result, Model model) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW;
    	}
    	//職位情報の削除処理
    	try {
    		this.service.deletePost(form);
    	} catch (DataChangedException e) {
    		//排他エラー時
    		result.reject("warning.optimistic");
    		return MY_VIEW;
    	}
    	return "redirect:" + MTC010Controller.INIT;
    }
}

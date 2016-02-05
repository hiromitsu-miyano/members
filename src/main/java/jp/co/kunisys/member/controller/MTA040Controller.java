package jp.co.kunisys.member.controller;

import java.util.ArrayList;

import org.jooq.exception.DataChangedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import jp.co.kunisys.member.bean.BreadCrumbBean;
import jp.co.kunisys.member.form.MTA040Form;
import jp.co.kunisys.member.service.MTA040Service;

/**
 * 機能権限編集コントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/MTA040")
public class MTA040Controller extends AbstractController {

    /** 画面名. */
    public static final String NAME = "機能権限編集";
    /** 初期処理 */
    public static final String INIT = "/MTA040/init";

    /** 自画面テンプレート. */
    private static final String MY_VIEW = "mta/mta040main";
    /** 自画面テンプレート(明細部). */
    private static final String MY_VIEW_LIST = "mta/mta040list";
    /** 自画面テンプレート(編集欄). */
    private static final String MY_VIEW_DIALOG = "mta/mta040dialog";

    /** サービスクラス */
    @Autowired
    private MTA040Service service;


    /**
     * コンストラクタ
     */
    public MTA040Controller() {
    	//パン屑リスト設定
    	this.breadCrumbTrails = new ArrayList<>();
    	this.breadCrumbTrails.add(new BreadCrumbBean(COB000Controller.NAME, COB000Controller.INIT));
    	this.breadCrumbTrails.add(new BreadCrumbBean(MTA020Controller.NAME, MTA020Controller.INIT));
    	//画面名を設定
    	this.viewName = NAME;
    }


    /**
     * フォームの生成
     * @return フォーム
     */
    @ModelAttribute("form")
    public MTA040Form getForm() {
    	return new MTA040Form();
    }


    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(value = "/init")
    public String init(@ModelAttribute("form") MTA040Form form) {
    	//コントローラリストを取得
    	this.service.searchControllerList(form);
    	//機能権限一覧を取得
    	this.service.searchAuthFunctionList(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 機能権限一覧取得
     * @param form フォーム
     * @return 自画面一覧
     */
    @RequestMapping(value = "/searchAuthFunction")
    public String searchAuthFunction(@ModelAttribute("form") MTA040Form form) {
    	//機能権限一覧を取得
    	this.service.searchAuthFunctionList(form);
    	//自画面一覧を返却
    	return MY_VIEW_LIST;
    }


    /**
     * 機能権限の選択
     * @param form フォーム
     * @return 編集欄
     */
    @RequestMapping(value = "/selectAuthFunction")
    public String selectAuthFunction(@ModelAttribute("form") MTA040Form form) {
    	//機能権限の選択処理
    	this.service.selectAuthFunction(form);
    	//フォームを返す
    	return MY_VIEW_DIALOG;
    }


    /**
     * 機能権限の登録
     * @param form フォーム
     * @param result バリデート結果
     * @return 編集欄
     */
    @RequestMapping(value = "/insertAuthFunction")
    public String insertAuthFunction(@ModelAttribute("form") MTA040Form form, BindingResult result) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW_DIALOG;
    	}

    	//機能権限の登録処理
    	this.service.insertAuthFunction(form);

    	return MY_VIEW_DIALOG;
    }


    /**
     * 機能権限の更新
     * @param form フォーム
     * @param result バリデート結果
     * @return 編集欄
     */
    @RequestMapping(value = "/updateAuthFunction")
    public String updateAuthFunction(@ModelAttribute("form") MTA040Form form, BindingResult result) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW_DIALOG;
    	}

    	//機能権限の更新処理
    	try {
    		this.service.updateAuthFunction(form);
    	} catch (DataChangedException ex) {
    		result.reject("warning.optimistic");
    		return MY_VIEW_DIALOG;
    	}

    	return MY_VIEW_DIALOG;
    }


    /**
     * 機能権限の削除
     * @param form フォーム
     * @param result バリデート結果
     * @return 編集欄
     */
    @RequestMapping(value = "/deleteAuthFunction")
    public String deleteAuthFunction(@ModelAttribute("form") MTA040Form form, BindingResult result) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW_DIALOG;
    	}

    	//機能権限の更新処理
    	try {
    		this.service.deleteAuthFunction(form);
    	} catch (DataChangedException ex) {
    		result.reject("warning.optimistic");
    		return MY_VIEW_DIALOG;
    	}

    	return MY_VIEW_DIALOG;
    }

}

package jp.co.kunisys.member.controller;

import java.util.ArrayList;

import org.jooq.exception.DataChangedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import jp.co.kunisys.member.bean.BreadCrumbBean;
import jp.co.kunisys.member.form.MTA010Form;
import jp.co.kunisys.member.service.MTA010Service;

/**
 * 権限割当画面コントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/MTA010")
public class MTA010Controller extends AbstractController {

    /** 画面名. */
    public static final String NAME = "権限割当";
    /** 初期処理 */
    public static final String INIT = "/MTA010/init";

    /** 自画面テンプレート. */
    private static final String MY_VIEW = "mta/mta010main";

    /** サービスクラス */
    @Autowired
    private MTA010Service service;


    /**
     * コンストラクタ
     */
    public MTA010Controller() {
    	//パン屑リスト生成
    	this.breadCrumbTrails = new ArrayList<>();
    	this.breadCrumbTrails.add(new BreadCrumbBean(COB000Controller.NAME, COB000Controller.INIT));
    	//画面名設定
    	this.viewName = NAME;
    }


    /**
     * フォームの生成
     * @return フォーム
     */
    @ModelAttribute("form")
    public MTA010Form getForm() {
    	return new MTA010Form();
    }


    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(value = "/init")
    public String init(@ModelAttribute("form") MTA010Form form) {
    	//初回検索
    	this.service.searchAuthAssign(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 検索処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(params = "search")
    public String search(@ModelAttribute("form") MTA010Form form) {
    	//検索
    	this.service.searchAuthAssign(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 更新処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(params = "update")
    public String update(@ModelAttribute("form") MTA010Form form, BindingResult result) {
    	try {
    		//ユーザ権限の登録更新処理
    		this.service.updateAuth(form);
    	} catch (DataChangedException ex) {
    		result.addError(new ObjectError("form", "ほかの端末で更新済みです。画面を再表示して、再度更新を行ってください。"));
    	}
    	//検索
    	this.service.searchAuthAssign(form);
    	//自画面を表示
    	return MY_VIEW;
    }
}

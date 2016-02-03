package jp.co.kunisys.member.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import jp.co.kunisys.member.bean.BreadCrumbBean;
import jp.co.kunisys.member.form.MTA020Form;
import jp.co.kunisys.member.service.MTA020Service;

/**
 * 権限情報一覧画面コントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/MTA020")
public class MTA020Controller extends AbstractController {

    /** 画面名. */
    public static final String NAME = "権限情報一覧";
    /** 初期処理 */
    public static final String INIT = "/MTA020/init";

    /** 自画面テンプレート. */
    private static final String MY_VIEW = "mta/mta020main";

    /** サービスクラス */
    @Autowired
    private MTA020Service service;


    /**
     * コンストラクタ
     */
    public MTA020Controller() {
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
    public MTA020Form getForm() {
    	return new MTA020Form();
    }


    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(value = "/init")
    public String init(@ModelAttribute("form") MTA020Form form) {
    	//初回検索
    	this.service.searchAuthList(form);
    	//自画面を表示
    	return MY_VIEW;
    }

}

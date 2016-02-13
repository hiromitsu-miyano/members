package jp.co.kunisys.member.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import jp.co.kunisys.member.bean.BreadCrumbBean;
import jp.co.kunisys.member.form.MTB010Form;
import jp.co.kunisys.member.service.MTB010Service;

/**
 * 部署メンテナンスコントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/MTB010")
public class MTB010Controller extends AbstractController {

    /** 画面名. */
    public static final String NAME = "部署情報一覧";
    /** 初期処理 */
    public static final String INIT = "/MTB010/init";

    /** 自画面テンプレート. */
    private static final String MY_VIEW = "mtb/mbt010main";

    /** サービスクラス */
    @Autowired
    private MTB010Service service;


    /**
     * コンストラクタ
     */
    public MTB010Controller() {
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
    @ModelAttribute("mtb010Form")
    public MTB010Form getForm() {
    	return new MTB010Form();
    }


    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(value = "/init")
    public String init(@ModelAttribute("mtb010Form") MTB010Form form) {
    	//初回検索
    	this.service.searchDepartmentList(form);
    	//自画面を表示
    	return MY_VIEW;
    }

}

package jp.co.kunisys.member.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import jp.co.kunisys.member.bean.BreadCrumbBean;
import jp.co.kunisys.member.form.MTD010Form;
import jp.co.kunisys.member.service.MTD010Service;

/**
 * 職位情報編集コントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/MTD010")
public class MTD010Controller extends AbstractController {

    /** 画面名. */
    public static final String NAME = "スキルメンテナンス";

    /** 自画面テンプレート. */
    private static final String MY_VIEW = "mtd/mtd010main";

    /** サービスクラス */
    @Autowired
    private MTD010Service service;


    /**
     * コンストラクタ
     */
    public MTD010Controller() {
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
    @ModelAttribute("mtd010Form")
    public MTD010Form getForm() {
    	return new MTD010Form();
    }


    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(value = "/init")
    public String init(@ModelAttribute("mtd010Form") MTD010Form form) {
    	//ツリーデータ生成
    	this.service.createSkillTreeInfo(form);
    	//自画面を表示
    	return MY_VIEW;
    }


}

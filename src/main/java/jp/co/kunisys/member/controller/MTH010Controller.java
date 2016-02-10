package jp.co.kunisys.member.controller;

import java.util.ArrayList;

import org.jooq.exception.DataChangedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;

import jp.co.kunisys.member.bean.BreadCrumbBean;
import jp.co.kunisys.member.form.MTH010Form;
import jp.co.kunisys.member.service.MTH010Service;

/**
 * 連携用ユーザ情報メンテナンス コントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/MTH010")
@SessionAttributes(value = "form")
public class MTH010Controller extends AbstractController {

    /** 画面名. */
    public static final String NAME = "連携用ユーザ情報メンテナンス";
    /** 初期処理 */
    public static final String INIT = "/MTH010/init";

    /** 自画面テンプレート. */
    private static final String MY_VIEW = "mth/mth010main";

    /** サービスクラス */
    @Autowired
    private MTH010Service service;

    /**
     * コンストラクタ
     */
    public MTH010Controller() {
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
    public MTH010Form createForm() {
    	return new MTH010Form();
    }



    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @PreAuthorize("hasRole('MTH010_INIT')")
    @RequestMapping(value = "/init")
    public String init(@ModelAttribute("form") MTH010Form form) {
    	//部署リストの検索処理
    	this.service.searchDeptList(form);
    	//職位リストの検索処理
    	this.service.searchPostList(form);
    	//連携用ユーザリストの検索処理
    	this.service.searchRelateUserList(form);

    	form.setSrchDeptCd("00300");
    	form.setSrchPostCd("04");

    	//社員の検索処理
    	this.service.searchMemberList(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 検索処理
     * @param form フォーム
     * @return 自画面
     */
    @PreAuthorize("hasRole('MTH010_SEARCHRELATEUSER')")
    @RequestMapping(params = "searchRelateUser")
    public String searchRelateUser(@ModelAttribute("form") MTH010Form form) {
    	//社員の検索処理
    	this.service.searchMemberList(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 更新処理
     * @param form フォーム
     * @param result バリデート結果
     * @return 自画面
     */
    @PreAuthorize("hasRole('MTH010_UPDATERELATEUSER')")
    @RequestMapping(params = "updateRelateUser")
    public String updateRelateUser(@ModelAttribute("form") MTH010Form form, BindingResult result, Model model) {
    	try {
    		//連携用ユーザ情報の更新処理
    		this.service.updateRelateUser(form);
    	} catch (DataChangedException e) {
    		//排他エラー時
    		result.reject("warning.optimistic");
    	}
    	//社員の検索処理
    	this.service.searchMemberList(form);
    	model.addAttribute("finished", true);
    	//自画面を表示
    	return MY_VIEW;
    }

}

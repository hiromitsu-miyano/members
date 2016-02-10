package jp.co.kunisys.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.jooq.exception.DataChangedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import jp.co.kunisys.member.bean.BreadCrumbBean;
import jp.co.kunisys.member.bean.CodeBean;
import jp.co.kunisys.member.common.Code;
import jp.co.kunisys.member.form.MTG010Form;
import jp.co.kunisys.member.service.MTG010Service;

/**
 * 学校マスタメンテナンス コントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/MTG010")
public class MTG010Controller extends AbstractController {

    /** 画面名. */
    public static final String NAME = "学校マスタメンテナンス";
    /** 初期処理 */
    public static final String INIT = "/MTG010/init";

    /** 自画面テンプレート. */
    private static final String MY_VIEW = "mtg/mtg010main";
    /** 自画面テンプレート(明細部). */
    private static final String MY_VIEW_LIST = "mtg/mtg010list";
    /** 自画面テンプレート(編集部) */
    private static final String MY_DIALOG = "mtg/mtg010dialog";

    /** サービスクラス */
    @Autowired
    private MTG010Service service;

    /**
     * コンストラクタ
     */
    public MTG010Controller() {
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
    public MTG010Form createForm() {
    	MTG010Form form = new MTG010Form();
    	//都道府県リスト
    	List<CodeBean> prefList = Code.getCodeList(Code.PREF.TYPE);
    	form.setPrefList(prefList);
    	//学校区分リスト
    	List<CodeBean> schoolTypeList = Code.getCodeList(Code.SCHOOL_TYPE.TYPE);
    	form.setSchoolTypeList(schoolTypeList);
    	return form;
    }



    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @PreAuthorize("hasRole('MTG010_INIT')")
    @RequestMapping(value = "/init")
    public String init(@ModelAttribute("form") MTG010Form form) {
    	//学校一覧の検索処理
    	this.service.searchSchoolList(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 検索処理
     * @param form フォーム
     * @return 自画面一覧
     */
    @PreAuthorize("hasRole('MTG010_SEARCHSCHOOL')")
    @RequestMapping(value = "/searchSchool")
    public String searchSchool(@ModelAttribute("form") MTG010Form form) {
    	//学校一覧の検索処理
    	this.service.searchSchoolList(form);
    	//自画面一覧を表示
    	return MY_VIEW_LIST;
    }


    /**
     * 選択処理
     * @param form フォーム
     * @return フォーム
     */
    @PreAuthorize("hasRole('MTG010_SELECTSCHOOL')")
    @RequestMapping(value = "/selectSchool")
    public String selectSchool(@ModelAttribute("form") MTG010Form form) {
    	//学校の選択処理
    	this.service.selectSchool(form);
    	//フォームを返却
    	return MY_DIALOG;
    }


    /**
     * 登録処理
     * @param form フォーム
     * @param result BindingResult
     * @param model Model
     * @return フォーム
     */
    @PreAuthorize("hasRole('MTG010_INSERTSCHOOL')")
    @RequestMapping(value = "/insertSchool")
    public String insertSchool(@ModelAttribute("form") MTG010Form form, BindingResult result, Model model) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_DIALOG;
    	}
    	//学校の登録処理
		this.service.insertSchool(form);
    	return MY_DIALOG;
    }


    /**
     * 更新処理
     * @param form フォーム
     * @param result BindingResult
     * @param model Model
     * @return フォーム
     */
    @PreAuthorize("hasRole('MTG010_UPDATESCHOOL')")
    @RequestMapping(value = "/updateSchool")
    public String updateSchool(@ModelAttribute("form") MTG010Form form, BindingResult result, Model model) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_DIALOG;
    	}
    	//学校の更新処理
    	try {
    		this.service.updateSchool(form);
    	} catch (DataChangedException e) {
    		//排他エラー時
    		result.reject("warning.optimistic");
    	}
    	return MY_DIALOG;
    }


    /**
     * 削除処理
     * @param form フォーム
     * @param result BindingResult
     * @param model Model
     * @return フォーム
     */
    @PreAuthorize("hasRole('MTG010_DELETESCHOOL')")
    @RequestMapping(value = "/deleteSchool")
    public String deleteSchool(@ModelAttribute("form") MTG010Form form, BindingResult result, Model model) {
    	//入力チェック
    	this.service.checkInput(form, result);
    	if (result.hasErrors()) {
    		return MY_DIALOG;
    	}
    	//学校の削除処理
    	try {
    		this.service.deleteSchool(form);
    	} catch (DataChangedException e) {
    		//排他エラー時
    		result.reject("warning.optimistic");
    	}
    	return MY_DIALOG;
    }

}

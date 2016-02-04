package jp.co.kunisys.member.controller;

import java.util.ArrayList;

import org.jooq.exception.DataChangedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;

import jp.co.kunisys.member.bean.BreadCrumbBean;
import jp.co.kunisys.member.form.MTA030Form;
import jp.co.kunisys.member.service.MTA030Service;

/**
 * 権限情報編集画面コントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/MTA030")
@SessionAttributes(value = "form")
public class MTA030Controller extends AbstractController {

    /** 画面名. */
    public static final String NAME = "権限情報編集";
    /** 初期処理 */
    public static final String INIT = "/MTA030/init";

    /** 自画面テンプレート. */
    private static final String MY_VIEW = "mta/mta030main";

    /** サービスクラス */
    @Autowired
    private MTA030Service service;


    /**
     * コンストラクタ
     */
    public MTA030Controller() {
    	//パン屑リスト生成
    	this.breadCrumbTrails = new ArrayList<>();
    	this.breadCrumbTrails.add(new BreadCrumbBean(COB000Controller.NAME, COB000Controller.INIT));
    	this.breadCrumbTrails.add(new BreadCrumbBean(MTA020Controller.NAME, MTA020Controller.INIT));
    	//画面名設定
    	this.viewName = NAME;
    }


    /**
     * フォームの生成
     * @return フォーム
     */
    @ModelAttribute("form")
    public MTA030Form getForm() {
    	return new MTA030Form();
    }
    /**
     * バインダ設定
     * @param binder バインダ
     */
    @InitBinder("form")
    public void initBinder(WebDataBinder binder) {
    	//型変換時自動生成コレクションの上限(256)を拡張する
    	binder.setAutoGrowCollectionLimit(1000);
    }


    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(value = "/init")
    public String initInsert(@ModelAttribute("form") MTA030Form form,
    						@RequestParam("paramAuthCd") String paramAuthCd) {
    	//初回検索
    	form.setParamAuthCd(paramAuthCd);
		this.service.searchAuth(form);
    	this.service.searchAuthFunctionList(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 登録処理
     * @param form フォーム
     * @param result バリデート結果
     * @return 自画面
     */
    @RequestMapping(params = "insertAuth")
    public String insert(@ModelAttribute("form") MTA030Form form, BindingResult result) {
    	//独自チェック
    	this.service.checkInsert(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW;
    	}

    	//権限の登録処理
    	this.service.insertAuth(form);

    	return "redirect:" + MTA020Controller.INIT;
    }


    /**
     * 更新処理
     * @param form フォーム
     * @param result バリデート結果
     * @return 自画面
     */
    @RequestMapping(params = "updateAuth")
    public String update(@ModelAttribute("form") MTA030Form form, BindingResult result) {
    	//独自チェック
    	this.service.checkUpdate(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW;
    	}
    	//更新処理
    	try {
    		this.service.updateAuth(form);

    	} catch(DataChangedException ex) {
    		//排他エラー時
    		result.reject("warning.optimistic");
    	}

    	return "redirect:" + MTA020Controller.INIT;
    }


    /**
     * 削除処理
     * @param form フォーム
     * @param result バリデート結果
     * @return 自画面
     */
    @RequestMapping(params = "deleteAuth")
    public String delete(@ModelAttribute("form") MTA030Form form, BindingResult result) {
    	//独自チェック
    	this.service.checkUpdate(form, result);
    	if (result.hasErrors()) {
    		return MY_VIEW;
    	}
    	//削除処理
    	try {
    		this.service.deleteAuth(form);

    	} catch(DataChangedException ex) {
    		//排他エラー時
    		result.reject("warning.optimistic");
    	}

    	return "redirect:" + MTA020Controller.INIT;
    }
}

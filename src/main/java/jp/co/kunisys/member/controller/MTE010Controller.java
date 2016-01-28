package jp.co.kunisys.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.co.kunisys.member.form.MTE010Form;
import jp.co.kunisys.member.service.MTE010Service;

/**
 * 勤務先メンテナンス画面コントローラ
 */
@Controller
@Scope("prototype")
@RequestMapping(value = "/MTE010")
@SessionAttributes(value = "form")
public class MTE010Controller extends AbstractController {

    /** 自画面テンプレート */
    private static final String MY_VIEW = "mte/mte010main";
    /** 自画面テンプレート(一覧部) */
    private static final String MY_VIEW_LIST = "mte/mte010list";

    /** サービスクラス */
    @Autowired
    private MTE010Service mte010Service;


    /**
     * フォームの生成
     * @return フォーム
     */
    @ModelAttribute("form")
    public MTE010Form getForm() {
    	return new MTE010Form();
    }


    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(value = "/init")
    public String init(@ModelAttribute("form") MTE010Form form) {
    	//フォームの初期化
    	form.init();
    	//初回検索
    	this.mte010Service.sarchWorkplaceList(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 勤務先一覧検索処理
     * @param form フォーム
     * @return 自画面一覧部
     */
    @RequestMapping(value = "/searchWorkplace")
    public String searchWorkplace(@ModelAttribute("form") MTE010Form form) {
    	//勤務先一覧を検索
    	this.mte010Service.sarchWorkplaceList(form);
    	//自画面一覧を返却
    	return MY_VIEW_LIST;
    }


    /**
     * 勤務先の選択処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(value = "/selectWorkplace")
    public String selectWorkplace(@ModelAttribute("form") MTE010Form form) {
    	//勤務先の選択処理
    	this.mte010Service.selectWorkplace(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 勤務先の登録処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(params = "insertWorkplace")
    public String insertWorkplace(@ModelAttribute("form") MTE010Form form) {
    	//勤務先の登録処理
    	this.mte010Service.insertWorkplace(form);
    	//初期化
    	this.init(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 勤務先の更新処理
     * @param form フォーム
     * @return 自画面
     */
    @RequestMapping(params = "updateWorkplace")
    public String updateWorkplace(@ModelAttribute("form") MTE010Form form) {
    	//勤務先の更新処理
    	this.mte010Service.updateWorkplace(form);
    	//初期化
    	this.init(form);
    	//自画面を表示
    	return MY_VIEW;
    }
}

package jp.co.kunisys.member.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import jp.co.kunisys.member.form.COB000Form;
import jp.co.kunisys.member.service.COB000Service;

/**
 * トップ画面コントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/COB000")
public class COB000Controller extends AbstractController {

	/** 画面名 */
	public static final String NAME = "メニュー";
	/** 初期処理 */
	public static final String INIT = "/COB000/init";

    /** 自画面JSP. */
    private static final String MY_VIEW = "cob/COB000Top";

    @Autowired
    private COB000Service cob000Service;


    /**
     * コンストラクタ
     */
    public COB000Controller() {
    	//パン屑リスト生成
    	this.breadCrumbTrails = new ArrayList<>();
    	//画面名設定
    	this.viewName = NAME;
    }


    /**
     * 初期処理
     * @return 自画面
     */
    @RequestMapping(value = "/init")
    public String init() {
    	this.cob000Service.searchMessageListLimit();
    	return MY_VIEW;
    }


    @ResponseBody
    @RequestMapping(value = "/updatePassword")
    public COB000Form updatePassword(@ModelAttribute("form") COB000Form form) {

    	boolean ret = this.cob000Service.changePassword(form);
    	if (!ret) {
    		form.setResult("パスワードに誤りがあります。");
    		form.setResultReason("oldPassword");
    	}
    	return form;
    }
}

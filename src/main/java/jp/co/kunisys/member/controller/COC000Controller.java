package jp.co.kunisys.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.kunisys.member.form.COC000Form;

/**
 * エラー画面 コントローラ
 */
@Controller
@RequestMapping(value = "/COC000")
public class COC000Controller {

	/** 画面名 */
	public static final String NAME = "メニュー";
	/** 初期処理 */
	public static final String INIT = "/COB000/init";

    /** 自画面JSP. */
    private static final String MY_VIEW = "coc/coc000error";


    /**
     * コンストラクタ
     */
    public COC000Controller() {
    }


    /**
     * フォームの生成
     * @return フォーム
     */
    @ModelAttribute("form")
    public COC000Form getForm() {
    	return new COC000Form();
    }


    /**
     * 権限エラー表示
     * @return 自画面
     */
    @RequestMapping(value = "/forbidden")
    public String forbidden(@ModelAttribute("form") COC000Form form) {
    	form.setMessage1("権限エラー");
    	form.setMessage2("権限が与えられていません。");
    	return MY_VIEW;
    }

}

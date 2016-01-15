package jp.co.kunisys.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.kunisys.member.form.COB000Form;

/**
 * トップ画面コントローラ
 */
@Controller
@RequestMapping(value = "/COB000")
public class COB000Controller {

    /** 自画面JSP. */
    private static final String MY_VIEW = "cob/COB000Top";


    /**
     * 初期処理
     * @return 自画面
     */
    @RequestMapping(value = "/init")
    public String init() {
    	return MY_VIEW;
    }

    @RequestMapping(value = "/updatePassword")
    public String updatePassword(@ModelAttribute("form") COB000Form form) {
    	return null;
    }
}

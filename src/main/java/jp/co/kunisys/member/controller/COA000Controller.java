package jp.co.kunisys.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ログイン画面 コントローラ
 */
@Controller
@RequestMapping(value = "/COA000")
public class COA000Controller {

    /** 自画面JSP. */
    private static final String MY_VIEW = "coa/coa000login";

    /**
     * 初期処理
     * @return 自画面
     */
    @RequestMapping(value = "/init")
	public String init() {
		return MY_VIEW;
	}
}

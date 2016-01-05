package jp.co.kunisys.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * トップ画面コントローラ
 */
@Controller
@RequestMapping(value = "/COB000")
public class COB000Controller {

    /** 自画面JSP. */
    private static final String MY_VIEW = "cob/COB000Top";


    @RequestMapping(value = "/init")
    public String init() {
    	return MY_VIEW;
    }
}

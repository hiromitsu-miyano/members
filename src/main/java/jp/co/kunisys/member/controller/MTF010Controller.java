package jp.co.kunisys.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import jp.co.kunisys.member.bean.BreadCrumbBean;
import jp.co.kunisys.member.common.BeanMap;
import jp.co.kunisys.member.form.MTF010Form;
import jp.co.kunisys.member.repository.KubunRepository;
import jp.co.kunisys.member.service.MTF010Service;

/**
 * 区分メンテナンス画面コントローラ
 */
@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/MTF010")
public class MTF010Controller extends AbstractController {

    /** 画面名. */
    public static final String NAME = "区分マスタメンテナンス";
    /** 初期処理 */
    public static final String INIT = "/MTF010/init";

    /** 自画面JSP. */
    private static final String MY_VIEW = "mtf/mtf010kubunedit";
    /** 自画面JSP(明細部). */
    private static final String MY_VIEW_LIST = "mtf/mtf010list";

    /** サービスクラス */
    @Autowired
    private MTF010Service mtf010Service;

    /**
     * コンストラクタ
     */
    public MTF010Controller() {
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
    public MTF010Form createForm() {
    	return new MTF010Form();
    }



    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
    @PreAuthorize("hasRole('MTF010_INIT')")
    @RequestMapping(value = "/init")
    public String init(@ModelAttribute("form") MTF010Form form) {
    	//区分種別リスト生成
    	List<BeanMap> kubunTypeList = this.mtf010Service.createKubunTypeList();
    	form.setKubunTypeList(kubunTypeList);
    	//初期検索
    	form.setSelectKubunType(KubunRepository.KUBUN_TYPE_ROOT);
    	this.mtf010Service.searchKubunList(form);
    	//自画面を表示
    	return MY_VIEW;
    }


    /**
     * 検索処理
     * @param form フォーム
     * @return 自画面リスト
     */
    @PreAuthorize("hasRole('MTF010_SEARCHKUBUN')")
    @RequestMapping(value = "/searchKubun")
    public String searchKubun(@ModelAttribute("form") MTF010Form form) {
    	//検索処理
    	this.mtf010Service.searchKubunList(form);
    	//一覧を返す
    	return MY_VIEW_LIST;
    }


    /**
     * 選択処理
     * @param form フォーム
     * @return フォーム(JSON)
     */
    @PreAuthorize("hasRole('MTF010_SELECTKUBUN')")
    @ResponseBody
    @RequestMapping(value = "/selectKubun")
    public MTF010Form selectKubun(@ModelAttribute("form") MTF010Form form) {
    	//区分の選択処理
    	this.mtf010Service.selectKubun(form);
    	//フォームを返却(JSON)
    	return form;
    }


    /**
     * 登録処理
     * @param form フォーム
     * @return フォーム(JSON)
     */
    @PreAuthorize("hasRole('MTF010_INSERTKUBUN')")
    @ResponseBody
    @RequestMapping(value = "/insertKubun")
    public MTF010Form insertKubun(@ModelAttribute("form") MTF010Form form) {
    	//区分の登録処理
    	this.mtf010Service.insertKubun(form);
    	//区分種別リスト生成
    	List<BeanMap> kubunTypeList = this.mtf010Service.createKubunTypeList();
    	form.setKubunTypeList(kubunTypeList);
    	//フォームを返却(JSON)
    	return form;
    }


    /**
     * 更新処理
     * @param form フォーム
     * @return フォーム(JSON)
     */
    @PreAuthorize("hasRole('MTF010_UPDATEKUBUN')")
    @ResponseBody
    @RequestMapping(value = "/updateKubun")
    public MTF010Form updateKubun(@ModelAttribute("form") MTF010Form form) {
    	//区分の更新処理
    	this.mtf010Service.updateKubun(form);
    	//フォームを返却(JSON)
    	return form;
    }


    /**
     * 削除処理
     * @param form フォーム
     * @return フォーム(JSON)
     */
    @PreAuthorize("hasRole('MTF010_DELETEKUBUN')")
    @ResponseBody
    @RequestMapping(value = "/deleteKubun")
    public MTF010Form deleteKubun(@ModelAttribute("form") MTF010Form form) {
    	//区分の削除処理
    	this.mtf010Service.deleteKubun(form);
    	//区分種別リスト生成
    	List<BeanMap> kubunTypeList = this.mtf010Service.createKubunTypeList();
    	form.setKubunTypeList(kubunTypeList);
    	//フォームを返却(JSON)
    	return form;
    }
}

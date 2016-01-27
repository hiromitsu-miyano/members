package jp.co.kunisys.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.kunisys.member.common.BeanMap;
import jp.co.kunisys.member.form.MTF010Form;
import jp.co.kunisys.member.repository.KubunRepository;
import jp.co.kunisys.member.service.MTF010Service;

/**
 * 区分メンテナンス画面コントローラ
 */
@Controller
@RequestMapping(value = "/MTF010")
public class MTF010Controller {

    /** 自画面JSP. */
    private static final String MY_VIEW = "mtf/mtf010kubunedit";
    /** 自画面JSP(明細部). */
    private static final String MY_VIEW_LIST = "mtf/mtf010list";

    /** サービスクラス */
    @Autowired
    private MTF010Service mtf010Service;


    /**
     * 初期処理
     * @param form フォーム
     * @return 自画面
     */
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

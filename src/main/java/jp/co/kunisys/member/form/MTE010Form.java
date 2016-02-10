package jp.co.kunisys.member.form;

import java.io.Serializable;
import java.util.List;

import jp.co.kunisys.member.bean.CodeBean;
import jp.co.kunisys.member.common.BeanMap;
import jp.co.kunisys.member.common.Code;
import lombok.Data;

/**
 * 勤務先メンテナンス画面フォーム
 */
@Data
public class MTE010Form implements Serializable {

	/** 勤務先区分リスト */
	private List<CodeBean> typeList;

    /** 選択ソートカラム. */
	private String selectSortColumn;
    /** 選択ソートオーダー. */
	private String selectSortOrder;

    /** 勤務先一覧. */
	private List<BeanMap> workplaceList;

    /** 勤務先ID. */
	private Integer inWorkplaceId;
    /** 勤務先名. */
	private String inName;
    /** 勤務先区分 */
	private String inWorkplaceType;
    /** 削除チェック */
	private boolean inDelete;
    /** 備考. */
	private String inRemark;
    /** バージョン */
	private Integer inVersion;


    /**
     * フォームの初期化
     */
    public void init() {
    	this.typeList = Code.getCodeList(Code.WORKPLACE_KUBUN.TYPE);
    	this.inWorkplaceId = null;
    	this.inName = null;
    	this.inWorkplaceType = null;
    	this.inRemark = null;
    	this.inDelete = false;
    	this.inVersion = null;
    }

}

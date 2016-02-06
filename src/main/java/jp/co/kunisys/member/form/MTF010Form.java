package jp.co.kunisys.member.form;

import java.io.Serializable;
import java.util.List;

import jp.co.kunisys.member.common.BeanMap;
import lombok.Data;

/**
 * 区分メンテナンス画面フォーム
 */
@Data
public class MTF010Form implements Serializable {

	/** 区分種別リスト */
	private List<BeanMap> kubunTypeList;
	/** 区分リスト */
	private List<BeanMap> kubunList;

	/** 選択区分種別 */
	private String selectKubunType;
	/** 選択区分番号 */
	private Integer selectSeq;

    /** 入力:区分番号. */
	private Integer inputSeq;
    /** 入力:区分種別コード. */
	private String inputTypeCode;
    /** 入力:区分種別名. */
	private String inputTypeName;
    /** 入力:区分コード. */
	private String inputCode;
    /** 入力:区分名. */
	private String inputName;
    /** 入力:バージョン. */
	private Integer inputVersion;

}

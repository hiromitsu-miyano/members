package jp.co.kunisys.member.form;

import java.util.List;

import jp.co.kunisys.member.bean.mta.ControllerBean;
import jp.co.kunisys.member.query.tables.records.AuthFunctionRecord;
import lombok.Data;

/**
 * 機能権限編集フォーム
 */
@Data
public class MTA040Form {

	/** コントローラリスト */
	private List<ControllerBean> controllerList;

	/** 検索：クラス名 */
	private String selectClassName;
	/** 検索：ソートカラム */
	private String selectSortColumn = "sortkey";
	/** 検索：ソートオーダー */
	private String selectSortOrder = "ASC";

	/** 機能権限一覧 */
	private List<AuthFunctionRecord> authFunctionList;

	/** 編集モード */
	private boolean edited;
    /** 機能権限コード. */
	private String inputAuthFunctionCd;
    /** 名称. */
	private String inputName;
    /** クラス名. */
	private String inputClassName;
    /** アクション名. */
	private String inputActionName;
    /** コメント. */
	private String inputComment;
    /** 並び順. */
	private Integer inputSortkey;

}

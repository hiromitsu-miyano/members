package jp.co.kunisys.member.form;

import java.util.List;

import jp.co.kunisys.member.bean.mta.AuthFuncBean;
import lombok.Data;

/**
 * 権限情報編集画面フォーム
 */
@Data
public class MTA030Form {

	/** パラメータ：権限コード */
	private String paramAuthCd;

	/** 権限コード */
	private String authCd;
	/** 権限名 */
	private String name;
	/** バージョン */
	private Integer version;
	/** 機能権限一覧 */
	private List<AuthFuncBean> authFunctionList;
}

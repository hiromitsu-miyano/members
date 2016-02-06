package jp.co.kunisys.member.form;

import java.util.List;

import jp.co.kunisys.member.query.tables.records.AuthRecord;
import lombok.Data;

/**
 * 権限情報一覧画面フォーム
 */
@Data
public class MTA020Form {

	/** 完了フラグ */
	private boolean finish;

	/** 権限リスト */
	private List<AuthRecord> authList;

}

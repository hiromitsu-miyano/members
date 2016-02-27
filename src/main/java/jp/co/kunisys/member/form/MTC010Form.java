package jp.co.kunisys.member.form;

import java.util.List;

import jp.co.kunisys.member.query.tables.records.PostRecord;
import lombok.Data;

/**
 * 職位メンテナンスフォーム
 */
@Data
public class MTC010Form {

	/** 職位一覧 */
	private List<PostRecord> postList;

}

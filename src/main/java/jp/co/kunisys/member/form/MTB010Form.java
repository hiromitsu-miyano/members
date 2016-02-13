package jp.co.kunisys.member.form;

import java.util.List;

import jp.co.kunisys.member.query.tables.records.DepartmentRecord;
import lombok.Data;

/**
 * 部署メンテナンスフォーム
 */
@Data
public class MTB010Form {

	/** 部署一覧 */
	private List<DepartmentRecord> deptList;
}

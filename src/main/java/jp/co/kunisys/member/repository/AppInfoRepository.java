package jp.co.kunisys.member.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.entity.AppInfo;

/**
 * アプリケーション設定リポジトリ
 */
@Repository
public class AppInfoRepository extends AbstractRepository<AppInfo> {

	/**
	 * コンストラクタ
	 * @param ds データソース
	 */
	@Autowired
	public AppInfoRepository(DataSource ds) {
		setDataSource(ds);
	}
}

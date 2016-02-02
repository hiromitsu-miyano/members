package jp.co.kunisys.member.repository;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.AppInfoRecord;

/**
 * アプリケーション設定リポジトリ
 */
@Repository
public class AppInfoRepository {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * レコードを全件返す
	 * @return レコードのリスト
	 */
	public List<AppInfoRecord> findAllOrderById() {
		return this.create.selectFrom(Tables.APP_INFO)
							.orderBy(Tables.APP_INFO.APP_KEY)
							.fetch();
	}
}

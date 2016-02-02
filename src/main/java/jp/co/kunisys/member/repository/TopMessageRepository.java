package jp.co.kunisys.member.repository;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.TopMessageRecord;

/**
 * メッセージリポジトリ
 */
@Repository
public class TopMessageRepository {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * レコードを全件返す
	 * @return レコードのリスト
	 */
	public List<TopMessageRecord> findAllOrderById() {
		return this.create.selectFrom(Tables.TOP_MESSAGE)
							.orderBy(Tables.TOP_MESSAGE.MESSAGE_ID)
							.fetch();
	}
}

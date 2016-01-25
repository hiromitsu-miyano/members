package jp.co.kunisys.member.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.entity.TopMessage;

/**
 * メッセージリポジトリ
 */
@Repository
public class TopMessageRepository extends AbstractRepository<TopMessage> {

	/**
	 * コンストラクタ
	 * @param ds データソース
	 */
	@Autowired
	public TopMessageRepository(DataSource ds) {
		setDataSource(ds);
	}
}

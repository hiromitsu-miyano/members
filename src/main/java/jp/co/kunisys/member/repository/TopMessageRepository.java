package jp.co.kunisys.member.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * メッセージリポジトリ
 */
@Repository
public class TopMessageRepository extends AbstractRepository {

	/**
	 * コンストラクタ
	 * @param ds データソース
	 */
	@Autowired
	public TopMessageRepository(DataSource ds) {
		setDataSource(ds);
	}
}

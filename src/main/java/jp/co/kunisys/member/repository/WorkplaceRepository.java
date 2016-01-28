package jp.co.kunisys.member.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.entity.Workplace;

/**
 * 勤務先リポジトリ
 */
@Repository
public class WorkplaceRepository extends AbstractRepository<Workplace> {

	/**
	 * コンストラクタ
	 * @param ds データソース
	 */
	@Autowired
	public WorkplaceRepository(DataSource ds) {
		setDataSource(ds);
	}


	/**
	 * 主キーでエンティティを検索する
	 * @param workplaceId 勤務先ID
	 * @return エンティティ
	 */
	public Workplace findById(Integer workplaceId) {
		Workplace param = new Workplace();
		param.setWorkplaceId(workplaceId);
		return findOneById(param);
	}


	/**
	 * 勤務先ID の採番処理
	 * @return 採番された勤務先ID
	 */
	public Integer createWorkplaceId() {
		String sql = "select max(workplace_id) from workplace";
		Integer maxId = getNamedParameterJdbcTemplate().queryForObject(sql, new EmptySqlParameterSource(), Integer.class);
		if (maxId == null) {
			maxId = 0;
		}
		maxId++;
		return maxId;
	}
}

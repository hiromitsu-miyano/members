package jp.co.kunisys.member.repository;

import static org.jooq.impl.DSL.*;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.WorkplaceRecord;

/**
 * 勤務先リポジトリ
 */
@Repository
public class WorkplaceRepository {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * レコードを全件検索する。
	 * @return レコードのリスト
	 */
	public List<WorkplaceRecord> findAllOrderById() {
		return this.create.selectFrom(Tables.WORKPLACE)
							.orderBy(Tables.WORKPLACE.WORKPLACE_ID)
							.fetch();
	}

	/**
	 * 主キーでエンティティを検索する
	 * @param workplaceId 勤務先ID
	 * @return エンティティ
	 */
	public WorkplaceRecord findById(Integer workplaceId) {
		return this.create.selectFrom(Tables.WORKPLACE)
							.where(Tables.WORKPLACE.WORKPLACE_ID.eq(workplaceId))
							.fetchOne();
	}


	/**
	 * 勤務先ID の採番処理
	 * @return 採番された勤務先ID
	 */
	public Integer createWorkplaceId() {
		Integer maxId = this.create.select(max(Tables.WORKPLACE.WORKPLACE_ID))
									.from(Tables.WORKPLACE)
									.fetchOneInto(Integer.class);
		if (maxId == null) {
			maxId = 0;
		}
		maxId++;
		return maxId;
	}
}

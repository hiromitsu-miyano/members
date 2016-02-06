package jp.co.kunisys.member.repository;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.UserInfoRecord;

/**
 * ユーザ情報リポジトリ
 */
@Repository
public class UserInfoRepository {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * ユーザ情報取得
	 * @param userId ユーザID
	 * @return ユーザ情報
	 */
	public UserInfoRecord findById(Integer userId) {
		return this.create.selectFrom(Tables.USER_INFO)
							.where(Tables.USER_INFO.USER_ID.eq(userId))
							.fetchOne();
	}

	/**
	 * ユーザ情報取得
	 * @param account アカウント
	 * @return ユーザ情報リスト
	 */
	public List<UserInfoRecord> findByAccount(String account) {
		return this.create.selectFrom(Tables.USER_INFO)
							.where(Tables.USER_INFO.ACCOUNT.eq(account))
							.fetch();
	}
}

package jp.co.kunisys.member.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.entity.UserInfo;

/**
 * ユーザ情報リポジトリ
 */
@Repository
public class UserInfoRepository extends AbstractRepository<UserInfo> {

	/**
	 * コンストラクタ
	 * @param ds データソース
	 */
	@Autowired
	public UserInfoRepository(DataSource ds) {
		setDataSource(ds);
	}

	/**
	 * ユーザ情報取得
	 * @param userId ユーザID
	 * @return ユーザ情報
	 */
	public UserInfo findById(Integer userId) {
		//パラメータ生成
		UserInfo entity = new UserInfo();
		entity.setUserId(userId);
		//実行
		return findOneById(entity);
	}

	/**
	 * ユーザ情報取得
	 * @param account アカウント
	 * @return ユーザ情報リスト
	 */
	public List<UserInfo> findByAccount(String account) {
		//パラメータ生成
		UserInfo entity = new UserInfo();
		entity.setAccount(account);
		//実行
		return findByParam(entity);
	}
}

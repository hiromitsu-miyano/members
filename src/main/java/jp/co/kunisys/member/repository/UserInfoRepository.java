package jp.co.kunisys.member.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.entity.UserInfo;

/**
 * ユーザ情報リポジトリ
 */
@Repository
public class UserInfoRepository extends AbstractRepository {

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
	public UserInfo findByUserId(Integer userId) {
		//SQL生成
		StringBuilder sql = new StringBuilder();
		sql.append("select * from user_info where user_id = :user_id ");
		//パラメータ生成
		UserInfo entity = new UserInfo();
		entity.setUserId(userId);
		SqlParameterSource param = new BeanPropertySqlParameterSource(entity);
		//実行
		return getNamedParameterJdbcTemplate().queryForObject(sql.toString(), param, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
	}

	/**
	 * ユーザ情報取得
	 * @param account アカウント
	 * @return ユーザ情報リスト
	 */
	public List<UserInfo> findByAccount(String account) {
		//SQL生成
		StringBuilder sql = new StringBuilder();
		sql.append("select * from user_info where account = :account ");
		//パラメータ生成
		UserInfo entity = new UserInfo();
		entity.setAccount(account);
		SqlParameterSource param = new BeanPropertySqlParameterSource(entity);
		//実行
		return getNamedParameterJdbcTemplate().query(sql.toString(), param, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
	}
}

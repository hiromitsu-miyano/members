package jp.co.kunisys.member.repository;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Version;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import jp.co.kunisys.member.common.SUtil;

/**
 * リポジトリの親クラス
 */
public abstract class AbstractRepository<T> extends NamedParameterJdbcDaoSupport {

	/** ロガー */
	private static final Logger log = LoggerFactory.getLogger(AbstractRepository.class);

	/**
	 * エンティティクラスを返す。
	 * @return エンティティクラス
	 */
	@SuppressWarnings("unchecked")
	private Class<T> getEntityClass() {
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		Class<?> entityClazz = (Class<?>) pt.getActualTypeArguments()[0];
		return (Class<T>) entityClazz;
	}

	/**
	 * テーブル名を返す。
	 * @return テーブル名
	 */
	protected String getTableName() {
		return SUtil.decamelize(getEntityClass().getSimpleName()).toLowerCase();
	}

	/**
	 * エンティティの項目リストを返す。
	 * @return エンティティの項目リスト
	 */
	private List<String> getEntityFieldList(Class<? extends Annotation> annotationClazz) {
		List<String> idList = new ArrayList<>();
		Class<T> entityClazz = getEntityClass();
		for (Field f : entityClazz.getDeclaredFields()) {
			if (f.isAnnotationPresent(annotationClazz)) {
				idList.add(f.getName());
			}
		}
		return idList;
	}

	/**
	 * バージョンチェック処理
	 * @param entity1 エンティティ１
	 * @param entity2 エンティティ２
	 * @return
	 */
	protected boolean equalVersion(T entity1, T entity2) {
		Field f1 = null;
		for (Field f : entity1.getClass().getDeclaredFields()) {
			if (f.isAnnotationPresent(Version.class)) {
				f1 = f;
				break;
			}
		}
		if (f1 == null) {
			return true;
		}

		Field f2 = null;
		try {
			f2 = entity2.getClass().getDeclaredField(f1.getName());
		} catch (NoSuchFieldException | SecurityException e) {
			return true;
		}

		f1.setAccessible(true);
		f2.setAccessible(true);
		try {
			if (f1.get(entity1).equals(f2.get(entity2))) {
				return true;
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			return true;
		}

		return false;
	}

	/**
	 * where (主キー指定) を返す。
	 * @param incVersion バージョン指定有無
	 * @return where
	 */
	private String createWhereId(boolean incVersion) {
		List<String> idList = getEntityFieldList(Id.class);

		StringBuilder where = new StringBuilder();
		for (int i = 0; i < idList.size(); i++) {
			if (i == 0) where.append(" where ");
			else where.append(" and ");

			String name = idList.get(i);
			where.append(SUtil.decamelize(name).toLowerCase()).append(" = :").append(name);
		}
		if (incVersion) {
			List<String> versionList = getEntityFieldList(Version.class);
			for (String f : versionList) {
				where.append(" and ");
				where.append(SUtil.decamelize(f).toLowerCase()).append(" = :").append(f);
			}
		}
		return where.toString();
	}

	/**
	 * where (設定フィールド指定) を生成する
	 * @param param エンティティ
	 * @return where
	 */
	private String createWhere(T param) {
		StringBuilder where = new StringBuilder();
		for (Field f : param.getClass().getDeclaredFields()) {
			Object val;
			try {
				f.setAccessible(true);
				val = f.get(param);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				val = null;
			}
			if (val != null) {
				if (where.length() == 0) where.append(" where ");
				else where.append(" and ");
				String name = f.getName();
				where.append(SUtil.decamelize(name).toLowerCase()).append(" = :").append(name);
			}
		}
		return where.toString();
	}


	/**
	 * order by (主キー指定) を返す。
	 * @return order by
	 */
	private String createOrderId() {
		List<String> idList = getEntityFieldList(Id.class);

		StringBuilder order = new StringBuilder();
		for (int i = 0; i < idList.size(); i++) {
			if (i == 0) order.append(" order by ");
			else order.append(", ");

			String name = idList.get(i);
			order.append(SUtil.decamelize(name).toLowerCase());
		}
		return order.toString();
	}

	/**
	 * insertを生成する
	 * @return insert
	 */
	private String createInsert() {
		List<String> colList = getEntityFieldList(Column.class);
		StringBuilder targets = new StringBuilder();
		StringBuilder params = new StringBuilder();
		for (int i = 0; i < colList.size(); i++) {
			if (i == 0) {
				targets.append("insert into ").append(getTableName()).append(" (");
				params.append(") values (");
			} else {
				targets.append(", ");
				params.append(", ");
			}
			String name = colList.get(i);
			targets.append(SUtil.decamelize(name).toLowerCase());
			params.append(":").append(name);
		}
		return targets.toString() + params.toString() + ");";
	}

	/**
	 * update を生成する
	 * @return update
	 */
	private String createUpdate() {
		List<String> colList = getEntityFieldList(Column.class);
		List<String> idList = getEntityFieldList(Id.class);

		StringBuilder targets = new StringBuilder();
		for (int i = 0; i < colList.size(); i++) {
			String name = colList.get(i);
			if (idList.contains(name)) continue;
			//主キー以外を対象
			if (targets.length() == 0) targets.append("update ").append(getTableName()).append(" set ");
			else targets.append(", ");

			targets.append(SUtil.decamelize(name).toLowerCase()).append(" = :").append(name);
		}

		StringBuilder where = new StringBuilder();
		for (int i = 0; i < idList.size(); i++) {
			if (i == 0) where.append(" where ");
			else where.append(" and ");

			String name = idList.get(i);
			where.append(SUtil.decamelize(name).toLowerCase()).append(" = :").append(name);
		}

		return targets.toString() + where.toString() + ";";
	}

	/**
	 * delete を生成する
	 * @return delete
	 */
	private String createDelete() {
		List<String> idList = getEntityFieldList(Id.class);

		StringBuilder targets = new StringBuilder();
		targets.append("delete from ").append(getTableName());

		StringBuilder where = new StringBuilder();
		for (int i = 0; i < idList.size(); i++) {
			if (i == 0) where.append(" where ");
			else where.append(" and ");

			String name = idList.get(i);
			where.append(SUtil.decamelize(name).toLowerCase()).append(" = :").append(name);
		}

		return targets.toString() + where.toString() + ";";
	}

	/**
	 * 「select * from T」を返す。
	 * @return sql文字列
	 */
	private String createSelectAndFrom() {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from ").append(getTableName());
		return sql.toString();
	}

	/**
	 * エンティティを全て取得する。
	 * @return エンティティのリスト
	 */
	public List<T> findAll() {
		String sql = createSelectAndFrom();
		log.debug("SQL: " + sql);
		return getNamedParameterJdbcTemplate().query(sql, new EmptySqlParameterSource(), new BeanPropertyRowMapper<T>(getEntityClass()));
	}


	/**
	 * 主キーの昇順で、エンティティを全て取得する。
	 * @return エンティティのリスト
	 */
	public List<T> findAllOrderById() {
		String sql = createSelectAndFrom();
		sql = sql + createOrderId();
		log.debug("SQL: " + sql);
		return getNamedParameterJdbcTemplate().query(sql, new EmptySqlParameterSource(), new BeanPropertyRowMapper<T>(getEntityClass()));
	}


	/**
	 * 主キーで、エンティティを取得する
	 * @param param パラメータのエンティティ
	 * @return エンティティのリスト
	 */
	public List<T> findById(T param) {
		String sql = createSelectAndFrom();
		sql = sql + createWhereId(false);
		log.debug("SQL: " + sql);
		return getNamedParameterJdbcTemplate().query(sql, new BeanPropertySqlParameterSource(param), new BeanPropertyRowMapper<>(getEntityClass()));
	}

	/**
	 * 主キーで、エンティティを取得する
	 * @param param パラメータのエンティティ
	 * @return エンティティ
	 */
	public T findOneById(T param) {
		List<T> entityList = findById(param);
		return entityList.isEmpty() ? null : entityList.get(0);
	}

	/**
	 * 主キー及びバージョンで、エンティティを取得する
	 * @param param パラメータのエンティティ
	 * @return エンティティのリスト
	 */
	public List<T> findByIdVersion(T param) {
		String sql = createSelectAndFrom();
		sql = sql + createWhereId(true);
		log.debug("SQL: " + sql);
		return getNamedParameterJdbcTemplate().query(sql, new BeanPropertySqlParameterSource(param), new BeanPropertyRowMapper<>(getEntityClass()));
	}

	/**
	 * 主キー及びバージョンで、エンティティを取得する
	 * @param param パラメータのエンティティ
	 * @return エンティティ
	 */
	public T findOneByIdVersion(T param) {
		List<T> entityList = findByIdVersion(param);
		return entityList.isEmpty() ? null : entityList.get(0);
	}


	/**
	 * 指定項目を条件に、エンティティを取得する。
	 * @param param パラメータ設定のエンティティ
	 * @return エンティティ
	 */
	public T findOneByParam(T param) {
		List<T> entityList = findByParam(param);
		if (entityList.size() > 1) {
			throw new IncorrectResultSizeDataAccessException(1, entityList.size());
		}
		return entityList.isEmpty() ? null : entityList.get(0);
	}


	/**
	 * 指定項目を条件に、エンティティを取得する。
	 * @param param パラメータ設定のエンティティ
	 * @return エンティティのリスト
	 */
	public List<T> findByParam(T param) {
		String sql = createSelectAndFrom();
		sql = sql + createWhere(param);
		log.debug("SQL: " + sql);
		return getNamedParameterJdbcTemplate().query(sql.toString(), new BeanPropertySqlParameterSource(param), new BeanPropertyRowMapper<T>(getEntityClass()));
	}


	/**
	 * エンティティ内容をＤＢに追加する。
	 * @param entity エンティティ
	 * @return 登録件数
	 */
	public int insert(T entity) {
		String sql = createInsert();
		log.debug("SQL: " + sql);
		return getNamedParameterJdbcTemplate().update(sql, new BeanPropertySqlParameterSource(entity));
	}


	/**
	 * エンティティ内容をＤＢに更新する
	 * @param entity エンティティ
	 * @return 更新件数
	 */
	public int update(T entity) {
		T ret = findOneById(entity);
		if (ret == null) {
			//主キー該当のデータなし
			throw new IncorrectResultSizeDataAccessException("該当データがありません。", 1, 0);
		}

		boolean isVersion = equalVersion(entity, ret);
		if (! isVersion) {
			//排他例外
			throw new OptimisticLockingFailureException("バージョン番号が異なる。");
		}

		String sql = createUpdate();
		log.debug("query: " + sql);
		return getNamedParameterJdbcTemplate().update(sql, new BeanPropertySqlParameterSource(entity));
	}


	/**
	 * エンティティ内容をＤＢより削除する
	 * @param entity エンティティ
	 * @return 削除件数
	 */
	public int delete(T entity) {
		T ret = findOneById(entity);
		if (ret == null) {
			//主キー該当のデータなし
			throw new IncorrectResultSizeDataAccessException("該当データがありません。", 1, 0);
		}

		boolean isVersion = equalVersion(entity, ret);
		if (! isVersion) {
			//排他例外
			throw new OptimisticLockingFailureException("バージョン番号が異なる。");
		}

		String sql = createDelete();
		log.debug("query: " + sql);
		return getNamedParameterJdbcTemplate().update(sql, new BeanPropertySqlParameterSource(entity));
	}
}

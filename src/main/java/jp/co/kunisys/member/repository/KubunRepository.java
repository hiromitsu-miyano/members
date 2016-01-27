package jp.co.kunisys.member.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.entity.Kubun;

/**
 * 区分リポジトリ
 */
@Repository
public class KubunRepository extends AbstractRepository<Kubun> {

    /** 区分種別：区分種別. */
    public static final String KUBUN_TYPE_ROOT = "000";
    /** 区分種別：都道府県. */
    public static final String KUBUN_TYPE_PREF = "001";
    /** 区分種別：学校区分. */
    public static final String KUBUN_TYPE_SCHOOL_TYPE = "002";
    /** 区分種別：退職区分. */
    public static final String KUBUN_TYPE_RETIRE_TYPE = "003";
    /** 区分種別：続柄区分. */
    public static final String KUBUN_TYPE_RELATION_TYPE = "004";
    /** 区分種別：同居区分. */
    public static final String KUBUN_TYPE_STAY_TYPE = "005";
    /** 区分種別：扶養区分. */
    public static final String KUBUN_TYPE_SUPPORT_TYPE = "006";
    /** 区分種別：辞令区分. */
    public static final String KUBUN_TYPE_APPOINT_TYPE = "007";

    /** 区分値：学校区分：大学院. */
    public static final String KUBUN_VALUE_SCHOOL_TYPE_DAIGAKUIN = "010";

	/**
	 * コンストラクタ
	 * @param ds データソース
	 */
	@Autowired
	public KubunRepository(DataSource ds) {
		setDataSource(ds);
	}


	/**
	 * 区分番号を元に区分を検索する
	 * @param seq 区分番号
	 * @return 区分
	 */
	public Kubun findById(Integer seq) {
		Kubun param = new Kubun();
		param.setSeq(seq);
		return findOneById(param);
	}

	/**
	 * 区分のリストを検索する
	 * @param kubunType 区分種別
	 * @return 区分のリスト
	 */
	public List<Kubun> findKubunList(String kubunType) {
		Kubun param = new Kubun();
		param.setTypeCode(kubunType);
		return findByParam(param);
	}

	/**
	 * 区分番号の最大値を検索します
	 * @return 区分番号の最大値
	 */
	public int findMaxNumber() {
		String sql = "select max(seq) from kubun";
		Integer seq = getNamedParameterJdbcTemplate().queryForObject(sql, new EmptySqlParameterSource(), Integer.class);
		if (seq == null) {
			seq = 0;
		}
		return seq.intValue();
	}
}

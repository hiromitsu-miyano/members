package jp.co.kunisys.member.repository;

import static org.jooq.impl.DSL.*;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.KubunRecord;

/**
 * 区分リポジトリ
 */
@Repository
public class KubunRepository {

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


    /** DSLContext */
    @Autowired
    private DSLContext create;


	/**
	 * 区分番号を元に区分を検索する
	 * @param seq 区分番号
	 * @return 区分
	 */
	public KubunRecord findById(Integer seq) {
		return this.create.selectFrom(Tables.KUBUN)
							.where(Tables.KUBUN.SEQ.eq(seq))
							.fetchOne();
	}

	/**
	 * 区分のリストを全件返す
	 * @return 区分のリスト
	 */
	public List<KubunRecord> findAllOrderById() {
		return this.create.selectFrom(Tables.KUBUN)
							.orderBy(Tables.KUBUN.SEQ)
							.fetch();
	}

	/**
	 * 区分のリストを検索する
	 * @param kubunType 区分種別
	 * @return 区分のリスト
	 */
	public List<KubunRecord> findKubunList(String kubunType) {
		return this.create.selectFrom(Tables.KUBUN)
							.where(Tables.KUBUN.TYPE_CODE.eq(kubunType))
							.fetch();
	}

	/**
	 * 区分番号の最大値を検索します
	 * @return 区分番号の最大値
	 */
	public int findMaxNumber() {
		Integer seq = this.create.select(max(Tables.KUBUN.SEQ))
									.from(Tables.KUBUN)
									.fetchOneInto(Integer.class);
		if (seq == null) {
			seq = 0;
		}
		return seq.intValue();
	}
}

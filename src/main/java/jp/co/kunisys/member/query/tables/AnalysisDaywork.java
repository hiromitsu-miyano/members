/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.AnalysisDayworkRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 分析稼働時間
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AnalysisDaywork extends TableImpl<AnalysisDayworkRecord> {

	private static final long serialVersionUID = -203634375;

	/**
	 * The reference instance of <code>members.analysis_daywork</code>
	 */
	public static final AnalysisDaywork ANALYSIS_DAYWORK = new AnalysisDaywork();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AnalysisDayworkRecord> getRecordType() {
		return AnalysisDayworkRecord.class;
	}

	/**
	 * The column <code>members.analysis_daywork.work_date</code>. 稼働日付
	 */
	public final TableField<AnalysisDayworkRecord, Date> WORK_DATE = createField("work_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "稼働日付");

	/**
	 * The column <code>members.analysis_daywork.member_code</code>. 社員コード
	 */
	public final TableField<AnalysisDayworkRecord, String> MEMBER_CODE = createField("member_code", org.jooq.impl.SQLDataType.VARCHAR.length(6).nullable(false), this, "社員コード");

	/**
	 * The column <code>members.analysis_daywork.project_code</code>. プロジェクトコード
	 */
	public final TableField<AnalysisDayworkRecord, String> PROJECT_CODE = createField("project_code", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "プロジェクトコード");

	/**
	 * The column <code>members.analysis_daywork.work_time</code>. 通常時間
	 */
	public final TableField<AnalysisDayworkRecord, BigDecimal> WORK_TIME = createField("work_time", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2), this, "通常時間");

	/**
	 * The column <code>members.analysis_daywork.work_time_jikangai</code>. 時間外時間
	 */
	public final TableField<AnalysisDayworkRecord, BigDecimal> WORK_TIME_JIKANGAI = createField("work_time_jikangai", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2), this, "時間外時間");

	/**
	 * The column <code>members.analysis_daywork.work_time_kyujitsu</code>. 休日時間
	 */
	public final TableField<AnalysisDayworkRecord, BigDecimal> WORK_TIME_KYUJITSU = createField("work_time_kyujitsu", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2), this, "休日時間");

	/**
	 * The column <code>members.analysis_daywork.work_time_houteigai</code>. 法定外時間
	 */
	public final TableField<AnalysisDayworkRecord, BigDecimal> WORK_TIME_HOUTEIGAI = createField("work_time_houteigai", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2), this, "法定外時間");

	/**
	 * The column <code>members.analysis_daywork.work_time_sinya</code>. 深夜時間
	 */
	public final TableField<AnalysisDayworkRecord, BigDecimal> WORK_TIME_SINYA = createField("work_time_sinya", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2), this, "深夜時間");

	/**
	 * The column <code>members.analysis_daywork.work_time_houteigai_sinya</code>. 法定外深夜時間
	 */
	public final TableField<AnalysisDayworkRecord, BigDecimal> WORK_TIME_HOUTEIGAI_SINYA = createField("work_time_houteigai_sinya", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2), this, "法定外深夜時間");

	/**
	 * The column <code>members.analysis_daywork.record_time</code>. 記録時間
	 */
	public final TableField<AnalysisDayworkRecord, BigDecimal> RECORD_TIME = createField("record_time", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2), this, "記録時間");

	/**
	 * Create a <code>members.analysis_daywork</code> table reference
	 */
	public AnalysisDaywork() {
		this("analysis_daywork", null);
	}

	/**
	 * Create an aliased <code>members.analysis_daywork</code> table reference
	 */
	public AnalysisDaywork(String alias) {
		this(alias, ANALYSIS_DAYWORK);
	}

	private AnalysisDaywork(String alias, Table<AnalysisDayworkRecord> aliased) {
		this(alias, aliased, null);
	}

	private AnalysisDaywork(String alias, Table<AnalysisDayworkRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "分析稼働時間");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AnalysisDayworkRecord> getPrimaryKey() {
		return Keys.KEY_ANALYSIS_DAYWORK_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AnalysisDayworkRecord>> getKeys() {
		return Arrays.<UniqueKey<AnalysisDayworkRecord>>asList(Keys.KEY_ANALYSIS_DAYWORK_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnalysisDaywork as(String alias) {
		return new AnalysisDaywork(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AnalysisDaywork rename(String name) {
		return new AnalysisDaywork(name, null);
	}
}

/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.AnalysisJobInfoRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 分析処理情報
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AnalysisJobInfo extends TableImpl<AnalysisJobInfoRecord> {

	private static final long serialVersionUID = 967451285;

	/**
	 * The reference instance of <code>members.analysis_job_info</code>
	 */
	public static final AnalysisJobInfo ANALYSIS_JOB_INFO = new AnalysisJobInfo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AnalysisJobInfoRecord> getRecordType() {
		return AnalysisJobInfoRecord.class;
	}

	/**
	 * The column <code>members.analysis_job_info.id</code>. ID
	 */
	public final TableField<AnalysisJobInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "ID");

	/**
	 * The column <code>members.analysis_job_info.job_date</code>. 処理実行日
	 */
	public final TableField<AnalysisJobInfoRecord, Timestamp> JOB_DATE = createField("job_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "処理実行日");

	/**
	 * Create a <code>members.analysis_job_info</code> table reference
	 */
	public AnalysisJobInfo() {
		this("analysis_job_info", null);
	}

	/**
	 * Create an aliased <code>members.analysis_job_info</code> table reference
	 */
	public AnalysisJobInfo(String alias) {
		this(alias, ANALYSIS_JOB_INFO);
	}

	private AnalysisJobInfo(String alias, Table<AnalysisJobInfoRecord> aliased) {
		this(alias, aliased, null);
	}

	private AnalysisJobInfo(String alias, Table<AnalysisJobInfoRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "分析処理情報");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AnalysisJobInfoRecord> getPrimaryKey() {
		return Keys.KEY_ANALYSIS_JOB_INFO_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AnalysisJobInfoRecord>> getKeys() {
		return Arrays.<UniqueKey<AnalysisJobInfoRecord>>asList(Keys.KEY_ANALYSIS_JOB_INFO_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnalysisJobInfo as(String alias) {
		return new AnalysisJobInfo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AnalysisJobInfo rename(String name) {
		return new AnalysisJobInfo(name, null);
	}
}

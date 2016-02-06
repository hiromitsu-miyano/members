/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.AnalysisMemberRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 分析社員
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AnalysisMember extends TableImpl<AnalysisMemberRecord> {

	private static final long serialVersionUID = 71696892;

	/**
	 * The reference instance of <code>members.analysis_member</code>
	 */
	public static final AnalysisMember ANALYSIS_MEMBER = new AnalysisMember();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AnalysisMemberRecord> getRecordType() {
		return AnalysisMemberRecord.class;
	}

	/**
	 * The column <code>members.analysis_member.member_code</code>. 社員コード
	 */
	public final TableField<AnalysisMemberRecord, String> MEMBER_CODE = createField("member_code", org.jooq.impl.SQLDataType.VARCHAR.length(6).nullable(false), this, "社員コード");

	/**
	 * The column <code>members.analysis_member.member_name</code>. 社員名
	 */
	public final TableField<AnalysisMemberRecord, String> MEMBER_NAME = createField("member_name", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "社員名");

	/**
	 * The column <code>members.analysis_member.busho_code</code>. 部署
	 */
	public final TableField<AnalysisMemberRecord, String> BUSHO_CODE = createField("busho_code", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "部署");

	/**
	 * Create a <code>members.analysis_member</code> table reference
	 */
	public AnalysisMember() {
		this("analysis_member", null);
	}

	/**
	 * Create an aliased <code>members.analysis_member</code> table reference
	 */
	public AnalysisMember(String alias) {
		this(alias, ANALYSIS_MEMBER);
	}

	private AnalysisMember(String alias, Table<AnalysisMemberRecord> aliased) {
		this(alias, aliased, null);
	}

	private AnalysisMember(String alias, Table<AnalysisMemberRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "分析社員");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AnalysisMemberRecord> getPrimaryKey() {
		return Keys.KEY_ANALYSIS_MEMBER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AnalysisMemberRecord>> getKeys() {
		return Arrays.<UniqueKey<AnalysisMemberRecord>>asList(Keys.KEY_ANALYSIS_MEMBER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnalysisMember as(String alias) {
		return new AnalysisMember(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AnalysisMember rename(String name) {
		return new AnalysisMember(name, null);
	}
}

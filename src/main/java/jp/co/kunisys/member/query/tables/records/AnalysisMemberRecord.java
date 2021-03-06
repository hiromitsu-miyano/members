/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.AnalysisMember;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AnalysisMemberRecord extends UpdatableRecordImpl<AnalysisMemberRecord> implements Record3<String, String, String> {

	private static final long serialVersionUID = -2142065990;

	/**
	 * Setter for <code>members.analysis_member.member_code</code>. 社員コード
	 */
	public void setMemberCode(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.analysis_member.member_code</code>. 社員コード
	 */
	public String getMemberCode() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>members.analysis_member.member_name</code>. 社員名
	 */
	public void setMemberName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.analysis_member.member_name</code>. 社員名
	 */
	public String getMemberName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>members.analysis_member.busho_code</code>. 部署
	 */
	public void setBushoCode(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.analysis_member.busho_code</code>. 部署
	 */
	public String getBushoCode() {
		return (String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, String, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, String, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return AnalysisMember.ANALYSIS_MEMBER.MEMBER_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return AnalysisMember.ANALYSIS_MEMBER.MEMBER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return AnalysisMember.ANALYSIS_MEMBER.BUSHO_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getMemberCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getMemberName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getBushoCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnalysisMemberRecord value1(String value) {
		setMemberCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnalysisMemberRecord value2(String value) {
		setMemberName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnalysisMemberRecord value3(String value) {
		setBushoCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnalysisMemberRecord values(String value1, String value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AnalysisMemberRecord
	 */
	public AnalysisMemberRecord() {
		super(AnalysisMember.ANALYSIS_MEMBER);
	}

	/**
	 * Create a detached, initialised AnalysisMemberRecord
	 */
	public AnalysisMemberRecord(String memberCode, String memberName, String bushoCode) {
		super(AnalysisMember.ANALYSIS_MEMBER);

		setValue(0, memberCode);
		setValue(1, memberName);
		setValue(2, bushoCode);
	}
}

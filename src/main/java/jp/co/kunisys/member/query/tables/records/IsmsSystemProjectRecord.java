/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.IsmsSystemProject;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * システム台帳関連プロジェクト
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsSystemProjectRecord extends UpdatableRecordImpl<IsmsSystemProjectRecord> implements Record2<Long, String> {

	private static final long serialVersionUID = 1986660468;

	/**
	 * Setter for <code>members.isms_system_project.asset_id</code>. 資産ID
	 */
	public void setAssetId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.isms_system_project.asset_id</code>. 資産ID
	 */
	public Long getAssetId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>members.isms_system_project.project_code</code>. プロジェクトコード
	 */
	public void setProjectCode(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.isms_system_project.project_code</code>. プロジェクトコード
	 */
	public String getProjectCode() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Long, String> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return IsmsSystemProject.ISMS_SYSTEM_PROJECT.ASSET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return IsmsSystemProject.ISMS_SYSTEM_PROJECT.PROJECT_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getAssetId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getProjectCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsSystemProjectRecord value1(Long value) {
		setAssetId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsSystemProjectRecord value2(String value) {
		setProjectCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsSystemProjectRecord values(Long value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IsmsSystemProjectRecord
	 */
	public IsmsSystemProjectRecord() {
		super(IsmsSystemProject.ISMS_SYSTEM_PROJECT);
	}

	/**
	 * Create a detached, initialised IsmsSystemProjectRecord
	 */
	public IsmsSystemProjectRecord(Long assetId, String projectCode) {
		super(IsmsSystemProject.ISMS_SYSTEM_PROJECT);

		setValue(0, assetId);
		setValue(1, projectCode);
	}
}
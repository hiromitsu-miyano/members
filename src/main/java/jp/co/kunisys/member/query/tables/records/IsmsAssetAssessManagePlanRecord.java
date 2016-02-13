/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.IsmsAssetAssessManagePlan;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * アセスメント資産対応管理策
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsAssetAssessManagePlanRecord extends UpdatableRecordImpl<IsmsAssetAssessManagePlanRecord> implements Record4<Timestamp, Long, Integer, Integer> {

	private static final long serialVersionUID = -1284984576;

	/**
	 * Setter for <code>members.isms_asset_assess_manage_plan.limit_date</code>. 締切日
	 */
	public void setLimitDate(Timestamp value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_manage_plan.limit_date</code>. 締切日
	 */
	public Timestamp getLimitDate() {
		return (Timestamp) getValue(0);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_manage_plan.asset_id</code>. 資産ID
	 */
	public void setAssetId(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_manage_plan.asset_id</code>. 資産ID
	 */
	public Long getAssetId() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_manage_plan.threat_weak_id</code>. 脅威脆弱性ID
	 */
	public void setThreatWeakId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_manage_plan.threat_weak_id</code>. 脅威脆弱性ID
	 */
	public Integer getThreatWeakId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_manage_plan.asset_manage_plan_id</code>. 適用管理策ID
	 */
	public void setAssetManagePlanId(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_manage_plan.asset_manage_plan_id</code>. 適用管理策ID
	 */
	public Integer getAssetManagePlanId() {
		return (Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record4<Timestamp, Long, Integer, Integer> key() {
		return (Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Timestamp, Long, Integer, Integer> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Timestamp, Long, Integer, Integer> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field1() {
		return IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN.LIMIT_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN.ASSET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN.THREAT_WEAK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN.ASSET_MANAGE_PLAN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value1() {
		return getLimitDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getAssetId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getThreatWeakId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getAssetManagePlanId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessManagePlanRecord value1(Timestamp value) {
		setLimitDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessManagePlanRecord value2(Long value) {
		setAssetId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessManagePlanRecord value3(Integer value) {
		setThreatWeakId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessManagePlanRecord value4(Integer value) {
		setAssetManagePlanId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessManagePlanRecord values(Timestamp value1, Long value2, Integer value3, Integer value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IsmsAssetAssessManagePlanRecord
	 */
	public IsmsAssetAssessManagePlanRecord() {
		super(IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN);
	}

	/**
	 * Create a detached, initialised IsmsAssetAssessManagePlanRecord
	 */
	public IsmsAssetAssessManagePlanRecord(Timestamp limitDate, Long assetId, Integer threatWeakId, Integer assetManagePlanId) {
		super(IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN);

		setValue(0, limitDate);
		setValue(1, assetId);
		setValue(2, threatWeakId);
		setValue(3, assetManagePlanId);
	}
}
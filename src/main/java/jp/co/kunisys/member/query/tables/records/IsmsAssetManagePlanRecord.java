/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.IsmsAssetManagePlan;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 適用管理策
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsAssetManagePlanRecord extends UpdatableRecordImpl<IsmsAssetManagePlanRecord> implements Record3<Integer, Integer, Integer> {

	private static final long serialVersionUID = 1118754135;

	/**
	 * Setter for <code>members.isms_asset_manage_plan.asset_type_category_id</code>. 保管形態カテゴリID
	 */
	public void setAssetTypeCategoryId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.isms_asset_manage_plan.asset_type_category_id</code>. 保管形態カテゴリID
	 */
	public Integer getAssetTypeCategoryId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>members.isms_asset_manage_plan.threat_weak_id</code>. 脅威脆弱性ID
	 */
	public void setThreatWeakId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.isms_asset_manage_plan.threat_weak_id</code>. 脅威脆弱性ID
	 */
	public Integer getThreatWeakId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>members.isms_asset_manage_plan.manage_plan_id</code>. 管理策ID
	 */
	public void setManagePlanId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.isms_asset_manage_plan.manage_plan_id</code>. 管理策ID
	 */
	public Integer getManagePlanId() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<Integer, Integer, Integer> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return IsmsAssetManagePlan.ISMS_ASSET_MANAGE_PLAN.ASSET_TYPE_CATEGORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return IsmsAssetManagePlan.ISMS_ASSET_MANAGE_PLAN.THREAT_WEAK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return IsmsAssetManagePlan.ISMS_ASSET_MANAGE_PLAN.MANAGE_PLAN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getAssetTypeCategoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getThreatWeakId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getManagePlanId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetManagePlanRecord value1(Integer value) {
		setAssetTypeCategoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetManagePlanRecord value2(Integer value) {
		setThreatWeakId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetManagePlanRecord value3(Integer value) {
		setManagePlanId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetManagePlanRecord values(Integer value1, Integer value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IsmsAssetManagePlanRecord
	 */
	public IsmsAssetManagePlanRecord() {
		super(IsmsAssetManagePlan.ISMS_ASSET_MANAGE_PLAN);
	}

	/**
	 * Create a detached, initialised IsmsAssetManagePlanRecord
	 */
	public IsmsAssetManagePlanRecord(Integer assetTypeCategoryId, Integer threatWeakId, Integer managePlanId) {
		super(IsmsAssetManagePlan.ISMS_ASSET_MANAGE_PLAN);

		setValue(0, assetTypeCategoryId);
		setValue(1, threatWeakId);
		setValue(2, managePlanId);
	}
}
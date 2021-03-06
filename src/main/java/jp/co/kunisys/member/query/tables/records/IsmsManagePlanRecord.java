/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.IsmsManagePlan;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 管理策
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsManagePlanRecord extends UpdatableRecordImpl<IsmsManagePlanRecord> implements Record6<Integer, String, String, String, Integer, Integer> {

	private static final long serialVersionUID = -1954344768;

	/**
	 * Setter for <code>members.isms_manage_plan.manage_plan_id</code>. 管理策ID
	 */
	public void setManagePlanId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.isms_manage_plan.manage_plan_id</code>. 管理策ID
	 */
	public Integer getManagePlanId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>members.isms_manage_plan.manage_item</code>. 箇条
	 */
	public void setManageItem(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.isms_manage_plan.manage_item</code>. 箇条
	 */
	public String getManageItem() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>members.isms_manage_plan.manage_item_name</code>. 項目名
	 */
	public void setManageItemName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.isms_manage_plan.manage_item_name</code>. 項目名
	 */
	public String getManageItemName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>members.isms_manage_plan.description</code>. 目的内容
	 */
	public void setDescription(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.isms_manage_plan.description</code>. 目的内容
	 */
	public String getDescription() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>members.isms_manage_plan.used</code>. 適用可否
	 */
	public void setUsed(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.isms_manage_plan.used</code>. 適用可否
	 */
	public Integer getUsed() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>members.isms_manage_plan.delete_flag</code>. 削除フラグ
	 */
	public void setDeleteFlag(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.isms_manage_plan.delete_flag</code>. 削除フラグ
	 */
	public Integer getDeleteFlag() {
		return (Integer) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, String, Integer, Integer> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, String, Integer, Integer> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return IsmsManagePlan.ISMS_MANAGE_PLAN.MANAGE_PLAN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return IsmsManagePlan.ISMS_MANAGE_PLAN.MANAGE_ITEM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return IsmsManagePlan.ISMS_MANAGE_PLAN.MANAGE_ITEM_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return IsmsManagePlan.ISMS_MANAGE_PLAN.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return IsmsManagePlan.ISMS_MANAGE_PLAN.USED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return IsmsManagePlan.ISMS_MANAGE_PLAN.DELETE_FLAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getManagePlanId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getManageItem();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getManageItemName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getUsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getDeleteFlag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsManagePlanRecord value1(Integer value) {
		setManagePlanId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsManagePlanRecord value2(String value) {
		setManageItem(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsManagePlanRecord value3(String value) {
		setManageItemName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsManagePlanRecord value4(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsManagePlanRecord value5(Integer value) {
		setUsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsManagePlanRecord value6(Integer value) {
		setDeleteFlag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsManagePlanRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IsmsManagePlanRecord
	 */
	public IsmsManagePlanRecord() {
		super(IsmsManagePlan.ISMS_MANAGE_PLAN);
	}

	/**
	 * Create a detached, initialised IsmsManagePlanRecord
	 */
	public IsmsManagePlanRecord(Integer managePlanId, String manageItem, String manageItemName, String description, Integer used, Integer deleteFlag) {
		super(IsmsManagePlan.ISMS_MANAGE_PLAN);

		setValue(0, managePlanId);
		setValue(1, manageItem);
		setValue(2, manageItemName);
		setValue(3, description);
		setValue(4, used);
		setValue(5, deleteFlag);
	}
}

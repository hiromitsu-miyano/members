/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.Workplace;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 勤務先
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkplaceRecord extends UpdatableRecordImpl<WorkplaceRecord> implements Record11<Integer, String, String, String, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> {

	private static final long serialVersionUID = -701351338;

	/**
	 * Setter for <code>members.workplace.workplace_id</code>. 勤務先ID
	 */
	public void setWorkplaceId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.workplace.workplace_id</code>. 勤務先ID
	 */
	public Integer getWorkplaceId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>members.workplace.name</code>. 勤務先名
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.workplace.name</code>. 勤務先名
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>members.workplace.workplace_type</code>. 勤務先区分
	 */
	public void setWorkplaceType(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.workplace.workplace_type</code>. 勤務先区分
	 */
	public String getWorkplaceType() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>members.workplace.remark</code>. 備考
	 */
	public void setRemark(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.workplace.remark</code>. 備考
	 */
	public String getRemark() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>members.workplace.created</code>. 登録日時
	 */
	public void setCreated(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.workplace.created</code>. 登録日時
	 */
	public Timestamp getCreated() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>members.workplace.created_user</code>. 登録ユーザ
	 */
	public void setCreatedUser(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.workplace.created_user</code>. 登録ユーザ
	 */
	public Integer getCreatedUser() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>members.workplace.updated</code>. 更新日時
	 */
	public void setUpdated(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>members.workplace.updated</code>. 更新日時
	 */
	public Timestamp getUpdated() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>members.workplace.updated_user</code>. 更新ユーザ
	 */
	public void setUpdatedUser(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>members.workplace.updated_user</code>. 更新ユーザ
	 */
	public Integer getUpdatedUser() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>members.workplace.deleted</code>. 削除日時
	 */
	public void setDeleted(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>members.workplace.deleted</code>. 削除日時
	 */
	public Timestamp getDeleted() {
		return (Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>members.workplace.deleted_user</code>. 削除ユーザ
	 */
	public void setDeletedUser(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>members.workplace.deleted_user</code>. 削除ユーザ
	 */
	public Integer getDeletedUser() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>members.workplace.version</code>. バージョン
	 */
	public void setVersion(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>members.workplace.version</code>. バージョン
	 */
	public Integer getVersion() {
		return (Integer) getValue(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, String, String, String, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, String, String, String, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Workplace.WORKPLACE.WORKPLACE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Workplace.WORKPLACE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Workplace.WORKPLACE.WORKPLACE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Workplace.WORKPLACE.REMARK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return Workplace.WORKPLACE.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Workplace.WORKPLACE.CREATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return Workplace.WORKPLACE.UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return Workplace.WORKPLACE.UPDATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return Workplace.WORKPLACE.DELETED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return Workplace.WORKPLACE.DELETED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return Workplace.WORKPLACE.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getWorkplaceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getWorkplaceType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getRemark();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getCreatedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getUpdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getUpdatedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value9() {
		return getDeleted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getDeletedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord value1(Integer value) {
		setWorkplaceId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord value3(String value) {
		setWorkplaceType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord value4(String value) {
		setRemark(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord value5(Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord value6(Integer value) {
		setCreatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord value7(Timestamp value) {
		setUpdated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord value8(Integer value) {
		setUpdatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord value9(Timestamp value) {
		setDeleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord value10(Integer value) {
		setDeletedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord value11(Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkplaceRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Integer value6, Timestamp value7, Integer value8, Timestamp value9, Integer value10, Integer value11) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WorkplaceRecord
	 */
	public WorkplaceRecord() {
		super(Workplace.WORKPLACE);
	}

	/**
	 * Create a detached, initialised WorkplaceRecord
	 */
	public WorkplaceRecord(Integer workplaceId, String name, String workplaceType, String remark, Timestamp created, Integer createdUser, Timestamp updated, Integer updatedUser, Timestamp deleted, Integer deletedUser, Integer version) {
		super(Workplace.WORKPLACE);

		setValue(0, workplaceId);
		setValue(1, name);
		setValue(2, workplaceType);
		setValue(3, remark);
		setValue(4, created);
		setValue(5, createdUser);
		setValue(6, updated);
		setValue(7, updatedUser);
		setValue(8, deleted);
		setValue(9, deletedUser);
		setValue(10, version);
	}
}

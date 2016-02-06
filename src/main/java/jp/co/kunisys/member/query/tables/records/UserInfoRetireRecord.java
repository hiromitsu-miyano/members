/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.UserInfoRetire;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 退職情報
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoRetireRecord extends UpdatableRecordImpl<UserInfoRetireRecord> implements Record10<Integer, String, Date, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> {

	private static final long serialVersionUID = 1242017687;

	/**
	 * Setter for <code>members.user_info_retire.user_id</code>. ユーザID
	 */
	public void setUserId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.user_info_retire.user_id</code>. ユーザID
	 */
	public Integer getUserId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>members.user_info_retire.retire_type</code>. 退職区分
	 */
	public void setRetireType(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.user_info_retire.retire_type</code>. 退職区分
	 */
	public String getRetireType() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>members.user_info_retire.retire_date</code>. 退職日
	 */
	public void setRetireDate(Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.user_info_retire.retire_date</code>. 退職日
	 */
	public Date getRetireDate() {
		return (Date) getValue(2);
	}

	/**
	 * Setter for <code>members.user_info_retire.created</code>. 登録日時
	 */
	public void setCreated(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.user_info_retire.created</code>. 登録日時
	 */
	public Timestamp getCreated() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>members.user_info_retire.created_user</code>. 登録ユーザ
	 */
	public void setCreatedUser(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.user_info_retire.created_user</code>. 登録ユーザ
	 */
	public Integer getCreatedUser() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>members.user_info_retire.updated</code>. 更新日時
	 */
	public void setUpdated(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.user_info_retire.updated</code>. 更新日時
	 */
	public Timestamp getUpdated() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>members.user_info_retire.updated_user</code>. 更新ユーザ
	 */
	public void setUpdatedUser(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>members.user_info_retire.updated_user</code>. 更新ユーザ
	 */
	public Integer getUpdatedUser() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>members.user_info_retire.deleted</code>. 削除日時
	 */
	public void setDeleted(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>members.user_info_retire.deleted</code>. 削除日時
	 */
	public Timestamp getDeleted() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>members.user_info_retire.deleted_user</code>. 削除ユーザ
	 */
	public void setDeletedUser(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>members.user_info_retire.deleted_user</code>. 削除ユーザ
	 */
	public Integer getDeletedUser() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>members.user_info_retire.version</code>. バージョン
	 */
	public void setVersion(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>members.user_info_retire.version</code>. バージョン
	 */
	public Integer getVersion() {
		return (Integer) getValue(9);
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
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Integer, String, Date, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Integer, String, Date, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return UserInfoRetire.USER_INFO_RETIRE.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return UserInfoRetire.USER_INFO_RETIRE.RETIRE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field3() {
		return UserInfoRetire.USER_INFO_RETIRE.RETIRE_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return UserInfoRetire.USER_INFO_RETIRE.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return UserInfoRetire.USER_INFO_RETIRE.CREATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return UserInfoRetire.USER_INFO_RETIRE.UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return UserInfoRetire.USER_INFO_RETIRE.UPDATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return UserInfoRetire.USER_INFO_RETIRE.DELETED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return UserInfoRetire.USER_INFO_RETIRE.DELETED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return UserInfoRetire.USER_INFO_RETIRE.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getRetireType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value3() {
		return getRetireDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getCreatedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getUpdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getUpdatedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getDeleted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getDeletedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRetireRecord value1(Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRetireRecord value2(String value) {
		setRetireType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRetireRecord value3(Date value) {
		setRetireDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRetireRecord value4(Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRetireRecord value5(Integer value) {
		setCreatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRetireRecord value6(Timestamp value) {
		setUpdated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRetireRecord value7(Integer value) {
		setUpdatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRetireRecord value8(Timestamp value) {
		setDeleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRetireRecord value9(Integer value) {
		setDeletedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRetireRecord value10(Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRetireRecord values(Integer value1, String value2, Date value3, Timestamp value4, Integer value5, Timestamp value6, Integer value7, Timestamp value8, Integer value9, Integer value10) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserInfoRetireRecord
	 */
	public UserInfoRetireRecord() {
		super(UserInfoRetire.USER_INFO_RETIRE);
	}

	/**
	 * Create a detached, initialised UserInfoRetireRecord
	 */
	public UserInfoRetireRecord(Integer userId, String retireType, Date retireDate, Timestamp created, Integer createdUser, Timestamp updated, Integer updatedUser, Timestamp deleted, Integer deletedUser, Integer version) {
		super(UserInfoRetire.USER_INFO_RETIRE);

		setValue(0, userId);
		setValue(1, retireType);
		setValue(2, retireDate);
		setValue(3, created);
		setValue(4, createdUser);
		setValue(5, updated);
		setValue(6, updatedUser);
		setValue(7, deleted);
		setValue(8, deletedUser);
		setValue(9, version);
	}
}

/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.Career;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 業務経歴
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CareerRecord extends UpdatableRecordImpl<CareerRecord> implements Record9<Integer, Integer, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> {

	private static final long serialVersionUID = -1257469652;

	/**
	 * Setter for <code>members.career.user_id</code>. ユーザID
	 */
	public void setUserId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.career.user_id</code>. ユーザID
	 */
	public Integer getUserId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>members.career.experience_years</code>. 入社時経験年数
	 */
	public void setExperienceYears(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.career.experience_years</code>. 入社時経験年数
	 */
	public Integer getExperienceYears() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>members.career.created</code>. 登録日時
	 */
	public void setCreated(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.career.created</code>. 登録日時
	 */
	public Timestamp getCreated() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>members.career.created_user</code>. 登録ユーザ
	 */
	public void setCreatedUser(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.career.created_user</code>. 登録ユーザ
	 */
	public Integer getCreatedUser() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>members.career.updated</code>. 更新日時
	 */
	public void setUpdated(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.career.updated</code>. 更新日時
	 */
	public Timestamp getUpdated() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>members.career.updated_user</code>. 更新ユーザ
	 */
	public void setUpdatedUser(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.career.updated_user</code>. 更新ユーザ
	 */
	public Integer getUpdatedUser() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>members.career.deleted</code>. 削除日時
	 */
	public void setDeleted(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>members.career.deleted</code>. 削除日時
	 */
	public Timestamp getDeleted() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>members.career.deleted_user</code>. 削除ユーザ
	 */
	public void setDeletedUser(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>members.career.deleted_user</code>. 削除ユーザ
	 */
	public Integer getDeletedUser() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>members.career.version</code>. バージョン
	 */
	public void setVersion(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>members.career.version</code>. バージョン
	 */
	public Integer getVersion() {
		return (Integer) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Career.CAREER.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Career.CAREER.EXPERIENCE_YEARS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return Career.CAREER.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Career.CAREER.CREATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return Career.CAREER.UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Career.CAREER.UPDATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return Career.CAREER.DELETED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return Career.CAREER.DELETED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return Career.CAREER.VERSION;
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
	public Integer value2() {
		return getExperienceYears();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getCreatedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getUpdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getUpdatedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getDeleted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getDeletedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerRecord value1(Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerRecord value2(Integer value) {
		setExperienceYears(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerRecord value3(Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerRecord value4(Integer value) {
		setCreatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerRecord value5(Timestamp value) {
		setUpdated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerRecord value6(Integer value) {
		setUpdatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerRecord value7(Timestamp value) {
		setDeleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerRecord value8(Integer value) {
		setDeletedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerRecord value9(Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerRecord values(Integer value1, Integer value2, Timestamp value3, Integer value4, Timestamp value5, Integer value6, Timestamp value7, Integer value8, Integer value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CareerRecord
	 */
	public CareerRecord() {
		super(Career.CAREER);
	}

	/**
	 * Create a detached, initialised CareerRecord
	 */
	public CareerRecord(Integer userId, Integer experienceYears, Timestamp created, Integer createdUser, Timestamp updated, Integer updatedUser, Timestamp deleted, Integer deletedUser, Integer version) {
		super(Career.CAREER);

		setValue(0, userId);
		setValue(1, experienceYears);
		setValue(2, created);
		setValue(3, createdUser);
		setValue(4, updated);
		setValue(5, updatedUser);
		setValue(6, deleted);
		setValue(7, deletedUser);
		setValue(8, version);
	}
}

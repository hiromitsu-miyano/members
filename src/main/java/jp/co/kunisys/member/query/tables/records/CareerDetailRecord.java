/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.CareerDetail;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Record2;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 業務経歴詳細
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CareerDetailRecord extends UpdatableRecordImpl<CareerDetailRecord> implements Record13<Integer, Integer, String, String, String, String, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> {

	private static final long serialVersionUID = -1619085331;

	/**
	 * Setter for <code>members.career_detail.user_id</code>. ユーザID
	 */
	public void setUserId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.career_detail.user_id</code>. ユーザID
	 */
	public Integer getUserId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>members.career_detail.job_no</code>. 業務経歴番号
	 */
	public void setJobNo(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.career_detail.job_no</code>. 業務経歴番号
	 */
	public Integer getJobNo() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>members.career_detail.job_name</code>. 担当主要業務
	 */
	public void setJobName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.career_detail.job_name</code>. 担当主要業務
	 */
	public String getJobName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>members.career_detail.span_from</code>. 期間自
	 */
	public void setSpanFrom(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.career_detail.span_from</code>. 期間自
	 */
	public String getSpanFrom() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>members.career_detail.span_to</code>. 期間至
	 */
	public void setSpanTo(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.career_detail.span_to</code>. 期間至
	 */
	public String getSpanTo() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>members.career_detail.remark</code>. 備考
	 */
	public void setRemark(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.career_detail.remark</code>. 備考
	 */
	public String getRemark() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>members.career_detail.created</code>. 登録日時
	 */
	public void setCreated(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>members.career_detail.created</code>. 登録日時
	 */
	public Timestamp getCreated() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>members.career_detail.created_user</code>. 登録ユーザ
	 */
	public void setCreatedUser(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>members.career_detail.created_user</code>. 登録ユーザ
	 */
	public Integer getCreatedUser() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>members.career_detail.updated</code>. 更新日時
	 */
	public void setUpdated(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>members.career_detail.updated</code>. 更新日時
	 */
	public Timestamp getUpdated() {
		return (Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>members.career_detail.updated_user</code>. 更新ユーザ
	 */
	public void setUpdatedUser(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>members.career_detail.updated_user</code>. 更新ユーザ
	 */
	public Integer getUpdatedUser() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>members.career_detail.deleted</code>. 削除日時
	 */
	public void setDeleted(Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>members.career_detail.deleted</code>. 削除日時
	 */
	public Timestamp getDeleted() {
		return (Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>members.career_detail.deleted_user</code>. 削除ユーザ
	 */
	public void setDeletedUser(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>members.career_detail.deleted_user</code>. 削除ユーザ
	 */
	public Integer getDeletedUser() {
		return (Integer) getValue(11);
	}

	/**
	 * Setter for <code>members.career_detail.version</code>. バージョン
	 */
	public void setVersion(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>members.career_detail.version</code>. バージョン
	 */
	public Integer getVersion() {
		return (Integer) getValue(12);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Integer, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<Integer, Integer, String, String, String, String, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> fieldsRow() {
		return (Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<Integer, Integer, String, String, String, String, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> valuesRow() {
		return (Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return CareerDetail.CAREER_DETAIL.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return CareerDetail.CAREER_DETAIL.JOB_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return CareerDetail.CAREER_DETAIL.JOB_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return CareerDetail.CAREER_DETAIL.SPAN_FROM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return CareerDetail.CAREER_DETAIL.SPAN_TO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return CareerDetail.CAREER_DETAIL.REMARK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return CareerDetail.CAREER_DETAIL.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return CareerDetail.CAREER_DETAIL.CREATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return CareerDetail.CAREER_DETAIL.UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return CareerDetail.CAREER_DETAIL.UPDATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field11() {
		return CareerDetail.CAREER_DETAIL.DELETED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return CareerDetail.CAREER_DETAIL.DELETED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field13() {
		return CareerDetail.CAREER_DETAIL.VERSION;
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
		return getJobNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getJobName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getSpanFrom();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getSpanTo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getRemark();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getCreatedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value9() {
		return getUpdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getUpdatedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value11() {
		return getDeleted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getDeletedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value13() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value1(Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value2(Integer value) {
		setJobNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value3(String value) {
		setJobName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value4(String value) {
		setSpanFrom(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value5(String value) {
		setSpanTo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value6(String value) {
		setRemark(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value7(Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value8(Integer value) {
		setCreatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value9(Timestamp value) {
		setUpdated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value10(Integer value) {
		setUpdatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value11(Timestamp value) {
		setDeleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value12(Integer value) {
		setDeletedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord value13(Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CareerDetailRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, Timestamp value7, Integer value8, Timestamp value9, Integer value10, Timestamp value11, Integer value12, Integer value13) {
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
		value12(value12);
		value13(value13);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CareerDetailRecord
	 */
	public CareerDetailRecord() {
		super(CareerDetail.CAREER_DETAIL);
	}

	/**
	 * Create a detached, initialised CareerDetailRecord
	 */
	public CareerDetailRecord(Integer userId, Integer jobNo, String jobName, String spanFrom, String spanTo, String remark, Timestamp created, Integer createdUser, Timestamp updated, Integer updatedUser, Timestamp deleted, Integer deletedUser, Integer version) {
		super(CareerDetail.CAREER_DETAIL);

		setValue(0, userId);
		setValue(1, jobNo);
		setValue(2, jobName);
		setValue(3, spanFrom);
		setValue(4, spanTo);
		setValue(5, remark);
		setValue(6, created);
		setValue(7, createdUser);
		setValue(8, updated);
		setValue(9, updatedUser);
		setValue(10, deleted);
		setValue(11, deletedUser);
		setValue(12, version);
	}
}

/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.Department;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 部署
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DepartmentRecord extends UpdatableRecordImpl<DepartmentRecord> implements Record9<String, String, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> {

	private static final long serialVersionUID = 681844997;

	/**
	 * Setter for <code>members.department.dept_cd</code>. 部署コード
	 */
	public void setDeptCd(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.department.dept_cd</code>. 部署コード
	 */
	public String getDeptCd() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>members.department.name</code>. 部署名
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.department.name</code>. 部署名
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>members.department.created</code>. 登録日時
	 */
	public void setCreated(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.department.created</code>. 登録日時
	 */
	public Timestamp getCreated() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>members.department.created_user</code>. 登録ユーザ
	 */
	public void setCreatedUser(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.department.created_user</code>. 登録ユーザ
	 */
	public Integer getCreatedUser() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>members.department.updated</code>. 更新日時
	 */
	public void setUpdated(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.department.updated</code>. 更新日時
	 */
	public Timestamp getUpdated() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>members.department.updated_user</code>. 更新ユーザ
	 */
	public void setUpdatedUser(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.department.updated_user</code>. 更新ユーザ
	 */
	public Integer getUpdatedUser() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>members.department.deleted</code>. 削除日時
	 */
	public void setDeleted(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>members.department.deleted</code>. 削除日時
	 */
	public Timestamp getDeleted() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>members.department.deleted_user</code>. 削除ユーザ
	 */
	public void setDeletedUser(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>members.department.deleted_user</code>. 削除ユーザ
	 */
	public Integer getDeletedUser() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>members.department.version</code>. バージョン
	 */
	public void setVersion(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>members.department.version</code>. バージョン
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
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, String, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, String, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Department.DEPARTMENT.DEPT_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Department.DEPARTMENT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return Department.DEPARTMENT.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Department.DEPARTMENT.CREATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return Department.DEPARTMENT.UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Department.DEPARTMENT.UPDATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return Department.DEPARTMENT.DELETED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return Department.DEPARTMENT.DELETED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return Department.DEPARTMENT.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getDeptCd();
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
	public DepartmentRecord value1(String value) {
		setDeptCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value3(Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value4(Integer value) {
		setCreatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value5(Timestamp value) {
		setUpdated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value6(Integer value) {
		setUpdatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value7(Timestamp value) {
		setDeleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value8(Integer value) {
		setDeletedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value9(Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord values(String value1, String value2, Timestamp value3, Integer value4, Timestamp value5, Integer value6, Timestamp value7, Integer value8, Integer value9) {
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
	 * Create a detached DepartmentRecord
	 */
	public DepartmentRecord() {
		super(Department.DEPARTMENT);
	}

	/**
	 * Create a detached, initialised DepartmentRecord
	 */
	public DepartmentRecord(String deptCd, String name, Timestamp created, Integer createdUser, Timestamp updated, Integer updatedUser, Timestamp deleted, Integer deletedUser, Integer version) {
		super(Department.DEPARTMENT);

		setValue(0, deptCd);
		setValue(1, name);
		setValue(2, created);
		setValue(3, createdUser);
		setValue(4, updated);
		setValue(5, updatedUser);
		setValue(6, deleted);
		setValue(7, deletedUser);
		setValue(8, version);
	}
}

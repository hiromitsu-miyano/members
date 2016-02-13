/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.DepartmentRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Department extends TableImpl<DepartmentRecord> {

	private static final long serialVersionUID = -288723747;

	/**
	 * The reference instance of <code>members.department</code>
	 */
	public static final Department DEPARTMENT = new Department();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DepartmentRecord> getRecordType() {
		return DepartmentRecord.class;
	}

	/**
	 * The column <code>members.department.dept_cd</code>. 部署コード
	 */
	public final TableField<DepartmentRecord, String> DEPT_CD = createField("dept_cd", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "部署コード");

	/**
	 * The column <code>members.department.name</code>. 部署名
	 */
	public final TableField<DepartmentRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "部署名");

	/**
	 * The column <code>members.department.created</code>. 登録日時
	 */
	public final TableField<DepartmentRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "登録日時");

	/**
	 * The column <code>members.department.created_user</code>. 登録ユーザ
	 */
	public final TableField<DepartmentRecord, Integer> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.INTEGER, this, "登録ユーザ");

	/**
	 * The column <code>members.department.updated</code>. 更新日時
	 */
	public final TableField<DepartmentRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新日時");

	/**
	 * The column <code>members.department.updated_user</code>. 更新ユーザ
	 */
	public final TableField<DepartmentRecord, Integer> UPDATED_USER = createField("updated_user", org.jooq.impl.SQLDataType.INTEGER, this, "更新ユーザ");

	/**
	 * The column <code>members.department.deleted</code>. 削除日時
	 */
	public final TableField<DepartmentRecord, Timestamp> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TIMESTAMP, this, "削除日時");

	/**
	 * The column <code>members.department.deleted_user</code>. 削除ユーザ
	 */
	public final TableField<DepartmentRecord, Integer> DELETED_USER = createField("deleted_user", org.jooq.impl.SQLDataType.INTEGER, this, "削除ユーザ");

	/**
	 * The column <code>members.department.version</code>. バージョン
	 */
	public final TableField<DepartmentRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "バージョン");

	/**
	 * Create a <code>members.department</code> table reference
	 */
	public Department() {
		this("department", null);
	}

	/**
	 * Create an aliased <code>members.department</code> table reference
	 */
	public Department(String alias) {
		this(alias, DEPARTMENT);
	}

	private Department(String alias, Table<DepartmentRecord> aliased) {
		this(alias, aliased, null);
	}

	private Department(String alias, Table<DepartmentRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "部署");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DepartmentRecord> getPrimaryKey() {
		return Keys.KEY_DEPARTMENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DepartmentRecord>> getKeys() {
		return Arrays.<UniqueKey<DepartmentRecord>>asList(Keys.KEY_DEPARTMENT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableField<DepartmentRecord, Integer> getRecordVersion() {
		return VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Department as(String alias) {
		return new Department(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Department rename(String name) {
		return new Department(name, null);
	}
}
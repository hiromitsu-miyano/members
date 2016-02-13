/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.RelateDepartmentRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 連係用部署情報
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RelateDepartment extends TableImpl<RelateDepartmentRecord> {

	private static final long serialVersionUID = 637190929;

	/**
	 * The reference instance of <code>members.relate_department</code>
	 */
	public static final RelateDepartment RELATE_DEPARTMENT = new RelateDepartment();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RelateDepartmentRecord> getRecordType() {
		return RelateDepartmentRecord.class;
	}

	/**
	 * The column <code>members.relate_department.id</code>. ID
	 */
	public final TableField<RelateDepartmentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "ID");

	/**
	 * The column <code>members.relate_department.dept_cd</code>. 部署コード
	 */
	public final TableField<RelateDepartmentRecord, String> DEPT_CD = createField("dept_cd", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "部署コード");

	/**
	 * The column <code>members.relate_department.sagyo_cd</code>. 財務作業所コード
	 */
	public final TableField<RelateDepartmentRecord, String> SAGYO_CD = createField("sagyo_cd", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "財務作業所コード");

	/**
	 * Create a <code>members.relate_department</code> table reference
	 */
	public RelateDepartment() {
		this("relate_department", null);
	}

	/**
	 * Create an aliased <code>members.relate_department</code> table reference
	 */
	public RelateDepartment(String alias) {
		this(alias, RELATE_DEPARTMENT);
	}

	private RelateDepartment(String alias, Table<RelateDepartmentRecord> aliased) {
		this(alias, aliased, null);
	}

	private RelateDepartment(String alias, Table<RelateDepartmentRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "連係用部署情報");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RelateDepartmentRecord> getPrimaryKey() {
		return Keys.KEY_RELATE_DEPARTMENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RelateDepartmentRecord>> getKeys() {
		return Arrays.<UniqueKey<RelateDepartmentRecord>>asList(Keys.KEY_RELATE_DEPARTMENT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RelateDepartment as(String alias) {
		return new RelateDepartment(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RelateDepartment rename(String name) {
		return new RelateDepartment(name, null);
	}
}
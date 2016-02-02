/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.IsmsSystemProjectRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * システム台帳関連プロジェクト
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsSystemProject extends TableImpl<IsmsSystemProjectRecord> {

	private static final long serialVersionUID = 1417192002;

	/**
	 * The reference instance of <code>members.isms_system_project</code>
	 */
	public static final IsmsSystemProject ISMS_SYSTEM_PROJECT = new IsmsSystemProject();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IsmsSystemProjectRecord> getRecordType() {
		return IsmsSystemProjectRecord.class;
	}

	/**
	 * The column <code>members.isms_system_project.asset_id</code>. 資産ID
	 */
	public final TableField<IsmsSystemProjectRecord, Long> ASSET_ID = createField("asset_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "資産ID");

	/**
	 * The column <code>members.isms_system_project.project_code</code>. プロジェクトコード
	 */
	public final TableField<IsmsSystemProjectRecord, String> PROJECT_CODE = createField("project_code", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "プロジェクトコード");

	/**
	 * Create a <code>members.isms_system_project</code> table reference
	 */
	public IsmsSystemProject() {
		this("isms_system_project", null);
	}

	/**
	 * Create an aliased <code>members.isms_system_project</code> table reference
	 */
	public IsmsSystemProject(String alias) {
		this(alias, ISMS_SYSTEM_PROJECT);
	}

	private IsmsSystemProject(String alias, Table<IsmsSystemProjectRecord> aliased) {
		this(alias, aliased, null);
	}

	private IsmsSystemProject(String alias, Table<IsmsSystemProjectRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "システム台帳関連プロジェクト");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IsmsSystemProjectRecord> getPrimaryKey() {
		return Keys.KEY_ISMS_SYSTEM_PROJECT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IsmsSystemProjectRecord>> getKeys() {
		return Arrays.<UniqueKey<IsmsSystemProjectRecord>>asList(Keys.KEY_ISMS_SYSTEM_PROJECT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsSystemProject as(String alias) {
		return new IsmsSystemProject(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IsmsSystemProject rename(String name) {
		return new IsmsSystemProject(name, null);
	}
}

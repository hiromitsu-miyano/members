/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.AuthRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 権限
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Auth extends TableImpl<AuthRecord> {

	private static final long serialVersionUID = 694764431;

	/**
	 * The reference instance of <code>members.auth</code>
	 */
	public static final Auth AUTH = new Auth();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AuthRecord> getRecordType() {
		return AuthRecord.class;
	}

	/**
	 * The column <code>members.auth.auth_cd</code>. 権限コード
	 */
	public final TableField<AuthRecord, String> AUTH_CD = createField("auth_cd", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false), this, "権限コード");

	/**
	 * The column <code>members.auth.name</code>. 権限名
	 */
	public final TableField<AuthRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "権限名");

	/**
	 * The column <code>members.auth.sortkey</code>. 並び順
	 */
	public final TableField<AuthRecord, Integer> SORTKEY = createField("sortkey", org.jooq.impl.SQLDataType.INTEGER, this, "並び順");

	/**
	 * The column <code>members.auth.version</code>. バージョン
	 */
	public final TableField<AuthRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "バージョン");

	/**
	 * Create a <code>members.auth</code> table reference
	 */
	public Auth() {
		this("auth", null);
	}

	/**
	 * Create an aliased <code>members.auth</code> table reference
	 */
	public Auth(String alias) {
		this(alias, AUTH);
	}

	private Auth(String alias, Table<AuthRecord> aliased) {
		this(alias, aliased, null);
	}

	private Auth(String alias, Table<AuthRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "権限");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AuthRecord> getPrimaryKey() {
		return Keys.KEY_AUTH_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AuthRecord>> getKeys() {
		return Arrays.<UniqueKey<AuthRecord>>asList(Keys.KEY_AUTH_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableField<AuthRecord, Integer> getRecordVersion() {
		return VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Auth as(String alias) {
		return new Auth(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Auth rename(String name) {
		return new Auth(name, null);
	}
}
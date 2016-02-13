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
import jp.co.kunisys.member.query.tables.records.IsmsAccessAuthRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * アクセス権限台帳
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsAccessAuth extends TableImpl<IsmsAccessAuthRecord> {

	private static final long serialVersionUID = -827213924;

	/**
	 * The reference instance of <code>members.isms_access_auth</code>
	 */
	public static final IsmsAccessAuth ISMS_ACCESS_AUTH = new IsmsAccessAuth();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IsmsAccessAuthRecord> getRecordType() {
		return IsmsAccessAuthRecord.class;
	}

	/**
	 * The column <code>members.isms_access_auth.access_auth_id</code>. アクセス権限台帳ID
	 */
	public final TableField<IsmsAccessAuthRecord, Integer> ACCESS_AUTH_ID = createField("access_auth_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "アクセス権限台帳ID");

	/**
	 * The column <code>members.isms_access_auth.server_id</code>. サーバID
	 */
	public final TableField<IsmsAccessAuthRecord, Long> SERVER_ID = createField("server_id", org.jooq.impl.SQLDataType.BIGINT, this, "サーバID");

	/**
	 * The column <code>members.isms_access_auth.folder_id</code>. フォルダID
	 */
	public final TableField<IsmsAccessAuthRecord, Integer> FOLDER_ID = createField("folder_id", org.jooq.impl.SQLDataType.INTEGER, this, "フォルダID");

	/**
	 * The column <code>members.isms_access_auth.set_date</code>. 設定日
	 */
	public final TableField<IsmsAccessAuthRecord, Timestamp> SET_DATE = createField("set_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "設定日");

	/**
	 * The column <code>members.isms_access_auth.manager</code>. 管理者
	 */
	public final TableField<IsmsAccessAuthRecord, Integer> MANAGER = createField("manager", org.jooq.impl.SQLDataType.INTEGER, this, "管理者");

	/**
	 * Create a <code>members.isms_access_auth</code> table reference
	 */
	public IsmsAccessAuth() {
		this("isms_access_auth", null);
	}

	/**
	 * Create an aliased <code>members.isms_access_auth</code> table reference
	 */
	public IsmsAccessAuth(String alias) {
		this(alias, ISMS_ACCESS_AUTH);
	}

	private IsmsAccessAuth(String alias, Table<IsmsAccessAuthRecord> aliased) {
		this(alias, aliased, null);
	}

	private IsmsAccessAuth(String alias, Table<IsmsAccessAuthRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "アクセス権限台帳");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IsmsAccessAuthRecord> getPrimaryKey() {
		return Keys.KEY_ISMS_ACCESS_AUTH_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IsmsAccessAuthRecord>> getKeys() {
		return Arrays.<UniqueKey<IsmsAccessAuthRecord>>asList(Keys.KEY_ISMS_ACCESS_AUTH_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAccessAuth as(String alias) {
		return new IsmsAccessAuth(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IsmsAccessAuth rename(String name) {
		return new IsmsAccessAuth(name, null);
	}
}
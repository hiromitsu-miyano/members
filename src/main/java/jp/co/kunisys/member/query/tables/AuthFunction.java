/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.AuthFunctionRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 機能権限
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthFunction extends TableImpl<AuthFunctionRecord> {

	private static final long serialVersionUID = -636637825;

	/**
	 * The reference instance of <code>members.auth_function</code>
	 */
	public static final AuthFunction AUTH_FUNCTION = new AuthFunction();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AuthFunctionRecord> getRecordType() {
		return AuthFunctionRecord.class;
	}

	/**
	 * The column <code>members.auth_function.auth_function_cd</code>. 機能権限コード
	 */
	public final TableField<AuthFunctionRecord, String> AUTH_FUNCTION_CD = createField("auth_function_cd", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "機能権限コード");

	/**
	 * The column <code>members.auth_function.name</code>. 機能権限名
	 */
	public final TableField<AuthFunctionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "機能権限名");

	/**
	 * The column <code>members.auth_function.class_name</code>. アクションクラス名
	 */
	public final TableField<AuthFunctionRecord, String> CLASS_NAME = createField("class_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "アクションクラス名");

	/**
	 * The column <code>members.auth_function.action_name</code>. アクション名
	 */
	public final TableField<AuthFunctionRecord, String> ACTION_NAME = createField("action_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "アクション名");

	/**
	 * The column <code>members.auth_function.comment</code>. コメント
	 */
	public final TableField<AuthFunctionRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "コメント");

	/**
	 * The column <code>members.auth_function.sortkey</code>. 並び順
	 */
	public final TableField<AuthFunctionRecord, Integer> SORTKEY = createField("sortkey", org.jooq.impl.SQLDataType.INTEGER, this, "並び順");

	/**
	 * Create a <code>members.auth_function</code> table reference
	 */
	public AuthFunction() {
		this("auth_function", null);
	}

	/**
	 * Create an aliased <code>members.auth_function</code> table reference
	 */
	public AuthFunction(String alias) {
		this(alias, AUTH_FUNCTION);
	}

	private AuthFunction(String alias, Table<AuthFunctionRecord> aliased) {
		this(alias, aliased, null);
	}

	private AuthFunction(String alias, Table<AuthFunctionRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "機能権限");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AuthFunctionRecord> getPrimaryKey() {
		return Keys.KEY_AUTH_FUNCTION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AuthFunctionRecord>> getKeys() {
		return Arrays.<UniqueKey<AuthFunctionRecord>>asList(Keys.KEY_AUTH_FUNCTION_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthFunction as(String alias) {
		return new AuthFunction(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AuthFunction rename(String name) {
		return new AuthFunction(name, null);
	}
}

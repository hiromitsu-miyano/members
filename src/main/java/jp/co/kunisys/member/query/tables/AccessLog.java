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
import jp.co.kunisys.member.query.tables.records.AccessLogRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * アクセス履歴
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccessLog extends TableImpl<AccessLogRecord> {

	private static final long serialVersionUID = 851881751;

	/**
	 * The reference instance of <code>members.access_log</code>
	 */
	public static final AccessLog ACCESS_LOG = new AccessLog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AccessLogRecord> getRecordType() {
		return AccessLogRecord.class;
	}

	/**
	 * The column <code>members.access_log.id</code>. ログ番号
	 */
	public final TableField<AccessLogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "ログ番号");

	/**
	 * The column <code>members.access_log.access_datetime</code>. アクセス日時
	 */
	public final TableField<AccessLogRecord, Timestamp> ACCESS_DATETIME = createField("access_datetime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "アクセス日時");

	/**
	 * The column <code>members.access_log.ip_address</code>. IPアドレス
	 */
	public final TableField<AccessLogRecord, String> IP_ADDRESS = createField("ip_address", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "IPアドレス");

	/**
	 * The column <code>members.access_log.browser_name</code>. ブラウザ名
	 */
	public final TableField<AccessLogRecord, String> BROWSER_NAME = createField("browser_name", org.jooq.impl.SQLDataType.VARCHAR.length(300), this, "ブラウザ名");

	/**
	 * The column <code>members.access_log.user_id</code>. ユーザID
	 */
	public final TableField<AccessLogRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "ユーザID");

	/**
	 * The column <code>members.access_log.form_id</code>. 画面ID
	 */
	public final TableField<AccessLogRecord, String> FORM_ID = createField("form_id", org.jooq.impl.SQLDataType.VARCHAR.length(6), this, "画面ID");

	/**
	 * The column <code>members.access_log.operation</code>. 操作
	 */
	public final TableField<AccessLogRecord, String> OPERATION = createField("operation", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "操作");

	/**
	 * Create a <code>members.access_log</code> table reference
	 */
	public AccessLog() {
		this("access_log", null);
	}

	/**
	 * Create an aliased <code>members.access_log</code> table reference
	 */
	public AccessLog(String alias) {
		this(alias, ACCESS_LOG);
	}

	private AccessLog(String alias, Table<AccessLogRecord> aliased) {
		this(alias, aliased, null);
	}

	private AccessLog(String alias, Table<AccessLogRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "アクセス履歴");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AccessLogRecord, Long> getIdentity() {
		return Keys.IDENTITY_ACCESS_LOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AccessLogRecord> getPrimaryKey() {
		return Keys.KEY_ACCESS_LOG_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AccessLogRecord>> getKeys() {
		return Arrays.<UniqueKey<AccessLogRecord>>asList(Keys.KEY_ACCESS_LOG_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccessLog as(String alias) {
		return new AccessLog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AccessLog rename(String name) {
		return new AccessLog(name, null);
	}
}

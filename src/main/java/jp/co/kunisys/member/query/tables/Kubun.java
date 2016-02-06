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
import jp.co.kunisys.member.query.tables.records.KubunRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 区分
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Kubun extends TableImpl<KubunRecord> {

	private static final long serialVersionUID = 2083598825;

	/**
	 * The reference instance of <code>members.kubun</code>
	 */
	public static final Kubun KUBUN = new Kubun();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<KubunRecord> getRecordType() {
		return KubunRecord.class;
	}

	/**
	 * The column <code>members.kubun.seq</code>. 区分番号
	 */
	public final TableField<KubunRecord, Integer> SEQ = createField("seq", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "区分番号");

	/**
	 * The column <code>members.kubun.type_code</code>. 区分種別コード
	 */
	public final TableField<KubunRecord, String> TYPE_CODE = createField("type_code", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "区分種別コード");

	/**
	 * The column <code>members.kubun.type_name</code>. 区分種別名
	 */
	public final TableField<KubunRecord, String> TYPE_NAME = createField("type_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "区分種別名");

	/**
	 * The column <code>members.kubun.code</code>. 区分コード
	 */
	public final TableField<KubunRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "区分コード");

	/**
	 * The column <code>members.kubun.name</code>. 区分名
	 */
	public final TableField<KubunRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "区分名");

	/**
	 * The column <code>members.kubun.created</code>. 登録日時
	 */
	public final TableField<KubunRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "登録日時");

	/**
	 * The column <code>members.kubun.created_user</code>. 登録ユーザ
	 */
	public final TableField<KubunRecord, Integer> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.INTEGER, this, "登録ユーザ");

	/**
	 * The column <code>members.kubun.updated</code>. 更新日時
	 */
	public final TableField<KubunRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新日時");

	/**
	 * The column <code>members.kubun.updated_user</code>. 更新ユーザ
	 */
	public final TableField<KubunRecord, Integer> UPDATED_USER = createField("updated_user", org.jooq.impl.SQLDataType.INTEGER, this, "更新ユーザ");

	/**
	 * The column <code>members.kubun.deleted</code>. 削除日時
	 */
	public final TableField<KubunRecord, Timestamp> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TIMESTAMP, this, "削除日時");

	/**
	 * The column <code>members.kubun.deleted_user</code>. 削除ユーザ
	 */
	public final TableField<KubunRecord, Integer> DELETED_USER = createField("deleted_user", org.jooq.impl.SQLDataType.INTEGER, this, "削除ユーザ");

	/**
	 * The column <code>members.kubun.version</code>. バージョン
	 */
	public final TableField<KubunRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "バージョン");

	/**
	 * Create a <code>members.kubun</code> table reference
	 */
	public Kubun() {
		this("kubun", null);
	}

	/**
	 * Create an aliased <code>members.kubun</code> table reference
	 */
	public Kubun(String alias) {
		this(alias, KUBUN);
	}

	private Kubun(String alias, Table<KubunRecord> aliased) {
		this(alias, aliased, null);
	}

	private Kubun(String alias, Table<KubunRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "区分");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<KubunRecord> getPrimaryKey() {
		return Keys.KEY_KUBUN_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<KubunRecord>> getKeys() {
		return Arrays.<UniqueKey<KubunRecord>>asList(Keys.KEY_KUBUN_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableField<KubunRecord, Integer> getRecordVersion() {
		return VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Kubun as(String alias) {
		return new Kubun(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Kubun rename(String name) {
		return new Kubun(name, null);
	}
}

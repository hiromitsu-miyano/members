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
import jp.co.kunisys.member.query.tables.records.IsmsAssetIdRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 資産ID履歴
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsAssetId extends TableImpl<IsmsAssetIdRecord> {

	private static final long serialVersionUID = -564310054;

	/**
	 * The reference instance of <code>members.isms_asset_id</code>
	 */
	public static final IsmsAssetId ISMS_ASSET_ID = new IsmsAssetId();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IsmsAssetIdRecord> getRecordType() {
		return IsmsAssetIdRecord.class;
	}

	/**
	 * The column <code>members.isms_asset_id.asset_id</code>. 資産ID
	 */
	public final TableField<IsmsAssetIdRecord, Long> ASSET_ID = createField("asset_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "資産ID");

	/**
	 * The column <code>members.isms_asset_id.created</code>. 登録日時
	 */
	public final TableField<IsmsAssetIdRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "登録日時");

	/**
	 * The column <code>members.isms_asset_id.created_user</code>. 登録ユーザ
	 */
	public final TableField<IsmsAssetIdRecord, Integer> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.INTEGER, this, "登録ユーザ");

	/**
	 * The column <code>members.isms_asset_id.updated</code>. 更新日時
	 */
	public final TableField<IsmsAssetIdRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新日時");

	/**
	 * The column <code>members.isms_asset_id.updated_user</code>. 更新ユーザ
	 */
	public final TableField<IsmsAssetIdRecord, Integer> UPDATED_USER = createField("updated_user", org.jooq.impl.SQLDataType.INTEGER, this, "更新ユーザ");

	/**
	 * The column <code>members.isms_asset_id.deleted</code>. 削除日時
	 */
	public final TableField<IsmsAssetIdRecord, Timestamp> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TIMESTAMP, this, "削除日時");

	/**
	 * The column <code>members.isms_asset_id.deleted_user</code>. 削除ユーザ
	 */
	public final TableField<IsmsAssetIdRecord, Integer> DELETED_USER = createField("deleted_user", org.jooq.impl.SQLDataType.INTEGER, this, "削除ユーザ");

	/**
	 * The column <code>members.isms_asset_id.version</code>. バージョン
	 */
	public final TableField<IsmsAssetIdRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "バージョン");

	/**
	 * Create a <code>members.isms_asset_id</code> table reference
	 */
	public IsmsAssetId() {
		this("isms_asset_id", null);
	}

	/**
	 * Create an aliased <code>members.isms_asset_id</code> table reference
	 */
	public IsmsAssetId(String alias) {
		this(alias, ISMS_ASSET_ID);
	}

	private IsmsAssetId(String alias, Table<IsmsAssetIdRecord> aliased) {
		this(alias, aliased, null);
	}

	private IsmsAssetId(String alias, Table<IsmsAssetIdRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "資産ID履歴");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<IsmsAssetIdRecord, Long> getIdentity() {
		return Keys.IDENTITY_ISMS_ASSET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IsmsAssetIdRecord> getPrimaryKey() {
		return Keys.KEY_ISMS_ASSET_ID_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IsmsAssetIdRecord>> getKeys() {
		return Arrays.<UniqueKey<IsmsAssetIdRecord>>asList(Keys.KEY_ISMS_ASSET_ID_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableField<IsmsAssetIdRecord, Integer> getRecordVersion() {
		return VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetId as(String alias) {
		return new IsmsAssetId(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IsmsAssetId rename(String name) {
		return new IsmsAssetId(name, null);
	}
}
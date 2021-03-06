/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.IsmsAssetTypeRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 資産保管形態
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsAssetType extends TableImpl<IsmsAssetTypeRecord> {

	private static final long serialVersionUID = -1580943627;

	/**
	 * The reference instance of <code>members.isms_asset_type</code>
	 */
	public static final IsmsAssetType ISMS_ASSET_TYPE = new IsmsAssetType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IsmsAssetTypeRecord> getRecordType() {
		return IsmsAssetTypeRecord.class;
	}

	/**
	 * The column <code>members.isms_asset_type.asset_type_id</code>. 保管形態ID
	 */
	public final TableField<IsmsAssetTypeRecord, Integer> ASSET_TYPE_ID = createField("asset_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "保管形態ID");

	/**
	 * The column <code>members.isms_asset_type.name</code>. 保管形態名称
	 */
	public final TableField<IsmsAssetTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "保管形態名称");

	/**
	 * The column <code>members.isms_asset_type.asset_type_category_id</code>. 保管形態カテゴリID
	 */
	public final TableField<IsmsAssetTypeRecord, Integer> ASSET_TYPE_CATEGORY_ID = createField("asset_type_category_id", org.jooq.impl.SQLDataType.INTEGER, this, "保管形態カテゴリID");

	/**
	 * Create a <code>members.isms_asset_type</code> table reference
	 */
	public IsmsAssetType() {
		this("isms_asset_type", null);
	}

	/**
	 * Create an aliased <code>members.isms_asset_type</code> table reference
	 */
	public IsmsAssetType(String alias) {
		this(alias, ISMS_ASSET_TYPE);
	}

	private IsmsAssetType(String alias, Table<IsmsAssetTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private IsmsAssetType(String alias, Table<IsmsAssetTypeRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "資産保管形態");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IsmsAssetTypeRecord> getPrimaryKey() {
		return Keys.KEY_ISMS_ASSET_TYPE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IsmsAssetTypeRecord>> getKeys() {
		return Arrays.<UniqueKey<IsmsAssetTypeRecord>>asList(Keys.KEY_ISMS_ASSET_TYPE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetType as(String alias) {
		return new IsmsAssetType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IsmsAssetType rename(String name) {
		return new IsmsAssetType(name, null);
	}
}

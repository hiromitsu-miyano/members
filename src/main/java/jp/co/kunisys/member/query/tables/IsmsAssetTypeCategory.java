/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.IsmsAssetTypeCategoryRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 資産保管形態カテゴリ
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsAssetTypeCategory extends TableImpl<IsmsAssetTypeCategoryRecord> {

	private static final long serialVersionUID = -1916084643;

	/**
	 * The reference instance of <code>members.isms_asset_type_category</code>
	 */
	public static final IsmsAssetTypeCategory ISMS_ASSET_TYPE_CATEGORY = new IsmsAssetTypeCategory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IsmsAssetTypeCategoryRecord> getRecordType() {
		return IsmsAssetTypeCategoryRecord.class;
	}

	/**
	 * The column <code>members.isms_asset_type_category.asset_type_category_id</code>. 保管形態カテゴリID
	 */
	public final TableField<IsmsAssetTypeCategoryRecord, Integer> ASSET_TYPE_CATEGORY_ID = createField("asset_type_category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "保管形態カテゴリID");

	/**
	 * The column <code>members.isms_asset_type_category.name</code>. 保管形態カテゴリ名称
	 */
	public final TableField<IsmsAssetTypeCategoryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "保管形態カテゴリ名称");

	/**
	 * Create a <code>members.isms_asset_type_category</code> table reference
	 */
	public IsmsAssetTypeCategory() {
		this("isms_asset_type_category", null);
	}

	/**
	 * Create an aliased <code>members.isms_asset_type_category</code> table reference
	 */
	public IsmsAssetTypeCategory(String alias) {
		this(alias, ISMS_ASSET_TYPE_CATEGORY);
	}

	private IsmsAssetTypeCategory(String alias, Table<IsmsAssetTypeCategoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private IsmsAssetTypeCategory(String alias, Table<IsmsAssetTypeCategoryRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "資産保管形態カテゴリ");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IsmsAssetTypeCategoryRecord> getPrimaryKey() {
		return Keys.KEY_ISMS_ASSET_TYPE_CATEGORY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IsmsAssetTypeCategoryRecord>> getKeys() {
		return Arrays.<UniqueKey<IsmsAssetTypeCategoryRecord>>asList(Keys.KEY_ISMS_ASSET_TYPE_CATEGORY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetTypeCategory as(String alias) {
		return new IsmsAssetTypeCategory(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IsmsAssetTypeCategory rename(String name) {
		return new IsmsAssetTypeCategory(name, null);
	}
}

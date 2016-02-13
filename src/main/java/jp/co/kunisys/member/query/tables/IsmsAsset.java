/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.IsmsAssetRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 資産管理台帳
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsAsset extends TableImpl<IsmsAssetRecord> {

	private static final long serialVersionUID = -1485928311;

	/**
	 * The reference instance of <code>members.isms_asset</code>
	 */
	public static final IsmsAsset ISMS_ASSET = new IsmsAsset();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IsmsAssetRecord> getRecordType() {
		return IsmsAssetRecord.class;
	}

	/**
	 * The column <code>members.isms_asset.asset_id</code>. 資産ID
	 */
	public final TableField<IsmsAssetRecord, Long> ASSET_ID = createField("asset_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "資産ID");

	/**
	 * The column <code>members.isms_asset.pattern_id</code>. 分類ID
	 */
	public final TableField<IsmsAssetRecord, Integer> PATTERN_ID = createField("pattern_id", org.jooq.impl.SQLDataType.INTEGER, this, "分類ID");

	/**
	 * The column <code>members.isms_asset.asset_manage_no</code>. 資産管理番号
	 */
	public final TableField<IsmsAssetRecord, String> ASSET_MANAGE_NO = createField("asset_manage_no", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "資産管理番号");

	/**
	 * The column <code>members.isms_asset.asset_name</code>. 資産名
	 */
	public final TableField<IsmsAssetRecord, String> ASSET_NAME = createField("asset_name", org.jooq.impl.SQLDataType.VARCHAR.length(300), this, "資産名");

	/**
	 * The column <code>members.isms_asset.asset_type_id</code>. 保管形態ID
	 */
	public final TableField<IsmsAssetRecord, Integer> ASSET_TYPE_ID = createField("asset_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "保管形態ID");

	/**
	 * The column <code>members.isms_asset.place</code>. 保管場所
	 */
	public final TableField<IsmsAssetRecord, String> PLACE = createField("place", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "保管場所");

	/**
	 * The column <code>members.isms_asset.span</code>. 保管期間
	 */
	public final TableField<IsmsAssetRecord, String> SPAN = createField("span", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "保管期間");

	/**
	 * The column <code>members.isms_asset.destruction_method</code>. 破棄方法
	 */
	public final TableField<IsmsAssetRecord, String> DESTRUCTION_METHOD = createField("destruction_method", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "破棄方法");

	/**
	 * The column <code>members.isms_asset.section</code>. 部門
	 */
	public final TableField<IsmsAssetRecord, String> SECTION = createField("section", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "部門");

	/**
	 * The column <code>members.isms_asset.manager_id</code>. 管理者
	 */
	public final TableField<IsmsAssetRecord, Integer> MANAGER_ID = createField("manager_id", org.jooq.impl.SQLDataType.INTEGER, this, "管理者");

	/**
	 * The column <code>members.isms_asset.greater_manager_id</code>. 上位管理者
	 */
	public final TableField<IsmsAssetRecord, Integer> GREATER_MANAGER_ID = createField("greater_manager_id", org.jooq.impl.SQLDataType.INTEGER, this, "上位管理者");

	/**
	 * The column <code>members.isms_asset.remark</code>. 備考
	 */
	public final TableField<IsmsAssetRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(300), this, "備考");

	/**
	 * Create a <code>members.isms_asset</code> table reference
	 */
	public IsmsAsset() {
		this("isms_asset", null);
	}

	/**
	 * Create an aliased <code>members.isms_asset</code> table reference
	 */
	public IsmsAsset(String alias) {
		this(alias, ISMS_ASSET);
	}

	private IsmsAsset(String alias, Table<IsmsAssetRecord> aliased) {
		this(alias, aliased, null);
	}

	private IsmsAsset(String alias, Table<IsmsAssetRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "資産管理台帳");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IsmsAssetRecord> getPrimaryKey() {
		return Keys.KEY_ISMS_ASSET_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IsmsAssetRecord>> getKeys() {
		return Arrays.<UniqueKey<IsmsAssetRecord>>asList(Keys.KEY_ISMS_ASSET_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAsset as(String alias) {
		return new IsmsAsset(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IsmsAsset rename(String name) {
		return new IsmsAsset(name, null);
	}
}
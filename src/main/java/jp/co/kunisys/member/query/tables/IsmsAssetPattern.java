/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.IsmsAssetPatternRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 資産分類表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsAssetPattern extends TableImpl<IsmsAssetPatternRecord> {

	private static final long serialVersionUID = 2142757903;

	/**
	 * The reference instance of <code>members.isms_asset_pattern</code>
	 */
	public static final IsmsAssetPattern ISMS_ASSET_PATTERN = new IsmsAssetPattern();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IsmsAssetPatternRecord> getRecordType() {
		return IsmsAssetPatternRecord.class;
	}

	/**
	 * The column <code>members.isms_asset_pattern.pattern_id</code>. 分類ID
	 */
	public final TableField<IsmsAssetPatternRecord, Integer> PATTERN_ID = createField("pattern_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "分類ID");

	/**
	 * The column <code>members.isms_asset_pattern.pattern_no</code>. 分類番号
	 */
	public final TableField<IsmsAssetPatternRecord, String> PATTERN_NO = createField("pattern_no", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "分類番号");

	/**
	 * The column <code>members.isms_asset_pattern.name</code>. 分類名称
	 */
	public final TableField<IsmsAssetPatternRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "分類名称");

	/**
	 * The column <code>members.isms_asset_pattern.level</code>. 分類階層
	 */
	public final TableField<IsmsAssetPatternRecord, String> LEVEL = createField("level", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "分類階層");

	/**
	 * The column <code>members.isms_asset_pattern.sortkey</code>. 並び順
	 */
	public final TableField<IsmsAssetPatternRecord, Integer> SORTKEY = createField("sortkey", org.jooq.impl.SQLDataType.INTEGER, this, "並び順");

	/**
	 * The column <code>members.isms_asset_pattern.media</code>. 媒体
	 */
	public final TableField<IsmsAssetPatternRecord, String> MEDIA = createField("media", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "媒体");

	/**
	 * The column <code>members.isms_asset_pattern.remark</code>. 情報資産例
	 */
	public final TableField<IsmsAssetPatternRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(300), this, "情報資産例");

	/**
	 * The column <code>members.isms_asset_pattern.hardware_flag</code>. ハードウェアフラグ
	 */
	public final TableField<IsmsAssetPatternRecord, Integer> HARDWARE_FLAG = createField("hardware_flag", org.jooq.impl.SQLDataType.INTEGER, this, "ハードウェアフラグ");

	/**
	 * The column <code>members.isms_asset_pattern.software_flag</code>. ソフトウェアフラグ
	 */
	public final TableField<IsmsAssetPatternRecord, Integer> SOFTWARE_FLAG = createField("software_flag", org.jooq.impl.SQLDataType.INTEGER, this, "ソフトウェアフラグ");

	/**
	 * The column <code>members.isms_asset_pattern.version</code>. バージョン
	 */
	public final TableField<IsmsAssetPatternRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "バージョン");

	/**
	 * Create a <code>members.isms_asset_pattern</code> table reference
	 */
	public IsmsAssetPattern() {
		this("isms_asset_pattern", null);
	}

	/**
	 * Create an aliased <code>members.isms_asset_pattern</code> table reference
	 */
	public IsmsAssetPattern(String alias) {
		this(alias, ISMS_ASSET_PATTERN);
	}

	private IsmsAssetPattern(String alias, Table<IsmsAssetPatternRecord> aliased) {
		this(alias, aliased, null);
	}

	private IsmsAssetPattern(String alias, Table<IsmsAssetPatternRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "資産分類表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IsmsAssetPatternRecord> getPrimaryKey() {
		return Keys.KEY_ISMS_ASSET_PATTERN_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IsmsAssetPatternRecord>> getKeys() {
		return Arrays.<UniqueKey<IsmsAssetPatternRecord>>asList(Keys.KEY_ISMS_ASSET_PATTERN_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableField<IsmsAssetPatternRecord, Integer> getRecordVersion() {
		return VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetPattern as(String alias) {
		return new IsmsAssetPattern(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IsmsAssetPattern rename(String name) {
		return new IsmsAssetPattern(name, null);
	}
}

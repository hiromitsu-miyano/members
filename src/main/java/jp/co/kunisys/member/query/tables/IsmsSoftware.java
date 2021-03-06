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
import jp.co.kunisys.member.query.tables.records.IsmsSoftwareRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * ソフトウェア台帳
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsSoftware extends TableImpl<IsmsSoftwareRecord> {

	private static final long serialVersionUID = 1160357752;

	/**
	 * The reference instance of <code>members.isms_software</code>
	 */
	public static final IsmsSoftware ISMS_SOFTWARE = new IsmsSoftware();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IsmsSoftwareRecord> getRecordType() {
		return IsmsSoftwareRecord.class;
	}

	/**
	 * The column <code>members.isms_software.asset_id</code>. 資産ID
	 */
	public final TableField<IsmsSoftwareRecord, Long> ASSET_ID = createField("asset_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "資産ID");

	/**
	 * The column <code>members.isms_software.software_manage_no</code>. ソフトウェア管理番号
	 */
	public final TableField<IsmsSoftwareRecord, String> SOFTWARE_MANAGE_NO = createField("software_manage_no", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "ソフトウェア管理番号");

	/**
	 * The column <code>members.isms_software.pattern_id</code>. 分類ID
	 */
	public final TableField<IsmsSoftwareRecord, Integer> PATTERN_ID = createField("pattern_id", org.jooq.impl.SQLDataType.INTEGER, this, "分類ID");

	/**
	 * The column <code>members.isms_software.name</code>. ソフトウェア名
	 */
	public final TableField<IsmsSoftwareRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "ソフトウェア名");

	/**
	 * The column <code>members.isms_software.introduction</code>. 導入日
	 */
	public final TableField<IsmsSoftwareRecord, Timestamp> INTRODUCTION = createField("introduction", org.jooq.impl.SQLDataType.TIMESTAMP, this, "導入日");

	/**
	 * The column <code>members.isms_software.software_type</code>. ソフトウェア形態
	 */
	public final TableField<IsmsSoftwareRecord, Integer> SOFTWARE_TYPE = createField("software_type", org.jooq.impl.SQLDataType.INTEGER, this, "ソフトウェア形態");

	/**
	 * The column <code>members.isms_software.license</code>. ライセンス数
	 */
	public final TableField<IsmsSoftwareRecord, Integer> LICENSE = createField("license", org.jooq.impl.SQLDataType.INTEGER, this, "ライセンス数");

	/**
	 * The column <code>members.isms_software.place</code>. 保管場所
	 */
	public final TableField<IsmsSoftwareRecord, String> PLACE = createField("place", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "保管場所");

	/**
	 * The column <code>members.isms_software.asset_type_id</code>. 保管形態ID
	 */
	public final TableField<IsmsSoftwareRecord, Integer> ASSET_TYPE_ID = createField("asset_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "保管形態ID");

	/**
	 * The column <code>members.isms_software.span</code>. 保管期間
	 */
	public final TableField<IsmsSoftwareRecord, String> SPAN = createField("span", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "保管期間");

	/**
	 * The column <code>members.isms_software.destruction_method</code>. 破棄方法
	 */
	public final TableField<IsmsSoftwareRecord, String> DESTRUCTION_METHOD = createField("destruction_method", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "破棄方法");

	/**
	 * The column <code>members.isms_software.section</code>. 部門
	 */
	public final TableField<IsmsSoftwareRecord, String> SECTION = createField("section", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "部門");

	/**
	 * The column <code>members.isms_software.manager_id</code>. 管理者ID
	 */
	public final TableField<IsmsSoftwareRecord, Integer> MANAGER_ID = createField("manager_id", org.jooq.impl.SQLDataType.INTEGER, this, "管理者ID");

	/**
	 * The column <code>members.isms_software.greater_manager_id</code>. 上位管理者ID
	 */
	public final TableField<IsmsSoftwareRecord, Integer> GREATER_MANAGER_ID = createField("greater_manager_id", org.jooq.impl.SQLDataType.INTEGER, this, "上位管理者ID");

	/**
	 * The column <code>members.isms_software.remark</code>. 備考
	 */
	public final TableField<IsmsSoftwareRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(300), this, "備考");

	/**
	 * Create a <code>members.isms_software</code> table reference
	 */
	public IsmsSoftware() {
		this("isms_software", null);
	}

	/**
	 * Create an aliased <code>members.isms_software</code> table reference
	 */
	public IsmsSoftware(String alias) {
		this(alias, ISMS_SOFTWARE);
	}

	private IsmsSoftware(String alias, Table<IsmsSoftwareRecord> aliased) {
		this(alias, aliased, null);
	}

	private IsmsSoftware(String alias, Table<IsmsSoftwareRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "ソフトウェア台帳");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IsmsSoftwareRecord> getPrimaryKey() {
		return Keys.KEY_ISMS_SOFTWARE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IsmsSoftwareRecord>> getKeys() {
		return Arrays.<UniqueKey<IsmsSoftwareRecord>>asList(Keys.KEY_ISMS_SOFTWARE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsSoftware as(String alias) {
		return new IsmsSoftware(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IsmsSoftware rename(String name) {
		return new IsmsSoftware(name, null);
	}
}

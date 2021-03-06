/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.IsmsSoftwareUseRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * ソフトウェア使用状況
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsSoftwareUse extends TableImpl<IsmsSoftwareUseRecord> {

	private static final long serialVersionUID = -1899691655;

	/**
	 * The reference instance of <code>members.isms_software_use</code>
	 */
	public static final IsmsSoftwareUse ISMS_SOFTWARE_USE = new IsmsSoftwareUse();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IsmsSoftwareUseRecord> getRecordType() {
		return IsmsSoftwareUseRecord.class;
	}

	/**
	 * The column <code>members.isms_software_use.software_asset_id</code>. ソフトウェア資産ID
	 */
	public final TableField<IsmsSoftwareUseRecord, Long> SOFTWARE_ASSET_ID = createField("software_asset_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "ソフトウェア資産ID");

	/**
	 * The column <code>members.isms_software_use.hardware_asset_id</code>. ハードウェア資産ID
	 */
	public final TableField<IsmsSoftwareUseRecord, Long> HARDWARE_ASSET_ID = createField("hardware_asset_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "ハードウェア資産ID");

	/**
	 * Create a <code>members.isms_software_use</code> table reference
	 */
	public IsmsSoftwareUse() {
		this("isms_software_use", null);
	}

	/**
	 * Create an aliased <code>members.isms_software_use</code> table reference
	 */
	public IsmsSoftwareUse(String alias) {
		this(alias, ISMS_SOFTWARE_USE);
	}

	private IsmsSoftwareUse(String alias, Table<IsmsSoftwareUseRecord> aliased) {
		this(alias, aliased, null);
	}

	private IsmsSoftwareUse(String alias, Table<IsmsSoftwareUseRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "ソフトウェア使用状況");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IsmsSoftwareUseRecord> getPrimaryKey() {
		return Keys.KEY_ISMS_SOFTWARE_USE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IsmsSoftwareUseRecord>> getKeys() {
		return Arrays.<UniqueKey<IsmsSoftwareUseRecord>>asList(Keys.KEY_ISMS_SOFTWARE_USE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsSoftwareUse as(String alias) {
		return new IsmsSoftwareUse(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IsmsSoftwareUse rename(String name) {
		return new IsmsSoftwareUse(name, null);
	}
}

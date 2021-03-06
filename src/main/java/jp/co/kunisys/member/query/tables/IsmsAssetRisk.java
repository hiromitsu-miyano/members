/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.IsmsAssetRiskRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 資産脅威脆弱性
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsAssetRisk extends TableImpl<IsmsAssetRiskRecord> {

	private static final long serialVersionUID = -1365608075;

	/**
	 * The reference instance of <code>members.isms_asset_risk</code>
	 */
	public static final IsmsAssetRisk ISMS_ASSET_RISK = new IsmsAssetRisk();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IsmsAssetRiskRecord> getRecordType() {
		return IsmsAssetRiskRecord.class;
	}

	/**
	 * The column <code>members.isms_asset_risk.asset_type_category_id</code>. 保管形態カテゴリID
	 */
	public final TableField<IsmsAssetRiskRecord, Integer> ASSET_TYPE_CATEGORY_ID = createField("asset_type_category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "保管形態カテゴリID");

	/**
	 * The column <code>members.isms_asset_risk.threat_weak_id</code>. 脅威脆弱性ID
	 */
	public final TableField<IsmsAssetRiskRecord, Integer> THREAT_WEAK_ID = createField("threat_weak_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "脅威脆弱性ID");

	/**
	 * The column <code>members.isms_asset_risk.threat_name</code>. 脅威名
	 */
	public final TableField<IsmsAssetRiskRecord, String> THREAT_NAME = createField("threat_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "脅威名");

	/**
	 * The column <code>members.isms_asset_risk.threat_confidential</code>. 脅威機密性
	 */
	public final TableField<IsmsAssetRiskRecord, Integer> THREAT_CONFIDENTIAL = createField("threat_confidential", org.jooq.impl.SQLDataType.INTEGER, this, "脅威機密性");

	/**
	 * The column <code>members.isms_asset_risk.threat_integrity</code>. 脅威完全性
	 */
	public final TableField<IsmsAssetRiskRecord, Integer> THREAT_INTEGRITY = createField("threat_integrity", org.jooq.impl.SQLDataType.INTEGER, this, "脅威完全性");

	/**
	 * The column <code>members.isms_asset_risk.threat_availability</code>. 脅威可用性
	 */
	public final TableField<IsmsAssetRiskRecord, Integer> THREAT_AVAILABILITY = createField("threat_availability", org.jooq.impl.SQLDataType.INTEGER, this, "脅威可用性");

	/**
	 * The column <code>members.isms_asset_risk.weak_name</code>. 脆弱性名
	 */
	public final TableField<IsmsAssetRiskRecord, String> WEAK_NAME = createField("weak_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "脆弱性名");

	/**
	 * The column <code>members.isms_asset_risk.weak_confidential</code>. 脆弱性機密性
	 */
	public final TableField<IsmsAssetRiskRecord, Integer> WEAK_CONFIDENTIAL = createField("weak_confidential", org.jooq.impl.SQLDataType.INTEGER, this, "脆弱性機密性");

	/**
	 * The column <code>members.isms_asset_risk.weak_integrity</code>. 脆弱性完全性
	 */
	public final TableField<IsmsAssetRiskRecord, Integer> WEAK_INTEGRITY = createField("weak_integrity", org.jooq.impl.SQLDataType.INTEGER, this, "脆弱性完全性");

	/**
	 * The column <code>members.isms_asset_risk.weak_availability</code>. 脆弱性可用性
	 */
	public final TableField<IsmsAssetRiskRecord, Integer> WEAK_AVAILABILITY = createField("weak_availability", org.jooq.impl.SQLDataType.INTEGER, this, "脆弱性可用性");

	/**
	 * Create a <code>members.isms_asset_risk</code> table reference
	 */
	public IsmsAssetRisk() {
		this("isms_asset_risk", null);
	}

	/**
	 * Create an aliased <code>members.isms_asset_risk</code> table reference
	 */
	public IsmsAssetRisk(String alias) {
		this(alias, ISMS_ASSET_RISK);
	}

	private IsmsAssetRisk(String alias, Table<IsmsAssetRiskRecord> aliased) {
		this(alias, aliased, null);
	}

	private IsmsAssetRisk(String alias, Table<IsmsAssetRiskRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "資産脅威脆弱性");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IsmsAssetRiskRecord> getPrimaryKey() {
		return Keys.KEY_ISMS_ASSET_RISK_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IsmsAssetRiskRecord>> getKeys() {
		return Arrays.<UniqueKey<IsmsAssetRiskRecord>>asList(Keys.KEY_ISMS_ASSET_RISK_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetRisk as(String alias) {
		return new IsmsAssetRisk(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IsmsAssetRisk rename(String name) {
		return new IsmsAssetRisk(name, null);
	}
}

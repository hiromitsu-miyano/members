/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.IsmsAssetAssessRisk;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Record3;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * アセスメント資産脅威脆弱性
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsAssetAssessRiskRecord extends UpdatableRecordImpl<IsmsAssetAssessRiskRecord> implements Record16<Timestamp, Long, Integer, String, Integer, Integer, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String> {

	private static final long serialVersionUID = -771450758;

	/**
	 * Setter for <code>members.isms_asset_assess_risk.limit_date</code>. 締切日
	 */
	public void setLimitDate(Timestamp value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.limit_date</code>. 締切日
	 */
	public Timestamp getLimitDate() {
		return (Timestamp) getValue(0);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.asset_id</code>. 資産ID
	 */
	public void setAssetId(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.asset_id</code>. 資産ID
	 */
	public Long getAssetId() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.threat_weak_id</code>. 脅威脆弱性ID
	 */
	public void setThreatWeakId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.threat_weak_id</code>. 脅威脆弱性ID
	 */
	public Integer getThreatWeakId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.threat_name</code>. 脅威名
	 */
	public void setThreatName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.threat_name</code>. 脅威名
	 */
	public String getThreatName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.threat_confidential</code>. 脅威機密性
	 */
	public void setThreatConfidential(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.threat_confidential</code>. 脅威機密性
	 */
	public Integer getThreatConfidential() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.threat_integrity</code>. 脅威完全性
	 */
	public void setThreatIntegrity(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.threat_integrity</code>. 脅威完全性
	 */
	public Integer getThreatIntegrity() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.threat_availability</code>. 脅威可用性
	 */
	public void setThreatAvailability(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.threat_availability</code>. 脅威可用性
	 */
	public Integer getThreatAvailability() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.weak_name</code>. 脆弱性名
	 */
	public void setWeakName(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.weak_name</code>. 脆弱性名
	 */
	public String getWeakName() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.weak_confidential</code>. 脆弱性機密性
	 */
	public void setWeakConfidential(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.weak_confidential</code>. 脆弱性機密性
	 */
	public Integer getWeakConfidential() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.weak_integrity</code>. 脆弱性完全性
	 */
	public void setWeakIntegrity(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.weak_integrity</code>. 脆弱性完全性
	 */
	public Integer getWeakIntegrity() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.weak_availability</code>. 脆弱性可用性
	 */
	public void setWeakAvailability(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.weak_availability</code>. 脆弱性可用性
	 */
	public Integer getWeakAvailability() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.risk_confidential</code>. リスク値機密性
	 */
	public void setRiskConfidential(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.risk_confidential</code>. リスク値機密性
	 */
	public Integer getRiskConfidential() {
		return (Integer) getValue(11);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.risk_integrity</code>. リスク値完全性
	 */
	public void setRiskIntegrity(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.risk_integrity</code>. リスク値完全性
	 */
	public Integer getRiskIntegrity() {
		return (Integer) getValue(12);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.risk_availability</code>. リスク値可用性
	 */
	public void setRiskAvailability(Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.risk_availability</code>. リスク値可用性
	 */
	public Integer getRiskAvailability() {
		return (Integer) getValue(13);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.judge</code>. 受容可否
	 */
	public void setJudge(Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.judge</code>. 受容可否
	 */
	public Integer getJudge() {
		return (Integer) getValue(14);
	}

	/**
	 * Setter for <code>members.isms_asset_assess_risk.remark</code>. 備考
	 */
	public void setRemark(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>members.isms_asset_assess_risk.remark</code>. 備考
	 */
	public String getRemark() {
		return (String) getValue(15);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<Timestamp, Long, Integer> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<Timestamp, Long, Integer, String, Integer, Integer, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String> fieldsRow() {
		return (Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<Timestamp, Long, Integer, String, Integer, Integer, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String> valuesRow() {
		return (Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field1() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.LIMIT_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.ASSET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.THREAT_WEAK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.THREAT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.THREAT_CONFIDENTIAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.THREAT_INTEGRITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.THREAT_AVAILABILITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.WEAK_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.WEAK_CONFIDENTIAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.WEAK_INTEGRITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.WEAK_AVAILABILITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.RISK_CONFIDENTIAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field13() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.RISK_INTEGRITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field14() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.RISK_AVAILABILITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field15() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.JUDGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field16() {
		return IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.REMARK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value1() {
		return getLimitDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getAssetId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getThreatWeakId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getThreatName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getThreatConfidential();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getThreatIntegrity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getThreatAvailability();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getWeakName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getWeakConfidential();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getWeakIntegrity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getWeakAvailability();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getRiskConfidential();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value13() {
		return getRiskIntegrity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value14() {
		return getRiskAvailability();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value15() {
		return getJudge();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value16() {
		return getRemark();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value1(Timestamp value) {
		setLimitDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value2(Long value) {
		setAssetId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value3(Integer value) {
		setThreatWeakId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value4(String value) {
		setThreatName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value5(Integer value) {
		setThreatConfidential(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value6(Integer value) {
		setThreatIntegrity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value7(Integer value) {
		setThreatAvailability(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value8(String value) {
		setWeakName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value9(Integer value) {
		setWeakConfidential(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value10(Integer value) {
		setWeakIntegrity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value11(Integer value) {
		setWeakAvailability(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value12(Integer value) {
		setRiskConfidential(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value13(Integer value) {
		setRiskIntegrity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value14(Integer value) {
		setRiskAvailability(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value15(Integer value) {
		setJudge(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord value16(String value) {
		setRemark(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsAssetAssessRiskRecord values(Timestamp value1, Long value2, Integer value3, String value4, Integer value5, Integer value6, Integer value7, String value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Integer value14, Integer value15, String value16) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IsmsAssetAssessRiskRecord
	 */
	public IsmsAssetAssessRiskRecord() {
		super(IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK);
	}

	/**
	 * Create a detached, initialised IsmsAssetAssessRiskRecord
	 */
	public IsmsAssetAssessRiskRecord(Timestamp limitDate, Long assetId, Integer threatWeakId, String threatName, Integer threatConfidential, Integer threatIntegrity, Integer threatAvailability, String weakName, Integer weakConfidential, Integer weakIntegrity, Integer weakAvailability, Integer riskConfidential, Integer riskIntegrity, Integer riskAvailability, Integer judge, String remark) {
		super(IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK);

		setValue(0, limitDate);
		setValue(1, assetId);
		setValue(2, threatWeakId);
		setValue(3, threatName);
		setValue(4, threatConfidential);
		setValue(5, threatIntegrity);
		setValue(6, threatAvailability);
		setValue(7, weakName);
		setValue(8, weakConfidential);
		setValue(9, weakIntegrity);
		setValue(10, weakAvailability);
		setValue(11, riskConfidential);
		setValue(12, riskIntegrity);
		setValue(13, riskAvailability);
		setValue(14, judge);
		setValue(15, remark);
	}
}
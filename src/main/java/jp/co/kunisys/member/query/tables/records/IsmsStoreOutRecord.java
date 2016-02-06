/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.IsmsStoreOut;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 入出庫管理台帳出庫
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsStoreOutRecord extends UpdatableRecordImpl<IsmsStoreOutRecord> implements Record7<Long, Integer, String, Timestamp, Integer, String, Integer> {

	private static final long serialVersionUID = 1739994154;

	/**
	 * Setter for <code>members.isms_store_out.asset_id</code>. 資産ID
	 */
	public void setAssetId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.isms_store_out.asset_id</code>. 資産ID
	 */
	public Long getAssetId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>members.isms_store_out.store_out_no</code>. 出庫ID
	 */
	public void setStoreOutNo(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.isms_store_out.store_out_no</code>. 出庫ID
	 */
	public Integer getStoreOutNo() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>members.isms_store_out.data_ticket_no</code>. データ受渡票No
	 */
	public void setDataTicketNo(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.isms_store_out.data_ticket_no</code>. データ受渡票No
	 */
	public String getDataTicketNo() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>members.isms_store_out.out_date</code>. 出庫日
	 */
	public void setOutDate(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.isms_store_out.out_date</code>. 出庫日
	 */
	public Timestamp getOutDate() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>members.isms_store_out.out_manager_id</code>. 出庫者
	 */
	public void setOutManagerId(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.isms_store_out.out_manager_id</code>. 出庫者
	 */
	public Integer getOutManagerId() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>members.isms_store_out.destination</code>. 出庫先
	 */
	public void setDestination(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.isms_store_out.destination</code>. 出庫先
	 */
	public String getDestination() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>members.isms_store_out.out_approval_manager_id</code>. 出庫承認者
	 */
	public void setOutApprovalManagerId(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>members.isms_store_out.out_approval_manager_id</code>. 出庫承認者
	 */
	public Integer getOutApprovalManagerId() {
		return (Integer) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Long, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Long, Integer, String, Timestamp, Integer, String, Integer> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Long, Integer, String, Timestamp, Integer, String, Integer> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return IsmsStoreOut.ISMS_STORE_OUT.ASSET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return IsmsStoreOut.ISMS_STORE_OUT.STORE_OUT_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return IsmsStoreOut.ISMS_STORE_OUT.DATA_TICKET_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return IsmsStoreOut.ISMS_STORE_OUT.OUT_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return IsmsStoreOut.ISMS_STORE_OUT.OUT_MANAGER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return IsmsStoreOut.ISMS_STORE_OUT.DESTINATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return IsmsStoreOut.ISMS_STORE_OUT.OUT_APPROVAL_MANAGER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getAssetId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getStoreOutNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getDataTicketNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getOutDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getOutManagerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getDestination();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getOutApprovalManagerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreOutRecord value1(Long value) {
		setAssetId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreOutRecord value2(Integer value) {
		setStoreOutNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreOutRecord value3(String value) {
		setDataTicketNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreOutRecord value4(Timestamp value) {
		setOutDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreOutRecord value5(Integer value) {
		setOutManagerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreOutRecord value6(String value) {
		setDestination(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreOutRecord value7(Integer value) {
		setOutApprovalManagerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreOutRecord values(Long value1, Integer value2, String value3, Timestamp value4, Integer value5, String value6, Integer value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IsmsStoreOutRecord
	 */
	public IsmsStoreOutRecord() {
		super(IsmsStoreOut.ISMS_STORE_OUT);
	}

	/**
	 * Create a detached, initialised IsmsStoreOutRecord
	 */
	public IsmsStoreOutRecord(Long assetId, Integer storeOutNo, String dataTicketNo, Timestamp outDate, Integer outManagerId, String destination, Integer outApprovalManagerId) {
		super(IsmsStoreOut.ISMS_STORE_OUT);

		setValue(0, assetId);
		setValue(1, storeOutNo);
		setValue(2, dataTicketNo);
		setValue(3, outDate);
		setValue(4, outManagerId);
		setValue(5, destination);
		setValue(6, outApprovalManagerId);
	}
}

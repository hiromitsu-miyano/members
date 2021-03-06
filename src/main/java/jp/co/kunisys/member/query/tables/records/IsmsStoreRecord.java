/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.IsmsStore;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 入出庫管理台帳
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsStoreRecord extends UpdatableRecordImpl<IsmsStoreRecord> implements Record10<Long, Integer, Integer, String, Integer, String, String, String, Integer, Integer> {

	private static final long serialVersionUID = -1962204382;

	/**
	 * Setter for <code>members.isms_store.asset_id</code>. 資産ID
	 */
	public void setAssetId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.isms_store.asset_id</code>. 資産ID
	 */
	public Long getAssetId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>members.isms_store.store_manage_no</code>. 入出庫管理番号
	 */
	public void setStoreManageNo(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.isms_store.store_manage_no</code>. 入出庫管理番号
	 */
	public Integer getStoreManageNo() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>members.isms_store.manager</code>. 担当者
	 */
	public void setManager(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.isms_store.manager</code>. 担当者
	 */
	public Integer getManager() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>members.isms_store.party</code>. 取引先
	 */
	public void setParty(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.isms_store.party</code>. 取引先
	 */
	public String getParty() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>members.isms_store.media</code>. 媒体
	 */
	public void setMedia(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.isms_store.media</code>. 媒体
	 */
	public Integer getMedia() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>members.isms_store.description</code>. データ内容
	 */
	public void setDescription(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.isms_store.description</code>. データ内容
	 */
	public String getDescription() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>members.isms_store.place</code>. 保存先
	 */
	public void setPlace(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>members.isms_store.place</code>. 保存先
	 */
	public String getPlace() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>members.isms_store.remark</code>. 備考
	 */
	public void setRemark(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>members.isms_store.remark</code>. 備考
	 */
	public String getRemark() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>members.isms_store.outside_document_flg</code>. 外部文書台帳フラグ
	 */
	public void setOutsideDocumentFlg(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>members.isms_store.outside_document_flg</code>. 外部文書台帳フラグ
	 */
	public Integer getOutsideDocumentFlg() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>members.isms_store.safekeeping_manage_flg</code>. 保管管理簿フラグ
	 */
	public void setSafekeepingManageFlg(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>members.isms_store.safekeeping_manage_flg</code>. 保管管理簿フラグ
	 */
	public Integer getSafekeepingManageFlg() {
		return (Integer) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Long, Integer, Integer, String, Integer, String, String, String, Integer, Integer> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Long, Integer, Integer, String, Integer, String, String, String, Integer, Integer> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return IsmsStore.ISMS_STORE.ASSET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return IsmsStore.ISMS_STORE.STORE_MANAGE_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return IsmsStore.ISMS_STORE.MANAGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return IsmsStore.ISMS_STORE.PARTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return IsmsStore.ISMS_STORE.MEDIA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return IsmsStore.ISMS_STORE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return IsmsStore.ISMS_STORE.PLACE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return IsmsStore.ISMS_STORE.REMARK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return IsmsStore.ISMS_STORE.OUTSIDE_DOCUMENT_FLG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return IsmsStore.ISMS_STORE.SAFEKEEPING_MANAGE_FLG;
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
		return getStoreManageNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getManager();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getParty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getMedia();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getPlace();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getRemark();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getOutsideDocumentFlg();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getSafekeepingManageFlg();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreRecord value1(Long value) {
		setAssetId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreRecord value2(Integer value) {
		setStoreManageNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreRecord value3(Integer value) {
		setManager(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreRecord value4(String value) {
		setParty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreRecord value5(Integer value) {
		setMedia(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreRecord value6(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreRecord value7(String value) {
		setPlace(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreRecord value8(String value) {
		setRemark(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreRecord value9(Integer value) {
		setOutsideDocumentFlg(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreRecord value10(Integer value) {
		setSafekeepingManageFlg(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsStoreRecord values(Long value1, Integer value2, Integer value3, String value4, Integer value5, String value6, String value7, String value8, Integer value9, Integer value10) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IsmsStoreRecord
	 */
	public IsmsStoreRecord() {
		super(IsmsStore.ISMS_STORE);
	}

	/**
	 * Create a detached, initialised IsmsStoreRecord
	 */
	public IsmsStoreRecord(Long assetId, Integer storeManageNo, Integer manager, String party, Integer media, String description, String place, String remark, Integer outsideDocumentFlg, Integer safekeepingManageFlg) {
		super(IsmsStore.ISMS_STORE);

		setValue(0, assetId);
		setValue(1, storeManageNo);
		setValue(2, manager);
		setValue(3, party);
		setValue(4, media);
		setValue(5, description);
		setValue(6, place);
		setValue(7, remark);
		setValue(8, outsideDocumentFlg);
		setValue(9, safekeepingManageFlg);
	}
}

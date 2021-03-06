/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.IsmsVirtualMachine;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 仮想マシン台帳
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IsmsVirtualMachineRecord extends UpdatableRecordImpl<IsmsVirtualMachineRecord> implements Record16<Long, String, Integer, String, String, Integer, String, Integer, String, String, String, Integer, Integer, Integer, Integer, String> {

	private static final long serialVersionUID = 64769350;

	/**
	 * Setter for <code>members.isms_virtual_machine.asset_id</code>. 資産ID
	 */
	public void setAssetId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.asset_id</code>. 資産ID
	 */
	public Long getAssetId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.virtual_machine_manage_no</code>. 仮想マシン管理番号
	 */
	public void setVirtualMachineManageNo(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.virtual_machine_manage_no</code>. 仮想マシン管理番号
	 */
	public String getVirtualMachineManageNo() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.pattern_id</code>. 分類ID
	 */
	public void setPatternId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.pattern_id</code>. 分類ID
	 */
	public Integer getPatternId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.name</code>. 仮想マシン名
	 */
	public void setName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.name</code>. 仮想マシン名
	 */
	public String getName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.guest_name</code>. 仮想マシンゲスト名
	 */
	public void setGuestName(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.guest_name</code>. 仮想マシンゲスト名
	 */
	public String getGuestName() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.stock_server_asset_id</code>. 保管サーバ名
	 */
	public void setStockServerAssetId(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.stock_server_asset_id</code>. 保管サーバ名
	 */
	public Integer getStockServerAssetId() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.stock_place</code>. 保管場所
	 */
	public void setStockPlace(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.stock_place</code>. 保管場所
	 */
	public String getStockPlace() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.asset_type_id</code>. 保管形態ID
	 */
	public void setAssetTypeId(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.asset_type_id</code>. 保管形態ID
	 */
	public Integer getAssetTypeId() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.span</code>. 保管期間
	 */
	public void setSpan(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.span</code>. 保管期間
	 */
	public String getSpan() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.destruction_method</code>. 破棄方法
	 */
	public void setDestructionMethod(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.destruction_method</code>. 破棄方法
	 */
	public String getDestructionMethod() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.section</code>. 部門
	 */
	public void setSection(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.section</code>. 部門
	 */
	public String getSection() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.manager_id</code>. 管理者ID
	 */
	public void setManagerId(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.manager_id</code>. 管理者ID
	 */
	public Integer getManagerId() {
		return (Integer) getValue(11);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.greater_manager_id</code>. 上位管理者ID
	 */
	public void setGreaterManagerId(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.greater_manager_id</code>. 上位管理者ID
	 */
	public Integer getGreaterManagerId() {
		return (Integer) getValue(12);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.capacity</code>. 容量
	 */
	public void setCapacity(Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.capacity</code>. 容量
	 */
	public Integer getCapacity() {
		return (Integer) getValue(13);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.memory_size</code>. メモリサイズ
	 */
	public void setMemorySize(Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.memory_size</code>. メモリサイズ
	 */
	public Integer getMemorySize() {
		return (Integer) getValue(14);
	}

	/**
	 * Setter for <code>members.isms_virtual_machine.remark</code>. 備考
	 */
	public void setRemark(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>members.isms_virtual_machine.remark</code>. 備考
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
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<Long, String, Integer, String, String, Integer, String, Integer, String, String, String, Integer, Integer, Integer, Integer, String> fieldsRow() {
		return (Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<Long, String, Integer, String, String, Integer, String, Integer, String, String, String, Integer, Integer, Integer, Integer, String> valuesRow() {
		return (Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.ASSET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.VIRTUAL_MACHINE_MANAGE_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.PATTERN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.GUEST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.STOCK_SERVER_ASSET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.STOCK_PLACE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.ASSET_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.SPAN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.DESTRUCTION_METHOD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.SECTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.MANAGER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field13() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.GREATER_MANAGER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field14() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.CAPACITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field15() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.MEMORY_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field16() {
		return IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.REMARK;
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
	public String value2() {
		return getVirtualMachineManageNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getPatternId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getGuestName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getStockServerAssetId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getStockPlace();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getAssetTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getSpan();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getDestructionMethod();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getSection();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getManagerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value13() {
		return getGreaterManagerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value14() {
		return getCapacity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value15() {
		return getMemorySize();
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
	public IsmsVirtualMachineRecord value1(Long value) {
		setAssetId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value2(String value) {
		setVirtualMachineManageNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value3(Integer value) {
		setPatternId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value4(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value5(String value) {
		setGuestName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value6(Integer value) {
		setStockServerAssetId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value7(String value) {
		setStockPlace(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value8(Integer value) {
		setAssetTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value9(String value) {
		setSpan(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value10(String value) {
		setDestructionMethod(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value11(String value) {
		setSection(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value12(Integer value) {
		setManagerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value13(Integer value) {
		setGreaterManagerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value14(Integer value) {
		setCapacity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value15(Integer value) {
		setMemorySize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord value16(String value) {
		setRemark(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IsmsVirtualMachineRecord values(Long value1, String value2, Integer value3, String value4, String value5, Integer value6, String value7, Integer value8, String value9, String value10, String value11, Integer value12, Integer value13, Integer value14, Integer value15, String value16) {
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
	 * Create a detached IsmsVirtualMachineRecord
	 */
	public IsmsVirtualMachineRecord() {
		super(IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE);
	}

	/**
	 * Create a detached, initialised IsmsVirtualMachineRecord
	 */
	public IsmsVirtualMachineRecord(Long assetId, String virtualMachineManageNo, Integer patternId, String name, String guestName, Integer stockServerAssetId, String stockPlace, Integer assetTypeId, String span, String destructionMethod, String section, Integer managerId, Integer greaterManagerId, Integer capacity, Integer memorySize, String remark) {
		super(IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE);

		setValue(0, assetId);
		setValue(1, virtualMachineManageNo);
		setValue(2, patternId);
		setValue(3, name);
		setValue(4, guestName);
		setValue(5, stockServerAssetId);
		setValue(6, stockPlace);
		setValue(7, assetTypeId);
		setValue(8, span);
		setValue(9, destructionMethod);
		setValue(10, section);
		setValue(11, managerId);
		setValue(12, greaterManagerId);
		setValue(13, capacity);
		setValue(14, memorySize);
		setValue(15, remark);
	}
}

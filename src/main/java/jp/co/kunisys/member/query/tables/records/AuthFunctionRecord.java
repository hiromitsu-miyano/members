/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.AuthFunction;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 機能権限
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthFunctionRecord extends UpdatableRecordImpl<AuthFunctionRecord> implements Record6<String, String, String, String, String, Integer> {

	private static final long serialVersionUID = -759328675;

	/**
	 * Setter for <code>members.auth_function.auth_function_cd</code>. 機能権限コード
	 */
	public void setAuthFunctionCd(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.auth_function.auth_function_cd</code>. 機能権限コード
	 */
	public String getAuthFunctionCd() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>members.auth_function.name</code>. 機能権限名
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.auth_function.name</code>. 機能権限名
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>members.auth_function.class_name</code>. アクションクラス名
	 */
	public void setClassName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.auth_function.class_name</code>. アクションクラス名
	 */
	public String getClassName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>members.auth_function.action_name</code>. アクション名
	 */
	public void setActionName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.auth_function.action_name</code>. アクション名
	 */
	public String getActionName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>members.auth_function.comment</code>. コメント
	 */
	public void setComment(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.auth_function.comment</code>. コメント
	 */
	public String getComment() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>members.auth_function.sortkey</code>. 並び順
	 */
	public void setSortkey(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.auth_function.sortkey</code>. 並び順
	 */
	public Integer getSortkey() {
		return (Integer) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, String, Integer> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, String, Integer> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return AuthFunction.AUTH_FUNCTION.AUTH_FUNCTION_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return AuthFunction.AUTH_FUNCTION.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return AuthFunction.AUTH_FUNCTION.CLASS_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return AuthFunction.AUTH_FUNCTION.ACTION_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return AuthFunction.AUTH_FUNCTION.COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return AuthFunction.AUTH_FUNCTION.SORTKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getAuthFunctionCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getClassName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getActionName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getSortkey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthFunctionRecord value1(String value) {
		setAuthFunctionCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthFunctionRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthFunctionRecord value3(String value) {
		setClassName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthFunctionRecord value4(String value) {
		setActionName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthFunctionRecord value5(String value) {
		setComment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthFunctionRecord value6(Integer value) {
		setSortkey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthFunctionRecord values(String value1, String value2, String value3, String value4, String value5, Integer value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AuthFunctionRecord
	 */
	public AuthFunctionRecord() {
		super(AuthFunction.AUTH_FUNCTION);
	}

	/**
	 * Create a detached, initialised AuthFunctionRecord
	 */
	public AuthFunctionRecord(String authFunctionCd, String name, String className, String actionName, String comment, Integer sortkey) {
		super(AuthFunction.AUTH_FUNCTION);

		setValue(0, authFunctionCd);
		setValue(1, name);
		setValue(2, className);
		setValue(3, actionName);
		setValue(4, comment);
		setValue(5, sortkey);
	}
}

/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.TopMessage;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * メッセージ
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TopMessageRecord extends UpdatableRecordImpl<TopMessageRecord> implements Record11<Long, Timestamp, String, Long, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> {

	private static final long serialVersionUID = -2083803342;

	/**
	 * Setter for <code>members.top_message.message_id</code>. メッセージID
	 */
	public void setMessageId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>members.top_message.message_id</code>. メッセージID
	 */
	public Long getMessageId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>members.top_message.message_date</code>. メッセージ日付
	 */
	public void setMessageDate(Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>members.top_message.message_date</code>. メッセージ日付
	 */
	public Timestamp getMessageDate() {
		return (Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>members.top_message.content</code>. メッセージ内容
	 */
	public void setContent(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>members.top_message.content</code>. メッセージ内容
	 */
	public String getContent() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>members.top_message.sort_order</code>. 並び順
	 */
	public void setSortOrder(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>members.top_message.sort_order</code>. 並び順
	 */
	public Long getSortOrder() {
		return (Long) getValue(3);
	}

	/**
	 * Setter for <code>members.top_message.created</code>. 登録日時
	 */
	public void setCreated(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>members.top_message.created</code>. 登録日時
	 */
	public Timestamp getCreated() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>members.top_message.created_user</code>. 登録ユーザ
	 */
	public void setCreatedUser(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>members.top_message.created_user</code>. 登録ユーザ
	 */
	public Integer getCreatedUser() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>members.top_message.updated</code>. 更新日時
	 */
	public void setUpdated(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>members.top_message.updated</code>. 更新日時
	 */
	public Timestamp getUpdated() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>members.top_message.updated_user</code>. 更新ユーザ
	 */
	public void setUpdatedUser(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>members.top_message.updated_user</code>. 更新ユーザ
	 */
	public Integer getUpdatedUser() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>members.top_message.deleted</code>. 削除日時
	 */
	public void setDeleted(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>members.top_message.deleted</code>. 削除日時
	 */
	public Timestamp getDeleted() {
		return (Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>members.top_message.deleted_user</code>. 削除ユーザ
	 */
	public void setDeletedUser(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>members.top_message.deleted_user</code>. 削除ユーザ
	 */
	public Integer getDeletedUser() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>members.top_message.version</code>. バージョン
	 */
	public void setVersion(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>members.top_message.version</code>. バージョン
	 */
	public Integer getVersion() {
		return (Integer) getValue(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Long, Timestamp, String, Long, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Long, Timestamp, String, Long, Timestamp, Integer, Timestamp, Integer, Timestamp, Integer, Integer> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return TopMessage.TOP_MESSAGE.MESSAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field2() {
		return TopMessage.TOP_MESSAGE.MESSAGE_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TopMessage.TOP_MESSAGE.CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return TopMessage.TOP_MESSAGE.SORT_ORDER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return TopMessage.TOP_MESSAGE.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return TopMessage.TOP_MESSAGE.CREATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return TopMessage.TOP_MESSAGE.UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return TopMessage.TOP_MESSAGE.UPDATED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return TopMessage.TOP_MESSAGE.DELETED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return TopMessage.TOP_MESSAGE.DELETED_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return TopMessage.TOP_MESSAGE.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getMessageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value2() {
		return getMessageDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getContent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getSortOrder();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getCreatedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getUpdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getUpdatedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value9() {
		return getDeleted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getDeletedUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord value1(Long value) {
		setMessageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord value2(Timestamp value) {
		setMessageDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord value3(String value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord value4(Long value) {
		setSortOrder(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord value5(Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord value6(Integer value) {
		setCreatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord value7(Timestamp value) {
		setUpdated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord value8(Integer value) {
		setUpdatedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord value9(Timestamp value) {
		setDeleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord value10(Integer value) {
		setDeletedUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord value11(Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TopMessageRecord values(Long value1, Timestamp value2, String value3, Long value4, Timestamp value5, Integer value6, Timestamp value7, Integer value8, Timestamp value9, Integer value10, Integer value11) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TopMessageRecord
	 */
	public TopMessageRecord() {
		super(TopMessage.TOP_MESSAGE);
	}

	/**
	 * Create a detached, initialised TopMessageRecord
	 */
	public TopMessageRecord(Long messageId, Timestamp messageDate, String content, Long sortOrder, Timestamp created, Integer createdUser, Timestamp updated, Integer updatedUser, Timestamp deleted, Integer deletedUser, Integer version) {
		super(TopMessage.TOP_MESSAGE);

		setValue(0, messageId);
		setValue(1, messageDate);
		setValue(2, content);
		setValue(3, sortOrder);
		setValue(4, created);
		setValue(5, createdUser);
		setValue(6, updated);
		setValue(7, updatedUser);
		setValue(8, deleted);
		setValue(9, deletedUser);
		setValue(10, version);
	}
}

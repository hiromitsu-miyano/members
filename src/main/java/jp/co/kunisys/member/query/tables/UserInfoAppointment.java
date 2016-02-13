/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.UserInfoAppointmentRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 辞令情報
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoAppointment extends TableImpl<UserInfoAppointmentRecord> {

	private static final long serialVersionUID = 1262511974;

	/**
	 * The reference instance of <code>members.user_info_appointment</code>
	 */
	public static final UserInfoAppointment USER_INFO_APPOINTMENT = new UserInfoAppointment();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserInfoAppointmentRecord> getRecordType() {
		return UserInfoAppointmentRecord.class;
	}

	/**
	 * The column <code>members.user_info_appointment.user_id</code>. ユーザID
	 */
	public final TableField<UserInfoAppointmentRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "ユーザID");

	/**
	 * The column <code>members.user_info_appointment.no</code>. 連番
	 */
	public final TableField<UserInfoAppointmentRecord, Integer> NO = createField("no", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "連番");

	/**
	 * The column <code>members.user_info_appointment.appoint_date</code>. 発令日
	 */
	public final TableField<UserInfoAppointmentRecord, Date> APPOINT_DATE = createField("appoint_date", org.jooq.impl.SQLDataType.DATE, this, "発令日");

	/**
	 * The column <code>members.user_info_appointment.appoint_type</code>. 辞令区分
	 */
	public final TableField<UserInfoAppointmentRecord, String> APPOINT_TYPE = createField("appoint_type", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "辞令区分");

	/**
	 * The column <code>members.user_info_appointment.description</code>. 内容
	 */
	public final TableField<UserInfoAppointmentRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "内容");

	/**
	 * The column <code>members.user_info_appointment.comment</code>. コメント
	 */
	public final TableField<UserInfoAppointmentRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "コメント");

	/**
	 * The column <code>members.user_info_appointment.created</code>. 登録日時
	 */
	public final TableField<UserInfoAppointmentRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "登録日時");

	/**
	 * The column <code>members.user_info_appointment.created_user</code>. 登録ユーザ
	 */
	public final TableField<UserInfoAppointmentRecord, Integer> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.INTEGER, this, "登録ユーザ");

	/**
	 * The column <code>members.user_info_appointment.updated</code>. 更新日時
	 */
	public final TableField<UserInfoAppointmentRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新日時");

	/**
	 * The column <code>members.user_info_appointment.updated_user</code>. 更新ユーザ
	 */
	public final TableField<UserInfoAppointmentRecord, Integer> UPDATED_USER = createField("updated_user", org.jooq.impl.SQLDataType.INTEGER, this, "更新ユーザ");

	/**
	 * The column <code>members.user_info_appointment.deleted</code>. 削除日時
	 */
	public final TableField<UserInfoAppointmentRecord, Timestamp> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TIMESTAMP, this, "削除日時");

	/**
	 * The column <code>members.user_info_appointment.deleted_user</code>. 削除ユーザ
	 */
	public final TableField<UserInfoAppointmentRecord, Integer> DELETED_USER = createField("deleted_user", org.jooq.impl.SQLDataType.INTEGER, this, "削除ユーザ");

	/**
	 * The column <code>members.user_info_appointment.version</code>. バージョン
	 */
	public final TableField<UserInfoAppointmentRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "バージョン");

	/**
	 * Create a <code>members.user_info_appointment</code> table reference
	 */
	public UserInfoAppointment() {
		this("user_info_appointment", null);
	}

	/**
	 * Create an aliased <code>members.user_info_appointment</code> table reference
	 */
	public UserInfoAppointment(String alias) {
		this(alias, USER_INFO_APPOINTMENT);
	}

	private UserInfoAppointment(String alias, Table<UserInfoAppointmentRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserInfoAppointment(String alias, Table<UserInfoAppointmentRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "辞令情報");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UserInfoAppointmentRecord> getPrimaryKey() {
		return Keys.KEY_USER_INFO_APPOINTMENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UserInfoAppointmentRecord>> getKeys() {
		return Arrays.<UniqueKey<UserInfoAppointmentRecord>>asList(Keys.KEY_USER_INFO_APPOINTMENT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableField<UserInfoAppointmentRecord, Integer> getRecordVersion() {
		return VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoAppointment as(String alias) {
		return new UserInfoAppointment(alias, this);
	}

	/**
	 * Rename this table
	 */
	public UserInfoAppointment rename(String name) {
		return new UserInfoAppointment(name, null);
	}
}
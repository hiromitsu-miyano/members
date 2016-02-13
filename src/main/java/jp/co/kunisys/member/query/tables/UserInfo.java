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
import jp.co.kunisys.member.query.tables.records.UserInfoRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * ユーザ情報
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfo extends TableImpl<UserInfoRecord> {

	private static final long serialVersionUID = -1911381281;

	/**
	 * The reference instance of <code>members.user_info</code>
	 */
	public static final UserInfo USER_INFO = new UserInfo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserInfoRecord> getRecordType() {
		return UserInfoRecord.class;
	}

	/**
	 * The column <code>members.user_info.user_id</code>. ユーザID
	 */
	public final TableField<UserInfoRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "ユーザID");

	/**
	 * The column <code>members.user_info.account</code>. アカウント
	 */
	public final TableField<UserInfoRecord, String> ACCOUNT = createField("account", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "アカウント");

	/**
	 * The column <code>members.user_info.password</code>. パスワード
	 */
	public final TableField<UserInfoRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "パスワード");

	/**
	 * The column <code>members.user_info.lastname</code>. 姓
	 */
	public final TableField<UserInfoRecord, String> LASTNAME = createField("lastname", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "姓");

	/**
	 * The column <code>members.user_info.firstname</code>. 名
	 */
	public final TableField<UserInfoRecord, String> FIRSTNAME = createField("firstname", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "名");

	/**
	 * The column <code>members.user_info.lastname_kana</code>. 姓フリガナ
	 */
	public final TableField<UserInfoRecord, String> LASTNAME_KANA = createField("lastname_kana", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "姓フリガナ");

	/**
	 * The column <code>members.user_info.firstname_kana</code>. 名フリガナ
	 */
	public final TableField<UserInfoRecord, String> FIRSTNAME_KANA = createField("firstname_kana", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "名フリガナ");

	/**
	 * The column <code>members.user_info.gender_cd</code>. 性別コード
	 */
	public final TableField<UserInfoRecord, String> GENDER_CD = createField("gender_cd", org.jooq.impl.SQLDataType.VARCHAR.length(1), this, "性別コード");

	/**
	 * The column <code>members.user_info.birthday</code>. 生年月日
	 */
	public final TableField<UserInfoRecord, Date> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.DATE, this, "生年月日");

	/**
	 * The column <code>members.user_info.address1</code>. 住所1
	 */
	public final TableField<UserInfoRecord, String> ADDRESS1 = createField("address1", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "住所1");

	/**
	 * The column <code>members.user_info.address2</code>. 住所2
	 */
	public final TableField<UserInfoRecord, String> ADDRESS2 = createField("address2", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "住所2");

	/**
	 * The column <code>members.user_info.access</code>. 最寄駅バス停
	 */
	public final TableField<UserInfoRecord, String> ACCESS = createField("access", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "最寄駅バス停");

	/**
	 * The column <code>members.user_info.join_years</code>. 入社年月日
	 */
	public final TableField<UserInfoRecord, Date> JOIN_YEARS = createField("join_years", org.jooq.impl.SQLDataType.DATE, this, "入社年月日");

	/**
	 * The column <code>members.user_info.dept_cd</code>. 部署コード
	 */
	public final TableField<UserInfoRecord, String> DEPT_CD = createField("dept_cd", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "部署コード");

	/**
	 * The column <code>members.user_info.post_cd</code>. 職位コード
	 */
	public final TableField<UserInfoRecord, String> POST_CD = createField("post_cd", org.jooq.impl.SQLDataType.VARCHAR.length(2), this, "職位コード");

	/**
	 * The column <code>members.user_info.auth_cd</code>. 権限コード
	 */
	public final TableField<UserInfoRecord, String> AUTH_CD = createField("auth_cd", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "権限コード");

	/**
	 * The column <code>members.user_info.created</code>. 登録日時
	 */
	public final TableField<UserInfoRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "登録日時");

	/**
	 * The column <code>members.user_info.created_user</code>. 登録ユーザ
	 */
	public final TableField<UserInfoRecord, Integer> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.INTEGER, this, "登録ユーザ");

	/**
	 * The column <code>members.user_info.updated</code>. 更新日時
	 */
	public final TableField<UserInfoRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新日時");

	/**
	 * The column <code>members.user_info.updated_user</code>. 更新ユーザ
	 */
	public final TableField<UserInfoRecord, Integer> UPDATED_USER = createField("updated_user", org.jooq.impl.SQLDataType.INTEGER, this, "更新ユーザ");

	/**
	 * The column <code>members.user_info.deleted</code>. 削除日時
	 */
	public final TableField<UserInfoRecord, Timestamp> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TIMESTAMP, this, "削除日時");

	/**
	 * The column <code>members.user_info.deleted_user</code>. 削除ユーザ
	 */
	public final TableField<UserInfoRecord, Integer> DELETED_USER = createField("deleted_user", org.jooq.impl.SQLDataType.INTEGER, this, "削除ユーザ");

	/**
	 * The column <code>members.user_info.version</code>. バージョン
	 */
	public final TableField<UserInfoRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "バージョン");

	/**
	 * Create a <code>members.user_info</code> table reference
	 */
	public UserInfo() {
		this("user_info", null);
	}

	/**
	 * Create an aliased <code>members.user_info</code> table reference
	 */
	public UserInfo(String alias) {
		this(alias, USER_INFO);
	}

	private UserInfo(String alias, Table<UserInfoRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserInfo(String alias, Table<UserInfoRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "ユーザ情報");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UserInfoRecord> getPrimaryKey() {
		return Keys.KEY_USER_INFO_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UserInfoRecord>> getKeys() {
		return Arrays.<UniqueKey<UserInfoRecord>>asList(Keys.KEY_USER_INFO_PRIMARY, Keys.KEY_USER_INFO_IDX_U);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableField<UserInfoRecord, Integer> getRecordVersion() {
		return VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfo as(String alias) {
		return new UserInfo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public UserInfo rename(String name) {
		return new UserInfo(name, null);
	}
}
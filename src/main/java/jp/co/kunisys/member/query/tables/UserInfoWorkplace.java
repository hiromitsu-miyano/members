/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.UserInfoWorkplaceRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * ユーザ勤務先
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoWorkplace extends TableImpl<UserInfoWorkplaceRecord> {

	private static final long serialVersionUID = 384276505;

	/**
	 * The reference instance of <code>members.user_info_workplace</code>
	 */
	public static final UserInfoWorkplace USER_INFO_WORKPLACE = new UserInfoWorkplace();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserInfoWorkplaceRecord> getRecordType() {
		return UserInfoWorkplaceRecord.class;
	}

	/**
	 * The column <code>members.user_info_workplace.user_id</code>. ユーザID
	 */
	public final TableField<UserInfoWorkplaceRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "ユーザID");

	/**
	 * The column <code>members.user_info_workplace.workplace_id</code>. 勤務先ID
	 */
	public final TableField<UserInfoWorkplaceRecord, Integer> WORKPLACE_ID = createField("workplace_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "勤務先ID");

	/**
	 * Create a <code>members.user_info_workplace</code> table reference
	 */
	public UserInfoWorkplace() {
		this("user_info_workplace", null);
	}

	/**
	 * Create an aliased <code>members.user_info_workplace</code> table reference
	 */
	public UserInfoWorkplace(String alias) {
		this(alias, USER_INFO_WORKPLACE);
	}

	private UserInfoWorkplace(String alias, Table<UserInfoWorkplaceRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserInfoWorkplace(String alias, Table<UserInfoWorkplaceRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "ユーザ勤務先");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UserInfoWorkplaceRecord> getPrimaryKey() {
		return Keys.KEY_USER_INFO_WORKPLACE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UserInfoWorkplaceRecord>> getKeys() {
		return Arrays.<UniqueKey<UserInfoWorkplaceRecord>>asList(Keys.KEY_USER_INFO_WORKPLACE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoWorkplace as(String alias) {
		return new UserInfoWorkplace(alias, this);
	}

	/**
	 * Rename this table
	 */
	public UserInfoWorkplace rename(String name) {
		return new UserInfoWorkplace(name, null);
	}
}
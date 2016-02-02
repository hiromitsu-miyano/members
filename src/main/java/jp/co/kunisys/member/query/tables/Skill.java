/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.Keys;
import jp.co.kunisys.member.query.Members;
import jp.co.kunisys.member.query.tables.records.SkillRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * スキル
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Skill extends TableImpl<SkillRecord> {

	private static final long serialVersionUID = -226204073;

	/**
	 * The reference instance of <code>members.skill</code>
	 */
	public static final Skill SKILL = new Skill();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SkillRecord> getRecordType() {
		return SkillRecord.class;
	}

	/**
	 * The column <code>members.skill.skill_no</code>. スキル番号
	 */
	public final TableField<SkillRecord, Integer> SKILL_NO = createField("skill_no", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "スキル番号");

	/**
	 * The column <code>members.skill.name</code>. スキル名称
	 */
	public final TableField<SkillRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "スキル名称");

	/**
	 * The column <code>members.skill.short_name</code>. スキル略称
	 */
	public final TableField<SkillRecord, String> SHORT_NAME = createField("short_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "スキル略称");

	/**
	 * The column <code>members.skill.skill_type_no</code>. スキル種類番号
	 */
	public final TableField<SkillRecord, Integer> SKILL_TYPE_NO = createField("skill_type_no", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "スキル種類番号");

	/**
	 * The column <code>members.skill.level</code>. スキル階層
	 */
	public final TableField<SkillRecord, String> LEVEL = createField("level", org.jooq.impl.SQLDataType.VARCHAR.length(300).nullable(false), this, "スキル階層");

	/**
	 * The column <code>members.skill.is_category</code>. カテゴリ識別
	 */
	public final TableField<SkillRecord, Byte> IS_CATEGORY = createField("is_category", org.jooq.impl.SQLDataType.TINYINT, this, "カテゴリ識別");

	/**
	 * The column <code>members.skill.comment</code>. コメント
	 */
	public final TableField<SkillRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "コメント");

	/**
	 * The column <code>members.skill.sortkey</code>. 並び順
	 */
	public final TableField<SkillRecord, Integer> SORTKEY = createField("sortkey", org.jooq.impl.SQLDataType.INTEGER, this, "並び順");

	/**
	 * The column <code>members.skill.created</code>. 登録日時
	 */
	public final TableField<SkillRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "登録日時");

	/**
	 * The column <code>members.skill.created_user</code>. 登録ユーザ
	 */
	public final TableField<SkillRecord, Integer> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.INTEGER, this, "登録ユーザ");

	/**
	 * The column <code>members.skill.updated</code>. 更新日時
	 */
	public final TableField<SkillRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新日時");

	/**
	 * The column <code>members.skill.updated_user</code>. 更新ユーザ
	 */
	public final TableField<SkillRecord, Integer> UPDATED_USER = createField("updated_user", org.jooq.impl.SQLDataType.INTEGER, this, "更新ユーザ");

	/**
	 * The column <code>members.skill.deleted</code>. 削除日時
	 */
	public final TableField<SkillRecord, Timestamp> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TIMESTAMP, this, "削除日時");

	/**
	 * The column <code>members.skill.deleted_user</code>. 削除ユーザ
	 */
	public final TableField<SkillRecord, Integer> DELETED_USER = createField("deleted_user", org.jooq.impl.SQLDataType.INTEGER, this, "削除ユーザ");

	/**
	 * The column <code>members.skill.version</code>. バージョン
	 */
	public final TableField<SkillRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "バージョン");

	/**
	 * Create a <code>members.skill</code> table reference
	 */
	public Skill() {
		this("skill", null);
	}

	/**
	 * Create an aliased <code>members.skill</code> table reference
	 */
	public Skill(String alias) {
		this(alias, SKILL);
	}

	private Skill(String alias, Table<SkillRecord> aliased) {
		this(alias, aliased, null);
	}

	private Skill(String alias, Table<SkillRecord> aliased, Field<?>[] parameters) {
		super(alias, Members.MEMBERS, aliased, parameters, "スキル");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SkillRecord> getPrimaryKey() {
		return Keys.KEY_SKILL_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SkillRecord>> getKeys() {
		return Arrays.<UniqueKey<SkillRecord>>asList(Keys.KEY_SKILL_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TableField<SkillRecord, Integer> getRecordVersion() {
		return VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Skill as(String alias) {
		return new Skill(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Skill rename(String name) {
		return new Skill(name, null);
	}
}

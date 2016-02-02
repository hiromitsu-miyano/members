package jp.co.kunisys.member.query;

import org.jooq.DSLContext;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import jp.co.kunisys.member.Application;
import jp.co.kunisys.member.config.SecurityConfig;
import jp.co.kunisys.member.query.tables.records.UserInfoRecord;

/**
 * JOOQ の INSERT 処理のテストクラス
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class, SecurityConfig.class})
@WebAppConfiguration
@Transactional
public class InsertTest {

	@Autowired
	private DSLContext dsl;


	private static final Integer userId1 = 1;
	private static final Integer userId2 = 2;


	/**
	 * 各テストの前準備
	 */
	@Before
	public void setUp() {
		//テストデータ１
		UserInfoRecord rec1 = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId1))
										.fetchOne();
		if (rec1 != null) {
			rec1.delete();
		}
		//テストデータ２
		UserInfoRecord rec2 = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId2))
										.fetchOne();
		if (rec2 != null) {
			rec2.delete();
		}
	}

	/**
	 * INSERT (直接実行１件)
	 */
	@Test
	public void testInsertSingle() {
		UserInfoRecord rec = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId1))
										.fetchOne();
		Assert.assertNull(rec);

		// INSERT INTO user_info (
		//      user_id,
		//      account,
		//      firstname,
		//      version
		// ) VALUES (userId1, 'HOGE', 'ほげ', 1);
		this.dsl.insertInto(Tables.USER_INFO,
				Tables.USER_INFO.USER_ID,
				Tables.USER_INFO.ACCOUNT,
				Tables.USER_INFO.FIRSTNAME,
				Tables.USER_INFO.VERSION)
			.values(userId1, "HOGE", "ほげ", 1)
			.execute();

		rec = this.dsl.selectFrom(Tables.USER_INFO)
				.where(Tables.USER_INFO.USER_ID.eq(userId1))
				.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("HOGE", rec.getAccount());
		Assert.assertEquals("ほげ", rec.getFirstname());
	}

	/**
	 * INSERT (直接実行複数件)
	 */
	@Test
	public void testInsertMulti() {
		UserInfoRecord rec = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId1))
										.fetchOne();
		Assert.assertNull(rec);
		rec = this.dsl.selectFrom(Tables.USER_INFO)
				.where(Tables.USER_INFO.USER_ID.eq(userId2))
				.fetchOne();
		Assert.assertNull(rec);

		// INSERT INTO user_info (
		//      user_id,
		//      account,
		//      firstname,
		//      version
		// ) VALUES (userId1, 'HOGE', 'ほげ', 1),
		//          (userId2, 'FUGA', 'ふが', 1);
		this.dsl.insertInto(Tables.USER_INFO,
				Tables.USER_INFO.USER_ID,
				Tables.USER_INFO.ACCOUNT,
				Tables.USER_INFO.FIRSTNAME,
				Tables.USER_INFO.VERSION)
			.values(userId1, "HOGE", "ほげ", 1)
			.values(userId2, "FUGA", "ふが", 1)
			.execute();

		rec = this.dsl.selectFrom(Tables.USER_INFO)
				.where(Tables.USER_INFO.USER_ID.eq(userId1))
				.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("HOGE", rec.getAccount());
		Assert.assertEquals("ほげ", rec.getFirstname());
		rec = this.dsl.selectFrom(Tables.USER_INFO)
				.where(Tables.USER_INFO.USER_ID.eq(userId2))
				.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("FUGA", rec.getAccount());
		Assert.assertEquals("ふが", rec.getFirstname());
	}

	/**
	 * INSERT (UpdatableRecord実行)
	 */
	@Test
	public void testInsertRecord() {
		UserInfoRecord rec = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId1))
										.fetchOne();
		Assert.assertNull(rec);

		//INSERT
		rec = this.dsl.newRecord(Tables.USER_INFO);
		rec.setUserId(userId1);
		rec.setAccount("HOGE");
		rec.setFirstname("ほげ");
		rec.setVersion(1);
		rec.store();

		rec = this.dsl.selectFrom(Tables.USER_INFO)
				.where(Tables.USER_INFO.USER_ID.eq(userId1))
				.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("HOGE", rec.getAccount());
		Assert.assertEquals("ほげ", rec.getFirstname());
	}

}

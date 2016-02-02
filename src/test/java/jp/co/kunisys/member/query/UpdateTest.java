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
 * JOOQ の UPDATE 処理のテストクラス
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class, SecurityConfig.class})
@WebAppConfiguration
@Transactional
public class UpdateTest {

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
		if (rec1 == null) {
			rec1 = this.dsl.newRecord(Tables.USER_INFO);
			rec1.setUserId(userId1);
		}
		rec1.setAccount("HOGE");
		rec1.setLastname("ほげ");
		rec1.setLastnameKana("ホゲ");
		rec1.setFirstname("TEST");
		rec1.setVersion(2);
		rec1.store();
		//テストデータ２
		UserInfoRecord rec2 = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId2))
										.fetchOne();
		if (rec2 == null) {
			rec2 = this.dsl.newRecord(Tables.USER_INFO);
			rec2.setUserId(userId2);
		}
		rec2.setAccount("FUGA");
		rec2.setFirstname("TEST");
		rec2.setVersion(2);
		rec2.store();
	}

	/**
	 * UPDATE (直接実行)
	 */
	@Test
	public void testUpdate() {
		UserInfoRecord rec = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId1))
										.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("ほげ", rec.getLastname());
		Assert.assertEquals("ホゲ", rec.getLastnameKana());

		//UPDATE user_info
		//   SET lastname      = 'HOGEHOGE',
		//       lastname_kana = 'ホゲホゲ'
		// WHERE account = 'HOGE'
		this.dsl.update(Tables.USER_INFO)
					.set(Tables.USER_INFO.LASTNAME, "HOGEHOGE")
					.set(Tables.USER_INFO.LASTNAME_KANA, "ホゲホゲ")
					.where(Tables.USER_INFO.ACCOUNT.eq("HOGE"))
					.execute();

		rec = this.dsl.selectFrom(Tables.USER_INFO)
						.where(Tables.USER_INFO.USER_ID.eq(userId1))
						.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("HOGEHOGE", rec.getLastname());
		Assert.assertEquals("ホゲホゲ", rec.getLastnameKana());
	}

	/**
	 * UPDATE (UpdatableRecord実行)
	 */
	@Test
	public void testUpdateRecord() {
		UserInfoRecord rec = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId1))
										.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("ほげ", rec.getLastname());
		Assert.assertEquals("ホゲ", rec.getLastnameKana());

		//UPDATE
		rec.setLastname("HOGEHOGE");
		rec.setLastnameKana("ホゲホゲ");
		rec.store();

		rec = this.dsl.selectFrom(Tables.USER_INFO)
						.where(Tables.USER_INFO.USER_ID.eq(userId1))
						.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("HOGEHOGE", rec.getLastname());
		Assert.assertEquals("ホゲホゲ", rec.getLastnameKana());
	}

	/**
	 * UPDATE (UpdatableRecord実行：排他確認)
	 */
	@Test
	public void testUpdateOptimistic() {
		UserInfoRecord rec = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId1))
										.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("ほげ", rec.getLastname());
		Assert.assertEquals("ホゲ", rec.getLastnameKana());

		//UPDATE
		boolean isOptimistic = false;
		try {
			rec.setLastname("HOGEHOGE");
			rec.setLastnameKana("ホゲホゲ");
			rec.setVersion(1);
			rec.store();
		} catch (org.jooq.exception.DataChangedException ex) {
			//排他例外発生時
			isOptimistic = true;
		}

		Assert.assertTrue(isOptimistic);
	}
}

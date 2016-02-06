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
 * JOOQ の DELETE 処理のテストクラス
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class, SecurityConfig.class})
@WebAppConfiguration
@Transactional
public class DeleteTest {

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
	 * DELETE (直接実行)
	 */
	@Test
	public void testDelete() {
		UserInfoRecord rec = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId1))
										.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("ほげ", rec.getLastname());
		Assert.assertEquals("ホゲ", rec.getLastnameKana());

		//DELETE user_info
		// WHERE user_id = userId1
		this.dsl.delete(Tables.USER_INFO)
					.where(Tables.USER_INFO.USER_ID.eq(userId1))
					.execute();

		rec = this.dsl.selectFrom(Tables.USER_INFO)
						.where(Tables.USER_INFO.USER_ID.eq(userId1))
						.fetchOne();
		Assert.assertNull(rec);
	}

	/**
	 * DELETE (UpdatableRecord実行)
	 */
	@Test
	public void testUpdateRecord() {
		UserInfoRecord rec = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId1))
										.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("ほげ", rec.getLastname());
		Assert.assertEquals("ホゲ", rec.getLastnameKana());

		//DELETE
		rec.delete();

		rec = this.dsl.selectFrom(Tables.USER_INFO)
						.where(Tables.USER_INFO.USER_ID.eq(userId1))
						.fetchOne();
		Assert.assertNull(rec);
	}

	/**
	 * DELETE (UpdatableRecord実行：排他確認)
	 */
	@Test
	public void testUpdateOptimistic() {
		UserInfoRecord rec = this.dsl.selectFrom(Tables.USER_INFO)
										.where(Tables.USER_INFO.USER_ID.eq(userId1))
										.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("ほげ", rec.getLastname());
		Assert.assertEquals("ホゲ", rec.getLastnameKana());

		//DELETE
		boolean isOptimistic = false;
		try {
			rec.setVersion(1);
			rec.delete();
		} catch (org.jooq.exception.DataChangedException ex) {
			//排他例外発生時
			isOptimistic = true;
		}

		Assert.assertTrue(isOptimistic);
	}
}

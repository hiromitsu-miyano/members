package jp.co.kunisys.member.query;

import java.util.List;

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
 * JOOQ の SELECT 処理のテストクラス
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class, SecurityConfig.class})
@WebAppConfiguration
@Transactional
public class SelectTest {

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
		rec1.setFirstname("TEST");
		rec1.setVersion(1);
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
		rec2.setVersion(1);
		rec2.store();
	}

	/**
	 * SELECT (任意の１件取得)
	 */
	@Test
	public void testSelectOne() {
		//SELECT * FROM user_info
		// WHERE user_id = userId1
		UserInfoRecord rec = this.dsl.selectFrom(Tables.USER_INFO)
									.where(Tables.USER_INFO.USER_ID.eq(userId1))
									.fetchOne();
		Assert.assertNotNull(rec);
		Assert.assertEquals("HOGE", rec.getAccount());
		Assert.assertEquals("TEST", rec.getFirstname());
	}

	/**
	 * SELECT (任意の複数件取得)
	 */
	@Test
	public void testSelectAny() {
		// SELECT * FROM user_info
		//  WHERE firstname = 'TEST'
		// ORDER BY user_id
		List<UserInfoRecord> recList = this.dsl.selectFrom(Tables.USER_INFO)
											.where(Tables.USER_INFO.FIRSTNAME.eq("TEST"))
											.orderBy(Tables.USER_INFO.USER_ID)
											.fetch();
		Assert.assertEquals(2, recList.size());
		Assert.assertEquals("HOGE", recList.get(0).getAccount());
		Assert.assertEquals("FUGA", recList.get(1).getAccount());
	}

	/**
	 * SELECT COUNT(*) (件数取得)
	 */
	@Test
	public void testSelectCount() {
		// SELECT COUNT(*)
		//   FROM user_info
		//  WHERE firstname = 'TEST'
		Integer count = this.dsl.selectCount()
								.from(Tables.USER_INFO)
								.where(Tables.USER_INFO.FIRSTNAME.eq("TEST"))
								.fetchOne().value1();
		Assert.assertEquals((Integer)2, count);
	}

	/**
	 * SELECT DISTINCT (重複除去取得)
	 */
	@Test
	public void testSelectDistinct() {
		// SELECT DISTINCT firstname, lastname
		//   FROM user_info
		//  WHERE firstname = 'TEST'
		List<UserInfoRecord> ret = this.dsl.selectDistinct(Tables.USER_INFO.FIRSTNAME, Tables.USER_INFO.LASTNAME)
											.from(Tables.USER_INFO)
											.where(Tables.USER_INFO.FIRSTNAME.eq("TEST"))
											.fetchInto(Tables.USER_INFO);
		Assert.assertEquals(1, ret.size());
		Assert.assertEquals("TEST", ret.get(0).getFirstname());
	}
}

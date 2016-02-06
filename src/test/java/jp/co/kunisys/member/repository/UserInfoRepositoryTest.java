package jp.co.kunisys.member.repository;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import jp.co.kunisys.member.Application;
import jp.co.kunisys.member.config.SecurityConfig;

/**
 * {@link UserInfoRepository}のテストクラス
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class, SecurityConfig.class})
@WebAppConfiguration
@Transactional
public class UserInfoRepositoryTest {

	@Autowired
	private UserInfoRepository repository;

	/**
	 * {@link #repository}が利用可能であることをテストします。
	 */
	@Test
	public void testAvailable() {
		assertNotNull(this.repository);
	}


	/**
	 * {@link UserInfoRepository#findById(Integer)}のテスト
	 */
	@Test
	public void testFindById() {
		this.repository.findById(1000);
	}

	/**
	 * {@link UserInfoRepository#findByAccount(String)}のテスト
	 */
	@Test
	public void testFindByAccount() {
		this.repository.findByAccount("0128");
	}
}

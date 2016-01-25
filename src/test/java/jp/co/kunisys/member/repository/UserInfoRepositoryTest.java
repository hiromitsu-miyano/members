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
import jp.co.kunisys.member.entity.UserInfo;

/**
 * {@link UserInfoRepository}のテストクラス
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class, SecurityConfig.class})
@WebAppConfiguration
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
	 * {@link UserInfoRepository#findAll()}のテスト
	 */
	@Transactional
	@Test
	public void testFindAll() {
		this.repository.findAll();
	}

	/**
	 * {@link UserInfoRepository#findAllOrderById()}のテスト
	 */
	@Transactional
	@Test
	public void testFindAlOrderById() {
		this.repository.findAllOrderById();
	}

	/**
	 * {@link UserInfoRepository#findOneByIdVersion(UserInfo))}のテスト
	 */
	@Transactional
	@Test
	public void testFindOneByIdVersion() {
		UserInfo param = new UserInfo();
		param.setUserId(1000);
		param.setVersion(14);
		this.repository.findOneByIdVersion(param);
	}

	/**
	 * {@link UserInfoRepository#findByParam(UserInfo)}のテスト
	 */
	@Transactional
	@Test
	public void testFindByParam() {
		UserInfo param = new UserInfo();
		param.setUserId(1000);
		this.repository.findOneByParam(param);
	}

	/**
	 * {@link UserInfoRepository#insert(UserInfo)}のテスト
	 */
	@Transactional
	@Test
	public void testInsert() {
		UserInfo entity = new UserInfo();
		entity.setUserId(1);
		entity.setAccount("test");
		entity.setVersion(1);
		this.repository.insert(entity);
	}

	/**
	 * {@link UserInfoRepository#update(UserInfo)}のテスト
	 */
	@Transactional
	@Test
	public void testUpdate() {
		UserInfo entity = new UserInfo();
		entity.setUserId(1000);
		entity.setAccount("test");
		entity.setVersion(15);
		this.repository.update(entity);
	}

	@Transactional
	@Test
	public void testFindByAccount() {
		this.repository.findByAccount("0128");
	}
}

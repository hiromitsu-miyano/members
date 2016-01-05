package jp.co.kunisys.member.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.entity.UserInfo;

/**
 * ユーザ情報リポジトリ
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
	/** ユーザ情報取得(アカウント) */
	public List<UserInfo> findByAccount(String account);
}

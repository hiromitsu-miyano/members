package jp.co.kunisys.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.kunisys.member.entity.TopMessage;

/**
 * メッセージリポジトリ
 */
@Repository
public interface TopMessageRepository extends JpaRepository<TopMessage, Long> {

}

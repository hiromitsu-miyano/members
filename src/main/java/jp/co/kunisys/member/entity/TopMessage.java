package jp.co.kunisys.member.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

/**
 * メッセージ
 */
@Entity
@Data
public class TopMessage {

    /** メッセージID */
    @Id
    @Column(precision = 19, nullable = false, unique = true)
    private Long messageId;

    /** メッセージ日付 */
    @Column(nullable = true, unique = false)
    private Timestamp messageDate;

    /** メッセージ内容 */
    @Column(length = 500, nullable = true, unique = false)
    private String content;

    /** 並び順 */
    @Column(precision = 19, nullable = true, unique = false)
    private Long sortOrder;

    /** 登録日時 */
    @Column(nullable = true, unique = false)
    private Timestamp created;

    /** 登録ユーザ */
    @Column(precision = 10, nullable = true, unique = false)
    private Integer createdUser;

    /** 更新日時 */
    @Column(nullable = true, unique = false)
    private Timestamp updated;

    /** 更新ユーザ */
    @Column(precision = 10, nullable = true, unique = false)
    private Integer updatedUser;

    /** 削除日時 */
    @Column(nullable = true, unique = false)
    private Timestamp deleted;

    /** 削除ユーザ */
    @Column(precision = 10, nullable = true, unique = false)
    private Integer deletedUser;

    /** バージョン */
    @Version
    @Column(precision = 10, nullable = true, unique = false)
    private Integer version;
}

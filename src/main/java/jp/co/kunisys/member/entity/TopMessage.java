package jp.co.kunisys.member.entity;

import java.sql.Timestamp;

import lombok.Data;

/**
 * メッセージ
 */
@Data
public class TopMessage {

    /** メッセージID */
    private Long messageId;

    /** メッセージ日付 */
    private Timestamp messageDate;

    /** メッセージ内容 */
    private String content;

    /** 並び順 */
    private Long sortOrder;

    /** 登録日時 */
    private Timestamp created;

    /** 登録ユーザ */
    private Integer createdUser;

    /** 更新日時 */
    private Timestamp updated;

    /** 更新ユーザ */
    private Integer updatedUser;

    /** 削除日時 */
    private Timestamp deleted;

    /** 削除ユーザ */
    private Integer deletedUser;

    /** バージョン */
    private Integer version;
}

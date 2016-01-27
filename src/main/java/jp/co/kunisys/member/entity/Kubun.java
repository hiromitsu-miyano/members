package jp.co.kunisys.member.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

/**
 * 区分
 */
@Entity
@Data
public class Kubun {

    /** 区分番号 */
    @Id
    @Column
    private Integer seq;

    /** 区分種別コード */
    @Column
    private String typeCode;

    /** 区分種別名 */
    @Column
    private String typeName;

    /** 区分コード */
    @Column
    private String code;

    /** 区分名 */
    @Column
    private String name;

    /** 登録日時 */
    @Column
    private Timestamp created;

    /** 登録ユーザ */
    @Column
    private Integer createdUser;

    /** 更新日時 */
    @Column
    private Timestamp updated;

    /** 更新ユーザ */
    @Column
    private Integer updatedUser;

    /** 削除日時 */
    @Column
    private Timestamp deleted;

    /** 削除ユーザ */
    @Column
    private Integer deletedUser;

    /** バージョン */
    @Version
    @Column
    private Integer version;
}

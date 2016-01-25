package jp.co.kunisys.member.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

/**
 * ユーザ情報
 */
@Entity
@Data
public class UserInfo {

    /** ユーザID */
    @Id
    @Column
    private Integer userId;

    /** アカウント */
    @Column
    private String account;

    /** パスワード */
    @Column
    private String password;

    /** 姓 */
    @Column
    private String lastname;

    /** 名 */
    @Column
    private String firstname;

    /** 姓フリガナ */
    @Column
    private String lastnameKana;

    /** 名フリガナ */
    @Column
    private String firstnameKana;

    /** 性別コード */
    @Column
    private String genderCd;

    /** 生年月日 */
    @Column
    private Date birthday;

    /** 住所1 */
    @Column
    private String address1;

    /** 住所2 */
    @Column
    private String address2;

    /** 最寄駅バス停 */
    @Column
    private String access;

    /** 入社年月日 */
    @Column
    private Date joinYears;

    /** 部署コード */
    @Column
    private String deptCd;

    /** 職位コード */
    @Column
    private String postCd;

    /** 権限コード */
    @Column
    private String authCd;

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

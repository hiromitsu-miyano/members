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
    @Column(precision = 10, nullable = false, unique = true)
    private Integer userId;

    /** アカウント */
    @Column(length = 50, nullable = false, unique = true)
    private String account;

    /** パスワード */
    @Column(length = 20, nullable = true, unique = false)
    private String password;

    /** 姓 */
    @Column(length = 50, nullable = true, unique = false)
    private String lastname;

    /** 名 */
    @Column(length = 50, nullable = true, unique = false)
    private String firstname;

    /** 姓フリガナ */
    @Column(length = 100, nullable = true, unique = false)
    private String lastnameKana;

    /** 名フリガナ */
    @Column(length = 100, nullable = true, unique = false)
    private String firstnameKana;

    /** 性別コード */
    @Column(length = 1, nullable = true, unique = false)
    private String genderCd;

    /** 生年月日 */
    @Column(nullable = true, unique = false)
    private Date birthday;

    /** 住所1 */
    @Column(length = 100, nullable = true, unique = false)
    private String address1;

    /** 住所2 */
    @Column(length = 100, nullable = true, unique = false)
    private String address2;

    /** 最寄駅バス停 */
    @Column(length = 100, nullable = true, unique = false)
    private String access;

    /** 入社年月日 */
    @Column(nullable = true, unique = false)
    private Date joinYears;

    /** 部署コード */
    @Column(length = 8, nullable = true, unique = false)
    private String deptCd;

    /** 職位コード */
    @Column(length = 2, nullable = true, unique = false)
    private String postCd;

    /** 権限コード */
    @Column(length = 3, nullable = true, unique = false)
    private String authCd;

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

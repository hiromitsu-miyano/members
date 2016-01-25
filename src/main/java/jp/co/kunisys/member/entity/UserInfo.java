package jp.co.kunisys.member.entity;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

/**
 * ユーザ情報
 */
@Data
public class UserInfo {

    /** ユーザID */
    private Integer userId;

    /** アカウント */
    private String account;

    /** パスワード */
    private String password;

    /** 姓 */
    private String lastname;

    /** 名 */
    private String firstname;

    /** 姓フリガナ */
    private String lastnameKana;

    /** 名フリガナ */
    private String firstnameKana;

    /** 性別コード */
    private String genderCd;

    /** 生年月日 */
    private Date birthday;

    /** 住所1 */
    private String address1;

    /** 住所2 */
    private String address2;

    /** 最寄駅バス停 */
    private String access;

    /** 入社年月日 */
    private Date joinYears;

    /** 部署コード */
    private String deptCd;

    /** 職位コード */
    private String postCd;

    /** 権限コード */
    private String authCd;

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

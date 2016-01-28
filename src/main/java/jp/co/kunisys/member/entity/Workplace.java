package jp.co.kunisys.member.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

/**
 * 勤務先
 */
@Entity
@Data
public class Workplace {

    /** 勤務先ID */
    @Id
    @Column
    private Integer workplaceId;

    /** 勤務先名 */
    @Column
    private String name;

    /** 勤務先区分 */
    @Column
    private String workplaceType;

    /** 備考 */
    @Column
    private String remark;

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

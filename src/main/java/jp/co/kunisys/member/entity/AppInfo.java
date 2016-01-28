package jp.co.kunisys.member.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * アプリケーション設定
 */
@Entity
@Data
public class AppInfo {

    /** キー定数 */
    @Id
    @Column
    private String appKey;

    /** 値 */
    @Column
    private String appValue;

    /** 値の型情報 */
    @Column
    private String typeOf;

    /** 備考 */
    @Column
    private String note;

    /** 使用フラグ */
    @Column
    private Integer stateFlg;
}

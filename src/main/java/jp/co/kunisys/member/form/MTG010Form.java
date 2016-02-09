package jp.co.kunisys.member.form;

import java.util.List;

import jp.co.kunisys.member.bean.CodeBean;
import jp.co.kunisys.member.common.BeanMap;
import lombok.Data;

/**
 * 学校マスタメンテナンス フォーム
 */
@Data
public class MTG010Form {

    /** 都道府県リスト. */
    private List<CodeBean> prefList;
    /** 選択都道府県. */
    private String selectPref;
    /** 学校区分リスト. */
    private List<CodeBean> schoolTypeList;
    /** 選択学校区分. */
    private String selectSchoolType;

    /** 学校リスト. */
    private List<BeanMap> schoolList;

    /** 選択学校コード. */
    private Integer selectSchoolId;

    /** 入力：学校コード. */
    private Integer inputSchoolId;
    /** 入力：学校名. */
    private String inputSchoolName;
    /** 入力：学校区分. */
    private String inputSchoolType;
    /** 入力：所在県. */
    private String inputPrefCd;
    /** 入力：コメント. */
    private String inputComment;
    /** 入力：バージョン. */
    private Integer inputVersion;
}

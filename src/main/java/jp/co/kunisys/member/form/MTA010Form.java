package jp.co.kunisys.member.form;

import java.util.List;

import jp.co.kunisys.member.bean.CodeBean;
import jp.co.kunisys.member.bean.mta.EmpBean;
import lombok.Data;

/**
 * 権限割当画面フォーム
 */
@Data
public class MTA010Form {

    /** 表示する社員が０件かのフラグ. */
    private boolean empFlag;
    /** 処理完了フラグ */
    private boolean finish;

    /** 権限コンボボックス表示用. */
    private List<CodeBean> authList;
    /** 部署コンボボックス表示用. */
    private List<CodeBean> deptList;
    /** 職位コンボボックス表示用. */
    private List<CodeBean> postList;

    /** 部署コード. */
    private String deptCd;
    /** 職位コード. */
    private String postCd;

    /** 社員一覧リスト. */
    private List<EmpBean> empList;
}

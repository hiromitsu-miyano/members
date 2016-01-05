package jp.co.kunisys.member.common;

public class Constants {

	/**
	 * バージョン番号（メジャー番号）
	 *
	 * 1.0   初回リリース（新人研修版）
	 * 1.1   ＨＧＷ移行（リリース中止）
	 * 1.2   業務分析リリース
	 * 1.3   資産管理(ISMS機能)リリース
	 * 1.4   社員個人情報検索(総務機能)リリース
	 * 1.5   資産管理(ISMS2013)リリース
	 */
	public static final String APPLICATION_VERSION_MEJOR = "ver. 1.5";
	/** バージョン番号 */
	public static String APPLICATION_VERSION;

    /** システム名称. (動的定数)*/
    public static String SYSTEM_NAME = "国建システム　社員管理システム";
    /** 帳票テンプレートディレクトリパス. (動的定数) */
    public static String TEMPLATE_DIR_PATH = "C:";

    /** 表示時のインデント. */
    public static final String INDENT = "&nbsp;&nbsp;";
    /** スラッシュ. */
    public static final String SLASH = "/";

    /** 帳票テンプレートディレクトリ. */
    public static final String DIR_TEMPLATE = "/template";

    /** ファイルセパレータ. */
    public static final String DS = System.getProperty("file.separator");

    /** MIME-TYPE : EXCEL. */
    public static final String MIME_TYPE_EXCEL = "application/vnd.ms-excel";
    /** MIME-TYPE : EXCEL(2007以降). */
    public static final String MIME_TYPE_EXCEL_OPENXML = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    /** MIME-TYPE : JSON. */
    public static final String MIME_TYPE_JSON = "application/json";

    /** CHARSET : Windows-31J. */
    public static final String CHARSET_WINDOWS_31J = "Windows-31J";
    /** CHARSET : UTF-8. */
    public static final String CHARSET_UTF_8 = "UTF-8";
    /** CHARSET : ISO-8859-1. */
    public static final String CHARSET_ISO_8859_1 = "ISO-8859-1";

    /** HTTP ステータスコード：200 OK. */
    public static final int HTTP_STATUS_200_OK = 200;
    /** HTTP ステータスコード：401 Unauthorized. */
    public static final int HTTP_STATUS_401_UNAUTHORIZED = 401;
    /** HTTP ステータスコード：403 Forbidden. */
    public static final int HTTP_STATUS_403_FORBIDDEN = 403;
    /** HTTP ステータスコード：404 Not Found. */
    public static final int HTTP_STATUS_404_NOT_FOUND = 404;

    /** チェックボックス値:ON. */
    public static final String CHECKBOX_ON = "on";
    /** チェックボックス値:OFF. */
    public static final String CHECKBOX_OFF = "off";

    /** 性別ラジオボタン初期値（genderCd="1",男). */
    public static final String GENDERCD_INIT = "1";

    /**
     * 五十音リスト.<br>
     * <p>
     * japaneseList[0][0-4] アイウエオ<br>
     * japaneseList[1][0-9] カキクケコガギグゲゴ<br>
     * japaneseList[2][0-9] サシスセソザジズゼゾ<br>
     * japaneseList[3][0-9] タチツテトダヂヅデド<br>
     * japaneseList[4][0-4] ナニヌネノ<br>
     * japaneseList[5][0-14]ハヒフヘホバビブベボパピプペポ<br>
     * japaneseList[6][0-4] マミムメモ<br>
     * japaneseList[7][0-2] ヤユヨ<br>
     * japaneseList[8][0-4] ラリルレロ<br>
     * japaneseList[9][0-2] ワヲン
     * <p>
     */
    public static final String[][] KATAKANA_LIST = {
        {"ア", "イ", "ウ", "エ", "オ" },
        {"カ", "キ", "ク", "ケ", "コ", "ガ", "ギ", "グ", "ゲ", "ゴ" },
        {"サ", "シ", "ス", "セ", "ソ", "ザ", "ジ", "ズ", "ゼ", "ゾ" },
        {"タ", "チ", "ツ", "テ", "ト", "ダ", "ヂ", "ヅ", "デ", "ド" },
        {"ナ", "ニ", "ヌ", "ネ", "ノ" },
        {"ハ", "ヒ", "フ", "ヘ", "ホ", "バ", "ビ", "ブ", "ベ", "ボ", "パ", "ピ", "プ", "ペ", "ポ" },
        {"マ", "ミ", "ム", "メ", "モ" },
        {"ヤ", "ユ", "ヨ" },
        {"ラ", "リ", "ル", "レ", "ロ" },
        {"ワ", "ヲ", "ン" }
    };

    /*
     * 区分値
     */

    /** 権限割当種類. */
    public static class AuthAssignType {
        /** 権限割当種類:権限なし. */
        public static final int NO_AUTH = 0;
        /** 権限割当種類:権限あり. */
        public static final int AUTH = 1;
        /** 権限割当種類:権限あり（他者情報編集不可）. */
        public static final int AUTH_MYSELF = 2;
    }

    /** 和暦元号. */
    public static class JpYear {
        /** 和暦元号:明治. */
        public static final String MEIJI = "明治";
        /** 和暦元号:大正. */
        public static final String TAISHO = "大正";
        /** 和暦元号:昭和. */
        public static final String SHOWA = "昭和";
        /** 和暦元号:平成. */
        public static final String HEISEI = "平成";
    }

    /** スキル種類. */
    public static class SkillType {
        /** スキル種類:フェーズ. */
        public static final int PHASE = 1;
        /** スキル種類:プログラム言語. */
        public static final int PROGRAM_LANGUAGE = 2;
        /** スキル種類:オペレーションシステム. */
        public static final int OS = 3;
        /** スキル種類:データベース. */
        public static final int DB = 4;
        /** スキル種類:資格. */
        public static final int LICENSE = 5;
    }

    /**
     * APP_INFOテーブルを参照する際の型
     */
    public static final class ValueType{
    	/** M_APP_INI の typeof: string */
    	public static final String INI_VAL_STRING = "string";
    	/** M_APP_INI の typeof: int */
    	public static final String INI_VAL_INT = "int";
    	/** M_APP_INI の typeof: integer */
    	public static final String INI_VAL_INTEGER = "integer";
    	/** M_APP_INI の typeof: double */
    	public static final String INI_VAL_DOUBLE = "double";
    	/** M_APP_INI の typeof: boolean */
    	public static final String INI_VAL_BOOLEAN = "boolean";
    }




    /**
     * コンストラクタ.
     */
    private Constants() {
    }
}

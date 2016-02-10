package jp.co.kunisys.member.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.lang3.StringUtils;

/**
 * 文字列ユーティリティ
 */
public class SUtil {

	/** 全角スペース */
	public static final String FULLSPACE = "　";
	/** 半角スペース */
	public static final String SPACE = StringUtils.SPACE;
	/** 空文字 */
	public static final String EMPTY = StringUtils.EMPTY;
	/** 改行文字CR */
	public static final String CR = StringUtils.CR;
	/** 改行文字LF */
	public static final String LF = StringUtils.LF;
	/** 改行文字CRLF */
	public static final String CRLF = StringUtils.CR + StringUtils.LF;

	/**
     * 空の文字列の配列です。
     */
    public static final String[] EMPTY_STRINGS = new String[0];

	/** カタカナ半角全角変換テーブル */
	private static final String kanaHanZenTbl[][] = {
		// 2文字構成の濁点付き半角カナ
		// 必ずテーブルに先頭に置いてサーチ順を優先すること
		{ "ｶﾞ", "ガ" }, { "ｷﾞ", "ギ" }, { "ｸﾞ", "グ" }, { "ｹﾞ", "ゲ" }, { "ｺﾞ", "ゴ" },
		{ "ｻﾞ", "ザ" }, { "ｼﾞ", "ジ" }, { "ｽﾞ", "ズ" }, { "ｾﾞ", "ゼ" }, { "ｿﾞ", "ゾ" },
		{ "ﾀﾞ", "ダ" }, { "ﾁﾞ", "ヂ" }, { "ﾂﾞ", "ヅ" }, { "ﾃﾞ", "デ" }, { "ﾄﾞ", "ド" },
		{ "ﾊﾞ", "バ" }, { "ﾋﾞ", "ビ" }, { "ﾌﾞ", "ブ" }, { "ﾍﾞ", "ベ" }, { "ﾎﾞ", "ボ" },
		{ "ﾊﾟ", "パ" }, { "ﾋﾟ", "ピ" }, { "ﾌﾟ", "プ" }, { "ﾍﾟ", "ペ" }, { "ﾎﾟ", "ポ" },
		{ "ｳﾞ", "ヴ" },
		// 1文字構成の半角カナ
		{ "ｱ", "ア" }, { "ｲ", "イ" }, { "ｳ", "ウ" }, { "ｴ", "エ" }, { "ｵ", "オ" },
		{ "ｶ", "カ" }, { "ｷ", "キ" }, { "ｸ", "ク" }, { "ｹ", "ケ" }, { "ｺ", "コ" },
		{ "ｻ", "サ" }, { "ｼ", "シ" }, { "ｽ", "ス" }, { "ｾ", "セ" }, { "ｿ", "ソ" },
		{ "ﾀ", "タ" }, { "ﾁ", "チ" }, { "ﾂ", "ツ" }, { "ﾃ", "テ" }, { "ﾄ", "ト" },
		{ "ﾅ", "ナ" }, { "ﾆ", "ニ" }, { "ﾇ", "ヌ" }, { "ﾈ", "ネ" }, { "ﾉ", "ノ" },
		{ "ﾊ", "ハ" }, { "ﾋ", "ヒ" }, { "ﾌ", "フ" }, { "ﾍ", "ヘ" }, { "ﾎ", "ホ" },
		{ "ﾏ", "マ" }, { "ﾐ", "ミ" }, { "ﾑ", "ム" }, { "ﾒ", "メ" }, { "ﾓ", "モ" },
		{ "ﾔ", "ヤ" }, { "ﾕ", "ユ" }, { "ﾖ", "ヨ" },
		{ "ﾗ", "ラ" }, { "ﾘ", "リ" }, { "ﾙ", "ル" }, { "ﾚ", "レ" }, { "ﾛ", "ロ" },
		{ "ﾜ", "ワ" }, { "ｦ", "ヲ" }, { "ﾝ", "ン" },
		{ "ｧ", "ァ" }, { "ｨ", "ィ" }, { "ｩ", "ゥ" }, { "ｪ", "ェ" }, { "ｫ", "ォ" },
		{ "ｬ", "ャ" }, { "ｭ", "ュ" }, { "ｮ", "ョ" }, { "ｯ", "ッ" },
		{ "｡", "。" }, { "｢", "「" }, { "｣", "」" }, { "､", "、" }, { "･", "・" },
		{ "ｰ", "ー" }, { "", "" }
	};

    /**
     * 文字列が<code>null</code>または空文字列なら<code>true</code>を返します。
     * @param text 文字列
     * @return 文字列が<code>null</code>または空文字列なら<code>true</code>
     */
    public static final boolean isEmpty(final String text) {
        return (text == null) || (text.length() == 0);
    }

    /**
     * 文字列が<code>null</code>でも空文字列でもなければ<code>true</code>を返します。
     * @param text 文字列
     * @return 文字列が<code>null</code>でも空文字列でもなければ<code>true</code>
     */
    public static final boolean isNotEmpty(final String text) {
        return !isEmpty(text);
    }

    /**
     * 文字列を置き換えます。
     * @param text 文字列
     * @param fromText 置き換え対象の文字列
     * @param toText 置き換える文字列
     * @return 結果
     */
    public static final String replace(final String text, final String fromText, final String toText) {

        if (text == null || fromText == null || toText == null) {
            return null;
        }
        StringBuffer buf = new StringBuffer(100);
        int pos = 0;
        int pos2 = 0;
        while (true) {
            pos = text.indexOf(fromText, pos2);
            if (pos == 0) {
                buf.append(toText);
                pos2 = fromText.length();
            } else if (pos > 0) {
                buf.append(text.substring(pos2, pos));
                buf.append(toText);
                pos2 = pos + fromText.length();
            } else {
                buf.append(text.substring(pos2));
                break;
            }
        }
        return buf.toString();
    }

    /**
     * 文字列を分割します。
     * @param str 文字列
     * @param delim 分割するためのデリミタ
     * @return 分割された文字列の配列
     */
    public static String[] split(final String str, final String delim) {
        if (isEmpty(str)) {
            return EMPTY_STRINGS;
        }
        List<Object> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, delim);
        while (st.hasMoreElements()) {
            list.add(st.nextElement());
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    /**
     * 左側の空白を削ります。
     * @param text 文字列
     * @return 結果の文字列
     */
    public static final String ltrim(final String text) {
        return ltrim(text, null);
    }

    /**
     * 左側の指定した文字列を削ります。
     * @param text 文字列
     * @param trimText 削る文字列
     * @return 結果の文字列
     */
    public static final String ltrim(final String text, String trimText) {
        if (text == null) {
            return null;
        }
        if (trimText == null) {
            trimText = " ";
        }
        int pos = 0;
        for (; pos < text.length(); pos++) {
            if (trimText.indexOf(text.charAt(pos)) < 0) {
                break;
            }
        }
        return text.substring(pos);
    }

    /**
     * 右側の空白を削ります。
     * @param text 文字列
     * @return 結果の文字列
     */
    public static final String rtrim(final String text) {
        return rtrim(text, null);
    }

    /**
     * 右側の指定した文字列を削ります。
     * @param text 文字列
     * @param trimText 削る文字列
     * @return 結果の文字列
     */
    public static final String rtrim(final String text, String trimText) {
        if (text == null) {
            return null;
        }
        if (trimText == null) {
            trimText = " ";
        }
        int pos = text.length() - 1;
        for (; pos >= 0; pos--) {
            if (trimText.indexOf(text.charAt(pos)) < 0) {
                break;
            }
        }
        return text.substring(0, pos + 1);
    }

    /**
     * サフィックスを削ります。
     * @param text 文字列
     * @param suffix サフィックス
     * @return 結果の文字列
     */
    public static final String trimSuffix(final String text, final String suffix) {
        if (text == null) {
            return null;
        }
        if (suffix == null) {
            return text;
        }
        if (text.endsWith(suffix)) {
            return text.substring(0, text.length() - suffix.length());
        }
        return text;
    }

    /**
     * プレフィックスを削ります。
     * @param text 文字列
     * @param prefix プレフィックス
     * @return 結果の文字列
     */
    public static final String trimPrefix(final String text, final String prefix) {
        if (text == null) {
            return null;
        }
        if (prefix == null) {
            return text;
        }
        if (text.startsWith(prefix)) {
            return text.substring(prefix.length());
        }
        return text;
    }

    /**
     * JavaBeansの仕様にしたがってデキャピタライズを行ないます。大文字が2つ以上続く場合は、小文字にならないので注意してください。
     * @param name 名前
     * @return 結果の文字列
     */
    public static String decapitalize(final String name) {
        if (isEmpty(name)) {
            return name;
        }
        char chars[] = name.toCharArray();
        if (chars.length >= 2 && Character.isUpperCase(chars[0])
                && Character.isUpperCase(chars[1])) {
            return name;
        }
        chars[0] = Character.toLowerCase(chars[0]);
        return new String(chars);
    }

    /**
     * JavaBeansの仕様にしたがってキャピタライズを行ないます。大文字が2つ以上続く場合は、大文字にならないので注意してください。
     * @param name 名前
     * @return 結果の文字列
     */
    public static String capitalize(final String name) {
        if (isEmpty(name)) {
            return name;
        }
        char chars[] = name.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }

    /**
     * ブランクかどうか返します。
     * @param str 文字列
     * @return ブランクかどうか
     */
    public static boolean isBlank(final String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * ブランクではないかどうか返します。
     * @param str 文字列
     * @return ブランクではないかどうか
     * @see #isBlank(String)
     */
    public static boolean isNotBlank(final String str) {
        return !isBlank(str);
    }

    /**
     * charを含んでいるかどうか返します。
     * @param str 文字列
     * @param ch char
     * @return charを含んでいるかどうか
     */
    public static boolean contains(final String str, final char ch) {
        if (isEmpty(str)) {
            return false;
        }
        return str.indexOf(ch) >= 0;
    }

    /**
     * 文字列を含んでいるかどうか返します。
     * @param s1 文字列
     * @param s2 比較する対象となる文字列
     * @return 文字列を含んでいるかどうか
     */
    public static boolean contains(final String s1, final String s2) {
        if (isEmpty(s1)) {
            return false;
        }
        return s1.indexOf(s2) >= 0;
    }

    /**
     * 文字列同士が等しいかどうか返します。どちらもnullの場合は、<code>true</code>を返します。
     * @param target1 文字列1
     * @param target2 文字列2
     * @return 文字列同士が等しいかどうか
     */
    public static boolean equals(final String target1, final String target2) {
        return (target1 == null) ? (target2 == null) : target1.equals(target2);
    }

	/**
	 * 文字列同士が等しくないかどうか判定する。どちらもnullの場合、falseを返す。
	 * @param value1 文字列１
	 * @param value2 文字列２
	 * @return 文字列が等しくない場合、true
	 */
	public static boolean notequals(String value1, String value2) {
		return !equals(value1, value2);
	}

    /**
     * ケースインセンシティブで文字列同士が等しいかどうか返します。どちらもnullの場合は、<code>true</code>を返します。
     * @param target1 文字列1
     * @param target2 文字列2
     * @return ケースインセンシティブで文字列同士が等しいか
     */
    public static boolean equalsIgnoreCase(final String target1, final String target2) {
        return (target1 == null) ? (target2 == null) : target1.equalsIgnoreCase(target2);
    }

    /**
     * ケースインセンシティブで特定の文字で終わっているのかどうかを返します。
     * @param target1 テキスト
     * @param target2 比較する文字列
     * @return ケースインセンシティブで特定の文字で終わっているのかどうか
     */
    public static boolean endsWithIgnoreCase(final String target1, final String target2) {
        if (target1 == null || target2 == null) {
            return false;
        }
        int length1 = target1.length();
        int length2 = target2.length();
        if (length1 < length2) {
            return false;
        }
        String s1 = target1.substring(length1 - length2);
        return s1.equalsIgnoreCase(target2);
    }

    /**
     * ケースインセンシティブで特定の文字ではじまっているのかどうかを返します。
     * @param target1 テキスト
     * @param target2 比較する文字列
     * @return ケースインセンシティブで特定の文字ではじまっているのかどうか
     */
    public static boolean startsWithIgnoreCase(final String target1, final String target2) {
        if (target1 == null || target2 == null) {
            return false;
        }
        int length1 = target1.length();
        int length2 = target2.length();
        if (length1 < length2) {
            return false;
        }
        String s1 = target1.substring(0, target2.length());
        return s1.equalsIgnoreCase(target2);
    }

    /**
     * 文字列の最後から指定した文字列で始まっている部分より手前を返します。
     * @param str 文字列
     * @param separator セパレータ
     * @return 結果の文字列
     */
    public static String substringFromLast(final String str, final String separator) {
        if (isEmpty(str) || isEmpty(separator)) {
            return str;
        }
        int pos = str.lastIndexOf(separator);
        if (pos == -1) {
            return str;
        }
        return str.substring(0, pos);
    }

    /**
     * 文字列の最後から指定した文字列で始まっている部分より後ろを返します。
     * @param str 文字列
     * @param separator セパレータ
     * @return 結果の文字列
     */
    public static String substringToLast(final String str, final String separator) {
        if (isEmpty(str) || isEmpty(separator)) {
            return str;
        }
        int pos = str.lastIndexOf(separator);
        if (pos == -1) {
            return str;
        }
        return str.substring(pos + 1, str.length());
    }

    /**
     * 16進数の文字列に変換します。
     * @param bytes バイトの配列
     * @return 16進数の文字列
     */
    public static String toHex(final byte[] bytes) {
        if (bytes == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer(bytes.length * 2);
        for (int i = 0; i < bytes.length; ++i) {
            appendHex(sb, bytes[i]);
        }
        return sb.toString();
    }

    /**
     * 16進数の文字列に変換します。
     * @param i int
     * @return 16進数の文字列
     */
    public static String toHex(final int i) {
        StringBuffer buf = new StringBuffer();
        appendHex(buf, i);
        return buf.toString();
    }

    /**
     * 文字列に、数値を16進数に変換した文字列を追加します。
     * @param buf 追加先の文字列
     * @param i 数値
     */
    public static void appendHex(final StringBuffer buf, final byte i) {
        buf.append(Character.forDigit((i & 0xf0) >> 4, 16));
        buf.append(Character.forDigit((i & 0x0f), 16));
    }

    /**
     * 文字列に、数値を16進数に変換した文字列を追加します。
     * @param buf 追加先の文字列
     * @param i 数値
     */
    public static void appendHex(final StringBuffer buf, final int i) {
        buf.append(Integer.toHexString((i >> 24) & 0xff));
        buf.append(Integer.toHexString((i >> 16) & 0xff));
        buf.append(Integer.toHexString((i >> 8) & 0xff));
        buf.append(Integer.toHexString(i & 0xff));
    }

    /**
     * スネークケースをキャメルケースに変換する。
     * @param s 文字列
     * @return 結果の文字列
     */
    public static String toCamel(String s) {
        if (s == null)  return null;

        s = s.toLowerCase();
        String[] array = SUtil.split(s, "_");
        if (array.length == 1) {
            return SUtil.capitalize(s);
        }
        StringBuffer buf = new StringBuffer(40);
        for (int i = 0; i < array.length; ++i) {
            buf.append(SUtil.capitalize(array[i]));
        }
        return buf.toString();
    }

    /**
     * キャメルケースをスネークケースに変換します。
     * @param s 文字列
     * @return 結果の文字列
     */
    public static String decamelize(final String s) {
        if (s == null) {
            return null;
        }
        if (s.length() == 1) {
            return s.toUpperCase();
        }
        StringBuffer buf = new StringBuffer(40);
        int pos = 0;
        for (int i = 1; i < s.length(); ++i) {
            if (Character.isUpperCase(s.charAt(i))) {
                if (buf.length() != 0) {
                    buf.append('_');
                }
                buf.append(s.substring(pos, i).toUpperCase());
                pos = i;
            }
        }
        if (buf.length() != 0) {
            buf.append('_');
        }
        buf.append(s.substring(pos, s.length()).toUpperCase());
        return buf.toString();
    }

    /**
     * 文字列が数値のみで構成されているかどうかを返します。
     * @param s 文字列
     * @return 数値のみで構成されている場合、<code>true</code>
     */
    public static boolean isNumber(final String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        int size = s.length();
        for (int i = 0; i < size; i++) {
            char chr = s.charAt(i);
            if (chr < '0' || '9' < chr) {
                return false;
            }
        }

        return true;
    }

	/**
	 * 文字列を大文字にして返却する。
	 * @param value 文字列
	 * @return 大文字の文字列。nullの場合、nullを返す。
	 */
	public static String upperCase(String value) {
		return StringUtils.upperCase(value);
	}

	/**
	 * 文字列を小文字にして返却する。
	 * @param value 文字列
	 * @return 小文字の文字列。nullの場合、nullを返す。
	 */
	public static String lowerCase(String value) {
		return StringUtils.lowerCase(value);
	}

	/**
	 * 文字列の長さを返却する。
	 * @param value 文字列
	 * @return 文字列長。null又はブランクの場合、0。
	 */
	public static int len(String value) {
		if (isEmpty(value)) return 0;
		return value.length();
	}

	/**
	 * 文字列を左から指定文字数、切り出す。
	 * @param value 文字列
	 * @param len 指定文字数
	 * @return 切り出した文字列。引数の文字列がnullの場合、null。
	 */
	public static String left(String value, int len) {
		return StringUtils.left(value, len);
	}

	/**
	 * 文字列を右から指定文字数、切り出す。
	 * @param value 文字列
	 * @param len 指定文字数
	 * @return 切り出した文字列。引数の文字列がnullの場合、null。
	 */
	public static String right(String value, int len) {
		return StringUtils.right(value, len);
	}

	/**
	 * 文字列を開始位置から指定文字数、切り出す。
	 * @param value 文字列
	 * @param pos 開始位置(0～)
	 * @param len 指定文字数
	 * @return 切り出した文字列。引数の文字列がnullの場合、null。
	 */
	public static String mid(String value, int pos, int len) {
		return StringUtils.mid(value, pos, len);
	}

	/**
	 * 文字列を開始位置から切り出す。
	 * @param value 文字列
	 * @param pos 開始位置(0～)
	 * @return 切り出した文字列。引数の文字列がnullの場合、null。
	 */
	public static String mid(String value, int pos) {
		int len = SUtil.isNotBlank(value) ? value.length() : 0;
		return StringUtils.mid(value, pos, len);
	}

	/**
	 * 対象文字列を指定サイズまでパディング文字で左埋めする。
	 * （"12", 5, '0') → "00012"
	 *
	 * @param value 対象文字列
	 * @param size 指定サイズ
	 * @param chr パティング文字
	 * @return 変換後の文字列
	 */
	public static String leftPad(String value, int size, char chr) {
		return StringUtils.leftPad(value, size, chr);
	}

	/**
	 * 対象文字列を指定サイズまでパディング文字で右埋めする。
	 * （"12", 5, '0') → "12000"
	 *
	 * @param value 対象文字列
	 * @param size 指定サイズ
	 * @param chr パティング文字
	 * @return 変換後の文字列
	 */
	public static String rightPad(String value, int size, char chr) {
		return StringUtils.rightPad(value, size, chr);
	}

	/**
	 * 文字列配列を区切り文字で結合する
	 * @param array 文字列配列
	 * @param separator 区切り文字
	 * @return 結合後の文字列
	 */
	public static String join(String[] array, String separator) {
		return StringUtils.join(array, separator);
	}

	/**
	 * 文字列リストを区切り文字で結合する
	 * @param list 文字列リスト
	 * @param separator 区切り文字
	 * @return 結合後の文字列
	 */
	public static String join(List<String> list, String separator) {
		return StringUtils.join(list, separator);
	}

	/**
	 * スペースを除去する
	 * @param str 対象文字列
	 * @return スペース除去後の文字列
	 */
	public static String removeSpace(String str) {
		String ret = StringUtils.remove(str, ' ');
		return StringUtils.remove(ret, '　');
	}

	/**
	 * 文字列中の指定文字列の数をカウントする。
	 * @param text 文字列
	 * @param str 指定文字列
	 * @return 指定文字列数
	 */
	public static int count(String text, String str) {
		return StringUtils.countMatches(text, str);
	}


	/**
	 * 指定文字列を指定数繰り返す
	 * @param str 指定文字列
	 * @param count 指定数
	 * @return 指定文字列を指定数繰り返した文字列
	 */
	public static String repeat(String str, int count) {
		return StringUtils.repeat(str, count);
	}


	/**
	 * 半角カタカナを全角カタカナに変換する
	 * @param str 全角カタカナ
	 * @return 半角カタカナ
	 */
	public static String convKatakanaWide(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0, j = 0; i < str.length(); i++) {
			Character c = new Character(str.charAt(i));
			// Unicode半角カタカナのコード範囲か？
			if (c.compareTo(new Character((char)0xff61)) >= 0 &&
					c.compareTo(new Character((char)0xff9f)) <= 0) {
				// 半角全角変換テーブルを検索する
				for (j = 0; j < kanaHanZenTbl.length; j++) {
					if (str.substring(i).startsWith(kanaHanZenTbl[j][0])) {
						sb.append(kanaHanZenTbl[j][1]);
						i += kanaHanZenTbl[j][0].length() - 1;
						break;
					}
				}
				// 検索できなければ、変換しない
				if (j >= kanaHanZenTbl.length) {
					sb.append(c);
				}
			} else {
				// Unicode半角カタカナ以外なら変換しない
				sb.append(c);
			}
		}
		return sb.toString();
	}


	/**
	 * 全角カタカナを半角カタカナに変換する
	 * @param str 半角カタカナ
	 * @return 全角カタカナ
	 */
	public static String convKatakanaNarrow(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0, j = 0; i < str.length(); i++) {
			Character c = new Character(str.charAt(i));
			// Unicode全角カタカナのコード範囲か?
			if (c.compareTo(new Character((char)0x30a1)) >= 0 &&
					c.compareTo(new Character((char)0x30fc)) <= 0) {
				// 半角全角変換テーブルを検索する
				for (j = 0; j < kanaHanZenTbl.length; j++) {
					if (str.substring(i).startsWith(kanaHanZenTbl[j][1])) {
						sb.append(kanaHanZenTbl[j][0]);
						break;
					}
				}
				// 検索できなければ、変換しない
				if (j >= kanaHanZenTbl.length) {
					sb.append(c);
				}
			} else {
				// 全角カタカナ以外なら変換しない
				sb.append(c);
			}
		}
		return sb.toString();
	}


	/**
	 * 半角数字を全角数字に変換する
	 * @param str 半角数字
	 * @return 全角数字
	 */
	public static String convNumWide(String str) {
		if (str == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if (c >= '0' && c <= '9') {
				sb.setCharAt(i, (char)(c - '0' + '０'));
			}
		}
		return sb.toString();
	}


	/**
	 * 全角数字を半角数字に変換する
	 * @param str 全角数字
	 * @return 半角数字
	 */
	public static String convNumNarrow(String str) {
		if (str == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if (c >= '０' && c <= '９') {
				sb.setCharAt(i, (char)(c - '０' + '0'));
			}
		}
		return sb.toString();
	}


	/**
	 * 文字列を改行コードで分割する
	 * @param str 文字列
	 * @return 分割した文字列リスト
	 */
	public static List<String> convLines(String str) {
		List<String> ret = new ArrayList<>();
		if (str == null) {
			return ret;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '\n') {
				ret.add(sb.toString());
				sb = new StringBuilder();
			} else {
				sb.append(str.charAt(i));
			}
		}

		if (sb.length() > 0) {
			ret.add(sb.toString());
		}

		return ret;
	}


}

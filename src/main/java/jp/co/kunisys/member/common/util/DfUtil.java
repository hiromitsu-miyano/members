package jp.co.kunisys.member.common.util;

import java.time.LocalDateTime;
import java.time.chrono.JapaneseChronology;
import java.time.format.DateTimeFormatter;

/**
 * 日付ユーティリティ (文字列変換)
 */
public class DfUtil {

	/**
	 * コンストラクタ
	 */
	private DfUtil() {}


	/**
	 * オブジェクトを西暦年に変換する。(例：2016)
	 * @param obj オブジェクト
	 * @return 西暦年[yyyy]
	 */
	public static String toY(Object obj) {
		return toFormat(obj, "uuuu");
	}
	/**
	 * オブジェクトを西暦年に変換する。(例：2016年)
	 * @param obj オブジェクト
	 * @return 西暦年[yyyy年]
	 */
	public static String toJy(Object obj) {
		return toFormat(obj, "uuuu年");
	}
	/**
	 * オブジェクトを西暦年月に変換する。(例：201602)
	 * @param obj オブジェクト
	 * @return 西暦年月[yyyyMM]
	 */
	public static String toYm(Object obj) {
		return toFormat(obj, "uuuuMM");
	}
	/**
	 * オブジェクトを西暦年月に変換する。(例：2016/02)
	 * @param obj オブジェクト
	 * @return 西暦年月[yyyy/MM]
	 */
	public static String toSym(Object obj) {
		return toFormat(obj, "uuuu/MM");
	}
	/**
	 * オブジェクトを西暦年月に変換する。(例：2016/2)
	 * @param obj オブジェクト
	 * @return 西暦年月[yyyy/M]
	 */
	public static String toSymZ(Object obj) {
		return toFormat(obj, "uuuu/M");
	}
	/**
	 * オブジェクトを西暦年月に変換する。(例：2016年02月)
	 * @param obj オブジェクト
	 * @return 西暦年月[yyyy年MM月]
	 */
	public static String toJym(Object obj) {
		return toFormat(obj, "uuuu年MM月");
	}
	/**
	 * オブジェクトを西暦年月に変換する。(例：2016年2月)
	 * @param obj オブジェクト
	 * @return 西暦年月[yyyy年MM月]
	 */
	public static String toJymZ(Object obj) {
		return toFormat(obj, "uuuu年M月");
	}
	/**
	 * オブジェクトを西暦年月日に変換する。(例：20160203)
	 * @param obj オブジェクト
	 * @return 西暦年月日[yyyyMMdd]
	 */
	public static String toYmd(Object obj) {
		return toFormat(obj, "uuuuMMdd");
	}
	/**
	 * オブジェクトを西暦年月日に変換する。(例：2016/02/03)
	 * @param obj オブジェクト
	 * @return 西暦年月日[yyyy/MM/dd]
	 */
	public static String toSymd(Object obj) {
		return toFormat(obj, "uuuu/MM/dd");
	}
	/**
	 * オブジェクトを西暦年月日に変換する。(例：2016/2/3)
	 * @param obj オブジェクト
	 * @return 西暦年月日[yyyy/M/d]
	 */
	public static String toSymdZ(Object obj) {
		return toFormat(obj, "uuuu/M/d");
	}
	/**
	 * オブジェクトを西暦年月日に変換する。(例：2016年02月03日)
	 * @param obj オブジェクト
	 * @return 西暦年月日[yyyy年MM月dd日]
	 */
	public static String toJymd(Object obj) {
		return toFormat(obj, "uuuu年MM月dd日");
	}
	/**
	 * オブジェクトを西暦年月日に変換する。(例：2016年2月3日)
	 * @param obj オブジェクト
	 * @return 西暦年月日[yyyy年M月d日]
	 */
	public static String toJymdZ(Object obj) {
		return toFormat(obj, "uuuu年M月d日");
	}
	/**
	 * オブジェクトを西暦年月日時分に変換する。(例：2016/02/03 04:05)
	 * @param obj オブジェクト
	 * @return 西暦年月日時分[yyyy/MM/dd HH:mm]
	 */
	public static String toSymdhm(Object obj) {
		return toFormat(obj, "uuuu/MM/dd HH:mm");
	}
	/**
	 * オブジェクトを西暦年月日時分に変換する。(例：2016/2/3 4:05)
	 * @param obj オブジェクト
	 * @return 西暦年月日時分[yyyy/M/d H:mm]
	 */
	public static String toSymdhmZ(Object obj) {
		return toFormat(obj, "uuuu/M/d H:mm");
	}
	/**
	 * オブジェクトを西暦年月日時分に変換する。(例：2016年02月03日 04時05分)
	 * @param obj オブジェクト
	 * @return 西暦年月日時分[yyyy年MM月dd日 HH時mm分]
	 */
	public static String toJymdhm(Object obj) {
		return toFormat(obj, "uuuu年MM月dd日 HH時mm分");
	}
	/**
	 * オブジェクトを西暦年月日時分に変換する。(例：2016年2月3日 4時05分)
	 * @param obj オブジェクト
	 * @return 西暦年月日時分[yyyy年M月d日 H時mm分]
	 */
	public static String toJymdhmZ(Object obj) {
		return toFormat(obj, "uuuu年M月d日 H時mm分");
	}
	/**
	 * オブジェクトを西暦年月日時分に変換する。(例：2016年02月03日 午前 04時05分)
	 * @param obj オブジェクト
	 * @return 西暦年月日時分[yyyy年MM月dd日 a hh時mm分]
	 */
	public static String toJymdhmAp(Object obj) {
		return toFormat(obj, "uuuu年MM月dd日 a hh時mm分");
	}
	/**
	 * オブジェクトを西暦年月日時分に変換する。(例：2016年2月3日 午前 4時05分)
	 * @param obj オブジェクト
	 * @return 西暦年月日時分[yyyy年M月d日 a h時mm分]
	 */
	public static String toJymdhmApZ(Object obj) {
		return toFormat(obj, "uuuu年M月d日 a h時mm分");
	}


	/**
	 * オブジェクトを和暦元号に変換する。(例：H)
	 * @param obj オブジェクト
	 * @return 和暦元号[GGGGG]
	 */
	public static String towSgengo(Object obj) {
		return toFormat(obj, "GGGGG");
	}
	/**
	 * オブジェクトを和暦元号に変換する。(例：平成)
	 * @param obj オブジェクト
	 * @return 和暦元号[G]
	 */
	public static String towJgengo(Object obj) {
		return toFormat(obj, "G");
	}
	/**
	 * オブジェクトを和暦年に変換する。(例：08)
	 * @param obj オブジェクト
	 * @return 和暦年[yy]
	 */
	public static String towYear(Object obj) {
		return toFormat(obj, "yy");
	}
	/**
	 * オブジェクトを和暦年に変換する。(例：8)
	 * @param obj オブジェクト
	 * @return 和暦年[y]
	 */
	public static String towYearZ(Object obj) {
		return toFormat(obj, "y");
	}
	/**
	 * オブジェクトを和暦年に変換する。(例：H08)
	 * @param obj オブジェクト
	 * @return 和暦年[GGGGGyy]
	 */
	public static String towSy(Object obj) {
		return toFormat(obj, "GGGGGyy");
	}
	/**
	 * オブジェクトを和暦年に変換する。(例：H8)
	 * @param obj オブジェクト
	 * @return 和暦年[GGGGGy]
	 */
	public static String towSyZ(Object obj) {
		return toFormat(obj, "GGGGGy");
	}
	/**
	 * オブジェクトを和暦年に変換する。(例：平成08年)
	 * @param obj オブジェクト
	 * @return 和暦年[Gyy年]
	 */
	public static String towJy(Object obj) {
		return toFormat(obj, "Gyy年");
	}
	/**
	 * オブジェクトを和暦年に変換する。(例：平成8年)
	 * @param obj オブジェクト
	 * @return 和暦年[Gy年]
	 */
	public static String towJyZ(Object obj) {
		return toFormat(obj, "Gy年");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：H08/02)
	 * @param obj オブジェクト
	 * @return 和暦年月[GGGGGyy/MM]
	 */
	public static String towSym(Object obj) {
		return toFormat(obj, "GGGGGyy/MM");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：H8/2)
	 * @param obj オブジェクト
	 * @return 和暦年月[GGGGGy/M]
	 */
	public static String towSymZ(Object obj) {
		return toFormat(obj, "GGGGGy/M");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：平成08年02月)
	 * @param obj オブジェクト
	 * @return 和暦年月[Gyy年MM月]
	 */
	public static String towJym(Object obj) {
		return toFormat(obj, "Gyy年MM月");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：平成8年2月)
	 * @param obj オブジェクト
	 * @return 和暦年月[Gy年M月]
	 */
	public static String towJymZ(Object obj) {
		return toFormat(obj, "Gy年M月");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：H08/02/03)
	 * @param obj オブジェクト
	 * @return 和暦年月[GGGGGyy/MM/dd]
	 */
	public static String towSymd(Object obj) {
		return toFormat(obj, "GGGGGyy/MM/dd");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：H8/2/3)
	 * @param obj オブジェクト
	 * @return 和暦年月[GGGGGy/M/d]
	 */
	public static String towSymdZ(Object obj) {
		return toFormat(obj, "GGGGGy/M/d");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：平成08年02月03日)
	 * @param obj オブジェクト
	 * @return 和暦年月[Gyy年MM月dd日]
	 */
	public static String towJymd(Object obj) {
		return toFormat(obj, "Gyy年MM月dd日");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：平成8年2月3日)
	 * @param obj オブジェクト
	 * @return 和暦年月[Gy年M月d日]
	 */
	public static String towJymdZ(Object obj) {
		return toFormat(obj, "Gy年M月d日");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：H08/02/03 04:05)
	 * @param obj オブジェクト
	 * @return 和暦年月[GGGGGyy/MM/dd HH:mm]
	 */
	public static String towSymdhm(Object obj) {
		return toFormat(obj, "GGGGGyy/MM/dd HH:mm");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：H8/2/3 4:05)
	 * @param obj オブジェクト
	 * @return 和暦年月[GGGGGy/M/d H:mm]
	 */
	public static String towSymdhmZ(Object obj) {
		return toFormat(obj, "GGGGGy/M/d H:mm");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：平成08年02月03日 04時05分)
	 * @param obj オブジェクト
	 * @return 和暦年月[Gyy年MM月dd日 HH時mm分]
	 */
	public static String towJymdhm(Object obj) {
		return toFormat(obj, "Gyy年MM月dd日 HH時mm分");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：平成8年2月3日 4時05分)
	 * @param obj オブジェクト
	 * @return 和暦年月[Gy年M月d日 H時mm分]
	 */
	public static String towJymdhmZ(Object obj) {
		return toFormat(obj, "Gy年M月d日 H時mm分");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：平成08年02月03日 午前 04時05分)
	 * @param obj オブジェクト
	 * @return 和暦年月[Gyy年MM月dd日 a hh時mm分]
	 */
	public static String towJymdhmAp(Object obj) {
		return toFormat(obj, "Gyy年MM月dd日 a hh時mm分");
	}
	/**
	 * オブジェクトを和暦年月に変換する。(例：平成8年2月3日 午前 4時05分)
	 * @param obj オブジェクト
	 * @return 和暦年月[Gy年M月d日 a h時mm分]
	 */
	public static String towJymdhmApZ(Object obj) {
		return toFormat(obj, "Gy年M月d日 a h時mm分");
	}

	/**
	 * オブジェクトを日付書式の文字列に変換する。
	 * @param obj オブジェクト
	 * @param format 日付書式
	 * @return 日付書式を適用した文字列
	 */
	private static String toFormat(Object obj, String format) {
		LocalDateTime ldt = DtUtil.toLocalDateTime(obj);
		if (ldt == null) {
			return null;
		}
		return DateTimeFormatter.ofPattern(format).withChronology(JapaneseChronology.INSTANCE).format(ldt);
	}
}

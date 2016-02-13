package jp.co.kunisys.member.common.util;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.JapaneseChronology;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 日付ユーティリティクラス (LocalDateTime変換)
 */
public class DtUtil {

	/**
	 * コンストラクタ
	 */
	private DtUtil() {}


	/**
	 * オブジェクト → java.time.LocalDateTime の変換処理
	 * @param obj オブジェクト
	 * @return LocalDateTime
	 */
	public static LocalDateTime toLocalDateTime(Object obj) {
		if (obj == null) {
			return null;
		} else if (obj instanceof LocalDateTime) {
			return (LocalDateTime) obj;
		} else if (obj instanceof Long) {
			Date dt = new Date((Long) obj);
			return LocalDateTime.ofInstant(dt.toInstant(), ZoneId.systemDefault());
		} else if (obj instanceof java.sql.Date) {
			Date dt = new Date(((java.sql.Date) obj).getTime());
			return LocalDateTime.ofInstant(dt.toInstant(), ZoneId.systemDefault());
		} else if (obj instanceof Date) {
			return LocalDateTime.ofInstant(((Date) obj).toInstant(), ZoneId.systemDefault());
		} else if (obj instanceof String) {
			return parse((String) obj);
		} else if (obj instanceof Instant) {
			return LocalDateTime.ofInstant((Instant) obj, ZoneId.systemDefault());
		} else {
			return null;
		}
	}

	/**
	 * 文字列 → {@link java.time.LocalDateTime}の変換処理
	 * @param str 文字列
	 * @return {@link java.time.LocalDateTime}
	 */
	public static LocalDateTime parse(String str) {
		if (SUtil.isBlank(str)) {
			return null;
		}
		LocalDateTime ldt = null;
		ldt = parseDate(str, "uuuuMMdd");
		if (ldt != null) return ldt;
		ldt = parseDate(str, "uuuu/M/d");
		if (ldt != null) return ldt;
		ldt = parseDate(str, "uuuu年M月d日");
		if (ldt != null) return ldt;
		ldt = parseDate(str, "GGGGGyyMMdd");
		if (ldt != null) return ldt;
		ldt = parseDate(str, "GGGGGy/M/d");
		if (ldt != null) return ldt;
		ldt = parseDate(str, "Gy年M月d日");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "uuuuMMddHH");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "uuuu/M/d H");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "uuuu年M月d日 H時");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "GGGGGyyMMddHH");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "GGGGGy/M/d H");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "Gy年M月d日 H時");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "uuuuMMddHHmm");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "uuuu/M/d H:m");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "uuuu年M月d日 H時m分");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "GGGGGyyMMddHHmm");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "GGGGGy/M/d H:m");
		if (ldt != null) return ldt;
		ldt = parseDateTime(str, "Gy年M月d日 H時m分");

		return ldt;
	}


	/**
	 * 文字列(日付) → {@link java.time.LocalDateTime}の変換処理
	 * @param str 文字列
	 * @param format 書式
	 * @return {@link java.time.LocalDateTime}
	 */
	private static LocalDateTime parseDate(String str, String format) {
		try {
			return DateTimeFormatter.ofPattern(format).withChronology(JapaneseChronology.INSTANCE)
					.parse(str, LocalDate::from).atStartOfDay();
		} catch (DateTimeException e) {
			return null;
		}
	}

	/**
	 * 文字列(日時) → {@link java.time.LocalDateTime}の変換処理
	 * @param str 文字列
	 * @param format 書式
	 * @return {@link java.time.LocalDateTime}
	 */
	private static LocalDateTime parseDateTime(String str, String format) {
		try {
			return DateTimeFormatter.ofPattern(format).withChronology(JapaneseChronology.INSTANCE)
					.parse(str, LocalDateTime::from);
		} catch (DateTimeException e) {
			return null;
		}
	}

}

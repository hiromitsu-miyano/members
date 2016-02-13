package jp.co.kunisys.member.common.util;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * 日付ユーティリティ
 */
public class DUtil {

	/** 年度初月 */
	private static final int NENDO_FIRST_MONTH = 4;

	/**
	 * 現在日時(Timestamp)を返却する
	 * @return 現在日時
	 */
	public static Timestamp getTimestamp() {
		return new Timestamp(new Date().getTime());
	}

	/**
	 * オブジェクト → {@link java.util.Date}の変換処理
	 * @param obj オブジェクト
	 * @return {@link java.util.Date}
	 */
	public static Date toDate(Object obj) {
		LocalDateTime ldt = DtUtil.toLocalDateTime(obj);
		if (ldt == null) {
			return null;
		}
		return Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
	}

	/**
	 * {@link java.util.Date}の生成処理
	 * @param year 年
	 * @param month 月[1-12]
	 * @param day 日
	 * @return {@link java.util.Date}
	 */
	public static Date toDate(int year, int month, int day) {
		LocalDateTime ld = LocalDate.of(year, month, day).atStartOfDay();
		return toDate(ld);
	}

	/**
	 * {@link java.util.Date}の生成処理
	 * @param year 年
	 * @param month 月[1-12]
	 * @param day 日
	 * @param hour 時
	 * @param minute 分
	 * @param second 秒
	 * @return {@link java.util.Date}
	 */
	public static Date toDate(int year, int month, int day, int hour, int minute, int second) {
		LocalDateTime ld = LocalDateTime.of(year, month, day, hour, minute, second);
		return toDate(ld);
	}

	/**
	 * 年を加算する。
	 * @param date 元日時
	 * @param years 加算年数
	 * @return 加算後の日時
	 */
	public static Date addYears(Date date, int years) {
		LocalDateTime ldt = DtUtil.toLocalDateTime(date);
		if (ldt == null) {
			return null;
		}
		return toDate(ldt.plusYears(years));
	}

	/**
	 * 月を加算する。
	 * @param date 元日時
	 * @param months 加算月数
	 * @return 加算後の日時
	 */
	public static Date addMonths(Date date, int months) {
		LocalDateTime ldt = DtUtil.toLocalDateTime(date);
		if (ldt == null) {
			return null;
		}
		return toDate(ldt.plusMonths(months));
	}

	/**
	 * 日を加算する。
	 * @param date 元日時
	 * @param days 加算日数
	 * @return 加算後の日時
	 */
	public static Date addDays(Date date, int days) {
		LocalDateTime ldt = DtUtil.toLocalDateTime(date);
		if (ldt == null) {
			return null;
		}
		return toDate(ldt.plusDays(days));
	}

	/**
	 * 時を加算する。
	 * @param date 元日時
	 * @param hours 加算時間数
	 * @return 加算後の日時
	 */
	public static Date addHours(Date date, int hours) {
		LocalDateTime ldt = DtUtil.toLocalDateTime(date);
		if (ldt == null) {
			return null;
		}
		return toDate(ldt.plusHours(hours));
	}

	/**
	 * 分を加算する。
	 * @param date 元日時
	 * @param minutes 加算分数
	 * @return 加算後の日時
	 */
	public static Date addMinutes(Date date, int minutes) {
		LocalDateTime ldt = DtUtil.toLocalDateTime(date);
		if (ldt == null) {
			return null;
		}
		return toDate(ldt.plusMinutes(minutes));
	}

	/**
	 * 秒を加算する。
	 * @param date 元日時
	 * @param seconds 加算秒数
	 * @return 加算後の日時
	 */
	public static Date addSeconds(Date date, int seconds) {
		LocalDateTime ldt = DtUtil.toLocalDateTime(date);
		if (ldt == null) {
			return null;
		}
		return toDate(ldt.plusSeconds(seconds));
	}

	/**
	 * 年度を返す
	 * @param date 判定対象の日付
	 * @return 年度
	 */
	public static int getNenod(Date date) {
		return getNendo(date, NENDO_FIRST_MONTH);
	}

	/**
	 * 年度を返す
	 * @param date 判定対象の日付
	 * @param firstMonthOfNendo 年度開始月
	 * @return 年度
	 */
	public static int getNendo(Date date, int firstMonthOfNendo) {
		LocalDateTime ldt = DtUtil.toLocalDateTime(date);
		int nendo = ldt.getYear();
		if (ldt.getMonthValue() < firstMonthOfNendo) {
			nendo--;
		}
		return nendo;
	}

}

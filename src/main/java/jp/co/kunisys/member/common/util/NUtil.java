package jp.co.kunisys.member.common.util;

import java.math.BigDecimal;

/**
 * 数値ユーティリティ
 */
public class NUtil {

	/**
	 * コンストラクタ
	 */
	private NUtil() {}

	/**
	 * byte に変換する。
	 * @param obj 変換対象
	 * @return 変換されたbyte
	 */
	public static byte toByte(Object obj) {
		if (obj == null) {
			return 0;
		} else if (obj instanceof Number) {
			return ((Number) obj).byteValue();
		} else if (obj instanceof String) {
			return toByte((String) obj);
		} else if (obj instanceof Boolean) {
			return ((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0;
		} else {
			return toByte(obj.toString());
		}
	}
	/**
	 * byte に変換する。
	 * @param s 変換対象
	 * @return 変換されたbyte
	 */
	private static byte toByte(String s) {
		if (SUtil.isEmpty(s)) {
			return 0;
		}
		return Byte.parseByte(s);
	}

	/**
	 * short に変換する。
	 * @param obj 変換対象
	 * @return 変換されたshort
	 */
	public static short toShort(Object obj) {
		if (obj == null) {
			return 0;
		} else if (obj instanceof Number) {
			return ((Number) obj).shortValue();
		} else if (obj instanceof String) {
			return toShort((String) obj);
		} else if (obj instanceof Boolean) {
			return ((Boolean) obj).booleanValue() ? (short) 1 : (short) 0;
		} else {
			return toShort(obj.toString());
		}
	}
	/**
	 * short に変換する。
	 * @param str 変換対象
	 * @return 変換されたshort
	 */
	private static short toShort(String str) {
		if (SUtil.isEmpty(str)) {
			return 0;
		}
		return Short.parseShort(str);
	}

	/**
	 * int に変換する。
	 * @param obj 変換対象
	 * @return 変換されたint
	 */
	public static int toInt(Object obj) {
		if (obj == null) {
			return 0;
		} else if (obj instanceof Number) {
			return ((Number) obj).intValue();
		} else if (obj instanceof String) {
			return toInt((String) obj);
		} else if (obj instanceof Boolean) {
			return ((Boolean) obj).booleanValue() ? (int) 1 : (int) 0;
		} else {
			return toInt(obj.toString());
		}
	}
	/**
	 * int に変換する。
	 * @param str 変換対象
	 * @return 変換されたint
	 */
	private static int toInt(String str) {
		if (SUtil.isEmpty(str)) {
			return 0;
		}
		return Integer.parseInt(str);
	}

	/**
	 * long に変換する。
	 * @param obj 変換対象
	 * @return 変換されたlong
	 */
	public static long toLong(Object obj) {
		if (obj == null) {
			return 0;
		} else if (obj instanceof Number) {
			return ((Number) obj).longValue();
		} else if (obj instanceof String) {
			return toLong((String) obj);
		} else if (obj instanceof Boolean) {
			return ((Boolean) obj).booleanValue() ? (long) 1 : (long) 0;
		} else {
			return toLong(obj.toString());
		}
	}
	/**
	 * long に変換する。
	 * @param str 変換対象
	 * @return 変換されたlong
	 */
	private static long toLong(String str) {
		if (SUtil.isEmpty(str)) {
			return 0;
		}
		return Long.parseLong(str);
	}

	/**
	 * float に変換する。
	 * @param obj 変換対象
	 * @return 変換されたfloat
	 */
	public static float toFloat(Object obj) {
		if (obj == null) {
			return 0;
		} else if (obj instanceof Number) {
			return ((Number) obj).floatValue();
		} else if (obj instanceof String) {
			return toFloat((String) obj);
		} else if (obj instanceof Boolean) {
			return ((Boolean) obj).booleanValue() ? (float) 1 : (float) 0;
		} else {
			return toFloat(obj.toString());
		}
	}
	/**
	 * float に変換する。
	 * @param str 変換対象
	 * @return 変換されたfloat
	 */
	private static float toFloat(String str) {
		if (SUtil.isEmpty(str)) {
			return 0;
		}
		return Float.parseFloat(str);
	}

	/**
	 * double に変換する。
	 * @param obj 変換対象
	 * @return 変換されたdouble
	 */
	public static double toDouble(Object obj) {
		if (obj == null) {
			return 0;
		} else if (obj instanceof Number) {
			return ((Number) obj).doubleValue();
		} else if (obj instanceof String) {
			return toDouble((String) obj);
		} else if (obj instanceof Boolean) {
			return ((Boolean) obj).booleanValue() ? (double) 1 : (double) 0;
		} else {
			return toDouble(obj.toString());
		}
	}
	/**
	 * double に変換する。
	 * @param str 変換対象
	 * @return 変換されたdouble
	 */
	private static double toDouble(String str) {
		if (SUtil.isEmpty(str)) {
			return 0;
		}
		return Float.parseFloat(str);
	}

	/**
	 * BigDecimal に変換する
	 * @param obj 変換対象
	 * @return 変換されたBigDecimal
	 */
	public static BigDecimal toDecimal(Object obj) {
		if (obj == null) {
			return new BigDecimal(0);
		} else if (obj instanceof BigDecimal) {
			return (BigDecimal) obj;
		} else if (obj instanceof String) {
			return toDecimal((String) obj);
		} else if (obj instanceof Boolean) {
			return ((Boolean) obj).booleanValue() ? new BigDecimal(1) : new BigDecimal(0);
		} else {
			return toDecimal(obj.toString());
		}
	}
	/**
	 * BigDecimal に変換する
	 * @param str 変換対象
	 * @return 変換されたBigDecimal
	 */
	private static BigDecimal toDecimal(String str) {
		if (SUtil.isEmpty(str)) {
			return new BigDecimal(0);
		}
		return new BigDecimal(new BigDecimal(str).toPlainString());
	}
}

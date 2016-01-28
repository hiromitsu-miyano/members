package jp.co.kunisys.member.common;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 日付ユーティリティ
 */
public class DUtil {

	/**
	 * 現在日時(Timestamp)を返却する
	 * @return 現在日時
	 */
	public static Timestamp getTimestamp() {
		return new Timestamp(new Date().getTime());
	}
}

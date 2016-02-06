package jp.co.kunisys.member.common.util;

import java.util.List;

import org.springframework.validation.BindingResult;

/**
 * 入力チェックユーティリティ
 */
public class ChkUtil {

	/**
	 * コンストラクタ
	 */
	private ChkUtil() {}


	/**
	 * 無条件にエラーを設定する
	 * @param br BindingResult
	 * @param field フィールド名
	 * @param msg エラーメッセージ
	 */
	public static void isError(BindingResult br, String field, String msg) {
		br.rejectValue(field, null, msg);
	}

	/* ******************** 必須チェック ******************** */

	/**
	 * 必須チェック (String)
	 * @param br BindingResult
	 * @param field フィールド名
	 * @param name 項目名
	 * @param val 値
	 * @return チェックＮＧの場合、true
	 */
	public static boolean isRequire(BindingResult br, String field, String name, String val) {
		if (SUtil.isBlank(val)) {
			String msg = String.format("%s は必須入力項目です。", name);
			br.rejectValue(field, null, msg);
			return true;
		}
		return false;
	}
	/**
	 * 必須チェック (List&ltString&gt)
	 * @param br BindingResult
	 * @param field フィールド名
	 * @param name 項目名
	 * @param valList 値リスト
	 * @return チェックＮＧの場合、true
	 */
	public static boolean isRequire(BindingResult br, String field, String name, List<String> valList) {
		if (valList == null || valList.isEmpty()) {
			String msg = String.format("%s は必須入力項目です。", name);
			br.rejectValue(field, null, msg);
			return true;
		}
		return false;
	}



	/* ******************** サイズチェック ******************** */


	/**
	 * 文字列長最大値チェック
	 * @param br BindingResult
	 * @param field フィールド名
	 * @param name 項目名
	 * @param val 値
	 * @param max 最大文字列長
	 * @return チェックＮＧの場合、true
	 */
	public static boolean isMaxChar(BindingResult br, String field, String name, String val, int max) {
		boolean ret = isMaxChar(val, max);
		if (ret) {
			String msg = String.format("%s には %s 文字以下の値を入力して下さい。", name, max);
			br.rejectValue(field, null, msg);
			return true;
		}
		return false;
	}
	/**
	 * 文字列長最大値チェック (判定のみ)
	 * @param val 値
	 * @param max 最大文字列長
	 * @return チェックＮＧの場合、true
	 */
	public static boolean isMaxChar(String val, int max) {
		if (SUtil.isEmpty(val)) return false;
		return (val.length() > max);
	}
}

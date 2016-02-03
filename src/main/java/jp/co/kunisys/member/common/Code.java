package jp.co.kunisys.member.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import jp.co.kunisys.member.bean.CodeBean;
import jp.co.kunisys.member.common.util.SUtil;
import jp.co.kunisys.member.query.tables.records.KubunRecord;

/**
 * コードクラス
 */
public class Code {

	/** プロジェクト形態コード */
	public static class PROJECT_TYPE {
		/** 区分種類 */
		public static String TYPE = "011";
	}
	/** システム構成コード */
	public static class SYSTEM_ARCHITECTURE {
		/** 区分種類 */
		public static String TYPE = "012";
	}

	public static class WORKPLACE_KUBUN {
		/** 区分種類 */
		public static String TYPE = "013";
	}

	/** コードリスト */
	private static List<KubunRecord> codeList;

	/**
	 * コンストラクタ
	 */
	private Code() {
	}

	/**
	 * コードリストを設定する
	 * @param list コードリスト
	 */
	public static void setCodeList(List<KubunRecord> list) {
		codeList = list;
	}


	/**
	 * コードリストを返却する
	 * @param type 区分種類
	 * @return コードリスト
	 */
	public static List<CodeBean> getCodeList(String type) {
		if (codeList.isEmpty()) {
			return new ArrayList<>();
		}

		return codeList.stream()
				.filter(entity -> SUtil.equals(entity.getTypeCode(), type))
				.map(entity -> {
					CodeBean bean = new CodeBean();
					bean.setCode(entity.getCode());
					bean.setName(entity.getName());
					return bean;
				})
				.collect(Collectors.toList());
	}

	/**
	 * コードを返却する
	 * @param type 区分種類
	 * @param code コード
	 * @return コード
	 */
	public static CodeBean getCode(String type, String code) {
		if (codeList.isEmpty() || SUtil.isBlank(type) || SUtil.isBlank(code)) {
			return null;
		}

		Optional<CodeBean> opt = codeList.stream()
				.filter(entity -> SUtil.equals(entity.getTypeCode(), type) && SUtil.equals(entity.getCode(), code))
				.map(entity -> {
					CodeBean bean = new CodeBean();
					bean.setCode(entity.getCode());
					bean.setName(entity.getName());
					return bean;
				})
				.findFirst();
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	/**
	 * コード名を返却する
	 * @param type 区分種類
	 * @param code コード
	 * @return コード
	 */
	public static String getName(String type, String code) {
		CodeBean bean = getCode(type, code);
		if (bean == null) {
			return "";
		}
		return bean.getName();
	}
}

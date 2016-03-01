package jp.co.kunisys.member.form;

import java.util.List;

import jp.co.kunisys.member.common.BeanMap;
import lombok.Data;

/**
 * スキルメンテナンス フォーム
 */
@Data
public class MTD010Form {

	/** スキルツリー表示表リスト */
	private List<BeanMap> skillList;

	/** スキル番号 */
	private Integer skillNo;
	/** スキル名称 */
	private String name;
	/** 略称 */
	private String shortName;
	/** スキル種類番号 */
	private Integer skillTypeNo;
	/** スキル階層 */
	private String level;
	/** カテゴリ識別 */
	private String isCategory;
	/** コメント */
	private String comment;
	/** 並び順 */
	private Integer sortkey;
	/** バージョン */
	private Integer version;
	/** 親スキル番号 */
	private Integer parentSkillNo;
	/** 親バージョン */
	private Integer parentSkillVersion;
}

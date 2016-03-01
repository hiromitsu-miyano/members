package jp.co.kunisys.member.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.kunisys.member.common.BeanMap;
import jp.co.kunisys.member.common.Constants;
import jp.co.kunisys.member.form.MTD010Form;
import jp.co.kunisys.member.query.Tables;

/**
 * スキルメンテナンス サービス
 */
@Transactional
@Service
public class MTD010Service {

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * スキルツリー情報生成
	 * @param form フォーム
	 */
	public void createSkillTreeInfo(MTD010Form form) {
		Pattern pattern = Pattern.compile("/");

		List<BeanMap> recList;
		if (form.getSkillNo() == null) {
			// 初期表示：フェーズ
			recList = findBySkillType(Constants.SkillType.PHASE);
		} else {
			// 選択されたツリーを表示
			recList = findBySkillType(form.getSkillTypeNo());
		}

		List<BeanMap> skillList = new ArrayList<>();
		for (BeanMap s : recList) {
			/* level のスラッシュの数を取得 */
			Matcher matcher = pattern.matcher(s.get("level").toString());
			int slashCount = 0;
			while (matcher.find()) {
				slashCount++;
			}

			/* スラッシュの数を元にインデント数設定 */
			if (slashCount < 2) {
				s.put("indent", 0);
			} else {
				s.put("indent", slashCount - 2);
			}
			skillList.add(s);
		}

		if (!skillList.isEmpty()) {
			// 親のスキル番号、バージョンをFormに設定(排他チェックのため)
			Integer parentSkillNo = Integer.valueOf(skillList.get(0).get("skillNo").toString());
			form.setParentSkillNo(parentSkillNo);
			Integer parentSkillVersion = Integer.valueOf(skillList.get(0).get("version").toString());
			form.setParentSkillVersion(parentSkillVersion);
			// sortkey = null のスキルをリストから削除
			skillList.remove(0);
		}

		form.setSkillList(skillList);
	}


	/**
	 * 指定されたスキル種類でスキルを検索する
	 * @param skillTypeNo スキル種類
	 * @return スキルのリスト
	 */
	private List<BeanMap> findBySkillType(int skillTypeNo) {
		return this.create.selectFrom(Tables.SKILL)
							.where(Tables.SKILL.SKILL_TYPE_NO.eq(Constants.SkillType.PHASE))
							.and(Tables.SKILL.DELETED.isNull())
							.orderBy(Tables.SKILL.SORTKEY)
							.fetchInto(BeanMap.class);
	}

}

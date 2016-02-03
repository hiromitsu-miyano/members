package jp.co.kunisys.member.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.kunisys.member.common.BeanMap;
import jp.co.kunisys.member.common.Code;
import jp.co.kunisys.member.common.util.BeanUtil;
import jp.co.kunisys.member.common.util.DUtil;
import jp.co.kunisys.member.form.MTE010Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.WorkplaceRecord;
import jp.co.kunisys.member.repository.WorkplaceRepository;
import jp.co.kunisys.member.security.LoginUser;

/**
 * 勤務先メンテナンス画面サービス
 */
@Service
public class MTE010Service {

	/** 勤務先リポジトリ */
	@Autowired
	private WorkplaceRepository workplaceRepository;

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * 勤務先リストの検索処理
	 * @param form フォーム
	 */
	public void sarchWorkplaceList(MTE010Form form) {

		List<WorkplaceRecord> recList = this.workplaceRepository.findAllOrderById();
		List<BeanMap> mapList = recList.stream()
				.map(r -> {
					BeanMap map = new BeanMap();
					BeanUtil.copyProperties(r, map);
					map.put("workplaceTypeName", Code.getName(Code.WORKPLACE_KUBUN.TYPE, r.getWorkplaceType()));
					return map;
				})
				.collect(Collectors.toList());
		form.setWorkplaceList(mapList);
	}


	/**
	 * 勤務先の選択処理
	 * @param form フォーム
	 */
	public void selectWorkplace(MTE010Form form) {
		WorkplaceRecord rec = this.workplaceRepository.findById(form.getInWorkplaceId());
		if (rec == null) {
			//勤務先ID
			form.setInWorkplaceId(null);
			//勤務先名
			form.setInName(null);
			//勤務先区分
			form.setInWorkplaceType(null);
			//備考
			form.setInRemark(null);
			//削除
			form.setInDelete(false);
			//バージョン
			form.setInVersion(1);
		} else {
			//勤務先ID
			form.setInWorkplaceId(rec.getWorkplaceId());
			//勤務先名
			form.setInName(rec.getName());
			//勤務先区分
			form.setInWorkplaceType(rec.getWorkplaceType());
			//備考
			form.setInRemark(rec.getRemark());
			//削除
			form.setInDelete(rec.getDeleted() != null);
			//バージョン
			form.setInVersion(rec.getVersion());
		}
	}


	/**
	 * 勤務先の登録処理
	 * @param form フォーム
	 */
	public void insertWorkplace(MTE010Form form) {
		Timestamp now = DUtil.getTimestamp();

		WorkplaceRecord rec = this.create.newRecord(Tables.WORKPLACE);
		//勤務先ID
		Integer workplaceId = this.workplaceRepository.createWorkplaceId();
		rec.setWorkplaceId(workplaceId);
		//勤務先名
		rec.setName(form.getInName());
		//勤務先区分
		rec.setWorkplaceType(form.getInWorkplaceType());
		//備考
		rec.setRemark(form.getInRemark());
		//登録日時
		rec.setCreated(now);
		//登録ユーザ
		rec.setCreatedUser(LoginUser.getUser().getUserId());
		//更新日時
		rec.setUpdated(now);
		//更新ユーザ
		rec.setUpdatedUser(LoginUser.getUser().getUserId());
		//バージョン
		rec.setVersion(1);

		//登録処理
		rec.store();
	}


	/**
	 * 勤務先の更新処理
	 * @param form フォーム
	 */
	public void updateWorkplace(MTE010Form form) {
		Timestamp now = DUtil.getTimestamp();

		WorkplaceRecord rec = this.workplaceRepository.findById(form.getInWorkplaceId());
		//勤務先名
		rec.setName(form.getInName());
		//勤務先区分
		rec.setWorkplaceType(form.getInWorkplaceType());
		//備考
		rec.setRemark(form.getInRemark());
		//更新日時
		rec.setUpdated(now);
		//更新ユーザ
		rec.setUpdatedUser(LoginUser.getUser().getUserId());
		//削除日時 (削除チェックONの場合)
		Timestamp deleted = form.isInDelete() ? now : null;
		rec.setDeleted(deleted);
		//削除ユーザ (削除チェックONの場合)
		Integer deletedUser = form.isInDelete() ? rec.getUpdatedUser() : null;
		rec.setDeletedUser(deletedUser);
		//バージョン
		rec.setVersion(form.getInVersion());

		//更新処理
		rec.store();
	}

}

package jp.co.kunisys.member.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.kunisys.member.common.BeanMap;
import jp.co.kunisys.member.common.BeanUtil;
import jp.co.kunisys.member.common.Code;
import jp.co.kunisys.member.common.DUtil;
import jp.co.kunisys.member.entity.Workplace;
import jp.co.kunisys.member.form.MTE010Form;
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


	/**
	 * 勤務先リストの検索処理
	 * @param form フォーム
	 */
	public void sarchWorkplaceList(MTE010Form form) {

		List<Workplace> entityList = this.workplaceRepository.findAllOrderById();
		List<BeanMap> mapList = entityList.stream()
				.map(e -> {
					BeanMap map = new BeanMap();
					BeanUtil.copyProperties(e, map);
					map.put("workplaceTypeName", Code.getName(Code.WORKPLACE_KUBUN.TYPE, e.getWorkplaceType()));
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
		Workplace entity = this.workplaceRepository.findById(form.getInWorkplaceId());
		if (entity == null) {
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
			form.setInWorkplaceId(entity.getWorkplaceId());
			//勤務先名
			form.setInName(entity.getName());
			//勤務先区分
			form.setInWorkplaceType(entity.getWorkplaceType());
			//備考
			form.setInRemark(entity.getRemark());
			//削除
			form.setInDelete(entity.getDeleted() != null);
			//バージョン
			form.setInVersion(entity.getVersion());
		}
	}


	/**
	 * 勤務先の登録処理
	 * @param form フォーム
	 */
	public void insertWorkplace(MTE010Form form) {
		Timestamp now = DUtil.getTimestamp();

		Workplace entity = new Workplace();
		//勤務先ID
		Integer workplaceId = this.workplaceRepository.createWorkplaceId();
		entity.setWorkplaceId(workplaceId);
		//勤務先名
		entity.setName(form.getInName());
		//勤務先区分
		entity.setWorkplaceType(form.getInWorkplaceType());
		//備考
		entity.setRemark(form.getInRemark());
		//登録日時
		entity.setCreated(now);
		//登録ユーザ
		entity.setCreatedUser(LoginUser.getUser().getUserId());
		//更新日時
		entity.setUpdated(now);
		//更新ユーザ
		entity.setUpdatedUser(LoginUser.getUser().getUserId());
		//バージョン
		entity.setVersion(1);

		//登録処理
		this.workplaceRepository.insert(entity);
	}


	/**
	 * 勤務先の更新処理
	 * @param form フォーム
	 */
	public void updateWorkplace(MTE010Form form) {
		Timestamp now = DUtil.getTimestamp();

		Workplace entity = this.workplaceRepository.findById(form.getInWorkplaceId());
		//勤務先名
		entity.setName(form.getInName());
		//勤務先区分
		entity.setWorkplaceType(form.getInWorkplaceType());
		//備考
		entity.setRemark(form.getInRemark());
		//更新日時
		entity.setUpdated(now);
		//更新ユーザ
		entity.setUpdatedUser(LoginUser.getUser().getUserId());
		//削除日時 (削除チェックONの場合)
		Timestamp deleted = form.isInDelete() ? now : null;
		entity.setDeleted(deleted);
		//削除ユーザ (削除チェックONの場合)
		Integer deletedUser = form.isInDelete() ? entity.getUpdatedUser() : null;
		entity.setDeletedUser(deletedUser);
		//バージョン
		entity.setVersion(form.getInVersion());

		//更新処理
		this.workplaceRepository.update(entity);
	}

}

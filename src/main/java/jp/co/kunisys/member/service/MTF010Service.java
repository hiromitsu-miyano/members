package jp.co.kunisys.member.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.kunisys.member.common.BeanMap;
import jp.co.kunisys.member.entity.Kubun;
import jp.co.kunisys.member.form.MTF010Form;
import jp.co.kunisys.member.repository.KubunRepository;
import jp.co.kunisys.member.security.LoginUser;

/**
 * 区分メンテナンス画面サービス
 */
@Transactional
@Service
public class MTF010Service {

	/** 区分リポジトリ */
	@Autowired
	private KubunRepository kubunRepository;


	/**
	 * 区分種別のリストを返却する
	 * @return 区分種別リスト
	 */
	public List<BeanMap> createKubunTypeList() {
		List<Kubun> entityList = this.kubunRepository.findKubunList(KubunRepository.KUBUN_TYPE_ROOT);

		List<BeanMap> kubunTypeList = new ArrayList<>();
		for (Kubun entity : entityList) {
			BeanMap map = new BeanMap();
			map.put("code", entity.getCode());
			map.put("name", entity.getName());
			kubunTypeList.add(map);
		}

		return kubunTypeList;
	}


    /**
     * 区分一覧を返却する.
     * @param form フォーム
     */
    public void searchKubunList(MTF010Form form) {
    	//区分一覧の検索
        List<Kubun> entityList = this.kubunRepository.findKubunList(form.getSelectKubunType());
        //Mapに格納
        List<BeanMap> kubunList = new ArrayList<BeanMap>();
        for (Kubun entity : entityList) {
            BeanMap map = new BeanMap();
            map.put("seq", entity.getSeq());
            map.put("typeCode", entity.getTypeCode());
            map.put("typeName", entity.getTypeName());
            map.put("code", entity.getCode());
            map.put("name", entity.getName());
            map.put("deleted", entity.getDeletedUser());
            map.put("version", entity.getVersion());
            kubunList.add(map);
        }

        form.setKubunList(kubunList);
    }


    /**
     * 区分の選択処理
     * @param form フォーム
     */
    public void selectKubun(MTF010Form form) {

    	Kubun entity = this.kubunRepository.findById(form.getSelectSeq());
    	//区分番号
    	form.setInputSeq(entity.getSeq());
    	//区分種別コード
    	form.setInputTypeCode(entity.getTypeCode());
    	//区分種別名
    	form.setInputTypeName(entity.getTypeName());
    	//区分コード
    	form.setInputCode(entity.getCode());
    	//区分名
    	form.setInputName(entity.getName());
    	//バージョン
    	form.setInputVersion(entity.getVersion());
    }


    /**
     * 区分の登録処理
     * @param form フォーム
     */
    public void insertKubun(MTF010Form form) {
    	Timestamp ts = new Timestamp(System.currentTimeMillis());

    	Kubun entity = new Kubun();
    	//区分番号
    	int seq = this.kubunRepository.findMaxNumber() + 1;
    	entity.setSeq(seq);
    	//区分種別コード
    	entity.setTypeCode(form.getInputTypeCode());
    	//区分種別名
    	entity.setTypeName(form.getInputTypeName());
    	//区分コード
    	entity.setCode(form.getInputCode());
    	//区分名
    	entity.setName(form.getInputName());
    	//登録日時
    	entity.setCreated(ts);
    	//登録ユーザ
    	entity.setCreatedUser(LoginUser.getUser().getUserId());
    	//更新日時
    	entity.setUpdated(ts);
    	//更新ユーザ
    	entity.setUpdatedUser(LoginUser.getUser().getUserId());
    	//バージョン
    	entity.setVersion(1);

    	//登録処理
    	this.kubunRepository.insert(entity);
    }


    /**
     * 区分の更新処理
     * @param form フォーム
     */
    public void updateKubun(MTF010Form form) {
    	Timestamp ts = new Timestamp(System.currentTimeMillis());

    	Kubun entity = this.kubunRepository.findById(form.getInputSeq());
    	if (entity == null) {
    		return;
    	}

    	//区分コード
    	entity.setCode(form.getInputCode());
    	//区分名
    	entity.setName(form.getInputName());
    	//更新日時
    	entity.setUpdated(ts);
    	//更新ユーザ
    	entity.setUpdatedUser(LoginUser.getUser().getUserId());
    	//バージョン
    	entity.setVersion(form.getInputVersion());

    	//更新処理
    	this.kubunRepository.update(entity);
    }


    /**
     * 区分の削除処理
     * @param form フォーム
     */
    public void deleteKubun(MTF010Form form) {
    	Timestamp ts = new Timestamp(System.currentTimeMillis());

    	Kubun entity = this.kubunRepository.findById(form.getInputSeq());
    	if (entity == null) {
    		return;
    	}

    	//削除日時
    	entity.setDeleted(ts);
    	//削除ユーザ
    	entity.setDeletedUser(LoginUser.getUser().getUserId());
    	//バージョン
    	entity.setVersion(form.getInputVersion());

    	//更新処理(論理削除)
    	this.kubunRepository.update(entity);
    }
}

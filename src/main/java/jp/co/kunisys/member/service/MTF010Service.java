package jp.co.kunisys.member.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.kunisys.member.common.BeanMap;
import jp.co.kunisys.member.form.MTF010Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.KubunRecord;
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

	/** DSLContext */
	@Autowired
	private DSLContext create;

	/**
	 * 区分種別のリストを返却する
	 * @return 区分種別リスト
	 */
	public List<BeanMap> createKubunTypeList() {
		List<KubunRecord> recList = this.kubunRepository.findKubunList(KubunRepository.KUBUN_TYPE_ROOT);

		return recList.stream()
						.map(r -> {
							BeanMap map = new BeanMap();
							map.put("code", r.getCode());
							map.put("name", r.getName());
							return map;
						}).collect(Collectors.toList());
	}


    /**
     * 区分一覧を返却する.
     * @param form フォーム
     */
    public void searchKubunList(MTF010Form form) {
    	//区分一覧の検索
        List<KubunRecord> recList = this.kubunRepository.findKubunList(form.getSelectKubunType());
        //Mapに格納
        List<BeanMap> kubunList = recList.stream()
        							.map(r -> {
        					            BeanMap map = new BeanMap();
        					            map.put("seq", r.getSeq());
        					            map.put("typeCode", r.getTypeCode());
        					            map.put("typeName", r.getTypeName());
        					            map.put("code", r.getCode());
        					            map.put("name", r.getName());
        					            map.put("deleted", r.getDeletedUser());
        					            map.put("version", r.getVersion());
        					            return map;
        							}).collect(Collectors.toList());
        form.setKubunList(kubunList);
    }


    /**
     * 区分の選択処理
     * @param form フォーム
     */
    public void selectKubun(MTF010Form form) {

    	KubunRecord rec = this.kubunRepository.findById(form.getSelectSeq());
    	//区分番号
    	form.setInputSeq(rec.getSeq());
    	//区分種別コード
    	form.setInputTypeCode(rec.getTypeCode());
    	//区分種別名
    	form.setInputTypeName(rec.getTypeName());
    	//区分コード
    	form.setInputCode(rec.getCode());
    	//区分名
    	form.setInputName(rec.getName());
    	//バージョン
    	form.setInputVersion(rec.getVersion());
    }


    /**
     * 区分の登録処理
     * @param form フォーム
     */
    public void insertKubun(MTF010Form form) {
    	Timestamp ts = new Timestamp(System.currentTimeMillis());

    	int seq = this.kubunRepository.findMaxNumber() + 1;

    	KubunRecord rec = this.create.newRecord(Tables.KUBUN);
    	//区分番号
    	rec.setSeq(seq);
    	//区分種別コード
    	rec.setTypeCode(form.getInputTypeCode());
    	//区分種別名
    	rec.setTypeName(form.getInputTypeName());
    	//区分コード
    	rec.setCode(form.getInputCode());
    	//区分名
    	rec.setName(form.getInputName());
    	//登録日時
    	rec.setCreated(ts);
    	//登録ユーザ
    	rec.setCreatedUser(LoginUser.getUser().getUserId());
    	//更新日時
    	rec.setUpdated(ts);
    	//更新ユーザ
    	rec.setUpdatedUser(LoginUser.getUser().getUserId());
    	//バージョン
    	rec.setVersion(1);

    	//登録処理
    	rec.store();
    }


    /**
     * 区分の更新処理
     * @param form フォーム
     */
    public void updateKubun(MTF010Form form) {
    	Timestamp ts = new Timestamp(System.currentTimeMillis());

    	KubunRecord rec = this.kubunRepository.findById(form.getInputSeq());
    	if (rec == null) {
    		return;
    	}

    	//区分コード
    	rec.setCode(form.getInputCode());
    	//区分名
    	rec.setName(form.getInputName());
    	//更新日時
    	rec.setUpdated(ts);
    	//更新ユーザ
    	rec.setUpdatedUser(LoginUser.getUser().getUserId());
    	//バージョン
    	rec.setVersion(form.getInputVersion());

    	//更新処理
    	rec.store();
    }


    /**
     * 区分の削除処理
     * @param form フォーム
     */
    public void deleteKubun(MTF010Form form) {
    	Timestamp ts = new Timestamp(System.currentTimeMillis());

    	KubunRecord rec = this.kubunRepository.findById(form.getInputSeq());
    	if (rec == null) {
    		return;
    	}

    	//削除日時
    	rec.setDeleted(ts);
    	//削除ユーザ
    	rec.setDeletedUser(LoginUser.getUser().getUserId());
    	//バージョン
    	rec.setVersion(form.getInputVersion());

    	//更新処理(論理削除)
    	rec.store();
    }
}

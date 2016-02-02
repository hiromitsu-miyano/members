package jp.co.kunisys.member.config;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jp.co.kunisys.member.common.Code;
import jp.co.kunisys.member.common.Constants;
import jp.co.kunisys.member.common.SUtil;
import jp.co.kunisys.member.query.tables.records.AppInfoRecord;
import jp.co.kunisys.member.query.tables.records.KubunRecord;
import jp.co.kunisys.member.repository.AppInfoRepository;
import jp.co.kunisys.member.repository.KubunRepository;

/**
 * アプリケーション初期化クラス
 */
@Component
public class Initializer implements CommandLineRunner {

	/** ロガー */
	private static Logger logger = LoggerFactory.getLogger(Initializer.class);

	/** Jenkinsのビルド番号属性 */
	private static final String BUILD_NUMBER = "JenkinsBuildNumber";
	/** SVNリビジョン番号属性 */
	private static final String SVN_REVISION = "JenkinsSvnRevision";

	/** アプリケーション設定リポジトリ */
	@Autowired
	private AppInfoRepository appInfoRepository;
	/** 区分マスタリポジトリ */
	@Autowired
	private KubunRepository kubunRepository;
	/** JOOQ設定クラス */
	@Autowired
	private org.jooq.Configuration jooqConfig;


	/**
	 * 初期化処理
	 */
	@Override
	public void run(String... args) throws Exception {
		//JOOQ の排他制御を有効にする
		this.jooqConfig.settings().withExecuteWithOptimisticLocking(true);

		//バージョン番号の読込
		loadVersionNumber();
		//定数クラスの初期化処理
		initAppInfo();
		//コードをメモリ上に展開する
		initCode();
	}


	/**
	 * バージョン番号の読込
	 */
	private void loadVersionNumber() {
		logger.info("バージョン番号読込開始");;
		//マニフェストファイル読込
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("META-INF/MANIFEST.MF");
		Manifest manifest = null;
		try {
			manifest = new Manifest(is);
		} catch (IOException ex) {
			logger.error("マニフェストファイルの読込に失敗しました。");
			return;
		}

		//マニフェストファイルよりビルド番号とリビジョン番号を取得
		Attributes attr = manifest.getMainAttributes();
		String buildNumber = attr.getValue(BUILD_NUMBER);
		if (buildNumber == null) {
			buildNumber = "0";
		}
		String revision = attr.getValue(SVN_REVISION);
		if (revision == null) {
			revision = "0";
		}
		Constants.APPLICATION_VERSION = String.format("%s.%s.%s", Constants.APPLICATION_VERSION_MEJOR, buildNumber, revision);
		logger.info("バージョン番号読込終了");;
	}


	/**
	 * 定数クラスの初期化処理
	 */
	private void initAppInfo() {
		logger.info("定数クラス設定開始");
		//アプリケーション設定を取得
		List<AppInfoRecord> recList = this.appInfoRepository.findAllOrderById();
		//定数クラスフィールドを全走査
		for (Field f : Constants.class.getFields()) {
			//フィールド毎にアプリケーション設定を検索
			Optional<AppInfoRecord> opt = recList.stream()
					.filter(b -> SUtil.equals(b.getAppKey(), f.getName()))
					.findFirst();
			if (opt.isPresent()) {
				//AppInfo entity = opt.get();
				AppInfoRecord rec = opt.get();
				//値の型情報がない場合は読み飛ばし
				if (SUtil.isBlank(rec.getTypeOf())) {
					logger.warn("アプリケーション設定テーブルの値の型情報が設定されていません。[%s]", rec.getAppKey());
					continue;
				}

				try {
					switch (rec.getTypeOf()) {
					case Constants.ValueType.INI_VAL_STRING:
						f.set(null, rec.getAppValue());
						break;
					case Constants.ValueType.INI_VAL_INT:
					case Constants.ValueType.INI_VAL_INTEGER:
						f.set(null, Integer.valueOf(rec.getAppValue()));
						break;
					case Constants.ValueType.INI_VAL_DOUBLE:
						f.set(null, Double.valueOf(rec.getAppValue()));
						break;
					case Constants.ValueType.INI_VAL_BOOLEAN:
						f.set(null, Boolean.parseBoolean(rec.getAppValue()));
						break;
					}
				} catch (IllegalAccessException ex) {
					logger.warn("アプリケーション設定テーブルの定数クラスへの設定に失敗しました。[%s]", rec.getAppKey());
				}
			}
		}

		logger.info("定数クラス設定終了");
	}


	/**
	 * コードをメモリ上に展開する
	 */
	private void initCode() {
		logger.info("コード(区分マスタ)読込開始");

		List<KubunRecord> entityList = this.kubunRepository.findAllOrderById();
		Code.setCodeList(entityList);

		logger.info("コード(区分マスタ)読込終了");
	}
}

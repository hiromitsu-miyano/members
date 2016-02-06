package jp.co.kunisys.member.common.util;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * クラスユーティリティ
 */
public class ClassUtil {
	/** ロガー */
	private static Logger logger = LoggerFactory.getLogger(ClassUtil.class);

	/** パッケージ (コントローラ) */
	public static final String PACKAGE_CONTROLLER = "jp.co.kunisys.member.controller";
	/** 拡張子の長さ */
	private static final int EXT_LENGTH = 6;

	/**
	 * コンストラクタ
	 */
	private ClassUtil() {}


	/**
	 * 指定されたパッケージのクラス一覧を返す
	 * @param packageName パッケージ名
	 * @return クラス一覧
	 */
	public static List<Class<?>> getClassList(String packageName) {
		if (SUtil.isBlank(packageName)) {
			return new ArrayList<>();
		}
		//クラスローダを取得
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		//パッケージ配下のディレクトリ/ファイルを列挙
		Enumeration<URL> resources;
		try {
			resources = classLoader.getResources(packageName.replace('.', '/'));
		} catch (IOException e) {
			logger.warn(e.getMessage());
			return new ArrayList<>();
		}
		//リストに詰め替え
		List<File> dirs = new ArrayList<>();
		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			String fileName = resource.getFile();
			String fileNameDecoded;
			try {
				fileNameDecoded = URLDecoder.decode(fileName, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				logger.warn(e.getMessage());
				continue;
			}
			dirs.add(new File(fileNameDecoded));
		}
		//ディレクトリ/ファイルリストよりクラスリストを取得
		List<Class<?>> classes = new ArrayList<>();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName));
		}
		return classes;
	}


	/**
	 * 該当ディレクトリのクラスを検索する
	 * @param directory ディレクトリ
	 * @param packageName パッケージ名
	 * @return クラス一覧
	 */
	private static List<Class<?>> findClasses(File directory, String packageName) {
		List<Class<?>> classes = new ArrayList<>();
		//ディレクトリの存在チェック
		if (!directory.exists()) {
			return classes;
		}
		//ディレクトリ内のディレクトリ/ファイルを走査する
		for (File file : directory.listFiles()) {
			String fileName = file.getName();
			if (file.isDirectory()) {
				//ディレクトリの場合、再帰呼出しして結果を追加
				classes.addAll(findClasses(file, packageName + "." + fileName));
			} else if (fileName.endsWith(".class") && !fileName.contains("$")) {
				//クラスファイル(インナークラスを除く)の場合
				String clazzName = packageName + "." + fileName.substring(0, fileName.length() - EXT_LENGTH);
				Class<?> clazz;
				try {
					clazz = getClass(clazzName);
				} catch (ClassNotFoundException e) {
					logger.warn(e.getMessage());
					continue;
				}
				classes.add(clazz);
			}
		}
		return classes;
	}


	/**
	 * クラス名よりクラスを返す
	 * @param className クラス名
	 * @return クラス
	 * @throws ClassNotFoundException
	 */
	private static Class<?> getClass(String className) throws ClassNotFoundException {
		Class<?> clazz;
		try {
			clazz = Class.forName(className);
		} catch (ExceptionInInitializerError e) {
			//クラス読込中に例外が発生した場合(static初期化子)
			clazz = Class.forName(className, false, Thread.currentThread().getContextClassLoader());
		}
		return clazz;
	}
}

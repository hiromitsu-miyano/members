package jp.co.kunisys.member.service;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import jp.co.kunisys.member.bean.mta.ControllerBean;
import jp.co.kunisys.member.common.util.ChkUtil;
import jp.co.kunisys.member.common.util.ClassUtil;
import jp.co.kunisys.member.common.util.SUtil;
import jp.co.kunisys.member.form.MTA040Form;
import jp.co.kunisys.member.query.Tables;
import jp.co.kunisys.member.query.tables.records.AuthFunctionRecord;

/**
 * 機能権限編集サービス
 */
@Service
public class MTA040Service {

	/** ロガー */
	private static Logger logger = LoggerFactory.getLogger(MTA040Service.class);

	/** DSLContext */
	@Autowired
	private DSLContext create;


	/**
	 * コントローラのリストを検索する
	 * @param form フォーム
	 */
	public void searchControllerList(MTA040Form form) {
		form.setControllerList(new ArrayList<>());

		//コントローラのクラスリスト取得
		List<Class<?>> classList = ClassUtil.getClassList(ClassUtil.PACKAGE_CONTROLLER);
		for (Class<?> clazz : classList) {
			String clazzName = clazz.getSimpleName();
			ControllerBean bean = new ControllerBean();
			//コントローラ名
			bean.setControllerName(clazzName);
			//画面名
			String viewName = "";
			try {
				viewName = (String) clazz.getField("NAME").get(null);
			} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
				logger.warn("コントローラ[%s]のフィールド[NAME]が取得できません。" + clazzName, clazzName);
				continue;
			}
			bean.setViewName(viewName);

			form.getControllerList().add(bean);
		}
	}


	/**
	 * 機能権限一覧の検索処理
	 * @param form フォーム
	 */
	public void searchAuthFunctionList(MTA040Form form) {
		String col = form.getSelectSortColumn();
		String order = form.getSelectSortOrder();
		//検索クエリ生成
		SelectQuery<AuthFunctionRecord> query = this.create.selectFrom(Tables.AUTH_FUNCTION)
				.orderBy(getOrder(col, order))
				.getQuery();
		//条件
		String className = convCotrollerToAction(form.getSelectClassName());
		if (SUtil.isNotBlank(form.getSelectClassName())) {
			query.addConditions(Tables.AUTH_FUNCTION.CLASS_NAME.eq(className));
		}

		List<AuthFunctionRecord> recList = query.fetch();
		form.setAuthFunctionList(recList);
	}

	/**
	 * orderを返す
	 * @param sortCol ソートカラム文字列
	 * @param order 並び順
	 * @return order
	 */
	private org.jooq.SortField<?> getOrder(String sortCol, String order) {
		String col = sortCol;
		if (SUtil.isBlank(col)) {
			col = "sortkey";
		}

		switch(col) {
		case "authFunctionCd":
			return getSortField(Tables.AUTH_FUNCTION.AUTH_FUNCTION_CD, order);
		case "name":
			return getSortField(Tables.AUTH_FUNCTION.NAME, order);
		case "className":
			return getSortField(Tables.AUTH_FUNCTION.CLASS_NAME, order);
		case "actionName":
			return getSortField(Tables.AUTH_FUNCTION.ACTION_NAME, order);
		case "comment":
			return getSortField(Tables.AUTH_FUNCTION.COMMENT, order);
		case "sortkey":
			return getSortField(Tables.AUTH_FUNCTION.SORTKEY, order);
		default:
			return getSortField(Tables.AUTH_FUNCTION.AUTH_FUNCTION_CD, order);
		}
	}

	/**
	 * orderを返す
	 * @param field ソートカラム
	 * @param order 並び順
	 * @return order
	 */
	private <T> org.jooq.SortField<T> getSortField(org.jooq.TableField<AuthFunctionRecord, T> field, String order) {
		if (SUtil.isBlank(order)) {
			return field.asc();
		} else if (SUtil.equals(order, "ASC")) {
			return field.asc();
		} else {
			return field.desc();
		}
	}


	private String convCotrollerToAction(String controller) {
		return SUtil.replace(controller, "Controller", "Action");
	}


	/**
	 * 機能権限の選択処理
	 * @param form フォーム
	 */
	public void selectAuthFunction(MTA040Form form) {
		//機能権限の検索
		AuthFunctionRecord rec = this.create.selectFrom(Tables.AUTH_FUNCTION)
												.where(Tables.AUTH_FUNCTION.AUTH_FUNCTION_CD.eq(form.getInputAuthFunctionCd()))
												.fetchOne();
		if (rec == null) {
			//機能権限名
			form.setInputName(null);
			//クラス名
			form.setInputClassName(null);
			//アクション名
			form.setInputActionName(null);
			//コメント
			form.setInputComment(null);
			//並び順
			form.setInputSortkey(null);
			//モード
			form.setEdited(false);
			return;
		}

		//機能権限名
		form.setInputName(rec.getName());
		//クラス名
		form.setInputClassName(rec.getClassName());
		//アクション名
		form.setInputActionName(rec.getActionName());
		//コメント
		form.setInputComment(rec.getComment());
		//並び順
		form.setInputSortkey(rec.getSortkey());
		//モード
		form.setEdited(true);
	}

	/**
	 * 入力チェック
	 * @param form フォーム
	 * @param result バリデート結果
	 */
	public void checkInput(MTA040Form form, BindingResult result) {
		ChkUtil.isRequire(result, "inputAuthFunctionCd", "機能権限コード", form.getInputAuthFunctionCd());
		ChkUtil.isRequire(result, "inputName",           "名称",           form.getInputName());
		ChkUtil.isRequire(result, "inputClassName",      "クラス名",       form.getInputClassName());
		ChkUtil.isRequire(result, "inputActionName",     "アクション名",   form.getInputActionName());

		ChkUtil.isMaxChar(result, "inputAuthFunctionCd", "機能権限コード", form.getInputAuthFunctionCd(), 10);
		ChkUtil.isMaxChar(result, "inputName",           "名称",           form.getInputName(), 100);
		ChkUtil.isMaxChar(result, "inputClassName",      "クラス名",       form.getInputClassName(), 100);
		ChkUtil.isMaxChar(result, "inputActionName",     "アクション名",   form.getInputActionName(), 100);
		ChkUtil.isMaxChar(result, "inputComment",        "コメント",       form.getInputComment(), 100);
	}


	/**
	 * 機能権限の登録処理
	 * @param form フォーム
	 */
	public void insertAuthFunction(MTA040Form form) {
		AuthFunctionRecord rec = this.create.newRecord(Tables.AUTH_FUNCTION);

		//機能権限コード
		rec.setAuthFunctionCd(form.getInputAuthFunctionCd());
		//機能権限名
		rec.setName(form.getInputName());
		//アクションクラス名
		rec.setClassName(form.getInputClassName());
		//アクション名
		rec.setActionName(form.getInputActionName());
		//コメント
		rec.setComment(form.getInputComment());
		//並び順
		rec.setSortkey(form.getInputSortkey());

		//登録処理実行
		rec.store();
	}


	/**
	 * 機能権限の更新処理
	 * @param form フォーム
	 */
	public void updateAuthFunction(MTA040Form form) {
		AuthFunctionRecord rec = this.create.selectFrom(Tables.AUTH_FUNCTION)
										.where(Tables.AUTH_FUNCTION.AUTH_FUNCTION_CD.eq(form.getInputAuthFunctionCd()))
										.fetchOne();
		if (rec == null) {
			return;
		}

		//機能権限名
		rec.setName(form.getInputName());
		//アクションクラス名
		rec.setClassName(form.getInputClassName());
		//アクション名
		rec.setActionName(form.getInputActionName());
		//コメント
		rec.setComment(form.getInputComment());
		//並び順
		rec.setSortkey(form.getInputSortkey());

		//更新処理実行
		rec.store();
	}


	/**
	 * 機能権限の削除処理
	 * @param form フォーム
	 */
	public void deleteAuthFunction(MTA040Form form) {
		AuthFunctionRecord rec = this.create.selectFrom(Tables.AUTH_FUNCTION)
										.where(Tables.AUTH_FUNCTION.AUTH_FUNCTION_CD.eq(form.getInputAuthFunctionCd()))
										.fetchOne();
		if (rec == null) {
			return;
		}

		//削除処理実行
		rec.delete();
	}
}

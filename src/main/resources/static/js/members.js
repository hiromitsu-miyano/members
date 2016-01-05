$(function(){
	/* ajaxイベントフック */
	$(document).ajaxSend(function(){
		$("div.ingicator").show();
	}).ajaxComplete(function(){
		$("div.ingicator").hide();
	});
});

/******************************************
 * システム共通AJAX関数
 */
var MJSAJAX = {
	/*
	 * AJAXメソッドのラッパー
	 * （エラー処理を共通化する）
	 */
	exec: function (param) {
		var vdata;
		var cfunc;
		if (param.data) vdata=param.data;
		if (param.complete) cfunc=param.complete;
		$.ajax({
			url:param.url, cache:false, dataType:param.dataType, data:vdata,
			success:param.success,
			error: function(req, status, error) {
				switch (req.status) {
				case 301:
					location.href="../COC000Error/init";
					break;
				case 401:
					alert("権限がありません。");
					break;
				case 403:
					alert(req.responseText);
					break;
				default:
					alert(req.responseText);
					break;
				}
			},
			complete:cfunc
		});
	}
}

/******************************************
 * カレンダダイアログ
 */
var MJSCALENDAR = {
	/**
	 * 初期処理
	 * @param id テキストボックスのID
	 */
	init :function(id) {
		$(id).datepicker({
			date: $(id).val(),
			current: $(id).val(),
			beforeShow: function() {
				if ($(id).validate()) {
					$(id).datepicker('setDate', $(id).val());
				}
			}
		});
	}
}

/******************************************
 * 編集ダイアログ
 */
var MJSDIALOG = {
	/**
	 * 初期処理
	 * @param id ダイアログのID
	 * @param w ダイアログの幅
	 * @param title ダイアログのタイトル
	 */
	init :function(id, w, title) {
		$(id).dialog({
			autoOpen: false,
			title: title,
			modal: true,
			width: w,
			close: function(event) {
				clearInput();
			}
		});
	}
}

/******************************************
 * システム共通関数
 */
var MJS = {
	/*
	 * 数値を３桁で区切る(1000⇒1,000)
	 */
	addFigure :function (str) {
		var num = new String(str).replace(/,/g, "");
		while (num != (num = num.replace(/^(-?\d+)(\d{3})/, "$1,$2")));
		return num;
	}
}

/******************************************
 * 共通入力チェック
 */
var MJSCHK = {
	/*
	 * 必須チェック
	 * @param arrRequired(item:ID, name:項目名)
	 */
	requiredArray :function (arrRequired) {
		var ret = true;
    	for (i = 0; i < arrRequired.length; i++) {
    		var val = $('#'+arrRequired[i].item).val();
    		if (!val || val.length == 0) {
    			$('#'+arrRequired[i].item).addClass('errorItem');
    			$('#'+arrRequired[i].item).after("<span class='errorMessage'><br/>「"+arrRequired[i].name+"」は必須です。</span>");
    			ret = false;
    		}
    	}

		return ret;
	},
	/*
	 * 必須チェック
	 * @param item ID
	 * @param name 項目名
	 */
	required: function (item, name) {
		if (!item || item.length == 0) return true;

		var val = $('#'+item).val();
		if (!val || val.length==0) {
			$('#'+item).addClass('errorItem');
			$('#'+item).after("<span class='errorMessage'><br/>「"+name+"」は必須です。</span>");
			return false;
		}

		return true;
	},
	/*
	 * 数値チェック
	 * @param item:ID
	 * @param name:項目名
	 */
	num: function (item, name) {
		if (!item || item.length == 0) return true;

		var val = $('#'+item).val();
		if (!val) return true;

		if (/[^0-9]/.test(val)) {
			$('#'+item).addClass('errorItem');
			$('#'+item).after("<span class='errorMessage'><br/>「"+name+"」は数値を入力します。</span>");
			return false;
		}

		return true;
	},
	/*
	 * 日付チェック
	 * @param year:ID(年)
	 * @param month:ID(月)
	 * @param day:ID(日)
	 * @param name:項目名
	 */
	dateYMD: function (year,month,day, name) {
		if (!year || year.length==0 || !month || month.length==0 || !day || day.length == 0) return true;
		var valY = $('#'+year).val();
		var valM = $('#'+month).val();
		var valD = $('#'+day).val();
		if ( (!valY || valY.length==0) && (!valM || valM.length==0) && (!valD || valD.length==0) ) return true;

		var dt = new Date(valY, valM-1, valD);
		if (dt == null || dt.getFullYear() != valY || dt.getMonth()+1 != valM || dt.getDate() != valD) {
			$('#'+year).addClass('errorItem');
			$('#'+month).addClass('errorItem');
			$('#'+day).addClass('errorItem');
			$('#'+day).after("<span class='errorMessage'><br/>「"+name+"」に存在しない日付が入力されています。</span>");
			return false;
		}

		return true;
	},
	/*
	 * 日付比較チェック
	 * @param fyear ID(開始年)
	 * @param fmonth ID(開始月)
	 * @param fday ID(開始日)
	 * @param fname 項目名(開始年月日)
	 * @param tyear ID(終了年)
	 * @param tmonth ID(終了月)
	 * @param tday ID(終了日)
	 * @param tname 項目名(終了年月日)
	 */
	dateYMDdiff: function (fyear,fmonth,fday,fname, tyear,tmonth,tday,tname) {
		var valYf = $('#'+fyear).val();
		var valMf = $('#'+fmonth).val();
		var valDf = $('#'+fday).val();
		if ( (!valYf || valYf.length==0) && (!valMf || valMf.length==0) && (!valDf || valDf.length==0) ) return true;
		var dtf = new Date(valYf, valMf-1, valDf);

		var valYt = $('#'+tyear).val();
		var valMt = $('#'+tmonth).val();
		var valDt = $('#'+tday).val();
		if ( (!valYt || valYt.length==0) && (!valMt || valMt.length==0) && (!valDt || valDt.length==0) ) return true;
		var dtt = new Date(valYt, valMt-1, valDt);

		if (dtf.getTime() > dtt.getTime()) {
			$('#'+fyear).addClass('errorItem');
			$('#'+fmonth).addClass('errorItem');
			$('#'+fday).addClass('errorItem');
			$('#'+tyear).addClass('errorItem');
			$('#'+tmonth).addClass('errorItem');
			$('#'+tday).addClass('errorItem');
			$('#'+tday).after("<span class='errorMessage'><br/>「"+fname+"」より「"+tname+"」が過去となっています。</span>");
			return false;
		}
		return true;
	},
	dateYMdiff: function (fyear,fmonth,fname, tyear,tmonth,tname) {
		var valYf = $('#'+fyear).val();
		var valMf = $('#'+fmonth).val();
		if ( (!valYf || valYf.length==0) && (!valMf || valMf.length==0) ) return true;
		var dtf = new Date(valYf, valMf-1, 1);

		var valYt = $('#'+tyear).val();
		var valMt = $('#'+tmonth).val();
		if ( (!valYt || valYt.length==0) && (!valMt || valMt.length==0) ) return true;
		var dtt = new Date(valYt, valMt-1, 1);

		if (dtf.getTime() > dtt.getTime()) {
			$('#'+fyear).addClass('errorItem');
			$('#'+fmonth).addClass('errorItem');
			$('#'+tyear).addClass('errorItem');
			$('#'+tmonth).addClass('errorItem');
			$('#'+tmonth).after("<span class='errorMessage'><br/>「"+fname+"」より「"+tname+"」が過去となっています。</span>");
			return false;
		}
		return true;
	},
	/*
	 * 文字列が指定長を超えていないかチェック
	 */
	maxLength :function (str,len) {
		if (!str) return true;
		return (str.length<=len);
	},
	/*
	 * 文字列の指定長を下回ってないかチェック
	 * @param item ID
	 * @param len 指定長
	 * @param name 項目名
	 */
	minLength :function (item,len,name) {
		var val = $('#'+item).val().trim();
		if (!val || val.length<len) {
			$('#'+item).addClass('errorItem');
			$('#'+item).after("<span class='errorMessage'><br/>「"+name+"」が短すぎます。(最小"+len+"文字)</span>");
			return false;
		}
		return true;
	},
	/*
	 * カタカナチェック(全半角空白も許容)
	 * @param item:ID
	 * @param name:項目名
	 */
	kana: function (item, name) {
		if (!item || item.length == 0) return true;

		var val = $('#'+item).val().trim();
		if (!val) return true;

		if (/[^ァ-ヶー\s　]/.test(val)) {
			$('#'+item).addClass('errorItem');
			$('#'+item).after("<span class='errorMessage'><br/>「"+name+"」はカタカナを入力します。</span>");
			return false;
		}

		return true;
	},
	/*
	 * 半角英数記号チェック
	 * @param item:ID
	 * @param name:項目名
	 */
	halfCharSymbol: function (item, name) {
		if (!item || item.length == 0) return true;

		var val = $('#'+item).val().trim();
		if (!val) return true;

		if (/[^0-9A-Za-z!-\/:-@\[-`{-~]/.test(val)) {
			$('#'+item).addClass('errorItem');
			$('#'+item).after("<span class='errorMessage'><br/>「"+name+"」は半角英数字/半角記号を入力します。</span>");
			return false;
		}

		return true;
	},
	/*
	 * 文字列の一致チェック
	 * @param fitem ID(比較元)
	 * @param fname 項目名(比較元)
	 * @param titem ID(比較先)
	 * @param tname 項目名(比較先)
	 */
	strEqual: function(fitem,fname,titem,tname) {
		var fval = $('#'+fitem).val().trim();
		if (!fval || fval.length==0) return true;
		var tval = $('#'+titem).val().trim();
		if (!tval || tval.length==0) return true;

		if (fval != tval) {
			$('#'+fitem).addClass('errorItem');
			$('#'+titem).addClass('errorItem');
			$('#'+titem).after("<span class='errorMessage'><br/>「"+tname+"」が「"+fname+"」と一致しません。</span>");
			return false;
		}

		return true;
	}
}

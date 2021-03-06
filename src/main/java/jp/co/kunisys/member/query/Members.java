/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jp.co.kunisys.member.query.tables.AccessLog;
import jp.co.kunisys.member.query.tables.AdToJapaneseYear;
import jp.co.kunisys.member.query.tables.AnalysisBusho;
import jp.co.kunisys.member.query.tables.AnalysisCustomer;
import jp.co.kunisys.member.query.tables.AnalysisDate;
import jp.co.kunisys.member.query.tables.AnalysisDaywork;
import jp.co.kunisys.member.query.tables.AnalysisGenka;
import jp.co.kunisys.member.query.tables.AnalysisJobInfo;
import jp.co.kunisys.member.query.tables.AnalysisMember;
import jp.co.kunisys.member.query.tables.AnalysisProject;
import jp.co.kunisys.member.query.tables.AnalysisProjectInfo;
import jp.co.kunisys.member.query.tables.AnalysisProjectMemberMonthlySummary;
import jp.co.kunisys.member.query.tables.AnalysisProjectMonthlySummary;
import jp.co.kunisys.member.query.tables.AnalysisProjectSummary;
import jp.co.kunisys.member.query.tables.AnalysisUserInfo;
import jp.co.kunisys.member.query.tables.AppInfo;
import jp.co.kunisys.member.query.tables.Auth;
import jp.co.kunisys.member.query.tables.AuthAssign;
import jp.co.kunisys.member.query.tables.AuthFunction;
import jp.co.kunisys.member.query.tables.Career;
import jp.co.kunisys.member.query.tables.CareerDetail;
import jp.co.kunisys.member.query.tables.CareerDetailSkill;
import jp.co.kunisys.member.query.tables.Department;
import jp.co.kunisys.member.query.tables.EduBackground;
import jp.co.kunisys.member.query.tables.Gender;
import jp.co.kunisys.member.query.tables.Ipv4AddressManage;
import jp.co.kunisys.member.query.tables.IsmsAccessAuth;
import jp.co.kunisys.member.query.tables.IsmsAccessAuthServerPath;
import jp.co.kunisys.member.query.tables.IsmsAccessAuthUser;
import jp.co.kunisys.member.query.tables.IsmsAsset;
import jp.co.kunisys.member.query.tables.IsmsAssetAssess;
import jp.co.kunisys.member.query.tables.IsmsAssetAssessManage;
import jp.co.kunisys.member.query.tables.IsmsAssetAssessManagePlan;
import jp.co.kunisys.member.query.tables.IsmsAssetAssessManageRisk;
import jp.co.kunisys.member.query.tables.IsmsAssetAssessRisk;
import jp.co.kunisys.member.query.tables.IsmsAssetAssessValue;
import jp.co.kunisys.member.query.tables.IsmsAssetId;
import jp.co.kunisys.member.query.tables.IsmsAssetManagePlan;
import jp.co.kunisys.member.query.tables.IsmsAssetPattern;
import jp.co.kunisys.member.query.tables.IsmsAssetRisk;
import jp.co.kunisys.member.query.tables.IsmsAssetType;
import jp.co.kunisys.member.query.tables.IsmsAssetTypeCategory;
import jp.co.kunisys.member.query.tables.IsmsGreaterManager;
import jp.co.kunisys.member.query.tables.IsmsHardware;
import jp.co.kunisys.member.query.tables.IsmsManagePlan;
import jp.co.kunisys.member.query.tables.IsmsOutsideDoc;
import jp.co.kunisys.member.query.tables.IsmsOutsideMedia;
import jp.co.kunisys.member.query.tables.IsmsSoftware;
import jp.co.kunisys.member.query.tables.IsmsSoftwareUse;
import jp.co.kunisys.member.query.tables.IsmsStore;
import jp.co.kunisys.member.query.tables.IsmsStoreAsset;
import jp.co.kunisys.member.query.tables.IsmsStoreDispose;
import jp.co.kunisys.member.query.tables.IsmsStoreIn;
import jp.co.kunisys.member.query.tables.IsmsStoreOut;
import jp.co.kunisys.member.query.tables.IsmsSystemInfo;
import jp.co.kunisys.member.query.tables.IsmsSystemProject;
import jp.co.kunisys.member.query.tables.IsmsVirtualMachine;
import jp.co.kunisys.member.query.tables.Kubun;
import jp.co.kunisys.member.query.tables.License;
import jp.co.kunisys.member.query.tables.PersonalSkill;
import jp.co.kunisys.member.query.tables.Post;
import jp.co.kunisys.member.query.tables.RelateDepartment;
import jp.co.kunisys.member.query.tables.RelateUser;
import jp.co.kunisys.member.query.tables.School;
import jp.co.kunisys.member.query.tables.Skill;
import jp.co.kunisys.member.query.tables.SkillKind;
import jp.co.kunisys.member.query.tables.TopMessage;
import jp.co.kunisys.member.query.tables.UserAuth;
import jp.co.kunisys.member.query.tables.UserInfo;
import jp.co.kunisys.member.query.tables.UserInfoAppointment;
import jp.co.kunisys.member.query.tables.UserInfoFamily;
import jp.co.kunisys.member.query.tables.UserInfoInsurance;
import jp.co.kunisys.member.query.tables.UserInfoRetire;
import jp.co.kunisys.member.query.tables.UserInfoView;
import jp.co.kunisys.member.query.tables.UserInfoWorkplace;
import jp.co.kunisys.member.query.tables.Workplace;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Members extends SchemaImpl {

	private static final long serialVersionUID = 1276897586;

	/**
	 * The reference instance of <code>members</code>
	 */
	public static final Members MEMBERS = new Members();

	/**
	 * No further instances allowed
	 */
	private Members() {
		super("members");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			AccessLog.ACCESS_LOG,
			AdToJapaneseYear.AD_TO_JAPANESE_YEAR,
			AnalysisBusho.ANALYSIS_BUSHO,
			AnalysisCustomer.ANALYSIS_CUSTOMER,
			AnalysisDate.ANALYSIS_DATE,
			AnalysisDaywork.ANALYSIS_DAYWORK,
			AnalysisGenka.ANALYSIS_GENKA,
			AnalysisJobInfo.ANALYSIS_JOB_INFO,
			AnalysisMember.ANALYSIS_MEMBER,
			AnalysisProject.ANALYSIS_PROJECT,
			AnalysisProjectInfo.ANALYSIS_PROJECT_INFO,
			AnalysisProjectMemberMonthlySummary.ANALYSIS_PROJECT_MEMBER_MONTHLY_SUMMARY,
			AnalysisProjectMonthlySummary.ANALYSIS_PROJECT_MONTHLY_SUMMARY,
			AnalysisProjectSummary.ANALYSIS_PROJECT_SUMMARY,
			AnalysisUserInfo.ANALYSIS_USER_INFO,
			AppInfo.APP_INFO,
			Auth.AUTH,
			AuthAssign.AUTH_ASSIGN,
			AuthFunction.AUTH_FUNCTION,
			Career.CAREER,
			CareerDetail.CAREER_DETAIL,
			CareerDetailSkill.CAREER_DETAIL_SKILL,
			Department.DEPARTMENT,
			EduBackground.EDU_BACKGROUND,
			Gender.GENDER,
			Ipv4AddressManage.IPV4_ADDRESS_MANAGE,
			IsmsAccessAuth.ISMS_ACCESS_AUTH,
			IsmsAccessAuthServerPath.ISMS_ACCESS_AUTH_SERVER_PATH,
			IsmsAccessAuthUser.ISMS_ACCESS_AUTH_USER,
			IsmsAsset.ISMS_ASSET,
			IsmsAssetAssess.ISMS_ASSET_ASSESS,
			IsmsAssetAssessManage.ISMS_ASSET_ASSESS_MANAGE,
			IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN,
			IsmsAssetAssessManageRisk.ISMS_ASSET_ASSESS_MANAGE_RISK,
			IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK,
			IsmsAssetAssessValue.ISMS_ASSET_ASSESS_VALUE,
			IsmsAssetId.ISMS_ASSET_ID,
			IsmsAssetManagePlan.ISMS_ASSET_MANAGE_PLAN,
			IsmsAssetPattern.ISMS_ASSET_PATTERN,
			IsmsAssetRisk.ISMS_ASSET_RISK,
			IsmsAssetType.ISMS_ASSET_TYPE,
			IsmsAssetTypeCategory.ISMS_ASSET_TYPE_CATEGORY,
			IsmsGreaterManager.ISMS_GREATER_MANAGER,
			IsmsHardware.ISMS_HARDWARE,
			IsmsManagePlan.ISMS_MANAGE_PLAN,
			IsmsOutsideDoc.ISMS_OUTSIDE_DOC,
			IsmsOutsideMedia.ISMS_OUTSIDE_MEDIA,
			IsmsSoftware.ISMS_SOFTWARE,
			IsmsSoftwareUse.ISMS_SOFTWARE_USE,
			IsmsStore.ISMS_STORE,
			IsmsStoreAsset.ISMS_STORE_ASSET,
			IsmsStoreDispose.ISMS_STORE_DISPOSE,
			IsmsStoreIn.ISMS_STORE_IN,
			IsmsStoreOut.ISMS_STORE_OUT,
			IsmsSystemInfo.ISMS_SYSTEM_INFO,
			IsmsSystemProject.ISMS_SYSTEM_PROJECT,
			IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE,
			Kubun.KUBUN,
			License.LICENSE,
			PersonalSkill.PERSONAL_SKILL,
			Post.POST,
			RelateDepartment.RELATE_DEPARTMENT,
			RelateUser.RELATE_USER,
			School.SCHOOL,
			Skill.SKILL,
			SkillKind.SKILL_KIND,
			TopMessage.TOP_MESSAGE,
			UserAuth.USER_AUTH,
			UserInfo.USER_INFO,
			UserInfoAppointment.USER_INFO_APPOINTMENT,
			UserInfoFamily.USER_INFO_FAMILY,
			UserInfoInsurance.USER_INFO_INSURANCE,
			UserInfoRetire.USER_INFO_RETIRE,
			UserInfoView.USER_INFO_VIEW,
			UserInfoWorkplace.USER_INFO_WORKPLACE,
			Workplace.WORKPLACE);
	}
}

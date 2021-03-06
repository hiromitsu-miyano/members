/**
 * This class is generated by jOOQ
 */
package jp.co.kunisys.member.query;


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
import jp.co.kunisys.member.query.tables.UserInfoWorkplace;
import jp.co.kunisys.member.query.tables.Workplace;
import jp.co.kunisys.member.query.tables.records.AccessLogRecord;
import jp.co.kunisys.member.query.tables.records.AdToJapaneseYearRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisBushoRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisCustomerRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisDateRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisDayworkRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisGenkaRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisJobInfoRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisMemberRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisProjectInfoRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisProjectMemberMonthlySummaryRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisProjectMonthlySummaryRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisProjectRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisProjectSummaryRecord;
import jp.co.kunisys.member.query.tables.records.AnalysisUserInfoRecord;
import jp.co.kunisys.member.query.tables.records.AppInfoRecord;
import jp.co.kunisys.member.query.tables.records.AuthAssignRecord;
import jp.co.kunisys.member.query.tables.records.AuthFunctionRecord;
import jp.co.kunisys.member.query.tables.records.AuthRecord;
import jp.co.kunisys.member.query.tables.records.CareerDetailRecord;
import jp.co.kunisys.member.query.tables.records.CareerDetailSkillRecord;
import jp.co.kunisys.member.query.tables.records.CareerRecord;
import jp.co.kunisys.member.query.tables.records.DepartmentRecord;
import jp.co.kunisys.member.query.tables.records.EduBackgroundRecord;
import jp.co.kunisys.member.query.tables.records.GenderRecord;
import jp.co.kunisys.member.query.tables.records.Ipv4AddressManageRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAccessAuthRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAccessAuthServerPathRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAccessAuthUserRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetAssessManagePlanRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetAssessManageRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetAssessManageRiskRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetAssessRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetAssessRiskRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetAssessValueRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetIdRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetManagePlanRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetPatternRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetRiskRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetTypeCategoryRecord;
import jp.co.kunisys.member.query.tables.records.IsmsAssetTypeRecord;
import jp.co.kunisys.member.query.tables.records.IsmsGreaterManagerRecord;
import jp.co.kunisys.member.query.tables.records.IsmsHardwareRecord;
import jp.co.kunisys.member.query.tables.records.IsmsManagePlanRecord;
import jp.co.kunisys.member.query.tables.records.IsmsOutsideDocRecord;
import jp.co.kunisys.member.query.tables.records.IsmsOutsideMediaRecord;
import jp.co.kunisys.member.query.tables.records.IsmsSoftwareRecord;
import jp.co.kunisys.member.query.tables.records.IsmsSoftwareUseRecord;
import jp.co.kunisys.member.query.tables.records.IsmsStoreAssetRecord;
import jp.co.kunisys.member.query.tables.records.IsmsStoreDisposeRecord;
import jp.co.kunisys.member.query.tables.records.IsmsStoreInRecord;
import jp.co.kunisys.member.query.tables.records.IsmsStoreOutRecord;
import jp.co.kunisys.member.query.tables.records.IsmsStoreRecord;
import jp.co.kunisys.member.query.tables.records.IsmsSystemInfoRecord;
import jp.co.kunisys.member.query.tables.records.IsmsSystemProjectRecord;
import jp.co.kunisys.member.query.tables.records.IsmsVirtualMachineRecord;
import jp.co.kunisys.member.query.tables.records.KubunRecord;
import jp.co.kunisys.member.query.tables.records.LicenseRecord;
import jp.co.kunisys.member.query.tables.records.PersonalSkillRecord;
import jp.co.kunisys.member.query.tables.records.PostRecord;
import jp.co.kunisys.member.query.tables.records.RelateDepartmentRecord;
import jp.co.kunisys.member.query.tables.records.RelateUserRecord;
import jp.co.kunisys.member.query.tables.records.SchoolRecord;
import jp.co.kunisys.member.query.tables.records.SkillKindRecord;
import jp.co.kunisys.member.query.tables.records.SkillRecord;
import jp.co.kunisys.member.query.tables.records.TopMessageRecord;
import jp.co.kunisys.member.query.tables.records.UserAuthRecord;
import jp.co.kunisys.member.query.tables.records.UserInfoAppointmentRecord;
import jp.co.kunisys.member.query.tables.records.UserInfoFamilyRecord;
import jp.co.kunisys.member.query.tables.records.UserInfoInsuranceRecord;
import jp.co.kunisys.member.query.tables.records.UserInfoRecord;
import jp.co.kunisys.member.query.tables.records.UserInfoRetireRecord;
import jp.co.kunisys.member.query.tables.records.UserInfoWorkplaceRecord;
import jp.co.kunisys.member.query.tables.records.WorkplaceRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>members</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<AccessLogRecord, Long> IDENTITY_ACCESS_LOG = Identities0.IDENTITY_ACCESS_LOG;
	public static final Identity<AnalysisGenkaRecord, Long> IDENTITY_ANALYSIS_GENKA = Identities0.IDENTITY_ANALYSIS_GENKA;
	public static final Identity<IsmsAssetIdRecord, Long> IDENTITY_ISMS_ASSET_ID = Identities0.IDENTITY_ISMS_ASSET_ID;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<AccessLogRecord> KEY_ACCESS_LOG_PRIMARY = UniqueKeys0.KEY_ACCESS_LOG_PRIMARY;
	public static final UniqueKey<AdToJapaneseYearRecord> KEY_AD_TO_JAPANESE_YEAR_PRIMARY = UniqueKeys0.KEY_AD_TO_JAPANESE_YEAR_PRIMARY;
	public static final UniqueKey<AnalysisBushoRecord> KEY_ANALYSIS_BUSHO_PRIMARY = UniqueKeys0.KEY_ANALYSIS_BUSHO_PRIMARY;
	public static final UniqueKey<AnalysisCustomerRecord> KEY_ANALYSIS_CUSTOMER_PRIMARY = UniqueKeys0.KEY_ANALYSIS_CUSTOMER_PRIMARY;
	public static final UniqueKey<AnalysisDateRecord> KEY_ANALYSIS_DATE_PRIMARY = UniqueKeys0.KEY_ANALYSIS_DATE_PRIMARY;
	public static final UniqueKey<AnalysisDayworkRecord> KEY_ANALYSIS_DAYWORK_PRIMARY = UniqueKeys0.KEY_ANALYSIS_DAYWORK_PRIMARY;
	public static final UniqueKey<AnalysisGenkaRecord> KEY_ANALYSIS_GENKA_PRIMARY = UniqueKeys0.KEY_ANALYSIS_GENKA_PRIMARY;
	public static final UniqueKey<AnalysisJobInfoRecord> KEY_ANALYSIS_JOB_INFO_PRIMARY = UniqueKeys0.KEY_ANALYSIS_JOB_INFO_PRIMARY;
	public static final UniqueKey<AnalysisMemberRecord> KEY_ANALYSIS_MEMBER_PRIMARY = UniqueKeys0.KEY_ANALYSIS_MEMBER_PRIMARY;
	public static final UniqueKey<AnalysisProjectRecord> KEY_ANALYSIS_PROJECT_PRIMARY = UniqueKeys0.KEY_ANALYSIS_PROJECT_PRIMARY;
	public static final UniqueKey<AnalysisProjectInfoRecord> KEY_ANALYSIS_PROJECT_INFO_PRIMARY = UniqueKeys0.KEY_ANALYSIS_PROJECT_INFO_PRIMARY;
	public static final UniqueKey<AnalysisProjectMemberMonthlySummaryRecord> KEY_ANALYSIS_PROJECT_MEMBER_MONTHLY_SUMMARY_PRIMARY = UniqueKeys0.KEY_ANALYSIS_PROJECT_MEMBER_MONTHLY_SUMMARY_PRIMARY;
	public static final UniqueKey<AnalysisProjectMonthlySummaryRecord> KEY_ANALYSIS_PROJECT_MONTHLY_SUMMARY_PRIMARY = UniqueKeys0.KEY_ANALYSIS_PROJECT_MONTHLY_SUMMARY_PRIMARY;
	public static final UniqueKey<AnalysisProjectSummaryRecord> KEY_ANALYSIS_PROJECT_SUMMARY_PRIMARY = UniqueKeys0.KEY_ANALYSIS_PROJECT_SUMMARY_PRIMARY;
	public static final UniqueKey<AnalysisUserInfoRecord> KEY_ANALYSIS_USER_INFO_PRIMARY = UniqueKeys0.KEY_ANALYSIS_USER_INFO_PRIMARY;
	public static final UniqueKey<AppInfoRecord> KEY_APP_INFO_PRIMARY = UniqueKeys0.KEY_APP_INFO_PRIMARY;
	public static final UniqueKey<AuthRecord> KEY_AUTH_PRIMARY = UniqueKeys0.KEY_AUTH_PRIMARY;
	public static final UniqueKey<AuthAssignRecord> KEY_AUTH_ASSIGN_PRIMARY = UniqueKeys0.KEY_AUTH_ASSIGN_PRIMARY;
	public static final UniqueKey<AuthFunctionRecord> KEY_AUTH_FUNCTION_PRIMARY = UniqueKeys0.KEY_AUTH_FUNCTION_PRIMARY;
	public static final UniqueKey<CareerRecord> KEY_CAREER_PRIMARY = UniqueKeys0.KEY_CAREER_PRIMARY;
	public static final UniqueKey<CareerDetailRecord> KEY_CAREER_DETAIL_PRIMARY = UniqueKeys0.KEY_CAREER_DETAIL_PRIMARY;
	public static final UniqueKey<CareerDetailSkillRecord> KEY_CAREER_DETAIL_SKILL_PRIMARY = UniqueKeys0.KEY_CAREER_DETAIL_SKILL_PRIMARY;
	public static final UniqueKey<DepartmentRecord> KEY_DEPARTMENT_PRIMARY = UniqueKeys0.KEY_DEPARTMENT_PRIMARY;
	public static final UniqueKey<EduBackgroundRecord> KEY_EDU_BACKGROUND_PRIMARY = UniqueKeys0.KEY_EDU_BACKGROUND_PRIMARY;
	public static final UniqueKey<GenderRecord> KEY_GENDER_PRIMARY = UniqueKeys0.KEY_GENDER_PRIMARY;
	public static final UniqueKey<Ipv4AddressManageRecord> KEY_IPV4_ADDRESS_MANAGE_PRIMARY = UniqueKeys0.KEY_IPV4_ADDRESS_MANAGE_PRIMARY;
	public static final UniqueKey<IsmsAccessAuthRecord> KEY_ISMS_ACCESS_AUTH_PRIMARY = UniqueKeys0.KEY_ISMS_ACCESS_AUTH_PRIMARY;
	public static final UniqueKey<IsmsAccessAuthServerPathRecord> KEY_ISMS_ACCESS_AUTH_SERVER_PATH_PRIMARY = UniqueKeys0.KEY_ISMS_ACCESS_AUTH_SERVER_PATH_PRIMARY;
	public static final UniqueKey<IsmsAccessAuthUserRecord> KEY_ISMS_ACCESS_AUTH_USER_PRIMARY = UniqueKeys0.KEY_ISMS_ACCESS_AUTH_USER_PRIMARY;
	public static final UniqueKey<IsmsAssetRecord> KEY_ISMS_ASSET_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_PRIMARY;
	public static final UniqueKey<IsmsAssetAssessRecord> KEY_ISMS_ASSET_ASSESS_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_ASSESS_PRIMARY;
	public static final UniqueKey<IsmsAssetAssessManageRecord> KEY_ISMS_ASSET_ASSESS_MANAGE_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_ASSESS_MANAGE_PRIMARY;
	public static final UniqueKey<IsmsAssetAssessManagePlanRecord> KEY_ISMS_ASSET_ASSESS_MANAGE_PLAN_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_ASSESS_MANAGE_PLAN_PRIMARY;
	public static final UniqueKey<IsmsAssetAssessManageRiskRecord> KEY_ISMS_ASSET_ASSESS_MANAGE_RISK_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_ASSESS_MANAGE_RISK_PRIMARY;
	public static final UniqueKey<IsmsAssetAssessRiskRecord> KEY_ISMS_ASSET_ASSESS_RISK_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_ASSESS_RISK_PRIMARY;
	public static final UniqueKey<IsmsAssetAssessValueRecord> KEY_ISMS_ASSET_ASSESS_VALUE_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_ASSESS_VALUE_PRIMARY;
	public static final UniqueKey<IsmsAssetIdRecord> KEY_ISMS_ASSET_ID_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_ID_PRIMARY;
	public static final UniqueKey<IsmsAssetManagePlanRecord> KEY_ISMS_ASSET_MANAGE_PLAN_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_MANAGE_PLAN_PRIMARY;
	public static final UniqueKey<IsmsAssetPatternRecord> KEY_ISMS_ASSET_PATTERN_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_PATTERN_PRIMARY;
	public static final UniqueKey<IsmsAssetRiskRecord> KEY_ISMS_ASSET_RISK_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_RISK_PRIMARY;
	public static final UniqueKey<IsmsAssetTypeRecord> KEY_ISMS_ASSET_TYPE_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_TYPE_PRIMARY;
	public static final UniqueKey<IsmsAssetTypeCategoryRecord> KEY_ISMS_ASSET_TYPE_CATEGORY_PRIMARY = UniqueKeys0.KEY_ISMS_ASSET_TYPE_CATEGORY_PRIMARY;
	public static final UniqueKey<IsmsGreaterManagerRecord> KEY_ISMS_GREATER_MANAGER_PRIMARY = UniqueKeys0.KEY_ISMS_GREATER_MANAGER_PRIMARY;
	public static final UniqueKey<IsmsHardwareRecord> KEY_ISMS_HARDWARE_PRIMARY = UniqueKeys0.KEY_ISMS_HARDWARE_PRIMARY;
	public static final UniqueKey<IsmsManagePlanRecord> KEY_ISMS_MANAGE_PLAN_PRIMARY = UniqueKeys0.KEY_ISMS_MANAGE_PLAN_PRIMARY;
	public static final UniqueKey<IsmsOutsideDocRecord> KEY_ISMS_OUTSIDE_DOC_PRIMARY = UniqueKeys0.KEY_ISMS_OUTSIDE_DOC_PRIMARY;
	public static final UniqueKey<IsmsOutsideMediaRecord> KEY_ISMS_OUTSIDE_MEDIA_PRIMARY = UniqueKeys0.KEY_ISMS_OUTSIDE_MEDIA_PRIMARY;
	public static final UniqueKey<IsmsSoftwareRecord> KEY_ISMS_SOFTWARE_PRIMARY = UniqueKeys0.KEY_ISMS_SOFTWARE_PRIMARY;
	public static final UniqueKey<IsmsSoftwareUseRecord> KEY_ISMS_SOFTWARE_USE_PRIMARY = UniqueKeys0.KEY_ISMS_SOFTWARE_USE_PRIMARY;
	public static final UniqueKey<IsmsStoreRecord> KEY_ISMS_STORE_PRIMARY = UniqueKeys0.KEY_ISMS_STORE_PRIMARY;
	public static final UniqueKey<IsmsStoreAssetRecord> KEY_ISMS_STORE_ASSET_PRIMARY = UniqueKeys0.KEY_ISMS_STORE_ASSET_PRIMARY;
	public static final UniqueKey<IsmsStoreDisposeRecord> KEY_ISMS_STORE_DISPOSE_PRIMARY = UniqueKeys0.KEY_ISMS_STORE_DISPOSE_PRIMARY;
	public static final UniqueKey<IsmsStoreInRecord> KEY_ISMS_STORE_IN_PRIMARY = UniqueKeys0.KEY_ISMS_STORE_IN_PRIMARY;
	public static final UniqueKey<IsmsStoreOutRecord> KEY_ISMS_STORE_OUT_PRIMARY = UniqueKeys0.KEY_ISMS_STORE_OUT_PRIMARY;
	public static final UniqueKey<IsmsSystemInfoRecord> KEY_ISMS_SYSTEM_INFO_PRIMARY = UniqueKeys0.KEY_ISMS_SYSTEM_INFO_PRIMARY;
	public static final UniqueKey<IsmsSystemProjectRecord> KEY_ISMS_SYSTEM_PROJECT_PRIMARY = UniqueKeys0.KEY_ISMS_SYSTEM_PROJECT_PRIMARY;
	public static final UniqueKey<IsmsVirtualMachineRecord> KEY_ISMS_VIRTUAL_MACHINE_PRIMARY = UniqueKeys0.KEY_ISMS_VIRTUAL_MACHINE_PRIMARY;
	public static final UniqueKey<KubunRecord> KEY_KUBUN_PRIMARY = UniqueKeys0.KEY_KUBUN_PRIMARY;
	public static final UniqueKey<LicenseRecord> KEY_LICENSE_PRIMARY = UniqueKeys0.KEY_LICENSE_PRIMARY;
	public static final UniqueKey<PersonalSkillRecord> KEY_PERSONAL_SKILL_PRIMARY = UniqueKeys0.KEY_PERSONAL_SKILL_PRIMARY;
	public static final UniqueKey<PostRecord> KEY_POST_PRIMARY = UniqueKeys0.KEY_POST_PRIMARY;
	public static final UniqueKey<RelateDepartmentRecord> KEY_RELATE_DEPARTMENT_PRIMARY = UniqueKeys0.KEY_RELATE_DEPARTMENT_PRIMARY;
	public static final UniqueKey<RelateUserRecord> KEY_RELATE_USER_PRIMARY = UniqueKeys0.KEY_RELATE_USER_PRIMARY;
	public static final UniqueKey<SchoolRecord> KEY_SCHOOL_PRIMARY = UniqueKeys0.KEY_SCHOOL_PRIMARY;
	public static final UniqueKey<SkillRecord> KEY_SKILL_PRIMARY = UniqueKeys0.KEY_SKILL_PRIMARY;
	public static final UniqueKey<SkillKindRecord> KEY_SKILL_KIND_PRIMARY = UniqueKeys0.KEY_SKILL_KIND_PRIMARY;
	public static final UniqueKey<TopMessageRecord> KEY_TOP_MESSAGE_PRIMARY = UniqueKeys0.KEY_TOP_MESSAGE_PRIMARY;
	public static final UniqueKey<UserAuthRecord> KEY_USER_AUTH_PRIMARY = UniqueKeys0.KEY_USER_AUTH_PRIMARY;
	public static final UniqueKey<UserInfoRecord> KEY_USER_INFO_PRIMARY = UniqueKeys0.KEY_USER_INFO_PRIMARY;
	public static final UniqueKey<UserInfoRecord> KEY_USER_INFO_IDX_U = UniqueKeys0.KEY_USER_INFO_IDX_U;
	public static final UniqueKey<UserInfoAppointmentRecord> KEY_USER_INFO_APPOINTMENT_PRIMARY = UniqueKeys0.KEY_USER_INFO_APPOINTMENT_PRIMARY;
	public static final UniqueKey<UserInfoFamilyRecord> KEY_USER_INFO_FAMILY_PRIMARY = UniqueKeys0.KEY_USER_INFO_FAMILY_PRIMARY;
	public static final UniqueKey<UserInfoInsuranceRecord> KEY_USER_INFO_INSURANCE_PRIMARY = UniqueKeys0.KEY_USER_INFO_INSURANCE_PRIMARY;
	public static final UniqueKey<UserInfoRetireRecord> KEY_USER_INFO_RETIRE_PRIMARY = UniqueKeys0.KEY_USER_INFO_RETIRE_PRIMARY;
	public static final UniqueKey<UserInfoWorkplaceRecord> KEY_USER_INFO_WORKPLACE_PRIMARY = UniqueKeys0.KEY_USER_INFO_WORKPLACE_PRIMARY;
	public static final UniqueKey<WorkplaceRecord> KEY_WORKPLACE_PRIMARY = UniqueKeys0.KEY_WORKPLACE_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<AccessLogRecord, Long> IDENTITY_ACCESS_LOG = createIdentity(AccessLog.ACCESS_LOG, AccessLog.ACCESS_LOG.ID);
		public static Identity<AnalysisGenkaRecord, Long> IDENTITY_ANALYSIS_GENKA = createIdentity(AnalysisGenka.ANALYSIS_GENKA, AnalysisGenka.ANALYSIS_GENKA.ID);
		public static Identity<IsmsAssetIdRecord, Long> IDENTITY_ISMS_ASSET_ID = createIdentity(IsmsAssetId.ISMS_ASSET_ID, IsmsAssetId.ISMS_ASSET_ID.ASSET_ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<AccessLogRecord> KEY_ACCESS_LOG_PRIMARY = createUniqueKey(AccessLog.ACCESS_LOG, AccessLog.ACCESS_LOG.ID);
		public static final UniqueKey<AdToJapaneseYearRecord> KEY_AD_TO_JAPANESE_YEAR_PRIMARY = createUniqueKey(AdToJapaneseYear.AD_TO_JAPANESE_YEAR, AdToJapaneseYear.AD_TO_JAPANESE_YEAR.AD);
		public static final UniqueKey<AnalysisBushoRecord> KEY_ANALYSIS_BUSHO_PRIMARY = createUniqueKey(AnalysisBusho.ANALYSIS_BUSHO, AnalysisBusho.ANALYSIS_BUSHO.BUSHO_CODE);
		public static final UniqueKey<AnalysisCustomerRecord> KEY_ANALYSIS_CUSTOMER_PRIMARY = createUniqueKey(AnalysisCustomer.ANALYSIS_CUSTOMER, AnalysisCustomer.ANALYSIS_CUSTOMER.CUSTOMER_CODE);
		public static final UniqueKey<AnalysisDateRecord> KEY_ANALYSIS_DATE_PRIMARY = createUniqueKey(AnalysisDate.ANALYSIS_DATE, AnalysisDate.ANALYSIS_DATE.ANALYSIS_DATE_);
		public static final UniqueKey<AnalysisDayworkRecord> KEY_ANALYSIS_DAYWORK_PRIMARY = createUniqueKey(AnalysisDaywork.ANALYSIS_DAYWORK, AnalysisDaywork.ANALYSIS_DAYWORK.WORK_DATE, AnalysisDaywork.ANALYSIS_DAYWORK.MEMBER_CODE, AnalysisDaywork.ANALYSIS_DAYWORK.PROJECT_CODE);
		public static final UniqueKey<AnalysisGenkaRecord> KEY_ANALYSIS_GENKA_PRIMARY = createUniqueKey(AnalysisGenka.ANALYSIS_GENKA, AnalysisGenka.ANALYSIS_GENKA.ID);
		public static final UniqueKey<AnalysisJobInfoRecord> KEY_ANALYSIS_JOB_INFO_PRIMARY = createUniqueKey(AnalysisJobInfo.ANALYSIS_JOB_INFO, AnalysisJobInfo.ANALYSIS_JOB_INFO.ID);
		public static final UniqueKey<AnalysisMemberRecord> KEY_ANALYSIS_MEMBER_PRIMARY = createUniqueKey(AnalysisMember.ANALYSIS_MEMBER, AnalysisMember.ANALYSIS_MEMBER.MEMBER_CODE);
		public static final UniqueKey<AnalysisProjectRecord> KEY_ANALYSIS_PROJECT_PRIMARY = createUniqueKey(AnalysisProject.ANALYSIS_PROJECT, AnalysisProject.ANALYSIS_PROJECT.PROJECT_CODE);
		public static final UniqueKey<AnalysisProjectInfoRecord> KEY_ANALYSIS_PROJECT_INFO_PRIMARY = createUniqueKey(AnalysisProjectInfo.ANALYSIS_PROJECT_INFO, AnalysisProjectInfo.ANALYSIS_PROJECT_INFO.PROJECT_CODE);
		public static final UniqueKey<AnalysisProjectMemberMonthlySummaryRecord> KEY_ANALYSIS_PROJECT_MEMBER_MONTHLY_SUMMARY_PRIMARY = createUniqueKey(AnalysisProjectMemberMonthlySummary.ANALYSIS_PROJECT_MEMBER_MONTHLY_SUMMARY, AnalysisProjectMemberMonthlySummary.ANALYSIS_PROJECT_MEMBER_MONTHLY_SUMMARY.PROJECT_CODE, AnalysisProjectMemberMonthlySummary.ANALYSIS_PROJECT_MEMBER_MONTHLY_SUMMARY.MEMBER_CODE, AnalysisProjectMemberMonthlySummary.ANALYSIS_PROJECT_MEMBER_MONTHLY_SUMMARY.NENDO, AnalysisProjectMemberMonthlySummary.ANALYSIS_PROJECT_MEMBER_MONTHLY_SUMMARY.MONTH_NO);
		public static final UniqueKey<AnalysisProjectMonthlySummaryRecord> KEY_ANALYSIS_PROJECT_MONTHLY_SUMMARY_PRIMARY = createUniqueKey(AnalysisProjectMonthlySummary.ANALYSIS_PROJECT_MONTHLY_SUMMARY, AnalysisProjectMonthlySummary.ANALYSIS_PROJECT_MONTHLY_SUMMARY.PROJECT_CODE, AnalysisProjectMonthlySummary.ANALYSIS_PROJECT_MONTHLY_SUMMARY.NENDO, AnalysisProjectMonthlySummary.ANALYSIS_PROJECT_MONTHLY_SUMMARY.MONTH_NO);
		public static final UniqueKey<AnalysisProjectSummaryRecord> KEY_ANALYSIS_PROJECT_SUMMARY_PRIMARY = createUniqueKey(AnalysisProjectSummary.ANALYSIS_PROJECT_SUMMARY, AnalysisProjectSummary.ANALYSIS_PROJECT_SUMMARY.PROJECT_CODE);
		public static final UniqueKey<AnalysisUserInfoRecord> KEY_ANALYSIS_USER_INFO_PRIMARY = createUniqueKey(AnalysisUserInfo.ANALYSIS_USER_INFO, AnalysisUserInfo.ANALYSIS_USER_INFO.USER_ID);
		public static final UniqueKey<AppInfoRecord> KEY_APP_INFO_PRIMARY = createUniqueKey(AppInfo.APP_INFO, AppInfo.APP_INFO.APP_KEY);
		public static final UniqueKey<AuthRecord> KEY_AUTH_PRIMARY = createUniqueKey(Auth.AUTH, Auth.AUTH.AUTH_CD);
		public static final UniqueKey<AuthAssignRecord> KEY_AUTH_ASSIGN_PRIMARY = createUniqueKey(AuthAssign.AUTH_ASSIGN, AuthAssign.AUTH_ASSIGN.AUTH_CD, AuthAssign.AUTH_ASSIGN.AUTH_FUNCTION_CD);
		public static final UniqueKey<AuthFunctionRecord> KEY_AUTH_FUNCTION_PRIMARY = createUniqueKey(AuthFunction.AUTH_FUNCTION, AuthFunction.AUTH_FUNCTION.AUTH_FUNCTION_CD);
		public static final UniqueKey<CareerRecord> KEY_CAREER_PRIMARY = createUniqueKey(Career.CAREER, Career.CAREER.USER_ID);
		public static final UniqueKey<CareerDetailRecord> KEY_CAREER_DETAIL_PRIMARY = createUniqueKey(CareerDetail.CAREER_DETAIL, CareerDetail.CAREER_DETAIL.USER_ID, CareerDetail.CAREER_DETAIL.JOB_NO);
		public static final UniqueKey<CareerDetailSkillRecord> KEY_CAREER_DETAIL_SKILL_PRIMARY = createUniqueKey(CareerDetailSkill.CAREER_DETAIL_SKILL, CareerDetailSkill.CAREER_DETAIL_SKILL.USER_ID, CareerDetailSkill.CAREER_DETAIL_SKILL.JOB_NO, CareerDetailSkill.CAREER_DETAIL_SKILL.SKILL_TYPE_NO, CareerDetailSkill.CAREER_DETAIL_SKILL.NO);
		public static final UniqueKey<DepartmentRecord> KEY_DEPARTMENT_PRIMARY = createUniqueKey(Department.DEPARTMENT, Department.DEPARTMENT.DEPT_CD);
		public static final UniqueKey<EduBackgroundRecord> KEY_EDU_BACKGROUND_PRIMARY = createUniqueKey(EduBackground.EDU_BACKGROUND, EduBackground.EDU_BACKGROUND.USER_ID, EduBackground.EDU_BACKGROUND.NO);
		public static final UniqueKey<GenderRecord> KEY_GENDER_PRIMARY = createUniqueKey(Gender.GENDER, Gender.GENDER.GENDER_CD);
		public static final UniqueKey<Ipv4AddressManageRecord> KEY_IPV4_ADDRESS_MANAGE_PRIMARY = createUniqueKey(Ipv4AddressManage.IPV4_ADDRESS_MANAGE, Ipv4AddressManage.IPV4_ADDRESS_MANAGE.IP_ADDRESS1, Ipv4AddressManage.IPV4_ADDRESS_MANAGE.IP_ADDRESS2, Ipv4AddressManage.IPV4_ADDRESS_MANAGE.IP_ADDRESS3, Ipv4AddressManage.IPV4_ADDRESS_MANAGE.IP_ADDRESS4);
		public static final UniqueKey<IsmsAccessAuthRecord> KEY_ISMS_ACCESS_AUTH_PRIMARY = createUniqueKey(IsmsAccessAuth.ISMS_ACCESS_AUTH, IsmsAccessAuth.ISMS_ACCESS_AUTH.ACCESS_AUTH_ID);
		public static final UniqueKey<IsmsAccessAuthServerPathRecord> KEY_ISMS_ACCESS_AUTH_SERVER_PATH_PRIMARY = createUniqueKey(IsmsAccessAuthServerPath.ISMS_ACCESS_AUTH_SERVER_PATH, IsmsAccessAuthServerPath.ISMS_ACCESS_AUTH_SERVER_PATH.FOLDER_ID);
		public static final UniqueKey<IsmsAccessAuthUserRecord> KEY_ISMS_ACCESS_AUTH_USER_PRIMARY = createUniqueKey(IsmsAccessAuthUser.ISMS_ACCESS_AUTH_USER, IsmsAccessAuthUser.ISMS_ACCESS_AUTH_USER.FOLDER_ID, IsmsAccessAuthUser.ISMS_ACCESS_AUTH_USER.AUTH_TYPE);
		public static final UniqueKey<IsmsAssetRecord> KEY_ISMS_ASSET_PRIMARY = createUniqueKey(IsmsAsset.ISMS_ASSET, IsmsAsset.ISMS_ASSET.ASSET_ID);
		public static final UniqueKey<IsmsAssetAssessRecord> KEY_ISMS_ASSET_ASSESS_PRIMARY = createUniqueKey(IsmsAssetAssess.ISMS_ASSET_ASSESS, IsmsAssetAssess.ISMS_ASSET_ASSESS.LIMIT_DATE, IsmsAssetAssess.ISMS_ASSET_ASSESS.ASSET_ID);
		public static final UniqueKey<IsmsAssetAssessManageRecord> KEY_ISMS_ASSET_ASSESS_MANAGE_PRIMARY = createUniqueKey(IsmsAssetAssessManage.ISMS_ASSET_ASSESS_MANAGE, IsmsAssetAssessManage.ISMS_ASSET_ASSESS_MANAGE.LIMIT_DATE);
		public static final UniqueKey<IsmsAssetAssessManagePlanRecord> KEY_ISMS_ASSET_ASSESS_MANAGE_PLAN_PRIMARY = createUniqueKey(IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN, IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN.LIMIT_DATE, IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN.ASSET_ID, IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN.THREAT_WEAK_ID, IsmsAssetAssessManagePlan.ISMS_ASSET_ASSESS_MANAGE_PLAN.ASSET_MANAGE_PLAN_ID);
		public static final UniqueKey<IsmsAssetAssessManageRiskRecord> KEY_ISMS_ASSET_ASSESS_MANAGE_RISK_PRIMARY = createUniqueKey(IsmsAssetAssessManageRisk.ISMS_ASSET_ASSESS_MANAGE_RISK, IsmsAssetAssessManageRisk.ISMS_ASSET_ASSESS_MANAGE_RISK.LIMIT_DATE, IsmsAssetAssessManageRisk.ISMS_ASSET_ASSESS_MANAGE_RISK.ASSET_ID, IsmsAssetAssessManageRisk.ISMS_ASSET_ASSESS_MANAGE_RISK.THREAT_WEAK_ID);
		public static final UniqueKey<IsmsAssetAssessRiskRecord> KEY_ISMS_ASSET_ASSESS_RISK_PRIMARY = createUniqueKey(IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK, IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.LIMIT_DATE, IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.ASSET_ID, IsmsAssetAssessRisk.ISMS_ASSET_ASSESS_RISK.THREAT_WEAK_ID);
		public static final UniqueKey<IsmsAssetAssessValueRecord> KEY_ISMS_ASSET_ASSESS_VALUE_PRIMARY = createUniqueKey(IsmsAssetAssessValue.ISMS_ASSET_ASSESS_VALUE, IsmsAssetAssessValue.ISMS_ASSET_ASSESS_VALUE.LIMIT_DATE, IsmsAssetAssessValue.ISMS_ASSET_ASSESS_VALUE.ASSET_ID);
		public static final UniqueKey<IsmsAssetIdRecord> KEY_ISMS_ASSET_ID_PRIMARY = createUniqueKey(IsmsAssetId.ISMS_ASSET_ID, IsmsAssetId.ISMS_ASSET_ID.ASSET_ID);
		public static final UniqueKey<IsmsAssetManagePlanRecord> KEY_ISMS_ASSET_MANAGE_PLAN_PRIMARY = createUniqueKey(IsmsAssetManagePlan.ISMS_ASSET_MANAGE_PLAN, IsmsAssetManagePlan.ISMS_ASSET_MANAGE_PLAN.ASSET_TYPE_CATEGORY_ID, IsmsAssetManagePlan.ISMS_ASSET_MANAGE_PLAN.THREAT_WEAK_ID, IsmsAssetManagePlan.ISMS_ASSET_MANAGE_PLAN.MANAGE_PLAN_ID);
		public static final UniqueKey<IsmsAssetPatternRecord> KEY_ISMS_ASSET_PATTERN_PRIMARY = createUniqueKey(IsmsAssetPattern.ISMS_ASSET_PATTERN, IsmsAssetPattern.ISMS_ASSET_PATTERN.PATTERN_ID);
		public static final UniqueKey<IsmsAssetRiskRecord> KEY_ISMS_ASSET_RISK_PRIMARY = createUniqueKey(IsmsAssetRisk.ISMS_ASSET_RISK, IsmsAssetRisk.ISMS_ASSET_RISK.ASSET_TYPE_CATEGORY_ID, IsmsAssetRisk.ISMS_ASSET_RISK.THREAT_WEAK_ID);
		public static final UniqueKey<IsmsAssetTypeRecord> KEY_ISMS_ASSET_TYPE_PRIMARY = createUniqueKey(IsmsAssetType.ISMS_ASSET_TYPE, IsmsAssetType.ISMS_ASSET_TYPE.ASSET_TYPE_ID);
		public static final UniqueKey<IsmsAssetTypeCategoryRecord> KEY_ISMS_ASSET_TYPE_CATEGORY_PRIMARY = createUniqueKey(IsmsAssetTypeCategory.ISMS_ASSET_TYPE_CATEGORY, IsmsAssetTypeCategory.ISMS_ASSET_TYPE_CATEGORY.ASSET_TYPE_CATEGORY_ID);
		public static final UniqueKey<IsmsGreaterManagerRecord> KEY_ISMS_GREATER_MANAGER_PRIMARY = createUniqueKey(IsmsGreaterManager.ISMS_GREATER_MANAGER, IsmsGreaterManager.ISMS_GREATER_MANAGER.GREATER_MANAGER_ID);
		public static final UniqueKey<IsmsHardwareRecord> KEY_ISMS_HARDWARE_PRIMARY = createUniqueKey(IsmsHardware.ISMS_HARDWARE, IsmsHardware.ISMS_HARDWARE.ASSET_ID);
		public static final UniqueKey<IsmsManagePlanRecord> KEY_ISMS_MANAGE_PLAN_PRIMARY = createUniqueKey(IsmsManagePlan.ISMS_MANAGE_PLAN, IsmsManagePlan.ISMS_MANAGE_PLAN.MANAGE_PLAN_ID);
		public static final UniqueKey<IsmsOutsideDocRecord> KEY_ISMS_OUTSIDE_DOC_PRIMARY = createUniqueKey(IsmsOutsideDoc.ISMS_OUTSIDE_DOC, IsmsOutsideDoc.ISMS_OUTSIDE_DOC.ASSET_ID, IsmsOutsideDoc.ISMS_OUTSIDE_DOC.OUTSIDE_DOC_ID);
		public static final UniqueKey<IsmsOutsideMediaRecord> KEY_ISMS_OUTSIDE_MEDIA_PRIMARY = createUniqueKey(IsmsOutsideMedia.ISMS_OUTSIDE_MEDIA, IsmsOutsideMedia.ISMS_OUTSIDE_MEDIA.ASSET_ID, IsmsOutsideMedia.ISMS_OUTSIDE_MEDIA.OUTSIDE_MEDIA_ID);
		public static final UniqueKey<IsmsSoftwareRecord> KEY_ISMS_SOFTWARE_PRIMARY = createUniqueKey(IsmsSoftware.ISMS_SOFTWARE, IsmsSoftware.ISMS_SOFTWARE.ASSET_ID);
		public static final UniqueKey<IsmsSoftwareUseRecord> KEY_ISMS_SOFTWARE_USE_PRIMARY = createUniqueKey(IsmsSoftwareUse.ISMS_SOFTWARE_USE, IsmsSoftwareUse.ISMS_SOFTWARE_USE.SOFTWARE_ASSET_ID, IsmsSoftwareUse.ISMS_SOFTWARE_USE.HARDWARE_ASSET_ID);
		public static final UniqueKey<IsmsStoreRecord> KEY_ISMS_STORE_PRIMARY = createUniqueKey(IsmsStore.ISMS_STORE, IsmsStore.ISMS_STORE.ASSET_ID);
		public static final UniqueKey<IsmsStoreAssetRecord> KEY_ISMS_STORE_ASSET_PRIMARY = createUniqueKey(IsmsStoreAsset.ISMS_STORE_ASSET, IsmsStoreAsset.ISMS_STORE_ASSET.ASSET_ID);
		public static final UniqueKey<IsmsStoreDisposeRecord> KEY_ISMS_STORE_DISPOSE_PRIMARY = createUniqueKey(IsmsStoreDispose.ISMS_STORE_DISPOSE, IsmsStoreDispose.ISMS_STORE_DISPOSE.ASSET_ID, IsmsStoreDispose.ISMS_STORE_DISPOSE.STORE_DISPOSE_NO);
		public static final UniqueKey<IsmsStoreInRecord> KEY_ISMS_STORE_IN_PRIMARY = createUniqueKey(IsmsStoreIn.ISMS_STORE_IN, IsmsStoreIn.ISMS_STORE_IN.ASSET_ID, IsmsStoreIn.ISMS_STORE_IN.STORE_IN_NO);
		public static final UniqueKey<IsmsStoreOutRecord> KEY_ISMS_STORE_OUT_PRIMARY = createUniqueKey(IsmsStoreOut.ISMS_STORE_OUT, IsmsStoreOut.ISMS_STORE_OUT.ASSET_ID, IsmsStoreOut.ISMS_STORE_OUT.STORE_OUT_NO);
		public static final UniqueKey<IsmsSystemInfoRecord> KEY_ISMS_SYSTEM_INFO_PRIMARY = createUniqueKey(IsmsSystemInfo.ISMS_SYSTEM_INFO, IsmsSystemInfo.ISMS_SYSTEM_INFO.ASSET_ID);
		public static final UniqueKey<IsmsSystemProjectRecord> KEY_ISMS_SYSTEM_PROJECT_PRIMARY = createUniqueKey(IsmsSystemProject.ISMS_SYSTEM_PROJECT, IsmsSystemProject.ISMS_SYSTEM_PROJECT.ASSET_ID, IsmsSystemProject.ISMS_SYSTEM_PROJECT.PROJECT_CODE);
		public static final UniqueKey<IsmsVirtualMachineRecord> KEY_ISMS_VIRTUAL_MACHINE_PRIMARY = createUniqueKey(IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE, IsmsVirtualMachine.ISMS_VIRTUAL_MACHINE.ASSET_ID);
		public static final UniqueKey<KubunRecord> KEY_KUBUN_PRIMARY = createUniqueKey(Kubun.KUBUN, Kubun.KUBUN.SEQ);
		public static final UniqueKey<LicenseRecord> KEY_LICENSE_PRIMARY = createUniqueKey(License.LICENSE, License.LICENSE.USER_ID, License.LICENSE.NO);
		public static final UniqueKey<PersonalSkillRecord> KEY_PERSONAL_SKILL_PRIMARY = createUniqueKey(PersonalSkill.PERSONAL_SKILL, PersonalSkill.PERSONAL_SKILL.USER_ID, PersonalSkill.PERSONAL_SKILL.SKILL_TYPE_NO, PersonalSkill.PERSONAL_SKILL.SKILL_NO);
		public static final UniqueKey<PostRecord> KEY_POST_PRIMARY = createUniqueKey(Post.POST, Post.POST.POST_CD);
		public static final UniqueKey<RelateDepartmentRecord> KEY_RELATE_DEPARTMENT_PRIMARY = createUniqueKey(RelateDepartment.RELATE_DEPARTMENT, RelateDepartment.RELATE_DEPARTMENT.ID);
		public static final UniqueKey<RelateUserRecord> KEY_RELATE_USER_PRIMARY = createUniqueKey(RelateUser.RELATE_USER, RelateUser.RELATE_USER.ID);
		public static final UniqueKey<SchoolRecord> KEY_SCHOOL_PRIMARY = createUniqueKey(School.SCHOOL, School.SCHOOL.SCHOOL_ID);
		public static final UniqueKey<SkillRecord> KEY_SKILL_PRIMARY = createUniqueKey(Skill.SKILL, Skill.SKILL.SKILL_NO);
		public static final UniqueKey<SkillKindRecord> KEY_SKILL_KIND_PRIMARY = createUniqueKey(SkillKind.SKILL_KIND, SkillKind.SKILL_KIND.SKILL_TYPE_NO);
		public static final UniqueKey<TopMessageRecord> KEY_TOP_MESSAGE_PRIMARY = createUniqueKey(TopMessage.TOP_MESSAGE, TopMessage.TOP_MESSAGE.MESSAGE_ID);
		public static final UniqueKey<UserAuthRecord> KEY_USER_AUTH_PRIMARY = createUniqueKey(UserAuth.USER_AUTH, UserAuth.USER_AUTH.USER_ID);
		public static final UniqueKey<UserInfoRecord> KEY_USER_INFO_PRIMARY = createUniqueKey(UserInfo.USER_INFO, UserInfo.USER_INFO.USER_ID);
		public static final UniqueKey<UserInfoRecord> KEY_USER_INFO_IDX_U = createUniqueKey(UserInfo.USER_INFO, UserInfo.USER_INFO.ACCOUNT);
		public static final UniqueKey<UserInfoAppointmentRecord> KEY_USER_INFO_APPOINTMENT_PRIMARY = createUniqueKey(UserInfoAppointment.USER_INFO_APPOINTMENT, UserInfoAppointment.USER_INFO_APPOINTMENT.USER_ID, UserInfoAppointment.USER_INFO_APPOINTMENT.NO);
		public static final UniqueKey<UserInfoFamilyRecord> KEY_USER_INFO_FAMILY_PRIMARY = createUniqueKey(UserInfoFamily.USER_INFO_FAMILY, UserInfoFamily.USER_INFO_FAMILY.USER_ID, UserInfoFamily.USER_INFO_FAMILY.NO);
		public static final UniqueKey<UserInfoInsuranceRecord> KEY_USER_INFO_INSURANCE_PRIMARY = createUniqueKey(UserInfoInsurance.USER_INFO_INSURANCE, UserInfoInsurance.USER_INFO_INSURANCE.USER_ID);
		public static final UniqueKey<UserInfoRetireRecord> KEY_USER_INFO_RETIRE_PRIMARY = createUniqueKey(UserInfoRetire.USER_INFO_RETIRE, UserInfoRetire.USER_INFO_RETIRE.USER_ID);
		public static final UniqueKey<UserInfoWorkplaceRecord> KEY_USER_INFO_WORKPLACE_PRIMARY = createUniqueKey(UserInfoWorkplace.USER_INFO_WORKPLACE, UserInfoWorkplace.USER_INFO_WORKPLACE.USER_ID, UserInfoWorkplace.USER_INFO_WORKPLACE.WORKPLACE_ID);
		public static final UniqueKey<WorkplaceRecord> KEY_WORKPLACE_PRIMARY = createUniqueKey(Workplace.WORKPLACE, Workplace.WORKPLACE.WORKPLACE_ID);
	}
}

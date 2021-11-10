package Configurations;

public class ObjectLocators {
	
	public static final String userName= "email";
	public static final String password= "password";
	public static final String loginBtn= "//*[@class= 'btn btn-primary form-control']";
	public static final String configuration= "//*[@id='masters']";
	public static final String role= "(//*[@class='read-more'])[1]";
	public static final String newRole= "//*[@class='dropdown-toggle btn btn-primary btn-sm']";
	public static final String roleName= "//*[@id='addModal']/div/div/form/div[2]/div/input";
	public static final String saveRolebtn= "//*[@value='save']";
	public static final String searchtxt ="//*[@name='keyword']";
	public static final String searchbtn="//*[@class='btn btn-xs searchbtn']";
	public static final String searchResetbtn ="//*[@class='btn btn-xs resetbtn']";

	public static final String customer= "(//*[@class='read-more'])[3]";
	public static final String newCustomer= "//*[@class='dropdown-toggle btn btn-primary btn-sm']";
	public static final String customerName= "(//*[@name='customerName'])[2]";
	public static final String location= "(//*[@name='location'])[2]";
	public static final String region= "(//*[@name='region'])[2]";
	public static final String saveCustomerbtn= "//*[@value='save']";
	public static final String editCustomer= "//*[@class='dropdown-toggle btn btn-tbl-edit btn-xs']";
	public static final String updatecustomerName= "(//*[@name='customerName'])[1]";
	public static final String updatecustomerbtn ="//*[@class='btn btn-circle btn-primary']";

	//bu
	

	public static final String bu= "(//*[@class='read-more'])[2]";
	public static final String newBu= "(//*[@class='dropdown-toggle btn btn-primary btn-sm'])[1]";
	public static final String buName= "(//*[@name='businessUnitName'])[2]";
	public static final String savebubtn= "//*[@value='save']";
	public static final String editBu= "//*[@class='dropdown-toggle btn btn-tbl-edit btn-xs']";
	public static final String updateBuName= "(//*[@name='businessUnitName'])[1]";
	public static final String updatebubtn ="//*[@class='btn btn-circle btn-primary']";
//project
	public static final String project= "(//*[@class='read-more'])[4]";
	public static final String newproject= "//*[@class='dropdown-toggle btn btn-primary btn-sm']";
	public static final String projectname= "//*[@id='addModal']/div/div/form/div[2]/div[1]/input";
	public static final String projectcustomername= "//*[@id='addModal']/div/div/form/div[2]/div[3]/select";
	public static final String projectbu= "//*[@id='addModal']/div/div/form/div[2]/div[2]/select";
	public static final String saveproject= "//*[@value='Save']";
//recruitmentrole
	public static final String recruitmentrole= "(//*[@class='read-more'])[7]";
	public static final String newrecruitmentrole= "//*[@class='dropdown-toggle btn btn-primary btn-sm']";
	public static final String recruitmentrolename= "//*[@id='addModal']/div/div/form/div[2]/div/input";
	public static final String saverecruitmentrole= "//*[@value='save']";
//interviewpanel
	public static final String interviewpanel= "(//*[@class='read-more'])[6]";
	public static final String interviewpaneldrop="(//*[@type='text'])[1]";
	public static final String interviewpaneledit= "(//*[@class='fa fa-pencil'])[1]";
	public static final String selectinterviewer= "(//*[@type='checkbox'])[1]";
	public static final String saveinterviewer= "//*[@value='save']";
	
	public static final String customerRecruitmentRoleBtn= "(//*[@class='read-more'])[8]";
	public static final String customerRecruitmentRoledrop="(//*[@type='text'])[1]";
	public static final String customerRecruitmentRoledit= "(//*[@title='Edit'])[1]";
	public static final String RecruitmentRole= "(//*[@type='checkbox'])[1]";
	public static final String savecustomerRecruitmentRole= "//*[@value='save']";
	
	public static final String emailconfiguration= "(//*[@class='read-more'])[11]";
	public static final String newemailconfiguration= "//*[@class='dropdown-toggle btn btn-primary btn-sm']";
	public static final String buname= "//*[@id='addModal']/div/form/div/div[2]/div[1]/div/select";
	public static final String purpose= "//*[@id='addModal']/div/form/div/div[2]/div[2]/div/select";
	public static final String subject= "";
	public static final String to= "//*[@id='addModal']/div/form/div/div[2]/div[3]/div/textarea";
	public static final String cc= "//*[@id='addModal']/div/form/div/div[2]/div[4]/div/textarea";
	public static final String bcc= "//*[@id='addModal']/div/form/div/div[2]/div[5]/div/textarea";
	public static final String savemailconfiguration= "//*[@value='save']";
	
	public static final String userpermission="(//*[@class='read-more'])[10]";
	public static final String newuserpermission="//*[@class='dropdown-toggle btn btn-primary btn-sm']";
	public static final String selrole="//*[@id='addRoleMenuMappingModal']/form/div/div/div[2]/div/div[1]/div[1]/select";
	public static final String selmainmenu="(//*[@class='form-check-input'])[1]";
	public static final String selsubmenu="(//*[@class='form-check-input'])[15]";
	public static final String selsubmenu1="(//*[@class='form-check-input'])[28]";
	public static final String persave="//*[@value='save']";

	public static final String pageaccess= "(//*[@class='read-more'])[9]";
	public static final String newmainmenu= "//*[@class='dropdown-toggle btn btn-primary btn-sm']";
	public static final String mainmenuname= "//*[@id='addMainMenuModal']/div/div/div[2]/form/div/input";
	public static final String savemainmenu= "//*[@value='save']";
	public static final String newsubmenu= "(//*[@class='dropdown-toggle btn btn-primary btn-sm'])[2]";
	public static final String mainmenuselect= "//*[@id='addSubMenuModal']/div/div/div[2]/form/div[1]/select";
	public static final String submenuname= "//*[@id='addSubMenuModal']/div/div/div[2]/form/div[2]/input";
	public static final String savesubmenu= "(//*[@value='save'])[2]";
	
	public static final String userReg="(//*[@class='read-more'])[5]";
	public static final String newuserReg="//*[@class='dropdown-toggle btn btn-primary btn-sm']";
	public static final String username="//*[@id='bar-parent10']/form/div[1]/div[1]/div/input";
	public static final String firstname="//*[@id='bar-parent10']/form/div[2]/div[1]/div/input";
	public static final String lastname="//*[@id='bar-parent10']/form/div[2]/div[2]/div/input";
	public static final String contactnum="//*[@id='bar-parent10']/form/div[3]/div[1]/div/input";
	public static final String designation="//*[@id='bar-parent10']/form/div[3]/div[2]/div/input";
	public static final String skillset1="//*[@id='bar-parent10']/form/div[5]/div[1]/div/textarea";
	public static final String locate="//*[@id='bar-parent10']/form/div[5]/div[2]/div/input";
	public static final String bunit1="//*[@id='bar-parent10']/form/div[4]/div[1]/div/select";
	public static final String role1="//*[@id='bar-parent10']/form/div[4]/div[2]/div/select";
	public static final String gender1="//*[@id='inlineRadio1']";
	public static final String register="//*[@value='register']";

	/////////////////////////////////////***************Resource**********************/////////////////////////
	public static final String services="//*[@id='services']";
	public static final String resourcemanage="//*[@id='what-we-do']/div/div/div/div[2]/div/div/a";
	public static final String newresource="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div[1]/div/div[4]/ul/li/a";
	public static final String empidbyhr="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[1]/div[2]/div/input";
	public static final String workordernumber="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[1]/div[3]/div/input";
	public static final String employmenttype="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[1]/div[4]/div/select";
	public static final String firstName="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/input";
	public static final String lastName="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[2]/div[2]/div/input";
	public static final String contactNo="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[2]/div[3]/div/input";
	public static final String remail="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[2]/div[4]/div/input";
	public static final String rgender="//*[@id='inlineRadio1']";
	public static final String projectallocation="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[3]/div[2]/div/select";
	public static final String rebu="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[4]/div[1]/div/select";
	public static final String projectName="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[3]/div[3]/div/select";
	public static final String rdesignation="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[4]/div[2]/div/input";
	public static final String rexp="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[4]/div[3]/div/input";
	public static final String rskillset="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[4]/div[4]/div/textarea";
	public static final String rsave="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div/form/div[5]/div[1]/input";
	public static final String rsearchtxt="(//*[@name='fullName'])[1]";
	public static final String rsearchbutton="(//*[@class='btn btn-primary'])[2]";
	public static final String rsearchresetbutton="/html/body/app-root/app-home/app-employee-details/div/div[2]/div[1]/div/div/div/div/div[1]/div/div[4]/a";
	
/////////////////////////////////////***************Vendor management**********************/////////////////////////
public static final String vendorMangement="(//*[@title='More Details'])[2]";
public static final String vendorNewBtn="//*[@class='dropdown-toggle btn btn-primary btn-sm']";
public static final String vendorName="(//*[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]";
public static final String vendorEmail="//*[@name='email']";
public static final String vendorContactNo="//*[@name='contactNumber']";
public static final String vendorLocation="//*[@name='location']";
public static final String vendorAddress="//*[@name='address']";
public static final String vendorCCEmail="//*[@name='ccEmailIds']";
public static final String vendorSave="//*[@value='Save']";
	
	/////////////////////////////////////***************JobRequest**********************/////////////////////////
	public static final String recruitment="//*[@id='recruitment']";
	public static final String jobrequest="(//*[@class='read-more'])[1]";
	public static final String newjobrequest="//*[@class='dropdown-toggle btn btn-primary btn-sm']";
	public static final String customerfield="//*[@id='bar-parent10']/form/div[1]/div[1]/div/select";
	public static final String rrole="//*[@id='bar-parent10']/form/div[1]/div[2]/div/select";
	public static final String bunit="//*[@id='bar-parent10']/form/div[1]/div[3]/div/select";
	public static final String currencytype="//*[@id='bar-parent10']/form/div[2]/div[2]/div/select";
	public static final String payrange="//*[@id='bar-parent10']/form/div[2]/div[4]/div/select";
	public static final String emptype="//*[@id='bar-parent10']/form/div[3]/div[1]/div/select";
	public static final String projectstartdate="//*[@name='projectStartDate']";
	public static final String placementfor="//*[@id='bar-parent10']/form/div[4]/div[1]/div/select";
	public static final String remoteworking="//*[@id='bar-parent10']/form/div[4]/div[2]/div/select";
	public static final String recruiter="//*[@id='bar-parent10']/form/div[4]/div[3]/div/select";
	public static final String nop="(//*[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]";
	public static final String location1="(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[1]";
	public static final String payrange1="//*[@name='payRange']";
	public static final String contractduration="//*[@name='contractDuration']";
	public static final String jobdescription="//*[@id='bar-parent10']/form/div[5]/div/div/textarea";
	public static final String mandatoryskills= "//*[@id='bar-parent10']/form/div[6]/div[1]/div/textarea";
	public static final String optionalskills="//*[@id='bar-parent10']/form/div[6]/div[2]/div/textarea";
	public static final String Savejobrequest="//*[@value='Save']";
/////////////////////////////////////***************Recruiter**********************/////////////////////////
	public static final String addrecruiterbu="//*[@id='tab1']/div/div/div/div/div/table/tbody/tr[1]/td[11]/a[1]";
	public static final String recruiterfield="//*[@id='exampleModal']/div/div/div[2]/form/div/ng-select/div/div/div[3]/input";
	public static final String updaterecruiter="//*[@value='update']";
	
/////////////////////////////////////***************Candidate**********************/////////////////////////
	public static final String recruitmentbu="//*[@id='recruitment']";
	public static final String jobrequestbu="(//*[@class='read-more'])[1]";
	public static final String addcandidate="(//*[@class='btn btn-tbl-add btn-xs'])[1]";
	public static final String addcandidatemultiplerequest="/html/body/app-root/app-home/app-add-candidate/div/div[2]/div[1]/div/div[1]/div";
	public static final String fname="//*[@id='bar-parent10']/form/div[1]/div[2]/div/input";
	public static final String lname="//*[@id='bar-parent10']/form/div[1]/div[3]/div/input";
	public static final String contactno="//*[@id='bar-parent10']/form/div[2]/div[1]/div/input";
	public static final String email="//*[@id='bar-parent10']/form/div[2]/div[2]/div/input";
	public static final String gender="//*[@id='inlineRadio1']";
	public static final String yearofexp="//*[@id='bar-parent10']/form/div[3]/div[1]/div/input";
	public static final String currentcom="//*[@id='bar-parent10']/form/div[3]/div[2]/div/input";
	public static final String candidatetype="//*[@id='bar-parent10']/form/div[3]/div[3]/div/select";
	public static final String skillset="//*[@id='bar-parent10']/form/div[4]/div[1]/div/textarea";
	public static final String resumeupload="//*[@id='bar-parent10']/form/div[4]/div[2]/div/input";
	public static final String candidatesave="//*[@value='Save']";
	public static final String closebutton="//*[@class='close']";
	public static final String addbenchcandbu="//*[@id='tab1']/div/div/div/div/div/table/tbody/tr[1]/td[10]/a[2]";
	public static final String benchapprove="//*[@id='tab1']/div/div/div/div/div/table/tbody/tr[1]/td[6]/ul/li/a";
	//*[@id='exampleModal']/div/div/div[1]/button/span
////////////////////////////////////*************Resumeshortlist**********************///////////////////////////
	public static final String resumeshortlistbu="(//*[@class='read-more'])[3]";
	public static final String resumeshortlistapprove="//*[@id='tab1']/div/div/div/div/div[1]/table/tbody/tr[1]/td[5]/ul[1]/li/a";
	public static final String reasonforshortlist="//*[@id='tab1']/div/div/div/div/div[1]/table/tbody/tr[1]/td[5]/ul[1]/li/ul/li/div/div/div/div/textarea";
	public static final String reasonforshortlistbu="//*[@id='basic-addon1']";
	
/////////////////////////////////////***************InterviewProcess**********************/////////////////////////
	public static final String recruit3= "//*[@id='recruitment']";
	public static final String interviewbutton="(//*[@class='read-more'])[5]";
	public static final String interround1="//*[@id='internal1']";
	public static final String interround2="//*[@id='int2']";
	public static final String custround="//*[@id='cus']";  //*[@class='dropdown-toggle btn btn-primary btn-sm']
	public static final String hrround="//*[@id='hr']";
	public static final String newschedulebutton="//*[@class='dropdown-toggle btn btn-primary btn-sm']";
	public static final String schedulebutton="(//*[@class='dropdown-toggle btn btn-tbl-add btn-xs'])[1]";
	public static final String interviewer="(//*[@type='text'])[4]";
    public static final String modeofinterview="(//*[@class='form-select ng-untouched ng-pristine ng-invalid'])[1]";
    public static final String scheduledate="//*[@type='date']";
    public static final String startsfrom="//*[@type='time']";
    public static final String duration="(//*[@class='form-select ng-untouched ng-pristine ng-invalid'])[1]";
    public static final String timezone="(//*[@type='text'])[5]";
    public static final String venue="//*[@name='venue']";
    public static final String remarks="//*[@name='scheduleRemarks']";
    public static final String intsave="//*[@value='Save']";
    public static final String intapprovebu="//*[@id='tab1']/div/div/div/div/div[1]/table/tbody/tr/td[7]/a";
    public static final String status="//*[@id='statusModel']/div/div/form/div[2]/div[1]/div/div/select";
    public static final String reintapprove="//*[@id='statusModel']/div/div/form/div[2]/div[2]/div/div/textarea";
    public static final String intresultsave="//*[@id='statusModel']/div/div/form/div[2]/div[3]/div/input";
	
/////////////////////////////////////***************BUHead**********************/////////////////////////
public static final String recruit="//*[@id='recruitment']";
public static final String readmorebu="(//*[@class='read-more'])[6]";
public static final String reasonbu="(//*[@class='dropdown-toggle btn btn-tbl-edit btn-xs'])[1]";
public static final String reason="(//*[@name='resultRemarks'])[1]";
public static final String approvebu="//*[@id='basic-addon1']";

/////////////////////////////////////***************OnboardDetails**********************/////////////////////////
public static final String readmorebut="(//*[@class='read-more'])[7]";
public static final String newonboarddetail="//*[@class='dropdown-toggle btn btn-primary btn-sm']";
public static final String schedulebu="(//*[@class='dropdown-toggle btn btn-tbl-add btn-xs'])[1]";
public static final String employeeId="(//*[@name='employeeIdByHR'])[1]";
public static final String workordernum="(//*[@name='workOrderNumber'])[1]";
public static final String onemail="(//*[@name='email'])[1]";
public static final String docsverified="(//*[@name='docsVerified'])[1]";
public static final String candidatejoined="(//*[@name='joined'])[1]";
public static final String doj="(//*[@name='joiningDate'])[1]";
public static final String selproject="(//*[@name='projectId'])[1]";
public static final String onboardsave="//*[@value='save']";

}

package Hireprostepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;

import Configurations.ObjectLocators;
import Configurations.Config;
import CustomKeyword.customkeyword;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hirepros_commonstepdef {
	static WebDriver driver; // Global
	int row;
	XSSFSheet sheet;

	@After
	public void addScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "");
		}
	}

    
	@Given("User has to navigate to Hirepros login page")
	public void user_has_to_navigate_to_Hirepros_login_page() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", Config.driverPath);
		driver = new ChromeDriver();
		driver.get(Config.url);
		driver.manage().window().maximize();
		
		

	}

	@When("User enter username and password for Hirepros")
	public void user_enter_username_and_password_for_Hirepros() throws IOException {

		driver.findElement(By.name(ObjectLocators.userName)).sendKeys(Config.username);
		driver.findElement(By.name(ObjectLocators.password)).sendKeys(Config.password);

	}

	@When("User clicks on Login button")
	public void user_clicks_on_Login_button() {

		driver.findElement(By.xpath(ObjectLocators.loginBtn)).click();

	}

	@Then("User will be logged in successfully")
	public void user_will_be_logged_in_successfully() throws InterruptedException {

		Thread.sleep(2000);
		// driver.findElement(By.xpath(Entities.configuration)).isDisplayed();

	}

	// ***************************************ROLE*******************************************\\
	@Given("User clicks on Configuration")
	public void user_clicks_on_configuration() throws InterruptedException {

		Thread.sleep(2000);
		WebElement conf = driver.findElement(By.xpath(ObjectLocators.configuration)); // clicking config
		conf.click();

	}

	@When("User navigates to the Role menu in the Configuration")
	public void user_navigates_to_the_role_menu_in_the_configuration() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.role)).click(); // clicking role

	}

	@When("User clicks on New Role button")
	public void user_clicks_on_new_role_button() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.newRole)).click(); // click new role button

	}

	@When("User Enters Role name and verifies field")
	public void user_enters_data_to_role_name_field_and_verifies() throws InterruptedException, IOException {

		Thread.sleep(2000);
		String rname = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "0");
		driver.findElement(By.xpath(ObjectLocators.roleName)).sendKeys(rname); // enter role name

	}

	@Then("User clicks on Save button and navigate to view Role list page")
	public void user_clicks_on_save_button_and_navigate_to_view_role_list_page() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.saveRolebtn)).click(); // clicking save button

	}

	@Then("User verify the added Role by searching")
	public void user_verify_the_added_role_by_searching() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.searchtxt)).click();
		driver.findElement(By.xpath(ObjectLocators.searchtxt))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "0"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.searchbtn)).click(); // clicking search button
		driver.findElement(By.xpath(ObjectLocators.searchResetbtn)).click(); // clicking reset button
	}

	// ***************************************CUSTOMER*******************************************\\
	@Given("User navigates to the Customer menu in the Configuration")
	public void user_navigates_to_the_customer_page_of_the_configuration() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.configuration)).click(); // clicking config
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.customer)).click(); // clicking customer

	}

	@When("User clicks on New Customer button")
	public void user_clicks_on_new_customer_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.newCustomer)).click(); // clicking new customer button

	}

	@When("User Enters data to Customer name, Location, Region field and verifies")
	public void user_enters_data_to_customer_name_location_region_field_and_verifies()
			throws InterruptedException, IOException {

		Thread.sleep(3000);
		String cname = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "1");
		driver.findElement(By.xpath(ObjectLocators.customerName)).sendKeys(cname); // enter customer field
		Thread.sleep(1000);
		String location = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "2");
		driver.findElement(By.xpath(ObjectLocators.location)).sendKeys(location);
		Thread.sleep(1000);
		String region = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "3");
		driver.findElement(By.xpath(ObjectLocators.region)).sendKeys(region);

	}

	@Then("User clicks on Save button and navigate to view customer list page")
	public void user_clicks_on_save_button_and_navigate_to_view_customer_list_page() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.saveCustomerbtn)).click(); // clicking save button

	}

	@Then("User can search Customer name in search text-box")
	public void user_can_search_customer_name_in_search_text_box() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.searchtxt)).click();
		driver.findElement(By.xpath(ObjectLocators.searchtxt))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "1")); 
		driver.findElement(By.xpath(ObjectLocators.searchbtn)).click(); // clicking search button
		driver.findElement(By.xpath(ObjectLocators.searchResetbtn)).click(); // clicking reset button

	}
	@Then("User update the field by clicking edit button and verifies updated Customer")
	public void User_update_the_field_by_clicking_edit_button_and_verifies_updated_Customer() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.editCustomer)).click(); 
		Thread.sleep(2000);
		String bu = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "4");
		driver.findElement(By.xpath(ObjectLocators.updatecustomerName)).sendKeys(bu); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.updatecustomerbtn)).click(); 

	}
	// ***************************************BU*******************************************\\

	@Given("User navigates to the Business Unit menu in the Configuration")
	public void user_navigates_to_the_business_unit_page_of_the_configuration() throws InterruptedException {

		Thread.sleep(4000);
		driver.findElement(By.xpath(ObjectLocators.configuration)).click(); // clicking config
		driver.findElement(By.xpath(ObjectLocators.bu)).click(); // BU

	}

	@When("User clicks on New Business Unit button")
	public void user_clicks_on_new_business_unit_button() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.newBu)).click(); // clicking newBU

	}

	@Given("User Enters data to Business Unit name field and verifies")
	public void user_enters_data_to_business_unit_name_field_and_verifies() throws InterruptedException, IOException {

		Thread.sleep(2000);
		String bu = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "4");
		driver.findElement(By.xpath(ObjectLocators.buName)).sendKeys(bu); // enter BU

	}

	@Then("User clicks on Save button and navigate to view Business Unit list page")
	public void user_clicks_on_save_button_and_navigate_to_view_business_unit_list_page() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.savebubtn)).click(); // clicking save button

	}

	@Then("User verify the added Business Unit by searching")
	public void user_can_search_business_unit_name_in_search() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.searchtxt)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.searchtxt))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "4"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.searchbtn)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.searchResetbtn)).click(); // clicking reset button
		

	}
	
	@Then("User update the field by clicking edit button and verifies updated Business Unit")
	public void User_update_the_field_by_clicking_edit_button_and_verifies_updated_Business_Unit() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.editBu)).click(); 
		Thread.sleep(2000);
		String bu = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "4");
		driver.findElement(By.xpath(ObjectLocators.updateBuName)).sendKeys(bu); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.updatebubtn)).click(); 
	}

	// ***************************************PROJECT*******************************************\\
	@Given("User navigates to the Project menu in the Configuration")
	public void user_navigates_to_the_project_menu_in_the_Configuration() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.configuration)).click(); // clicking config
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.project)).click();

	}

	@When("User clicks on New Project button")
	public void user_clicks_on_new_project_button() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.newproject)).click(); // clicking new
		Thread.sleep(2000);

	}

	@When("User Enters data to Project name field and verifies")
	public void user_enters_data_to_project_name_field_and_verifies() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.projectname)).click();
		Thread.sleep(2000);
		String pname = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "5");
		driver.findElement(By.xpath(ObjectLocators.projectname)).sendKeys(pname); // enter

	}

	@When("User has to select Customer Name and Business Unit from the dropdown for Project creation")
	public void user_has_to_select_Customer_Name_and_Business_Unit_from_the_dropdown_for_Project_creation()
			throws InterruptedException, IOException {

		Thread.sleep(2000);
		String bu = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "6");
		Select businessUnit = new Select(driver.findElement(By.xpath(ObjectLocators.projectbu)));
		businessUnit.selectByVisibleText(bu);
		Thread.sleep(2000);
		String cust = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "7");
		Select customer = new Select(driver.findElement(By.xpath(ObjectLocators.projectcustomername)));
		customer.selectByVisibleText(cust);

	}

	@Then("User clicks on Save button and navigate to view Project list page")
	public void user_clicks_on_save_button_and_navigate_to_view_project_list_page() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.saveproject)).click(); // clicking save button

	}

	@Then("User can search Project name in search text-box")
	public void user_can_search_project_name_in_search_text_box() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.searchtxt)).click();
		driver.findElement(By.xpath(ObjectLocators.searchtxt))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "5"));
																										
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.searchbtn)).click(); // clicking search button
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.searchResetbtn)).click(); // clicking reset button
		Thread.sleep(2000);

	}
	
	@Then("User update the field by clicking edit button and verifies updated Project")
	public void User_update_the_field_by_clicking_edit_button_and_verifies_updated_Project() throws InterruptedException, IOException {

	}
	// ***************************************RECURITMENTROLE*******************************************\\

	@Given("User navigates to the Recruitment Role menu in the Configuration")
	public void user_navigates_to_the_recruitment_role_page_of_the_configuration() throws InterruptedException {

		Thread.sleep(2000);

		driver.findElement(By.xpath(ObjectLocators.configuration)).click(); // clicking config
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.recruitmentrole)).click(); // clicking RR

	}

	@When("User clicks on New Recruitment Role button")
	public void user_clicks_on_new_recruitment_role_button() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.newrecruitmentrole)).click(); // clicking new rr button

	}

	@When("User Enters data to Recruitment Role name field and verifies")
	public void user_enters_data_to_recruitment_role_name_field_and_verifies()
			throws InterruptedException, IOException {

		Thread.sleep(2000);
		String rr = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "8");
		driver.findElement(By.xpath(ObjectLocators.recruitmentrolename)).sendKeys(rr); // enter rr button

	}

	@Then("User clicks on Save button and navigate to view Recruitment Role list page")
	public void user_clicks_on_save_button_and_navigate_to_view_recruitment_role_list_page()
			throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.saverecruitmentrole)).click(); // clicking save button

	}

	@Then("User can search Recruitment name in search text-box")
	public void user_can_search_recruitment_name_in_search_text_box() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.searchtxt)).click();
		driver.findElement(By.xpath(ObjectLocators.searchtxt))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "8")); 
		driver.findElement(By.xpath(ObjectLocators.searchbtn)).click(); // clicking search button
		driver.findElement(By.xpath(ObjectLocators.searchResetbtn)).click(); // clicking reset button

	}
	@Then("User update the field by clicking edit button and verifies updated Recruitment Role")
	public void User_update_the_field_by_clicking_edit_button_and_verifies_updated_Recruitment_Role() throws InterruptedException, IOException {
	
	}
//////////////////////////////////////Custmer RR//////////////////////////////////////////////////////////
	@Given("User navigates to the Recruitment Role - Recruitment Role menu in the Configurations")
	public void user_navigates_to_the_recruitment_role_recruitment_role_menu_in_the_configurations()
			throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.configuration)).click(); // clicking config
		driver.findElement(By.xpath(ObjectLocators.customerRecruitmentRoleBtn)).click();
	}

	@When("User can edit and select Recruitment Role in Customer - Recruitment Role according to Business Unit Users")
	public void user_can_edit_and_select_recruitment_role_in_customer_recruitment_role_according_to_business_unit_users()
			throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.customerRecruitmentRoledrop)).sendKeys("samplerr6");
		driver.findElement(By.xpath(ObjectLocators.interviewpaneldrop)).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath(ObjectLocators.customerRecruitmentRoledit)).click(); // clicking config
	}

	@When("User has to select the interviewer checkboxes on the Customer - Recruitment Role")
	public void user_has_to_select_the_interviewer_checkboxes_on_the_customer_recruitment_role()
			throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.RecruitmentRole)).click();
	}

	@Then("User clicks on Save button and navigate to view Customer - Recruitment Role list page")
	public void user_clicks_on_save_button_and_navigate_to_view_customer_recruitment_role_list_page()
			throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.savecustomerRecruitmentRole)).click();
	}
	// ***************************************INTERVIEWPANEL*******************************************\\

	@Given("User navigates to the Interview Panel menu in the Configurations")
	public void user_navigates_to_the_Interview_Panel_menu_in_the_Configurations() throws Throwable {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.configuration)).click(); // clicking config
		driver.findElement(By.xpath(ObjectLocators.interviewpanel)).click();

	}

	@When("User can edit and select interviewer in Interview Panel according to Business Unit Users")
	public void user_can_edit_and_select_interviewer_in_Interview_Panel_according_to_Business_Unit_Users()
			throws Throwable {

		Thread.sleep(3000);
		// Digital - Application Development
		driver.findElement(By.xpath(ObjectLocators.interviewpaneldrop)).sendKeys("samplebu6");

		driver.findElement(By.xpath(ObjectLocators.interviewpaneldrop)).sendKeys(Keys.ENTER);

		// Select drop = new
		// Select(driver.findElement(By.xpath(Entities.interviewpaneldrop)));
		// drop.selectByVisibleText("16");
		// Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.interviewpaneledit)).click(); // clicking config

	}

	@When("User has to select the interviewer checkboxes on the Interview Panel")
	public void user_has_to_select_the_interviewer_checkboxes_on_the_Interview_Panel() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.selectinterviewer)).click();

	}

	@Then("User clicks on Save button and navigate to view Interview Panel list page")
	public void user_clicks_on_Save_button_and_navigate_to_view_Interview_Panel_list_page() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.saveinterviewer)).click();

	}

	// ***************************************EMAILCONFIGURATION*******************************************\\
	@Given("User navigates to the Email Configuration in the Configurations")
	public void user_navigates_to_the_Email_Configuration_in_the_Configurations() throws Throwable {

		Thread.sleep(3000);

		driver.findElement(By.xpath(ObjectLocators.configuration)).click(); // clicking config
		driver.findElement(By.xpath(ObjectLocators.emailconfiguration)).click();

	}

	@When("User clicks on New Email Configuration button")
	public void user_clicks_on_New_Email_Configuration_button() throws Throwable {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.newemailconfiguration)).click();

	}

	@When("User has to select Business Unit Name and Purpose from the dropdown for Email Configurations")
	public void user_has_to_select_Business_Unit_Name_and_Purpose_from_the_dropdown_for_Email_Configurations()
			throws Throwable {

		Thread.sleep(2000);
		String business = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "15");
		Select businessUnit = new Select(driver.findElement(By.xpath(ObjectLocators.buname)));
		businessUnit.selectByVisibleText(business);
		Thread.sleep(1000);
		String purpose = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "9");
		Select Purpose = new Select(driver.findElement(By.xpath(ObjectLocators.purpose)));
		Purpose.selectByVisibleText(purpose);

	}

	@When("User Enters data to Subject, To, Cc and Bcc mail id and verifies")
	public void user_Enters_data_to_To_Cc_and_Bcc_mail_id_and_verifies() throws Throwable {

		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.to))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "10"));
		driver.findElement(By.xpath(ObjectLocators.cc))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "11"));
		driver.findElement(By.xpath(ObjectLocators.bcc))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "12"));

	}

	@Then("User clicks on Save button and navigate to view Email list page")
	public void user_clicks_on_Save_button_and_navigate_to_view_Email_list_page() throws Throwable {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.savemailconfiguration)).click(); // clicking save button
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id='addModal']/div/div/div[1]/button/span")).click();

	}

	@Then("User can select Business Unit and search Email Configuration in search text-box")
	public void user_can_select_Business_Unit_and_search_Email_Configuration_in_search_text_box() throws Throwable {
		Thread.sleep(1000);
	}

	// ***************************************USERPERMISSION*******************************************\\
	@Given("User navigates to the User Permissions menu in the Configuration")
	public void user_navigates_to_the_User_Permissions_menu_in_the_Configuration() throws Throwable {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.configuration)).click(); // clicking config
		driver.findElement(By.xpath(ObjectLocators.userpermission)).click();
		System.out.println("User navigates to the User Permissions menu in the Configuration");
	}

	@When("User clicks on New User Permissions button")
	public void user_clicks_on_New_User_Permissions_button() {

		driver.findElement(By.xpath(ObjectLocators.newuserpermission)).click();
		System.out.println("User clicks on New User Permissions button");
	}

	@When("User has to select Role Name from the dropdown for User Permissions")
	public void user_has_to_select_Role_Name_from_the_dropdown_for_User_Permissions() throws Throwable {

		Thread.sleep(3000);
		String rname = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "0");
		Select role = new Select(driver.findElement(By.xpath(ObjectLocators.selrole)));
		role.selectByVisibleText(rname);

	}

	@When("User has to select the checkboxes on the Main Menus and Sub Menus")
	public void user_has_to_select_the_checkboxes_on_the_Main_Menus_and_Sub_Menus() throws Throwable {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.selmainmenu)).click();
		driver.findElement(By.xpath(ObjectLocators.selsubmenu)).click();
		driver.findElement(By.xpath(ObjectLocators.selsubmenu1)).click();
		driver.findElement(
				By.xpath("//*[@id=\"addRoleMenuMappingModal\"]/div/div/div[2]/form/div/div[2]/div/div/div[8]/input[1]"))
				.click();

	}

	@Then("User clicks on Save button and navigate to view User permission list page")
	public void user_clicks_on_Save_button_and_navigate_to_view_User_permission_list_page() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.persave)).click(); // clicking config

	}

	@Then("User can select Role Name in search text-box")
	public void user_can_select_Role_Name_in_search_text_box() throws Throwable {

		Thread.sleep(2000);
		Select role = new Select(
				driver.findElement(By.xpath("//*[@class='form-select ng-pristine ng-valid ng-touched']")));
		role.selectByVisibleText(customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "0"));

	}

	// ***************************************PAGEACCESS*******************************************\\
	@Given("User navigates to the Page Access menu in the Configuration")
	public void user_navigates_to_the_page_access_page_of_the_configuration() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.configuration)).click(); // clicking config
		driver.findElement(By.xpath(ObjectLocators.pageaccess)).click();

	}

	@When("User clicks on New Menu button")
	public void user_clicks_on_new_menu_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.newmainmenu)).click();

	}

	@When("User Enters data to Menu name field and verifies")
	public void user_enters_data_to_menu_name_field_and_verifies() throws InterruptedException, IOException {

		Thread.sleep(3000);
		String mainmenu = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "13");
		driver.findElement(By.xpath(ObjectLocators.mainmenuname)).sendKeys(mainmenu); // enter customer in search box

	}

	@Then("User clicks on Save button and navigate to view Menu list page")
	public void user_clicks_on_save_button_and_navigate_to_view_menu_list_page() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.savemainmenu)).click();

	}

	@Given("User clicks on Sub Menu button")
	public void user_clicks_on_sub_menu_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.newsubmenu)).click();

	}

	@Given("User Enters data to Sub Menu name field and verifies")
	public void user_enters_data_to_sub_menu_name_field_and_verifies() throws InterruptedException, IOException {

		Thread.sleep(3000);
		String mmenu = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "13");
		Select mainmenu = new Select(driver.findElement(By.xpath(ObjectLocators.mainmenuselect)));
		mainmenu.selectByVisibleText(mmenu);
		Thread.sleep(3000);
		String submenu = customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "14");
		driver.findElement(By.xpath(ObjectLocators.submenuname)).sendKeys(submenu); // enter customer in search box

	}

	@Then("User clicks on Save button and navigate to view Sub Menu list page")
	public void user_clicks_on_save_button_and_navigate_to_view_sub_menu_list_page() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.savesubmenu)).click();

	}

	@Then("User can search Sub Menu name in search")
	public void user_can_search_sub_menu_name_in_search() throws InterruptedException, IOException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='keyword']")).click();
		driver.findElement(By.xpath("//*[@name='keyword']"))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "ConfigRole", "1", "13"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='search']/form/div/input[2]")).click(); // clicking search button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='search']/form/div/input[3]")).click(); // clicking reset button
		Thread.sleep(3000);

	}

	// ***************************************newUser*******************************************\\

	@Given("User clicks on Users Registration")
	public void user_clicks_on_Users_Registration() throws InterruptedException {

		driver.findElement(By.xpath(ObjectLocators.configuration)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.userReg)).click(); // clicking config

	}

	@When("User clicks on New Users Registration button")
	public void user_clicks_on_New_Users_Registration_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.newuserReg)).click();

	}

	@When("User Enters data to Email, Firstname, Lastname, Designation, Skill Set, Location field and verifies")
	public void user_Enters_data_to_Email_Firstname_Lastname_Designation_Skill_Set_Location_field_and_verifies()
			throws InterruptedException, IOException {

		Thread.sleep(2000);
		String usname = customkeyword.getExcelData(Config.excelTestData, "User", "1", "0");
		driver.findElement(By.xpath(ObjectLocators.username)).sendKeys(usname); // username
		Thread.sleep(1000);
		String name = customkeyword.getExcelData(Config.excelTestData, "User", "1", "1");
		driver.findElement(By.xpath(ObjectLocators.firstname)).sendKeys(name); // fname
		Thread.sleep(1000);
		String lname = customkeyword.getExcelData(Config.excelTestData, "User", "1", "2");
		driver.findElement(By.xpath(ObjectLocators.lastname)).sendKeys(lname); // Lname
		Thread.sleep(1000);
		String number = customkeyword.getExcelData(Config.excelTestData, "User", "1", "3");
		driver.findElement(By.xpath(ObjectLocators.contactnum)).sendKeys(number); // number
		Thread.sleep(1000);
		String designation = customkeyword.getExcelData(Config.excelTestData, "User", "1", "4");
		driver.findElement(By.xpath(ObjectLocators.designation)).sendKeys(designation); // Designation
		Thread.sleep(1000);
		String skillSet = customkeyword.getExcelData(Config.excelTestData, "User", "1", "5");
		driver.findElement(By.xpath(ObjectLocators.skillset1)).sendKeys(skillSet); // skillSet
		Thread.sleep(1000);
		String location = customkeyword.getExcelData(Config.excelTestData, "User", "1", "6");
		driver.findElement(By.xpath(ObjectLocators.locate)).sendKeys(location); // location

	}

	@When("User has to select Business Unit, Role and Gender for Users creation")
	public void User_has_to_select_Business_Unit_Gender_and_Role_Name_from_the_dropdown_for_Users_creation()
			throws InterruptedException, IOException {

		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.gender1)).click();
		Thread.sleep(1000);
		String rl = customkeyword.getExcelData(Config.excelTestData, "User", "1", "7");
		Select Role = new Select(driver.findElement(By.xpath(ObjectLocators.role1)));
		Role.selectByVisibleText(rl);
		Thread.sleep(1000);
		String bu = customkeyword.getExcelData(Config.excelTestData, "User", "1", "8");
		Select businessUnit = new Select(driver.findElement(By.xpath(ObjectLocators.bunit1)));
		businessUnit.selectByVisibleText(bu);

	}

	@Then("User clicks on Register button and navigate to view Users list page")
	public void user_clicks_on_Save_button_and_navigate_to_view_Users_list_page() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.register)).click(); // clicking save button

	}

	@Then("User verify the added Users by searching")
	public void user_verify_the_added_Users_by_searching() {

	}
	
	@Then("User update the field by clicking edit button and verifies updated Users")
	public void User_update_the_field_by_clicking_edit_button_and_verifies_updated_Users() {

	}
	
	

	// ****************************************ResourceManagement***********************************\\
	@Given("User clicks on Services")
	public void user_clicks_on_Services_for_resource_creation() throws InterruptedException {

		Thread.sleep(3000);
		WebElement con = driver.findElement(By.xpath(ObjectLocators.services));
		con.click();

	}

	@When("User clicks on Resource Management button")
	public void user_clicks_on_Resource_Management_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.resourcemanage)).click();

	}

	@And("User clicks on New Resource Management button")
	public void User_clicks_on_New_Resource_Management_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.newresource)).click();

	}

	@And("User Enters data to EmployeeId By HR, WorkOrderNumber, Employment Type, FirstName, LastName, ContactNo, Email, Gender, Project Allocation, Project Name, CustomerName, Business Unit, Designation, Skillset field and verifies")
	public void User_Enters_data_to_EmployeeId_By_HR_WorkOrderNumber_Employment_Type_FirstName_LastName_ContactNo_Email_Gender_Project_Allocation_Project_Name_CustomerName_Business_Unit_Designation_Skillset_field_and_verifies()
			throws InterruptedException, IOException {

		Thread.sleep(3000);
		row = 1;
		String s = Integer.toString(row);

		String Empidbyhr = customkeyword.getExcelData(Config.excelTestData, "Resource", s, "0");

		driver.findElement(By.xpath(ObjectLocators.empidbyhr)).sendKeys(Empidbyhr);
		Thread.sleep(1000);

		driver.findElement(By.xpath(ObjectLocators.workordernumber))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "1"));
		Thread.sleep(1000);
		Select emptype = new Select(driver.findElement(By.xpath(ObjectLocators.employmenttype)));
		emptype.selectByVisibleText(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "2"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.firstName))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "3"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.lastName))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "4"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.contactNo))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "5"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.remail))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "6"));
		Thread.sleep(1000);
		WebElement radio = driver.findElement(By.xpath(ObjectLocators.rgender));
		radio.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.projectallocation))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "7"));
		Select bu = new Select(driver.findElement(By.xpath(ObjectLocators.rebu)));
		bu.selectByVisibleText(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "8"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.rdesignation))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "9"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.rexp))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "10"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.rskillset))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "11"));
	}

	@Then("User clicks on Save button and navigate to view Resources list page")
	public void User_clicks_on_Save_button_and_navigate_to_view_Resources_list_page() throws InterruptedException {

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(ObjectLocators.rsave)).click();
	}

	@And("User verify the added Resource by searching")
	public void User_verify_the_added_Resource_by_searching() throws InterruptedException, IOException {

		row = 1;
		String s = Integer.toString(row);
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.rsearchtxt)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.rsearchtxt))
				.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Resource", s, "3"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.rsearchbutton)).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(ObjectLocators.rsearchresetbutton)).click();
		Thread.sleep(2000);

	}

	// ***************************************VendorMangement*******************************************\\

	@When("User clicks on Vendor Management button")
	public void user_clicks_on_vendor_management_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.vendorMangement)).click();
	}

	@When("User clicks on New Vendor Management button")
	public void user_clicks_on_new_vendor_management_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.vendorNewBtn)).click();
	}

	@When("User Enters data to VendorName, ContactNo, Email,Location,Address and CCEmailIDs field and verifies")
	public void user_enters_data_to_vendor_name_contact_no_email_location_address_and_cc_email_ids_field_and_verifies()
			throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.vendorName)).sendKeys("114");
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.vendorEmail)).sendKeys("fg@gm.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.vendorContactNo)).sendKeys("09005567898");
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.vendorLocation)).sendKeys("chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.vendorAddress)).sendKeys("chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath(ObjectLocators.vendorCCEmail)).sendKeys("fgh@gm2.com");

		Thread.sleep(1000);

	}

	@Then("User clicks on Save button and navigate to view Vendor list page")
	public void user_clicks_on_save_button_and_navigate_to_view_vendor_list_page() throws InterruptedException {
		driver.findElement(By.xpath(ObjectLocators.vendorSave)).click();
	}

	@Then("User verify the added Vendor by searching")
	public void user_verify_the_added_vendor_by_searching() throws InterruptedException {

	}

	// ***************************************JobRequest*******************************************\\
	@Given("User navigates to the New Job Request page of the Recruitment")

	public void user_navigates_to_the_New_Job_Request_page_of_the_Recruitment() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.recruitment)).click(); // clicking config
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.jobrequest)).click();
	}

	@When("User click on New Job Request button")
	public void user_click_on_New_Job_Request_button() throws InterruptedException {

		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\'tab1\']/div/div/div/div/div/div[1]/div[6]/ul/li/a")).click();

	}

	@And("User has to fill the details of Customer Name, Recruitment Role, Business Unit, Currency Type, Pay Frequency, Employment Type, Project Start Date, Placement For, Remote Working, Recruiter, No. of Openings, Email, Firstname, Lastname, Location, Pay Range, Contract Duration,Job Description, Mandatory Skills, Optional Skills and save the Job request")
	public void user_has_to_fill_the_details_of_Customer_Name_Recruitment_Role_Business_Unit_Currency_Type_Pay_Frequency_Employment_Type_Project_Start_Date_Placement_For_Remote_Working_Recruiter_No_of_Openings_Email_Firstname_Lastname_Location_Pay_Range_Contract_Duration_Job_Description_Mandatory_Skills_Optional_Skills_and_save_the_job_request()
			throws InterruptedException, IOException, AWTException {

		String value = customkeyword.getRowCount(Config.excelTestData, "Jobrequest");
		System.out.println(value);
		int rows = Integer.parseInt(value);
		rows = rows - 1;
		
		for (row = 1; row <= rows; row++) {

			Thread.sleep(5000);
			driver.findElement(By.xpath(ObjectLocators.newjobrequest)).click();

			String s = Integer.toString(row);
			String excute = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "17");// execute yes/no
			System.out.println(excute);
			
			Thread.sleep(3000);
			String cust = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "0");
			Select customer = new Select(driver.findElement(By.xpath(ObjectLocators.customerfield)));
			customer.selectByVisibleText(cust);
			Thread.sleep(3000);
			String recruitment = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "1");
			Select recruitmentRole = new Select(driver.findElement(By.xpath(ObjectLocators.rrole)));
			recruitmentRole.selectByVisibleText(recruitment);
			Thread.sleep(3000);
			String business = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "2");
			Select businessUnit = new Select(driver.findElement(By.xpath(ObjectLocators.bunit)));
			businessUnit.selectByVisibleText(business);
			Thread.sleep(1000);
			String currency = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "5");
			Select currencyType = new Select(driver.findElement(By.xpath(ObjectLocators.currencytype)));
			currencyType.selectByVisibleText(currency);
			Thread.sleep(1000);
			String payf = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "7");
			Select payFrequency = new Select(driver.findElement(By.xpath(ObjectLocators.payrange)));
			payFrequency.selectByVisibleText(payf);
			Thread.sleep(1000);
			String empt = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "8");
			Select employmentType = new Select(driver.findElement(By.xpath(ObjectLocators.emptype)));
			employmentType.selectByVisibleText(empt);
			Thread.sleep(3000);

			Point coordinates = driver.findElement(By.name("projectStartDate")).getLocation();
			Thread.sleep(1000);
			Robot robot = new Robot();
			Thread.sleep(4000);
			robot.mouseMove(coordinates.getX() + 230, coordinates.getY() + 130);
			//155
			Thread.sleep(3000);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(3000);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(3000);
			driver.findElement(By.name("projectStartDate")).sendKeys(Keys.ENTER);

			String pf = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "11");
			Select placementFor = new Select(driver.findElement(By.xpath(ObjectLocators.placementfor)));
			placementFor.selectByVisibleText(pf);
			Thread.sleep(1000);
			String rw = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "12");
			Select remoteworking = new Select(driver.findElement(By.xpath(ObjectLocators.remoteworking)));
			remoteworking.selectByVisibleText(rw);
			Thread.sleep(1000);
			String recruit = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "13");
			Select recruiter = new Select(driver.findElement(By.xpath(ObjectLocators.recruiter)));
			recruiter.selectByVisibleText(recruit);
			Thread.sleep(1000);

			String nop = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "3");
			driver.findElement(By.xpath(ObjectLocators.nop)).clear();
			driver.findElement(By.xpath(ObjectLocators.nop)).sendKeys(nop);
			Thread.sleep(1000);
			driver.findElement(By.xpath(ObjectLocators.location1)).clear();
			driver.findElement(By.xpath(ObjectLocators.location1))
					.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "4"));
			Thread.sleep(1000);
			String Payrange = customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "6");
			driver.findElement(By.xpath(ObjectLocators.payrange1)).clear();
			driver.findElement(By.xpath(ObjectLocators.payrange1)).sendKeys(Payrange);
			Thread.sleep(1000);
			driver.findElement(By.xpath(ObjectLocators.contractduration)).clear();
			driver.findElement(By.xpath(ObjectLocators.contractduration))
					.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "9"));
			Thread.sleep(1000);
			driver.findElement(By.xpath(ObjectLocators.jobdescription)).clear();
			driver.findElement(By.xpath(ObjectLocators.jobdescription))
					.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "14"));
			Thread.sleep(1000);
			driver.findElement(By.xpath(ObjectLocators.mandatoryskills)).clear();
			driver.findElement(By.xpath(ObjectLocators.mandatoryskills))
					.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "15"));
			Thread.sleep(1000);
			driver.findElement(By.xpath(ObjectLocators.optionalskills)).clear();
			driver.findElement(By.xpath(ObjectLocators.optionalskills))
					.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Jobrequest", s, "16"));

			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);

			driver.findElement(By.xpath(ObjectLocators.Savejobrequest)).click(); // clicking save button
			Thread.sleep(5000);
}
		}

	

	@Then("User verify the added Job Request by searching")
	public void user_verify_the_added_Job_Request_by_searching() throws InterruptedException {

		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"adv-search\"]/input")).sendKeys("REC02021000007");
		// driver.findElement(By.xpath("//*[@id=\"adv-search\"]/div/div/button")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div/div[1]/div/div[4]/a")).click();

	}

	// ****************************************SelectRecruiter*******************************************\\
	/*
	 * @Given("User click on Recruiter icon") public void
	 * user_click_on_Recruiter_icon() throws InterruptedException {
	 * Thread.sleep(3000);
	 * driver.findElement(By.xpath(Entities.addrecruiterbu)).click();
	 * System.out.println("User click on Recruiter icon"); } catch (Exception e) {
	 * System.out.println("Error-User click on Recruiter icon"); } }
	 * 
	 * @And("User has to select Recruiter Name from the dropdown for Recruiter")
	 * public void
	 * user_has_to_select_recruiter_name_from_the_dropdown_for_recruiter() throws
	 * InterruptedException, IOException { Thread.sleep(3000); String recruit =
	 * customkeyword.getExcelData( Profile.excelTestData, "Jobrequest", "1", "13");
	 * 
	 * driver.findElement(By.xpath(Entities.recruiterfield)).sendKeys(recruit);
	 * driver.findElement(By.xpath(Entities.recruiterfield)).sendKeys(Keys.ENTER);
	 * System.out.
	 * println("User has to select Recruiter Name from the dropdown for Recruiter");
	 * } catch (Exception e) { System.out.
	 * println("Error-User has to select Recruiter Name from the dropdown for Recruiter"
	 * ); } }
	 * 
	 * @Then("User click on Update button and navigate to Job Request list page")
	 * public void
	 * user_click_on_update_button_and_navigate_to_job_request_list_page() throws
	 * InterruptedException { Thread.sleep(3000);
	 * driver.findElement(By.xpath(Entities.updaterecruiter)).click(); System.out.
	 * println("User click on Update button and navigate to Job Request list page");
	 * } catch (Exception e) { System.out.
	 * println("Error-User click on Update button and navigate to Job Request list page"
	 * ); } }
	 */
	// ***************************************ResumeShortlist********************************************\\
	@Given("User navigates to the Resume Shortlist page of the Recruitment")
	public void user_navigates_to_the_Resume_shortlist_page_of_the_Recruitment() throws InterruptedException {

		Thread.sleep(3000);
		WebElement conf = driver.findElement(By.xpath(ObjectLocators.recruitment)); // clicking config
		conf.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.resumeshortlistbu)).click();

	}

	@When("User can click and view Resume icon in Resume Shortlist")
	public void user_can_click_and_view_resume_icon_in_resume_shortlist() {

	}

	@And("User clicks on Approve, Hold and Reject by adding comment")
	public void user_clicks_on_approve_hold_and_reject_by_adding_comment() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.resumeshortlistapprove)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.reasonforshortlist)).sendKeys("GoodSkills");
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.reasonforshortlistbu)).click();

	}

	// ***********************************NewCandidatecreation**********************************\\
	@Given("User navigates to the New Candidate page of the Recruitment")
	public void user_navigates_to_the_new_candidate_page_of_the_recruitment() throws InterruptedException {

		Thread.sleep(1000);
		// WebElement conf = driver.findElement(By.xpath("//*[@id='recruitment']")); //
		// clicking config
		// conf.click();
		// driver.findElement(By.xpath("//*[@id='what-we-do']/div/div/div/div[1]/div/div/a")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@class='btn btn-tbl-add btn-xs']")).click();

	}

	@Given("User can fill the details to Firstname, Lastname, Contact Number, Email, Years of Experience, Current Company Name, Skill Set, Candidate Type, Gender, Resume Upload and save the candidate")
	public void user_can_fill_the_details_to_Firstname_Lastname_Contact_Number_Email_Years_of_Experience_Current_Company_Name_Skill_Set_CandidateType_Gender_Resume_Upload_and_verifies()
			throws IOException, InterruptedException {

		WebElement conf = driver.findElement(By.xpath(ObjectLocators.recruitmentbu)); // clicking config
		conf.click();
		driver.findElement(By.xpath(ObjectLocators.jobrequestbu)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.addcandidate)).click();
		driver.findElement(By.xpath(ObjectLocators.addcandidatemultiplerequest)).click();

		String value = customkeyword.getRowCount(Config.excelTestData, "Candidate");

		int rows = Integer.parseInt(value);
		for (row = 1; row <= rows; row++) {
			String s = Integer.toString(row);
			System.out.println(customkeyword.getExcelData(Config.excelTestData, "Candidate", s, "0"));
			Thread.sleep(3000);

			driver.findElement(By.xpath(ObjectLocators.fname))
					.sendKeys(customkeyword.getExcelData(Config.excelTestData, "Candidate", s, "0"));

			Thread.sleep(1000);
			String lastName = customkeyword.getExcelData(Config.excelTestData, "Candidate", s, "1");
			driver.findElement(By.xpath(ObjectLocators.lname)).sendKeys(lastName);
			Thread.sleep(1000);
			String contactno = customkeyword.getExcelData(Config.excelTestData, "Candidate", s, "2");
			driver.findElement(By.xpath(ObjectLocators.contactno)).clear();
			driver.findElement(By.xpath(ObjectLocators.contactno)).sendKeys(contactno);
			Thread.sleep(1000);
			String email = customkeyword.getExcelData(Config.excelTestData, "Candidate", s, "3");
			driver.findElement(By.xpath(ObjectLocators.email)).sendKeys(email);
			Thread.sleep(1000);

			String exp = customkeyword.getExcelData(Config.excelTestData, "Candidate", s, "4");
			driver.findElement(By.xpath(ObjectLocators.yearofexp)).clear();
			driver.findElement(By.xpath(ObjectLocators.yearofexp)).sendKeys(exp);

			String currentCompanyName = customkeyword.getExcelData(Config.excelTestData, "Candidate", s, "5");
			driver.findElement(By.xpath(ObjectLocators.currentcom)).sendKeys(currentCompanyName);
			String skillset = customkeyword.getExcelData(Config.excelTestData, "Candidate", s, "7");
			driver.findElement(By.xpath(ObjectLocators.skillset)).sendKeys(skillset);
			WebElement radio = driver.findElement(By.xpath(ObjectLocators.gender));
			radio.click();
			String candidateType = customkeyword.getExcelData(Config.excelTestData, "Candidate", s, "6");
			Select CandidateType = new Select(driver.findElement(By.xpath(ObjectLocators.candidatetype)));
			CandidateType.selectByVisibleText(candidateType);

			Thread.sleep(1000);
			driver.findElement(By.xpath(ObjectLocators.resumeupload)).sendKeys("C:\\Selenium\\surya resume.docx");
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(By.xpath(ObjectLocators.candidatesave)).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath(ObjectLocators.closebutton)).click();
			Thread.sleep(3000);
		}

	}

	// ***************************************BenchCandidate******************************************\\
	@Given("User has to click Add Bench candidate")
	public void User_has_to_click_Add_bench_candidate() throws InterruptedException {

		Thread.sleep(3000);
		WebElement conf = driver.findElement(By.xpath(ObjectLocators.recruitmentbu)); // clicking config
		conf.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.jobrequestbu)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.addbenchcandbu)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.benchapprove)).click();

	}

	@And("User has to select Bench candidate from the list and upload resume and save the candidate")
	public void User_has_to_select_Bench_candidate_from_the_list_and_upload_resume_and_save_the_candidate()
			throws InterruptedException {

		Thread.sleep(3000);
		File file = new File(new File(Config.uploadResume).getAbsolutePath());
		driver.findElement(By.xpath(ObjectLocators.resumeupload)).sendKeys(file.toString());
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(ObjectLocators.candidatesave)).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(ObjectLocators.closebutton)).click();

	}

	// ***************************************InternalRound1*******************************************\\

	@Given("User navigates to the Interview page of the Recruitment")
	public void user_navigates_to_the_Interview_page_of_the_Recruitment() throws InterruptedException {
		try {
			Thread.sleep(3000);
			WebElement conf = driver.findElement(By.xpath(ObjectLocators.recruit3)); // clicking config
			conf.click();
			driver.findElement(By.xpath(ObjectLocators.interviewbutton)).click();
			System.out.println("User navigates to the Interview page of the Recruitment");
		} catch (Exception e) {
			System.out.println("Error-User navigates to the Interview page of the Recruitment");
		}

	}

	@When("User can click on Internal Round1 button")
	public void user_can_click_on_Internal_Round1_button() throws InterruptedException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(ObjectLocators.interround1)).click();
			System.out.println("User can click on Internal Round1 button");
		} catch (Exception e) {
			System.out.println("Error-User can click on Internal Round1 button");
		}

	}

	@When("User can click on New schedule button")
	public void user_can_click_on_New_schedule_button() throws InterruptedException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(ObjectLocators.newschedulebutton)).click();
			System.out.println("User can click on New schedule button");
		} catch (Exception e) {
			System.out.println("Error-User can click on New schedule button");
		}
	}

	@And("User can click on schedule button from InternalRound1 page")
	public void user_can_click_on_Schedule_button_from_InternalRound1_page() throws InterruptedException {
		try {
			Thread.sleep(3000);
			// driver.findElement(By.xpath("//*[@class='dropdown-toggle btn btn-tbl-add
			// btn-xs']")).click();
			System.out.println("User can click on schedule button from InternalRound1 page");
		} catch (Exception e) {
			System.out.println("Error-User can click on schedule button from InternalRound1 page");
		}
	}

	@And("User can fill the details of Interviewer, mode of interview, date, time, Duration, timezone, venue, Remarks and click on save for Internal Round1")
	public void user_can_fill_the_details_of_Interviewer_mode_of_interview_date_time_duration_timezone_venue_remarks_and_verifies()
			throws InterruptedException, IOException, AWTException {

		for (row = 1; row <= 1; row++) {

			String s = Integer.toString(row);

			driver.findElement(By.xpath(ObjectLocators.schedulebutton)).click();

			System.out.println(customkeyword.getExcelData(Config.excelTestData, "Internalround1", s, "0"));

			Thread.sleep(3000);

			String Interview = customkeyword.getExcelData(Config.excelTestData, "Internalround1", s, "0");

			// driver.findElement(By.xpath("//*[@id=\"scheduleModel\"]/div/div/div[2]/form/div/div[1]/div[1]/div[1]/div/ng-select/div/span[2]")).sendKeys(Interview);

			driver.findElement(By.xpath(ObjectLocators.interviewer)).sendKeys(Interview);

			driver.findElement(By.xpath(ObjectLocators.interviewer)).sendKeys(Keys.ENTER);

			Thread.sleep(1000);
			String modeofinterview = customkeyword.getExcelData(Config.excelTestData, "Internalround1", s, "1");
			Select ModeofInterview = new Select(driver.findElement(By.xpath(ObjectLocators.modeofinterview)));
			ModeofInterview.selectByVisibleText(modeofinterview);
			Thread.sleep(3000);
			Point coordinates = driver.findElement(By.xpath("(//*[@name='scheduleDateTime'])[1]")).getLocation();
			Thread.sleep(1000);
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.mouseMove(coordinates.getX() + 153, coordinates.getY() + 127);
			Thread.sleep(1000);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(1000);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(1000);

			driver.findElement(By.xpath("(//*[@name='scheduleDateTime'])[1]")).sendKeys(Keys.ENTER);

			driver.findElement(By.name("scheduleDateTime")).getAttribute("value");

			Thread.sleep(1000);
			String time = customkeyword.getExcelData(Config.excelTestData, "Internalround1", s, "3");
			driver.findElement(By.xpath(ObjectLocators.startsfrom)).sendKeys(time);
			Thread.sleep(3000);

			String Duration = customkeyword.getExcelData(Config.excelTestData, "Internalround1", s, "4");

			Select duration = new Select(driver.findElement(By.xpath(ObjectLocators.duration)));
			duration.selectByVisibleText(Duration);
			Thread.sleep(1000);

			String Timezone = customkeyword.getExcelData(Config.excelTestData, "Internalround1", s, "5");

			driver.findElement(By.xpath(ObjectLocators.timezone)).sendKeys(Timezone);
			Thread.sleep(2000);
			driver.findElement(By.xpath(ObjectLocators.timezone)).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			String venue = customkeyword.getExcelData(Config.excelTestData, "Internalround1", s, "6");
			driver.findElement(By.xpath(ObjectLocators.venue)).sendKeys(venue);
			Thread.sleep(1000);
			String remarks = customkeyword.getExcelData(Config.excelTestData, "Internalround1", s, "7");
			driver.findElement(By.xpath(ObjectLocators.remarks)).sendKeys(remarks);

			JavascriptExecutor save = (JavascriptExecutor) driver;
			save.executeScript("window.scrollBy(0,1000)");
			driver.findElement(By.xpath(ObjectLocators.intsave)).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='cus']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(ObjectLocators.interround1)).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(ObjectLocators.intapprovebu)).click();
			Thread.sleep(2000);
			String approvestatus = customkeyword.getExcelData(Config.excelTestData, "BUApproval", s, "0");
			Select status = new Select(driver.findElement(By.xpath(ObjectLocators.status)));
			status.selectByVisibleText(approvestatus);
			Thread.sleep(2000);
			String approval = customkeyword.getExcelData(Config.excelTestData, "BUApproval", s, "1");
			driver.findElement(By.xpath(ObjectLocators.reintapprove)).sendKeys(approval);
			Thread.sleep(3000);
			driver.findElement(By.xpath(ObjectLocators.intresultsave)).click();
		}
	}

	@Then("User verify the Schedule Candidate Details by searching")
	public void user_verify_the_Schedule_Candidate_Details_by_searching() {

	}

	// ***************************************CustomerRound*******************************************\\
	@Given("User navigates to the Interview page of the Recruitment for Customer Round")
	public void user_navigates_to_the_Interview_page_of_the_Recruitment_for_Customer_Round()
			throws InterruptedException {

		Thread.sleep(3000);
		WebElement conf = driver.findElement(By.xpath(ObjectLocators.recruit3)); // clicking config
		conf.click();
		driver.findElement(By.xpath(ObjectLocators.interviewbutton)).click();
		System.out.println("User navigates to the Interview page of the Recruitment for Customer Round");

	}

	@When("User can click on Customer Round button")
	public void user_can_click_on_Customer_Round_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='cus']")).click();
		System.out.println("User can click on Customer Round button");

	}

	@When("User can click on New schedule button in Customer Round")
	public void user_can_click_on_New_schedule_button_in_Customer_Round() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.newschedulebutton)).click();
		System.out.println("User can click on New schedule button in Customer Round");

	}

	@And("User can click on schedule button from CustomerRound")
	public void user_can_click_on_Schedule_button_from_CustomerRound() throws InterruptedException {
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@class='dropdown-toggle btn btn-tbl-add
		// btn-xs']")).click();

	}

	@And("User can fill the details of Interviewer, mode of interview, date, time, Duration, timezone, venue, Remarks and click on save for Customer Round")
	public void user_can_fill_the_details_of_Interviewer_mode_of_interview_date_time_duration_timezone_venue_remarks_and_verifies_from_the_Customer_Round()
			throws InterruptedException, IOException, AWTException {

		for (row = 1; row <= 1; row++) {

			driver.findElement(By.xpath(ObjectLocators.schedulebutton)).click();

			String s = Integer.toString(row);

			System.out.println(customkeyword.getExcelData(Config.excelTestData, "CustomerRound", s, "0"));

			Thread.sleep(3000);

			String Interview = customkeyword.getExcelData(Config.excelTestData, "CustomerRound", s, "0");

			driver.findElement(By.xpath(ObjectLocators.interviewer)).sendKeys(Interview);

			driver.findElement(By.xpath(ObjectLocators.interviewer)).sendKeys(Keys.ENTER);

			Thread.sleep(1000);
			String modeofinterview = customkeyword.getExcelData(Config.excelTestData, "CustomerRound", s, "1");
			Select ModeofInterview = new Select(driver.findElement(By.xpath(ObjectLocators.modeofinterview)));
			ModeofInterview.selectByVisibleText(modeofinterview);
			Point coordinates = driver.findElement(By.xpath("(//*[@name='scheduleDateTime'])[1]")).getLocation();
			Thread.sleep(1000);
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.mouseMove(coordinates.getX() + 170, coordinates.getY() + 127);
			Thread.sleep(3000);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(3000);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(3000);

			driver.findElement(By.xpath("(//*[@name='scheduleDateTime'])[1]")).sendKeys(Keys.ENTER);

			Thread.sleep(1000);
			String time = customkeyword.getExcelData(Config.excelTestData, "CustomerRound", s, "3");
			driver.findElement(By.xpath(ObjectLocators.startsfrom)).sendKeys(time);

			Thread.sleep(1000);

			String Duration = customkeyword.getExcelData(Config.excelTestData, "CustomerRound", s, "4");

			Select duration = new Select(driver.findElement(By.xpath(ObjectLocators.duration)));
			duration.selectByVisibleText(Duration);
			Thread.sleep(2000);

			String Timezone = customkeyword.getExcelData(Config.excelTestData, "Internalround1", s, "5");

			driver.findElement(By.xpath(ObjectLocators.timezone)).sendKeys(Timezone);
			Thread.sleep(2000);
			driver.findElement(By.xpath(ObjectLocators.timezone)).sendKeys(Keys.ENTER);
			Thread.sleep(1000);

			String venue = customkeyword.getExcelData(Config.excelTestData, "CustomerRound", s, "6");
			driver.findElement(By.xpath(ObjectLocators.venue)).sendKeys(venue);
			Thread.sleep(1000);
			String remarks = customkeyword.getExcelData(Config.excelTestData, "CustomerRound", s, "7");
			driver.findElement(By.xpath(ObjectLocators.remarks)).sendKeys(remarks);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			driver.findElement(By.xpath(ObjectLocators.intsave)).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(ObjectLocators.interround1)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='cus']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(ObjectLocators.intapprovebu)).click();
			Thread.sleep(2000);
			String approvestatus = customkeyword.getExcelData(Config.excelTestData, "BUApproval", s, "0");
			Select status = new Select(driver.findElement(By.xpath(ObjectLocators.status)));
			status.selectByVisibleText(approvestatus);
			Thread.sleep(2000);
			String approval = customkeyword.getExcelData(Config.excelTestData, "BUApproval", s, "1");
			driver.findElement(By.xpath(ObjectLocators.reintapprove)).sendKeys(approval);
			Thread.sleep(2000);

			driver.findElement(By.xpath(ObjectLocators.intresultsave)).click();
			driver.findElement(By.xpath(ObjectLocators.intresultsave)).click();
			driver.findElement(By.xpath(ObjectLocators.intresultsave)).sendKeys(Keys.ENTER);
		}

	}

	@Then("User verify the Schedule Candidate Details by searching for Customer Round")
	public void user_verify_the_Schedule_Candidate_Details_by_searching_for_Customer_Round() {
		// driver.findElement(By.xpath("//*[@class='dropdown-toggle btn btn-tbl-add
		// btn-xs']")).click();
	}

/////////////////////////////////// BU HeadApproval//////////////////////////////////////////

	@Given("User navigates to the Business Unit Head Approval page of the Recruitment")
	public void user_navigates_to_the_business_unit_head_approval_page_of_the_recruitment()
			throws InterruptedException {

		Thread.sleep(3000);
		WebElement conf = driver.findElement(By.xpath(ObjectLocators.recruit)); // clicking config
		conf.click();
		driver.findElement(By.xpath(ObjectLocators.readmorebu)).click();

	}

	@When("User click on Approve, Hold and Reject by adding comment")
	public void user_click_on_approve_hold_and_reject_by_adding_comment() throws InterruptedException, IOException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.reasonbu)).click();
		Thread.sleep(3000);
		String approval = customkeyword.getExcelData(Config.excelTestData, "BUApproval", "1", "1");
		driver.findElement(By.xpath(ObjectLocators.reason)).sendKeys(approval);
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.approvebu)).click();

	}

///////////////////////////////////// OnboardDetails/////////////////////////////////////////////////////////////////////////////

	@Given("User navigates to the Onboard Details page of the Recruitment")
	public void user_navigates_to_the_onboard_details_page_of_the_recruitment() throws InterruptedException {

		Thread.sleep(3000);
		WebElement conf = driver.findElement(By.xpath(ObjectLocators.recruit)); // clicking config
		conf.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.readmorebut)).click();
		System.out.println("User navigates to the Onboard Details page of the Recruitment");

	}

	@When("User can click on New Onboard Details button")
	public void user_can_click_on_new_onboard_details_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.newonboarddetail)).click();
		System.out.println("User can click on New Onboard Details button");
	}

	@And("User can click on schedule button")
	public void user_can_click_on_schedule_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.schedulebu)).click();
		System.out.println("User can click on New Onboard Details button");
	}

	@When("User Enters data to Employee ID and Work Order and verifies")
	public void user_enters_data_to_employee_id_and_work_order_and_verifies() throws InterruptedException, IOException {

		row = 1;
		String s = Integer.toString(row);
// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);

//		driver.findElement(By.xpath(Entities.employeeId)).sendKeys(
//				customkeyword.getExcelData(Profile.excelTestData, "Onboarddetails", s, "0"));
//		driver.findElement(By.xpath(Entities.workordernum)).sendKeys(
//				customkeyword.getExcelData(Profile.excelTestData, "Onboarddetails", s, "4"));
//		driver.findElement(By.xpath(Entities.onemail)).sendKeys(
//				customkeyword.getExcelData(Profile.excelTestData, "Onboarddetails", s, "1"));

	}

	@When("User has to select Documents Verified and Candidate Joined from the dropdown for Interview Schedule")
	public void user_has_to_select_documents_verified_and_candidate_joined_from_the_dropdown_for_the_interview_schedule()
			throws InterruptedException, IOException {

		row = 1;
		String s = Integer.toString(row);
		Thread.sleep(3000);
//Select documentverified = new Select(driver.findElement(By.xpath(Entities.docsverified)));
//documentverified.selectByVisibleText(customkeyword.getExcelData(
//Profile.excelTestData, "Onboarddetails",
//s, "2"));
//Thread.sleep(2000);
//		Select candidatejoined = new Select(driver.findElement(By.xpath(Entities.candidatejoined)));
//		candidatejoined.selectByVisibleText(
//				customkeyword.getExcelData(Profile.excelTestData, "Onboarddetails", s, "3"));
		Thread.sleep(2000);
		Select project = new Select(driver.findElement(By.xpath(ObjectLocators.selproject)));
		project.selectByVisibleText(customkeyword.getExcelData(Config.excelTestData, "Onboarddetails", s, "5"));

	}

	@When("User has to select date for onboarding from the datepicker")
	public void user_has_to_select_date_for_onboarding_from_the_datepicker() throws InterruptedException, AWTException {

		Thread.sleep(3000);
		Point coordinates = driver.findElement(By.xpath(ObjectLocators.doj)).getLocation();
		System.out.println(coordinates);
		Robot robot = new Robot();

		robot.mouseMove(coordinates.getX() + 120, coordinates.getY() + 127);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		driver.findElement(By.xpath(ObjectLocators.doj)).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(ObjectLocators.onboardsave)).click();

	}

	@Then("User click on Save button and navigate to Candidate Details list page")
	public void user_click_on_save_button_and_navigate_to_candidate_details_list_page() throws InterruptedException {

// Thread.sleep(3000);
// JavascriptExecutor js = (JavascriptExecutor) driver;
// js.executeScript("window.scrollBy(0,1000)");
// Thread.sleep(3000);
// driver.findElement(By.xpath(Entities.onboardsave)).click();

	}

	@Then("User verify the Onboard Details by searching in Candidate Details")
	public void user_verify_the_onboard_details_by_searching_in_candidate_details() throws InterruptedException {
// Thread.sleep(3000);
// driver.findElement(By.xpath("//*[@id=\"tab2\"]/div/div/div/div/div[1]/div/div[2]/form/div/input[1]")).sendKeys("1");
// driver.findElement(By.xpath("//*[@class=\"btn btn-xs searchbtn\"]")).click();
// Thread.sleep(3000);
// driver.findElement(By.xpath("//*[@id=\"tab2\"]/div/div/div/div/div[1]/div/div[2]/form/div/input[3]")).click();

	}
	
	
}

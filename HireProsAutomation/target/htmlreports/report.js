$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hirepros_CommonLogin.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Feature: Checking Login functionality"
    },
    {
      "line": 2,
      "value": "#---------------------------------------------------------------------------------------------------------------------------------"
    },
    {
      "line": 3,
      "value": "# Authors : Seena K and Gokul T                                                                                                                                                          Reviewer    :"
    },
    {
      "line": 4,
      "value": "# Date   : 24-08-2021                                                                                                                                                                  Reviewed On :"
    },
    {
      "line": 5,
      "value": "# Last Updated By:"
    },
    {
      "line": 6,
      "value": "# Last Updated On:"
    },
    {
      "line": 7,
      "value": "# Feature Name: Login functionality"
    },
    {
      "line": 8,
      "value": "# Feature Description: Checking Login functionality"
    },
    {
      "line": 9,
      "value": "#---------------------------------------------------------------------------------------------------------------------------------"
    }
  ],
  "line": 10,
  "name": "Login Functionality of the Hirepros",
  "description": "",
  "id": "login-functionality-of-the-hirepros",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 13,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality-of-the-hirepros;login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User has to navigate to Hirepros login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User enter username for Hirepros",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User enter password for Hirepros",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User validate the fields",
  "keyword": "Then "
});
formatter.match({
  "location": "hirepros_commonstepdef.user_has_to_navigate_to_Hirepros_login_page()"
});
formatter.result({
  "duration": 14111578700,
  "status": "passed"
});
formatter.match({
  "location": "hirepros_commonstepdef.user_enter_username_for_Hirepros()"
});
formatter.result({
  "duration": 236783000,
  "status": "passed"
});
formatter.match({
  "location": "hirepros_commonstepdef.user_enter_password_for_Hirepros()"
});
formatter.result({
  "duration": 224677900,
  "status": "passed"
});
formatter.match({
  "location": "hirepros_commonstepdef.user_click_on_Login_button()"
});
formatter.result({
  "duration": 104992500,
  "status": "passed"
});
formatter.match({
  "location": "hirepros_commonstepdef.user_validate_the_Fields()"
});
formatter.result({
  "duration": 34500,
  "status": "passed"
});
formatter.uri("hirepros_Recruitment.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Feature: Checking Recruitment functionality"
    },
    {
      "line": 2,
      "value": "#---------------------------------------------------------------------------------------------------------------------------------"
    },
    {
      "line": 3,
      "value": "# Authors : Seena K and Gokul T                                                                                                                                                          Reviewer    :"
    },
    {
      "line": 4,
      "value": "# Date   : 26-08-2021                                                                                                                                                                  Reviewed On :"
    },
    {
      "line": 5,
      "value": "# Last Updated By:"
    },
    {
      "line": 6,
      "value": "# Last Updated On:"
    },
    {
      "line": 7,
      "value": "# Feature Name: Checking Recruitment functionality"
    },
    {
      "line": 8,
      "value": "# Feature Description: Checking Recruitment functionality"
    },
    {
      "line": 9,
      "value": "#---------------------------------------------------------------------------------------------------------------------------------"
    }
  ],
  "line": 10,
  "name": "Checking Recruitment functionality",
  "description": "",
  "id": "checking-recruitment-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 30,
      "value": "#Scenario-3"
    }
  ],
  "line": 32,
  "name": "Filling New Candidate creation",
  "description": "",
  "id": "checking-recruitment-functionality;filling-new-candidate-creation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "User navigates to the New Candidate page of the Recruitment",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User Enters data to Firstname, Lastname, Contact Number, Email, Years of Experience, Current Company Name, Skill Set and verifies",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User has to select Candidate Type and Gender from the dropdown for Project creation",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User has to upload file for Resume Upload",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User click on Save button and navigate to view Candidate Details list page",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "User verify the added Candidate Details by searching",
  "keyword": "And "
});
formatter.match({
  "location": "hirepros_commonstepdef.user_navigates_to_the_new_candidate_page_of_the_recruitment()"
});
formatter.result({
  "duration": 2968605800,
  "status": "passed"
});
formatter.match({
  "location": "hirepros_commonstepdef.user_enters_data_to_firstname_lastname_contact_number_email_years_of_experience_current_company_name_skill_set_and_verifies()"
});
formatter.result({
  "duration": 1185313900,
  "status": "passed"
});
formatter.match({
  "location": "hirepros_commonstepdef.user_has_to_select_candidate_type_and_gender_from_the_dropdown_for_project_creation()"
});
formatter.result({
  "duration": 181887800,
  "status": "passed"
});
formatter.match({
  "location": "hirepros_commonstepdef.user_has_to_upload_file_for_resume_upload()"
});
formatter.result({
  "duration": 64180800,
  "error_message": "org.openqa.selenium.InvalidArgumentException: invalid argument\n  (Session info: chrome\u003d93.0.4577.63)\nBuild info: version: \u00274.0.0-beta-3\u0027, revision: \u00275d108f9a67\u0027\nSystem info: host: \u0027PRO-GOKULT\u0027, ip: \u0027192.168.0.101\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [8d337c0b1e786b518ebb49e3213bb58f, clickElement {id\u003d7264af8b-c596-459a-b681-426ad2a1d6de}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.63, chrome: {chromedriverVersion: 92.0.4515.43 (8c61b7e2989f2..., userDataDir: C:\\Users\\PROMAN~2\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:58193}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:58193/devtoo..., se:cdpVersion: 93.0.4577.63, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (8d337c0b1e786b518ebb49e3213bb58f)] -\u003e xpath: //*[@id\u003d\"bar-parent10\"]/form/div[4]/div[2]/div/input]\nSession ID: 8d337c0b1e786b518ebb49e3213bb58f\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:198)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:131)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:153)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:128)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:619)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:237)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:75)\r\n\tat Hireprostepdef.hirepros_commonstepdef.user_has_to_upload_file_for_resume_upload(hirepros_commonstepdef.java:659)\r\n\tat ✽.And User has to upload file for Resume Upload(hirepros_Recruitment.feature:36)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "hirepros_commonstepdef.user_click_on_save_button_and_navigate_to_view_candidate_details_list_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "hirepros_commonstepdef.user_verify_the_added_candidate_details_by_searching()"
});
formatter.result({
  "status": "skipped"
});
});
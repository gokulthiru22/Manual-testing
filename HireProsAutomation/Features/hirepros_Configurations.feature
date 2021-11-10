#Feature: Checking configurations functionality of HirePros
#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena K and Gokul T                                                                                                                                                          Reviewer    :
# Date   : 24-08-2021                                                                                                                                                                  Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name: Configurations functionality of HirePros
# Feature Description: Checking configurations functionality of HirePros
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Checking configurations functionality of HirePros

  #Scenario-1
  @RegTest
  Scenario: Filling Role creation
    Given User clicks on Configuration
    When User navigates to the Role menu in the Configuration
    And User clicks on New Role button
    And User Enters Role name and verifies field
    Then User clicks on Save button and navigate to view Role list page
    And User verify the added Role by searching
    
    
 
  #Scenario-2
   @OneTest
  Scenario: Filling Business Unit creation
    Given User navigates to the Business Unit menu in the Configuration
    When User clicks on New Business Unit button
    And User Enters data to Business Unit name field and verifies
    Then User clicks on Save button and navigate to view Business Unit list page
    And User verify the added Business Unit by searching
    And User update the field by clicking edit button and verifies updated Business Unit

  #Scenario-3
   @SmokeTest
  Scenario: Filling Customer creation
    Given User navigates to the Customer menu in the Configuration
    When User clicks on New Customer button
    And User Enters data to Customer name, Location, Region field and verifies
    Then User clicks on Save button and navigate to view customer list page
    And User can search Customer name in search text-box
    And User update the field by clicking edit button and verifies updated Customer

  #Scenario-4
  @SmokeTest
  Scenario: Filling Project creation
    Given User navigates to the Project menu in the Configuration
    When User clicks on New Project button
    And User Enters data to Project name field and verifies
    And User has to select Customer Name and Business Unit from the dropdown for Project creation
    Then User clicks on Save button and navigate to view Project list page
    And User can search Project name in search text-box
    And User update the field by clicking edit button and verifies updated Project

  #Scenario-5
  @SmokeTest
  Scenario: Filling Users creation
    Given User clicks on Users Registration
    When User clicks on New Users Registration button
    And User Enters data to Email, Firstname, Lastname, Designation, Skill Set, Location field and verifies
    And User has to select Business Unit, Role and Gender for Users creation
    Then User clicks on Register button and navigate to view Users list page
    And User verify the added Users by searching
    And User update the field by clicking edit button and verifies updated Users

 
    #Scenario-6
  @SmokeTest
  Scenario: Adding interviwer in Interview Panel
    Given User navigates to the Interview Panel menu in the Configurations
    When User can edit and select interviewer in Interview Panel according to Business Unit Users
    And User has to select the interviewer checkboxes on the Interview Panel
    Then User clicks on Save button and navigate to view Interview Panel list page

  #Scenario-7
  @SmokeTest
  Scenario: Filling Recruitment Role creation
    Given User navigates to the Recruitment Role menu in the Configuration
    When User clicks on New Recruitment Role button
    And User Enters data to Recruitment Role name field and verifies
    Then User clicks on Save button and navigate to view Recruitment Role list page
    And User can search Recruitment name in search text-box
     And User update the field by clicking edit button and verifies updated Users

  #Scenario-8
  @SmokeTest
  Scenario: Adding Recruitment Role in Customer - Recruitment Role
    Given User navigates to the Recruitment Role - Recruitment Role menu in the Configurations
    When User can edit and select Recruitment Role in Customer - Recruitment Role according to Business Unit Users
    And User has to select the interviewer checkboxes on the Customer - Recruitment Role
    Then User clicks on Save button and navigate to view Customer - Recruitment Role list page
    And User update the field by clicking edit button and verifies updated Recruitment Role

  #Scenario-9
  @SmokeTest
  Scenario: Filling Email-Configuration
    Given User navigates to the Email Configuration in the Configurations
    When User clicks on New Email Configuration button
    And User has to select Business Unit Name and Purpose from the dropdown for Email Configurations
    And User Enters data to Subject, To, Cc and Bcc mail id and verifies
    Then User clicks on Save button and navigate to view Email list page
    And User can select Business Unit and search Email Configuration in search text-box

  #Scenario-10
  @RegTest
  Scenario: Filling User Permissions creation
    Given User navigates to the User Permissions menu in the Configuration
    When User clicks on New User Permissions button
    And User has to select Role Name from the dropdown for User Permissions
    And User has to select the checkboxes on the Main Menus and Sub Menus
    Then User clicks on Save button and navigate to view User permission list page
    And User can select Role Name in search text-box

  #Scenario-11
  @RegTest
  Scenario: Filling Menu creation
    Given User navigates to the Page Access menu in the Configuration
    When User clicks on New Menu button
    And User Enters data to Menu name field and verifies
    Then User clicks on Save button and navigate to view Menu list page

  #Scenario-12
  @RegTest
  Scenario: Filling Sub Menu creation
    Given User navigates to the Page Access menu in the Configuration
    When User clicks on Sub Menu button
    And User Enters data to Sub Menu name field and verifies
    Then User clicks on Save button and navigate to view Sub Menu list page
    And User can search Sub Menu name in search

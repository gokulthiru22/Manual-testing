#Feature: Checking configurations functionality of HirePros
#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena K and Gokul T                                                                                                                                                          Reviewer    :
# Date   : 24-08-2021                                                                                                                                                                  Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name: Configurations functionality of HirePros
# Feature Description: Checking configurations functionality of HirePros
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Checking Users creation functionality in Users Registration

  #Scenario-1
  @SmokeTest
  Scenario: Filling Resources creation
    Given User clicks on Services
    When User clicks on Resource Management button
    And User clicks on New Resource Management button
    And User Enters data to EmployeeId By HR, WorkOrderNumber, Employment Type, FirstName, LastName, ContactNo, Email, Gender, Project Allocation, Project Name, CustomerName, Business Unit, Designation, Skillset field and verifies
    Then User clicks on Save button and navigate to view Resources list page
    And User verify the added Resource by searching

  #Scenario-2
 @SmokeTest
  Scenario: Filling Vendor creation
    Given User clicks on Services
    When User clicks on Vendor Management button
    And User clicks on New Vendor Management button
    And User Enters data to VendorName, ContactNo, Email,Location,Address and CCEmailIDs field and verifies
    Then User clicks on Save button and navigate to view Vendor list page
    And User verify the added Vendor by searching

#Feature: Checking Login functionality
#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena K and Gokul T                                                                                                                                                          Reviewer    :
# Date   : 24-08-2021                                                                                                                                                                  Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name: Login functionality
# Feature Description: Checking Login functionality
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Login Functionality of the Hirepros

#Scenario-1
  @OneTest
  Scenario: Login functionality
    Given User has to navigate to Hirepros login page
    When User enter username and password for Hirepros
    And User clicks on Login button
    Then User will be logged in successfully

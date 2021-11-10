#Feature: Checking Recruitment functionality
#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena K and Gokul T                                                                                                                                                          Reviewer    :
# Date   : 26-08-2021                                                                                                                                                                  Reviewed On :
# Last Updated By:
# Last Updated On:
# Feature Name: Checking Recruitment functionality
# Feature Description: Checking Recruitment functionality
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Checking Recruitment functionality

  #Scenario-1
  @OneTest
  Scenario: Filling Job Request creation
    Given User navigates to the New Job Request page of the Recruitment
    And User click on New Job Request button
    And User has to fill the details of Customer Name, Recruitment Role, Business Unit, Currency Type, Pay Frequency, Employment Type, Project Start Date, Placement For, Remote Working, Recruiter, No. of Openings, Email, Firstname, Lastname, Location, Pay Range, Contract Duration,Job Description, Mandatory Skills, Optional Skills and save the Job request
    And User verify the added Job Request by searching

  #Scenario-2
  @RegTest
  Scenario: Filling New Candidate creation
    Given User navigates to the New Candidate page of the Recruitment
    And User can fill the details to Firstname, Lastname, Contact Number, Email, Years of Experience, Current Company Name, Skill Set, Candidate Type, Gender, Resume Upload and save the candidate

  #Scenario-3
  @SmokeTest
  Scenario: Filling Bench Candidate creation
    Given User has to click Add Bench candidate
    And User has to select Bench candidate from the list and upload resume and save the candidate

  #Scenario-4
  @SmokeTest
  Scenario: Resume Shortlist
    Given User navigates to the Resume Shortlist page of the Recruitment
    When User can click and view Resume icon in Resume Shortlist
    And User clicks on Approve, Hold and Reject by adding comment

  #Scenario-5
  @SmokeTest
  Scenario: Internal Round1
    Given User navigates to the Interview page of the Recruitment
    When User can click on Internal Round1 button
    And User can click on New schedule button
    And User can click on schedule button from InternalRound1 page
    And User can fill the details of Interviewer, mode of interview, date, time, Duration, timezone, venue, Remarks and click on save for Internal Round1
    Then User verify the Schedule Candidate Details by searching

  #Scenario-7
  @SmokeTest
  Scenario: Customer Round
    Given User navigates to the Interview page of the Recruitment for Customer Round
    When User can click on Customer Round button
    And User can click on New schedule button in Customer Round
    And User can click on schedule button from CustomerRound
    And User can fill the details of Interviewer, mode of interview, date, time, Duration, timezone, venue, Remarks and click on save for Customer Round
    Then User verify the Schedule Candidate Details by searching for Customer Round

  #Scenario-9
  @SmokeTest
  Scenario: Business Unit Head Approval
    Given User navigates to the Business Unit Head Approval page of the Recruitment
    When User click on Approve, Hold and Reject by adding comment

  #Scenario-10
  @SmokeTest
  Scenario: Onboard Details
    Given User navigates to the Onboard Details page of the Recruitment
    When User can click on New Onboard Details button
    And User can click on schedule button
    And User Enters data to Employee ID and Work Order and verifies
    And User has to select Documents Verified and Candidate Joined from the dropdown for Interview Schedule
    And User has to select date for onboarding from the datepicker
    Then User verify the Onboard Details by searching in Candidate Details

Feature: Personal Details User functionality

  @Positive
  Scenario: Test Case 13 - User successfully Edit Profile Current User
    Given user is on Login page
    When user input Username User
    And user input Password User
    And user click button Login
    Then user navigated to Dashboard page
    When user click menu My Info
    And user select dropdown Nationality
#    And user select dropdown Marital Status
    And user click choosen Gender
    And user click button Save Edit Profile
    Then user navigated to Personal Details page

  @Negative
  Scenario: Test Case 14 - User failed Edit Profile with Empty Field Required
    Given user is on Login page
    When user input Username User
    And user input Password User
    And user click button Login
    Then user navigated to Dashboard page
    When user click menu My Info
    And user clear First Name
    And user clear Last Name
    Then user see Required message on Full Name field
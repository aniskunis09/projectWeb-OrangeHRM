Feature: Login as User functionality

  @Positive
  Scenario: Test Case 10 - User successfully login as User with status Enabled
    Given user is on Login page
    When user input Username User
    And user input Password User
    And user click button Login
    Then user navigated to Dashboard page

  @Negative
  Scenario: Test Case 11 - User failed login as User with status Disabled
    Given user is on Login page
    When user input Username User Disabled
    And user input Password User Disabled
    And user click button Login
    Then user see Account Disable message
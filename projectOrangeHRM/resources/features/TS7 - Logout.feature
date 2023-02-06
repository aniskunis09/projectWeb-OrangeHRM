Feature: Logout functionality

  @Positive
  Scenario: Test Case 16 - User successfully logout as Admin
    Given user is on Login page
    When user input Username Admin
    And user input Password Admin
    And user click button Login
    Then user navigated to Dashboard page
    When user click dropdown Menu
    And user click button Logout
    Then user navigated to Login page

  @Positive
  Scenario: Test Case 17 - User successfully logout as User with status Enabled
    Given user is on Login page
    When user input Username User
    And user input Password User
    And user click button Login
    Then user navigated to Dashboard page
    When user click dropdown Menu
    And user click button Logout
    Then user navigated to Login page
Feature: Login as Admin functionality

  @Positive
  Scenario: Test Case 1 - User successfully login as Admin
    Given user is on Login page
    When user input Username Admin
    And user input Password Admin
    And user click button Login
    Then user navigated to Dashboard page

  @Negative
  Scenario: Test Case 2 - User failed login as Admin with Input Wrong Username
    Given user is on Login page
    When user input Wrong Username Admin
    And user input Password Admin
    And user click button Login
    Then user see Invalid credentials message

  @Negative
  Scenario: Test Case 3 - User failed login as Admin with Input Wrong Password
    Given user is on Login page
    When user input Username Admin
    And user input Wrong Password Admin
    And user click button Login
    Then user see Invalid credentials message

  @Negative
  Scenario: Test Case 4 - User failed login as Admin with No Input Mandatory Field
    Given user is on Login page
    When user click button Login
    Then user see Required message on Mandatory field

  @Negative
  Scenario: Test Case 5 - User failed login as Admin with No Input Username
    Given user is on Login page
    When user input Password Admin
    And user click button Login
    Then user see Required message on field Username

  @Negative
  Scenario: Test Case 6 - User failed login as Admin with No Input Password
    Given user is on Login page
    When user input Username Admin
    And user click button Login
    Then user see Required message on field Password
Feature: Employee functionality

  @Positive
  Scenario: Test Case 7 - User successfully add New Employee with Status Enabled
    Given user is on Login page
    When user input Username Admin
    And user input Password Admin
    And user click button Login
    Then user navigated to Dashboard page
    When user click menu PIM
    And user click button Add Employee
    And user input First Name
    And user input Middle Name
    And user input Last Name
    And user click switch Create Login Details
    And user input Username for New Employee
    And user input Password for New Employee
    And user input Confirm Password for New Employee
    And user click button Save New Employee
    Then user navigated to Personal Details page

  @Positive
  Scenario: Test Case 8 - User successfully add New Employee with Status Disabled
    Given user is on Login page
    When user input Username Admin
    And user input Password Admin
    And user click button Login
    Then user navigated to Dashboard page
    When user click menu PIM
    And user click button Add Employee
    And user input First Name
    And user input Middle Name
    And user input Last Name
    And user click switch Create Login Details
    And user input Username for New Employee Disabled
    And user input Password for New Employee Disabled
    And user input Confirm Password for New Employee Disabled
    And user click radio button Status into Disabled
    And user click button Save New Employee
    Then user navigated to Personal Details page

  @Negative
  Scenario: Test Case 9 - User failed add New Employee with No Input Full Name
    Given user is on Login page
    When user input Username Admin
    And user input Password Admin
    And user click button Login
    Then user navigated to Dashboard page
    When user click menu PIM
    And user click button Add Employee
    And user click button Save New Employee
    Then user see Required message on Full Name field
Feature: Punch-In functionality

  @Positive
  Scenario: Test Case 12 - User successfully Punch-In
    Given user is on Login page
    When user input Username User
    And user input Password User
    And user click button Login
    Then user navigated to Dashboard page
    When user click icon Stopwatch
#    And user input Date Punch-In
#    And user input Time Punch-In
    And user input Note Punch-In
    And user click button In
    Then user navigated to Punch-Out page
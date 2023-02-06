Feature: Punch-Out functionality

  @Positive
  Scenario: Test Case 15 - User successfully Punch-Out
    Given user is on Login page
    When user input Username User
    And user input Password User
    And user click button Login
    Then user navigated to Dashboard page
    When user has already Punch-In
    And user click icon Stopwatch
#    And user input Date Punch-Out
#    And user input Time Punch-Out
    And user input Note Punch-Out
    And user click button Out
    Then user navigated to Punch-In page
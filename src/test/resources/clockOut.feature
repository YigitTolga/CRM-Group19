
Feature: Clock out functionality
 User Story:
  As a user, I should be able to log work hours
  with time reporting

  Background:
    Given user am on login page
    When user enter valid "username" and "password"
    And  user click login button
    Then dashboard should be displayed

  @wip1
  Scenario: Verify user can clock out.
    Then user clicks on clock button
    And user clicks on continue working day button
    And user clicks on clock out button
    Then user verifies clocked out is displayed
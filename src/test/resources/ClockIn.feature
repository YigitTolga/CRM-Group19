Feature: Clock in
  User Story:As a user, I should be able to log
  work hours with time reporting

  Background:
    Given user am on login page
    When user enter valid "username" and "password"
    And  user click login button
    Then dashboard should be displayed
  @wip2
 Scenario: users can clock in

   When : user navigate  clock in button
   And : user start time track by clicking clock in button
   Then : Verify that user start time




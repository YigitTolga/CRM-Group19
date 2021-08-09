Feature: Add event functionality
  User Story: As a user, I should be able to log work hours with time reporting

  Background:
    Given user am on login page
    When user enter valid "helpdesk37@cybertekschool.com" and "UserUser"
    And  user click login button
    Then dashboard should be displayed

  @wip
  Scenario: Add start time and end time for create an event.

    When user click on time container
    And user click time boxes
    And user set up start hour "12" and minute "45"
    And choose "PM" then click select
    And user end hour "1" and minute "30"
    And choose "PM" then click select button
    When user enter "Birthday Party" and click plus button
    Then "Birthday Party" should be displayed





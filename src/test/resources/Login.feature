Feature: Login Functionality
  User story : As a user, I should be able to log
  work hours with time reporting
Background:
  @wip
  Scenario: 1. users (helpdesk) login with valid credentials
    Given I am on login page
    When I enter valid "helpdesk37@cybertekschool.com" and "UserUser"
    And  I click login button
    Then dashboard should be displayed


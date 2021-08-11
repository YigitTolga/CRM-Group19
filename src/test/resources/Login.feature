@wip2
Feature: Login Functionality
  User story : As a user, I should be able to log work hours with time reporting


  Scenario: Users (helpdesk) login with valid credentials
    Given user am on login page
    When user enter valid "username" and "password"
    And  user click login button
    Then dashboard should be displayed


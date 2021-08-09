Feature: Edit work day by providing start and end time.
  User Story: As a user, I should be able to log
  work hours with time reporting.
Background:
  Given user am on login page
  When user enter valid "username" and "password" and click login button
  Then user should land home page

  @wip
  Scenario:  users can edit work day starting and ending time
    Then user click clock
    Then user click edit (pencil icon)
    And user click "Start" hour field and set hour (0-24) and set minutes (0-59)
    And user click "End" hour field and set hour and set minutes (0-59)
    Then User click "Reason" mandatory text field and enter letters, number and characters
    And user click "Save" button.

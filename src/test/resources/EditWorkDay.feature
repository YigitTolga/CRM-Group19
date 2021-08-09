Feature: Edit work day by providing start and end time.
  User Story: As a user, I should be able to log
  work hours with time reporting.

  Background:
    Given user am on login page
    When user enter valid "username" and "password"
    And  user click login button
    Then dashboard should be displayed


  @wip3
  Scenario:  users can edit work day starting and ending time
    Then user click clock
    Then user click edit (pencil icon)
    And user click Start hour field and set hour "editStartHour" and set minutes "editStartMin" and choose "editStartAmPm"
    And user click End hour field and set hour "editEndHour" and set minutes "editEndMin" and choose "editEndAmPm"
    Then User click Reason mandatory text field and enter letters, number and characters "reason"
    And user click Save button.
    Then  user should see working day duration total hours, minutes, and second on Working Day Duration pop-up

@wip
Feature: main page on Activity Stream


  Background:user is on login page
    Given  user is on  login page
    And user enter valid username, password
    When user click login button to go home page
    Then click on Poll button


  Scenario: user should be able to add users by selecting multiple contacts from employees and Department's contact lists
    When user clicks on the add more button
    And user adds multiple contacts for polling
    Then User sees multiple contacts in the polling list


  Scenario: User should be able to add questions and multiple answers.
    When user clicks on Add question button
    Then user sees a question and multiple answers added to polling section


  Scenario: User should be able to delete questions and multiple answers
    When user clicks on delete button
    Then delete question button is clickable on the page


  Scenario: User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox
    When user clicks Allow multiple choice checkbox
    Then user sees the checkbox is selected


  Scenario:  user see error message if want to create a poll without adding persons
    When  user create a poll without adding persons for the poll
    Then please specify at least one person error message is displayed on the page


  Scenario: user see error message if want to create a poll without question text
    When user create a poll without question text
    Then the question text is not specified error message is displayed on the page




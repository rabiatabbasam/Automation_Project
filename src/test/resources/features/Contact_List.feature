Feature: main page on Activity Stream



  Background:user is on login page
    Given  user is on  login page
    And user enter valid username, password
    When user click login button to go home page
    Then click on Poll button


    Scenario: user should be able to add users by selecting multiple contacts from employees and Department's contact lists
    When user clicks on the add more button
    And user adds multiple contacts for polling
    Then user sees multiple contacts in the polling list


      Scenario: User should be able to add questions and multiple answers.
    When user clicks on Add question button
    Then user sees a question and multiple answers added to polling section

        Scenario: User should be able to add questions and multiple answers
          When user clicks on Add question button
          Then delete question button is clickable on the page

          Scenario: User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox
            When user clicks Allow multiple choice checkbox
            Then user sees the checkbox is selected

            Scenario: User should be able to create a poll with mandatory fields
              When user creates a poll leaving message title empty
              Then the message title is not specified error message is displayed on the page

              When user creates a poll without adding persons for the poll
              Then please specify at least one person error message is displayed on the page

              When user creates a poll without question text
              Then the question text is not specified error message is displayed on the page

              When user creates a poll without answers
              Then the question has no answers error message is displayed on the page

              When user creates a poll with only one answer
              Then please specify at least two answers error message is displayed on the page


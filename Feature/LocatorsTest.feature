Feature: Performing actions on web elements

  Background: 
    Given User open the application

  @configScenario
  Scenario Outline: Test the web form
    When Click on web page forms
    And Click on Layout and Presentation
    Then Verify form is displaying or not
    When Enter "<name>" in the YourName text box
    And Enter "<email>" in the Email address text box
    And Select BreakFast "<item>"
    And Select Coffee with "<preferences>"
    And Click on Submit button
    And Click on alert window
    Examples: 
      |name     |email          |item         |preferences |
      |testname |test@gmail.com |Orange juice |Honey       |

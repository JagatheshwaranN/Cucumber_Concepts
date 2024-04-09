@scenarioOutlineDemo
  Feature: Scenario Outline Keyword Demo

    Scenario Outline: Student login to Upskill portal
      Given student on the Upskill website
      When student enter the username "<username>"
      And student enter the password "<password>"
      And click the login button
      Then the student should be logged in successfully to Upskill portal

      Examples:
      |username|password|
      |admin   |admin12 |
      |system  |system1 |
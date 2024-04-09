@scenarioDemo
  Feature: Scenario Keyword Demo

    Scenario: Student login to Upskill portal
      Given student on the Upskill website
      When student enter the "username"
      And student enter the "password"
      And click the login button
      Then the student should be logged in successfully to Upskill portal
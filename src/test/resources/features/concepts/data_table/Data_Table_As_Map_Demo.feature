@dataTableDemo
  Feature: DataTable Concept Demo

    Scenario: Student login to Upskill portal
      Given customer is on user registration page
      When customer enters the following details with headers
      |FName|LName|Email         |Country|
      |John |Alex |john@gmail.com|USA    |
      |Raj  |Kumar|raj@gmail.com |IN     |
      Then customer registration should be successful
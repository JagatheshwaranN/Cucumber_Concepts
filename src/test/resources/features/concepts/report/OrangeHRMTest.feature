@orangeHRM
  Feature: Orange HRM Login Test with Extent Report

    @loginPositive
    Scenario: Orange HRM Login - Positive Scenario
      Given User on Orange HRM login page
      When User enters username "Admin"
      And User enters password "admin123"
      And User clicks login button
      Then Orange HRM dashboard page should display

    @loginNegative
    Scenario: Orange HRM Login - Negative Scenario
      Given User on Orange HRM login page
      When User enters username "Admin"
      And User enters password "admin12"
      And User clicks login button
      Then Orange HRM dashboard page should display
@parallel
  Feature: Orange HRM Login Test with Parallel Run

    @ormLoginPositive
    Scenario: Orange HRM Login - Positive Scenario
      Given User on OHRM login page
      When User enters OHRM username "Admin"
      And User enters OHRM password "admin123"
      And User clicks OHRM login button
      Then OHRM dashboard page should display
@parallel
  Feature: NOP Commerce Login Test with Parallel Run

    @nopLoginPositive
    Scenario: NOP Commerce Login - Positive Scenario
      Given User on NOP Commerce login page
      When User enters NOP Commerce username "admin@yourstore.com"
      And User enters NOP Commerce password "admin"
      And User clicks NOP Commerce login button
      Then NOP Commerce dashboard page should display
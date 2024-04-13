Feature: Login Page Feature

  Scenario: Verify Login Page Title
    Given User is on login page
    When User verify the title of the page
    Then Page title should be "Login - My Shop"


  Scenario: Verify Forgot Password Link
    Given User is on login page
    Then Forgot your password link should be displayed

  Scenario: Verify Successful Login
    Given User is on login page
    When User enters email "testuser1324@gmail.com"
    And User enters passkey "Admin@123"
    And User clicks on signin button
    And Page title should be "My account - My Shop"

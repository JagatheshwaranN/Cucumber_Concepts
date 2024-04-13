Feature: Account Page Feature

  Background:
    Given user has logged in to application
      |username|password|
      |testuser1324@gmail.com|Admin@123|

  Scenario: Verify Account Page Title
    Given User is on account page
    When User verify the title of the page
    Then Page title should be "My account - My Shop"

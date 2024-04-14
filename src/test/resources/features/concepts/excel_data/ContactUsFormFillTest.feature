Feature: Contact Us Message Functionality

  Scenario Outline: Verify Contact Us Send Message Functionality
    Given User is on contact us page
    When User fills the message from the sheet "<sheetName>" with row number "<rowNum>"
    And User clicks send button
    Then success message "Your message has been successfully sent to our team." should display
    Examples:
      | sheetName | rowNum |
      | ContactUs | 0      |
@rerun
Feature: Contact Us Message Functionality

  Scenario Outline: Verify Contact Us Send Message Functionality
    Given User is on contact us page
    When User fills the message with details "<Subject>" "<Email>" "<Order>" and "<Message>"
    And User clicks send button
    Then success message "Your message has been successfully sent to our team." should display
    Examples:
      | Subject          | Email          | Order | Message   |
      | Customer service | test@gmail.com | 12345 | Thank you |
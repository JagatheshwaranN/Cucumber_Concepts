Feature: Scenario Execution Skip Functionality

  @skipScenario
  Scenario: Online Shopping Application Product Search for Laptop
    Given Shopping application have search bar
    When User search for a product "HP Laptop" with price 50000
    Then Product with title "HP Laptop" should be displayed
    And Product should be added to cart and checkout
    And Order Id is 12345 and username is "John"

  Scenario: Online Shopping Application Product Search for Mobile
    Given Shopping application have search bar
    When User search for a product "Iphone 11" with price 50000
    Then Product with title "Iphone 11" should be displayed
    And Product should be added to cart and checkout
    And Order Id is 54321 and username is "John"
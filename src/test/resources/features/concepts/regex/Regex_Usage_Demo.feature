@regexDemo
  Feature: Regular Expression Usage Demo

    Scenario: Online Shopping Application Product Search for Mobile
      Given Shopping application have search bar
      When User search for a mobile "Iphone 11" with price 50000
      Then Product with title "Iphone 11" should be displayed
      And Product should be added to cart and checkout
      And Order Id is 54321 and username is "John"
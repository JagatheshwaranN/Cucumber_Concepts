@tagDemo
  Feature: Tag Annotation Demo

    @login
    Scenario: Login to Shopping Cart
      Given I am on the shopping website
      And I have logged in as a registered user

    @cart
    Scenario: Add Item To Cart
      When I search for "smart phone"
      And I add the first item to the cart
      Then the item should be added successfully

    @cart
    Scenario: Remove Item From Cart
      When I go to my shopping cart
      And I remove the first item from the cart
      Then the item should be removed successfully

    @logout
    Scenario: Logout to Shopping Cart
      Given I am on the shopping website
      And I have logged out as a registered user

    @login
    Scenario: Login to Shopping Cart
      Given I am on the shopping website
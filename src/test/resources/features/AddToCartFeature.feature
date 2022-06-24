Feature: Add to cart
  Scenario: Add on quantity from store
    Given I'm on the store page
    When I add a "Red Shoes" to the cart
    Then I see 1 "Red Shoes" in the cart
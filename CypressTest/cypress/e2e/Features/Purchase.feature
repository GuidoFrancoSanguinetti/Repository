Feature: Purchase Tests

  Scenario Outline: <TestId> - Purchase a product
    Given the user navigates to the home page
    When the user clicks on the first item
    And the user adds the item to the cart
    And the user navigates to the cart
    And the user clicks on the Place Order button
    And the user fills in the purchase form with the following details: "testName", "testCreditCard", "testCountry", "testCity", "testCard", "testMonth", "testYear"
    And the user clicks on the Purchase button
    Then the user clicks on the confirm button for the purchase
    Examples: 
      | TestId |
      |   0000 |

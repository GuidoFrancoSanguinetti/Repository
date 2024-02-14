Feature: Cart Tests

  Scenario Outline: <TestId> - Add and remove single item from cart
    Given the user navigates to the home page
    When the user clicks on the first item
    And the user adds the item to the cart
    And the user navigates to the cart
    Then the user deletes the item from the cart
    Then the item should be removed from the cart
    Examples: 
      | TestId |
      |   0000 |
      |   0000 |

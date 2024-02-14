Feature: Login Tests

  Scenario Outline: <TestId> - Login and Logout check
    Given the user navigates to the home page
    When the user clicks on the login button
    And the user enters "<username>" and "<password> as username and password
    Then the user clicks on the login button
    Then the user clicks on the logout button

    Examples: 
      | TestId | username     | password         |
      |   0000 | TestUser#123 | TestPassword#123 |
      |   0000 | TestUser#123 | TestPassword#123 |
      |   0000 | TestUser#123 | TestPassword#123 |

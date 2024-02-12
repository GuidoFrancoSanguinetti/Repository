Feature: Test

  Scenario Outline: <testID> -
    Given the user opens the "google" main page on "<Browser>"
    When the user enters "<searchValue>" in the search field
    Then the user presses the Intro key
    Then the user should see the search results page
    Examples:
      | Browser | testID | searchValue            |
      | Chrome  | 0000   | recon                  |
      | Firefox | 0000   | chatGPT love           |
      | Edge    | 0000   | The Beatles > all else | Feature: Test

    @Requirement=0000
  Scenario Outline: <testID> - Login with privacy policies accepted
    Given the user opens the "login" page
    When the user enters <loginUser> in the login field
    And the user enters <loginPassword> in the password field
    Then the user accepts the privacy policies
    Then the user should see the home page
    Examples:
      | testID | loginUser | loginPassword |
      | 0000   | testUser  | testPassword  |
      | 0000   | testUser  | testPassword  |
      | 0000   | testUser  | testPassword  |

  @Requirement=0000
  Scenario Outline: <testID> - Login with privacy policies rejected
    Given the user opens the "login" page
    When the user enters <loginUser> in the login field
    And the user enters <loginPassword> in the password field
    Then the user rejects the privacy policies
    Then the user should see the login page with empty fieds
    Examples:
      | testID | loginUser | loginPassword |
      | 0000   | testUser  | testPassword  |
      | 0000   | testUser  | testPassword  |
      | 0000   | testUser  | testPassword  |

  @Requirement=0000
  Scenario Outline: <testID> - Check login privacy policies
    Given the user opens the "login" page
    When the user enters <loginUser> in the login field
    And the user enters <loginPassword> in the password field
    And the user clicks on the privacy policies
    Then the privacy policies information should be displayed
    Examples:
      | testID | loginUser | loginPassword |
      | 0000   | testUser  | testPassword  |
      | 0000   | testUser  | testPassword  |
      | 0000   | testUser  | testPassword  |
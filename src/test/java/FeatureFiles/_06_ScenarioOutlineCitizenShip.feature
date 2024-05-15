Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario Outline: Create a Citizenship with parameter
    When Create a CitizenShip name as "<name>" shortcode as "<shortName>"
    Then Success message should be displayed

    When Create a CitizenShip name as "<name>" shortcode as "<shortName>"
    Then Already exist message should be displayed

    When user delete name as "<name>"
    Then Success message should be displayed
    Examples:
      | name  | shortName |
      | umit  | eser      |
      | umit1 | eser1     |
      | umit2 | eser2     |
      | umit3 | eser3     |
      | umit4 | eser4     |


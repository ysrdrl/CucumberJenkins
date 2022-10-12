Feature: Citizenship with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Citizenship page

  Scenario Outline: Citizenship create
    When User a Citizenship name as "<name as>" shortname as"<shortname as>"
    Then Success message should be displayed


    When User a Citizenship name as "<name as>" shortname as"<shortname as>"
    Then Already exist message should be displayed
    And Click on cloe button

    When User delete the "<name as>"
    Then Success message should be displayed

    Examples:
      | name as    | shortname as |
      | Vatan61    | vt61         |
      | Vatan611   | vt611        |
      | Vatan6111  | vt6111       |
      | Vatan61111 | vt6111       |






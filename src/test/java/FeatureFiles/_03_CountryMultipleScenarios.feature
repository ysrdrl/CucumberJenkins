Feature: Country Multi Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to country page
  @SmokeTest
  Scenario: Create a Country
    When Create a country
    Then Success message should be displayed
  @SmokeTest
    Scenario: Create a country parameter data
      When Create a country name as "Trabzonn" code as "061"
      Then Success message should be displayed


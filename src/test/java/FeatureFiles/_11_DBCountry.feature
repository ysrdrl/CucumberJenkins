Feature: DB Control

  Background:

  Background:
    Given Navigate to basqar
    When  Enter username and password and click login button
    Then User should login successfuly

  Scenario: States testing with JDBC
    And Click on the element in the left Nav
      | setup      |
      | parameters |
      | states     |
    Then Send the query database "select * from States" and control match

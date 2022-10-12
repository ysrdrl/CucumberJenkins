Feature: ApachePOI Citizen Funchtionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Citizenship page

    Scenario: Create and delete citizenship form excel
      When User Create citizenShip with ApachePOI


     Scenario: Create and delete citizenship form excel
      Then User Delete citizenShip with ApachePOI


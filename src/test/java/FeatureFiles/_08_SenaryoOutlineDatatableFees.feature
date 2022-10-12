Feature: Entrance with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Create a Fees
    And Click on the element in the left Nav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys ın Dialog contect
      | nameInput       | <nameInput>       |
      | countryCode     | <countryCode>     |
      | integrationCode | <integrationCode> |
      | priority        | <priority>        |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | <nameInput> |

    And Success message should be displayed
    Examples:
      | nameInput    | countryCode | integrationCode | priority |
      | Dokker11     | Dk11        | DK61            | 61       |
      | Dokker111    | Dk111       | DK611           | 611      |
      | Dokker1111   | Dk1111      | DK6111          | 6111     |
      | Dokker11111  | Dk11111     | DK61111         | 61111    |
      | Dokker111111 | Dk111111    | DK611111        | 611111   |
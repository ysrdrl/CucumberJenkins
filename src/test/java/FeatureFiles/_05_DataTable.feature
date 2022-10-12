Feature: Citizenship with61 scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create Country
    And Click on the element in the left Nav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys ın Dialog contect

      | nameInput   | Trabzon61 |
      | countryCode | 61        |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | Trabzon61 |

    And Success message should be displayed


  Scenario: Create a Nationality
    And Click on the element in the left Nav
      | setup       |
      | parameters  |
      | nationality |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys ın Dialog contect
      | nameInput | Yasar61 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | Yasar61 |

    And Success message should be displayed

  Scenario: Create a Fees
    And Click on the element in the left Nav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys ın Dialog contect
      | nameInput   | Dokker11 |
      | countryCode | Dk11   |
      | integrationCode | DK61   |
      | priority | 61   |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | Dokker11 |

    And Success message should be displayed




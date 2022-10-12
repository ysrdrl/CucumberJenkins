Feature: Emplooye Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create Emplooyee

    And Click on the element in the left Nav
      | humanResources |
      | employees      |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys ın Dialog contect
      | emplooyeFirstName | Yaşar  |
      | emplooyeLastName  | DERELİ |
      | emplooyeId        | 61600  |
      | documentNumber    | 8888   |

    And Click on the element in the Dialog
      | documentType    |
      | personelId      |
      | emplooyeContact |

    And User sending the keys ın Dialog contect
      | emplooyeCountry | Trabzon |

    And Click on the element in the Dialog
      | cityOne    |
      | cookies    |
      | saveButton |

    And Click on the element in the left Nav
      | humanResources |
      | employees      |

    And User delete item from Dialog
      | Yaşar |

    And Success message should be displayed










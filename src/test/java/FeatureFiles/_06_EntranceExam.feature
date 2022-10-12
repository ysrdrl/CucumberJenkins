Feature: Entrance with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create and Delete a Exam
    And Click on the element in the left Nav
      | entranceExams |
      | setup1         |
      | entranceExams2 |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys ın Dialog contect

      | nameInput   | Trabzon61 |

    And Click on the element in the Form

    | academicPeriod |
    | academicPeriod1 |
    | gradeLevel |
    | gradeLevel1 |


    And Click on the element in the Dialog
    |cookies|
    |saveButton|
    |entranceBack|

   And Success message should be displayed

    And User delete item from Dialog
    |Trabzon61|

    And Success message should be displayed
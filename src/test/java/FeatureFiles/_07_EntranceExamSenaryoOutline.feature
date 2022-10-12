Feature: Entrance with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Create and Delete a Exam
    And Click on the element in the left Nav
      | entranceExams  |
      | setup1         |
      | entranceExams2 |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys ın Dialog contect

      | nameInput | <ExamName> |

    And Click on the element in the Form

      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |


    And Click on the element in the Dialog
      | cookies      |
      | saveButton   |
      | entranceBack |

    And Success message should be displayed

    And User delete item from Dialog
      | <ExamName> |

    Then Success message should be displayed

    Examples:
      | ExamName    | AcademicPeriodOption | GradeLevelOption |
      | Dokker1     | academicPeriod1      | gradeLevel1      |
      | MySQL61     | academicPeriod1      | gradeLevel1      |
      | Ubuntu01    | academicPeriod1      | gradeLevel1      |
      | Springboot1 | academicPeriod1      | gradeLevel1      |


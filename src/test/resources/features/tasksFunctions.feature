Feature: Task functions



  Scenario Outline: User navigates to Tasks -- In Progress
    Given the user logged as "<username>"
    When the user navigates to "Tasks" module
    And user clicks In Progress
    Then the title should be My tasks

    Examples:
      | username    | password  |
      | hr2         |  UserUser |
      | helpdesk2   |  UserUser |
      | marketing2  |  UserUser |



    # User should be able to display tasks "In Progress" by clicking "All Tasks" tab
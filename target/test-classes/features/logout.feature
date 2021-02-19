@logout
Feature: Logout

  Scenario Outline: User logs out
    Given the user logged as "<username>"
    When clicks log out option from popUp menu under his or her name
    Then the page title should be Authorization

    Examples:
      | username    | password  |
      | hr2         |  UserUser |
      | helpdesk2   |  UserUser |
      | marketing2  |  UserUser |

  Scenario Outline: User logs out through his or her profile avatar
    Given the user logged as "<username>"
    When user clicks his or her profile avatar
    And clicks log out option from popUp menu under his or her name
    Then the page title should be Authorization

    Examples:
      | username    | password  |
      | hr2         |  UserUser |
      | helpdesk2   |  UserUser |
      | marketing2  |  UserUser |

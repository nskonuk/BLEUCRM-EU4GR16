Feature: Login

  Background:
    Given the user is on the login page

  Scenario Outline: Authorized user is logging with <username>
      When the user logins with valid "<username>" and password
      Then the user should be able to login

  Examples:
    | username    |
    | hr5         |
    | helpdesk5   |
    | marketing5  |

  @login
  Scenario Outline: Authorized user is logging with <username> and <password>
    When the user logins with valid "<username>" and "<password>"
    Then the user should be able to login

    Examples:
      | username    | password  |
      | hr2         |  UserUser |
      | helpdesk2   |  UserUser |
      | marketing2  |  UserUser |

 Scenario Outline: <username> is logged in
    When the user logged as "<username>"

    Examples:
      | username   |
      | hr1        |
      | helpdesk2  |
      | marketing3 |

# UserUser

   @nonauthorizedLogin
  Scenario Outline: Non-authorized login users
    When the user logs in with invalid "<username>" and "<password>"
    Then Login error message should be displayed

    Examples:
      | username    | password   |
      | hrhrhrhhhh  | passworddd |
      | hr3         | passworddd |
      |             | UserUser   |
      | hr3         |            |
      |             |            |
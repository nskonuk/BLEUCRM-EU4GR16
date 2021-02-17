Feature: Login


  Background:
    Given the user is on the login page
  @login
  Scenario Outline: Authorized login with <username>
      When the user logins with valid "<username>" and password
      Then the user should be able to login

  Examples:
    | username    |
    | hr5         |
    | helpdesk5   |
    | marketing5  |

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
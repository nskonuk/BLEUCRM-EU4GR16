
Feature: Login

  Background:
    Given the user is on the login page

  Scenario Outline: Verify that user should be able to login as <user> with Valid Credentials
    When the user logs in with "<validUsername>" and "<validPassword>"
    Then the user should be able to login

    Examples:
      | user          | validUsername                  | validPassword |
      | HR1           | hr1@cybertekschool.com         | UserUser      |
  #    | HR25          | hr30@cybertekschool.com        | UserUser      |
      | Helpdesk5     | helpdesk2@cybertekschool.com   | UserUser      |
  #    | Helpdesk50    | helpdesk62@cybertekschool.com  | UserUser      |
      | Marketing10   | marketing3@cybertekschool.com  | UserUser      |
  #    | Marketing90   | marketing28@cybertekschool.com | UserUser      |


  Scenario Outline: Verify that user should not be able to login with Invalid Credentials
    When the user logs in with "<invalidUsername>" and "<invalidPassword>"
    Then Login error message should be displayed

    Examples:
      | invalidUsername                | invalidPassword |
      | invalidUsername                | invalidPass     |
      | hr12@cybertekschool.com        | invalidPass     |
      | invalidUsername                | UserUser        |
      |                                |                 |
      | marketing7@cybertekschool.com  |                 |
      |                                | UserUser        |
 @login
  Scenario Outline: <usertype> is logged in
    When the user logged as "<usertype>"

    Examples:
      | usertype  |
      | hr        |
      | helpdesk  |
      | marketing |

 
  Scenario: User is logged successfully
    When the user logged as "usertype"





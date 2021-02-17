@login

Feature: Login


  Background:
    Given the user is on the login page

  Scenario Outline: Authorized login with <username>
      When the user logins with valid "<username>" and password
      Then the user should be able to login

  Examples:
    | username   |
    | hr5        |
    | helpdesk5  |
    | marketing5 |

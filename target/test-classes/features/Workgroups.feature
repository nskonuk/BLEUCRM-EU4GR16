@workg
Feature:
  Background: 
    Given the user is on the login page
    And the user logged as "helpdesk"
    And the user navigates to "Workgroups" module

  Scenario: User joins to groups
    When user finds "Sales" group and clicks join
    Then "Sales" group should have Request has been sent message





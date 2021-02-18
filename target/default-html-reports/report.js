$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Workgroups.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@workg"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.loginPageStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logged as \"helpdesk\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.loginPageStepDefs.the_user_logged_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Workgroups\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.WorkgroupsStepDefs.the_user_navigates_to_module(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User joins to groups",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@workg"
    }
  ]
});
formatter.step({
  "name": "user finds \"Sales\" group and clicks join",
  "keyword": "When "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.WorkgroupsStepDefs.user_finds_group_and_clicks_join(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Sales\" group should have Request has been sent message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.WorkgroupsStepDefs.group_should_have_Request_has_been_sent_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/google.feature");
formatter.feature({
  "name": "Google map API",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add new location",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User want add my payload",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleApi.user_want_add_my_payload()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User submit \"Post\" API",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleApi.user_submit_API(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User want to assert the status code is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleApi.user_want_to_assert_the_status_code_is(Integer)"
});
formatter.result({
  "status": "passed"
});
});
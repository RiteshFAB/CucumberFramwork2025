$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Facebook.feature");
formatter.feature({
  "name": "Validation of Facebbok Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validation of Login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sainty"
    }
  ]
});
formatter.step({
  "name": "User launch Browser and the Facebook url",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.org.FacebookStepDef.user_launch_Browser_and_the_Facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the creads",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.org.FacebookStepDef.user_enters_the_creads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validate the Home page of Facebook Application",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.org.FacebookStepDef.user_validate_the_Home_page_of_Facebook_Application()"
});
formatter.result({
  "status": "passed"
});
});
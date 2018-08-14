$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login on EAG",
  "description": "",
  "id": "login-on-eag",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login on EAG",
  "description": "",
  "id": "login-on-eag;successful-login-on-eag",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to EAG portal",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enters the username",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_navigates_to_EAG_portal()"
});
formatter.result({
  "duration": 113333449807,
  "status": "passed"
});
formatter.match({
  "location": "Login.enters_the_username()"
});
formatter.result({
  "duration": 3421767145,
  "status": "passed"
});
formatter.match({
  "location": "Login.enters_the_password()"
});
formatter.result({
  "duration": 766279617,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_Login_Button()"
});
formatter.result({
  "duration": 138432954970,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_is_able_to_login_successfully()"
});
formatter.result({
  "duration": 9704408997,
  "status": "passed"
});
});
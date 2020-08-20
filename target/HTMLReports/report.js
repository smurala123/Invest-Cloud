$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#"
    },
    {
      "line": 2,
      "value": "#Login Functionality automation with valid and invalid credentials."
    },
    {
      "line": 3,
      "value": "##"
    },
    {
      "line": 4,
      "value": "#@RegressionTest"
    }
  ],
  "line": 5,
  "name": "Test Login Functionality",
  "description": "",
  "id": "test-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9056042400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#@SmokeTest"
    }
  ],
  "line": 7,
  "name": "Check Login with valid credentials",
  "description": "",
  "id": "test-login-functionality;check-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "invest cloud login page url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user is navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPF.invest_cloud_login_page_url()"
});
formatter.result({
  "duration": 155555200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.user_enter_username_and_password()"
});
formatter.result({
  "duration": 1619749000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.clicks_on_login_button()"
});
formatter.result({
  "duration": 146838500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.user_is_navigated_to_home_page()"
});
formatter.result({
  "duration": 5106713300,
  "status": "passed"
});
formatter.after({
  "duration": 2840358300,
  "status": "passed"
});
formatter.before({
  "duration": 7719954900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 13,
      "value": "#\t@invalidCredential"
    }
  ],
  "line": 14,
  "name": "Check Login with invalid credentials",
  "description": "",
  "id": "test-login-functionality;check-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "invest cloud login page url",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "enter invalid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user  get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPF.invest_cloud_login_page_url()"
});
formatter.result({
  "duration": 89000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.enter_invalid_username_and_password()"
});
formatter.result({
  "duration": 1572625000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.clicks_on_login_button()"
});
formatter.result({
  "duration": 170110300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.user_get_error_message()"
});
formatter.result({
  "duration": 3021322000,
  "status": "passed"
});
formatter.after({
  "duration": 2746304000,
  "status": "passed"
});
});
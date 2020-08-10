$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#POC using BDD framework."
    },
    {
      "line": 2,
      "value": "#Login Functionality automation"
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
  "name": "invest cloud logn page url",
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
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPF.invest_cloud_logn_page_url()"
});
formatter.result({
  "duration": 5967284200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.user_enter_username_and_password()"
});
formatter.result({
  "duration": 2615451800,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.clicks_on_login_button()"
});
formatter.result({
  "duration": 142233000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.user_is_navigated_to_home_page()"
});
formatter.result({
  "duration": 29956754400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.close_the_browser()"
});
formatter.result({
  "duration": 4087204000,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 14,
      "value": "#\t@invalidCredential"
    }
  ],
  "line": 15,
  "name": "Check Login with invalid credentials",
  "description": "",
  "id": "test-login-functionality;check-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "invest cloud logn page url",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "enter invalid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user  get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPF.invest_cloud_logn_page_url()"
});
formatter.result({
  "duration": 5697764000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.enter_invalid_username_and_password()"
});
formatter.result({
  "duration": 4734974800,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.clicks_on_login_button()"
});
formatter.result({
  "duration": 133023300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPF.user_get_error_message()"
});
formatter.result({
  "duration": 5024147000,
  "status": "passed"
});
});
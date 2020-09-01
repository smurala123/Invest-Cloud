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
  "duration": 8089858700,
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
  "location": "LoginTest.invest_cloud_login_page_url()"
});
formatter.result({
  "duration": 301847200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_enter_username_and_password()"
});
formatter.result({
  "duration": 1741335100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.clicks_on_login_button()"
});
formatter.result({
  "duration": 117161400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_is_navigated_to_home_page()"
});
formatter.result({
  "duration": 4326334800,
  "status": "passed"
});
formatter.after({
  "duration": 2800537800,
  "status": "passed"
});
formatter.before({
  "duration": 6914214900,
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
  "location": "LoginTest.invest_cloud_login_page_url()"
});
formatter.result({
  "duration": 1646400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.enter_invalid_username_and_password()"
});
formatter.result({
  "duration": 1600992200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.clicks_on_login_button()"
});
formatter.result({
  "duration": 156362000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_get_error_message()"
});
formatter.result({
  "duration": 3051272100,
  "status": "passed"
});
formatter.after({
  "duration": 2756186900,
  "status": "passed"
});
});
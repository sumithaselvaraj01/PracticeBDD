$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "validate NTL login page",
  "description": "",
  "id": "validate-ntl-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginNTL"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Validate login with positive data",
  "description": "",
  "id": "validate-ntl-login-page;validate-login-with-positive-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "open browser as chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as http://www.ntltaxi.com/",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click Loginlink",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter Mobilenumber as 9677109279",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter Password as 545667",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click LoginButton",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 16
    }
  ],
  "location": "LoginNTL.OpenBrowser(String)"
});
formatter.result({
  "duration": 10322380232,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 13
    }
  ],
  "location": "LoginNTL.EnterURL(String)"
});
formatter.result({
  "duration": 6192311974,
  "status": "passed"
});
formatter.match({
  "location": "LoginNTL.ClickLoginLink()"
});
formatter.result({
  "duration": 874382035,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9677109279",
      "offset": 22
    }
  ],
  "location": "LoginNTL.EnterMobilenumber(String)"
});
formatter.result({
  "duration": 176347127,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "545667",
      "offset": 18
    }
  ],
  "location": "LoginNTL.EnterPassword(String)"
});
formatter.result({
  "duration": 105946514,
  "status": "passed"
});
formatter.match({
  "location": "LoginNTL.ClickLoginButton()"
});
formatter.result({
  "duration": 601583,
  "error_message": "java.lang.ArithmeticException: / by zero\r\n\tat LoginTest.LoginNTL.ClickLoginButton(LoginNTL.java:51)\r\n\tat ✽.Then Click LoginButton(login.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/jpeg", "embedded0.jpg");
formatter.after({
  "duration": 213863963,
  "status": "passed"
});
});
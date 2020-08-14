#POC using BDD framework.
#Login Functionality automation
##
#@RegressionTest
Feature: Test Login Functionality
 #@SmokeTest
	Scenario: Check Login with valid credentials
		Given invest cloud logn page url
		When user enter username and password
		And Clicks on login button
		Then user is navigated to home page
		And Close the browser
		
#	@invalidCredential
	Scenario: Check Login with invalid credentials
		Given invest cloud logn page url
		When enter invalid username and password
		And Clicks on login button
		Then user  get error message
		And validate and Close the browser
		
#		
# @SmokeTest
#	Scenario Outline: Check Login with valid credentials
#		Given invest cloud logn page url
#		When user enter <username> and <password>
#		And Clicks on login button
#		Then user is navigated to home page

#Examples:
#|username|password|url|
#|Autotestclient|Test@123456|

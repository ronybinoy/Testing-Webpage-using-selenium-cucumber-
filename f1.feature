Feature: Test login Functionality

	Scenario: Check Login is successful with valid credentials
	 Given browser is open
	 And user is on login page
	 When user enters user and password
	 And user clicks on login
	 Then user is navigated to the home page
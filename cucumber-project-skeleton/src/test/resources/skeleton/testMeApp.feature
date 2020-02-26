Feature: Login Details
This is a test on Online TestMeApp

@Smoke 
Scenario: Valid Login
Given TestMeApp is opened
When  user provides valid username & password
Then User must be able to download

@Sanity
Scenario: Invalid Login
Given TestMeApp is opened
When user provides invalid username & password
Then User should get error message

@Sanity
Scenario: Blank Login
Given TestMeApp is opened
When user  provides blank username or password
Then User should get blank error message
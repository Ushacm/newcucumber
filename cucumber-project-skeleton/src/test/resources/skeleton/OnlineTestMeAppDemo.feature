Feature: Online Login
This is a test for online testme app

Scenario: Valid login
Given OnlineTestMeApp is opened
When I provide valid password
Then User should be able to login
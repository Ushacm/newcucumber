Feature: Online Login
This is a test for online demowebshop

Scenario Outline:
Given User open
When Valid "<Login>"and"<Pass>"
Then Next Page

Examples:
|prahane@gmail.com|prahane|
|prahane1@gmail.com|prahane1|
|prahane2@gmail.com|prahane2|
|prahane3@gmail.com|prahane3|
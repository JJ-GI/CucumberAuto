@Regression
Feature: Login to QAClickAcademy

@Sanity
Scenario Outline: Landing Page Login
Given User is on homepage
When User logging in using <username> and <password>
Then Home page is displayed
And "abc" is displayed on the top
But password is not

Examples:
|username|password|
|a@a.com|pwd|

@Smoke @Sanity
Scenario: Tagging test1
Given Tagging is on
When Tags are applied
Then Only tagged scenario are run

@Smoke
Scenario: Tagging test2
Given Tagging is on
When Tags are applied
Then Only tagged scenario are run

@Sanity
Scenario: Tagging test3
Given Tagging is on
When Tags are applied
Then Only tagged scenario are run
Feature: Login
Scenario: successful Login With valid Credentials
Given user launch chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And User enters Email as "" and password as ""
And Click on Login
When User click on Logout link
And close browser

Scenario Outline: successful Login with Credentials DDT
Given user launch chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And User enters Email as "<email>" and password as "<password>"
And Click on Login
When User click on Logout link
And close browser
 Examples:
     | email | password |
     |   |   | 
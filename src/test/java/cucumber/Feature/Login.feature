Feature: Login functionality for facebook

Background:  
      

Scenario Outline: Login function
Given user should launch the browser and enter the url
When user should enter "<username>" and "<password>"
Then user should click login button
And user should able to login succesfully


Examples:

|username|password|
|harish  |s123456 |
|nandhini|s0988764|




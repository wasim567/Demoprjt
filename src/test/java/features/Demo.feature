Feature: Credit card payment



@RegTest
Scenario: User is able to check the creditcard balance

Given user is on Login page
When user enters "was" and "123"
And clicks on login button
Then user is sucessfully logged into creditcard site
When user clicks on creditcard tab
Then user is able to see the creditcard balance

@SmokeTest @RegTest
Scenario: User is unable to check the creditcard balance

Given user is on Login page
When user enters "akr" and "456"
And clicks on login button
Then user is sucessfully logged into creditcard site
When user clicks on creditcard tab
Then user is able to see the creditcard balance
And able to git

@RegTest
Scenario: User registering in creditcard application

Given user is on Login page
When user clicks on register button and enters the following details
|firstname |Lastname|DOB|Address|City|LandMark|
|second |demo|DOB|Address|City|LandMark|

And clicks on submit button
Then user is sucessfully logged into creditcard site


@SmokeTest
Scenario Outline: User is trying with multiple logins

Given user is on Login page
When user enters <Username> and <Password>
And clicks on login button
Then user is sucessfully logged into creditcard site

Examples:
|Username|Password|
|one|1234|
|two|567|
|five|456|
|three|0123|
|seven|789|



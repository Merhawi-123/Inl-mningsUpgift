Feature: Registration functionality

Scenario Outline: Check registration is successful with valid credentials
Given browser is open 
When 	user is on registration page
Then 	user enters <email> <username> and <password>
And   click on sign up button
Then 	user is navigated to the check email page

Examples: 
|email| username|  password|

|meraforever21@gmail.com|merhawiiii|123456mA#|
|meraforever21@gmail.com|merhamerhamerhamerhamerhamerhamerhamerhamerhamerhamerhamerhamerhamerhamerhamerhamerhamerhamerhamerhamerha|1234567mA!|
|todaymerhawi21@gmail.com|merhawiiiii|123456mA%|
|  |merhawiiiiii|12345678mA&|




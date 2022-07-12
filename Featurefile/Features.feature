Feature: open ultimateqa.com feature
Scenario Outline: open ultimateqa.com and login
 Given user is entering ultimateqa.com
 When user clicks the Courses menu
 And user clicks signIn button
 And types the Email as "<username>"
 And types the "<password>" 
 And clicks signIn button
 Then the user should see their account
 
 Examples: 
 |username|password|
 |testing123@gmail.com|Testing123|
 |testing@gmail.com|Testing123|
 
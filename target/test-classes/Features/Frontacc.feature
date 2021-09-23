Feature: login function
 Scenario Outline: To do data driven testing on login functionality
 Given User is on login page
 When user enters username as "<username>" and password as "<passWord>" and clicks on login
 Then login "<logintype>" be happen
 
 Examples:
 		| username	| passWord | logintype |
 		| demouser  |password  | should    |
 		|admin  |admin123 |shouldNot|
 		|hr |hr123 |should|
 	
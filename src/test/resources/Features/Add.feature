Feature: Addition
 Scenario: Addition of two numbers
 Given I have two numbers as "6" and "12"
 When I do addition
 Then Result should display in the console
 
 Scenario: Addition of two numbers with List
 Given I have two numbers as below
   | 8 |
   |43 |
 When I do addition
 Then Result should display in the console
 
 Scenario: Addition of two numbers with Map
 Given I have two numbers as below map
  | num1 | 7 |
  | num2 | 23 |
 When I do addition
 Then Result should display in the console
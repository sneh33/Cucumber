Feature: Download Page
 Scenario: Verification of download page link
 Given User is on home page of Selenium
 When user clicks on Download link
 Then title should be "Downloads | Selenium"
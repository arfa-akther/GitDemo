@runs
Feature: This is to validate login functionality 


Scenario: Verify the Login form is displayed in login page
Given Launch camp "<URL>" application
Then Click on login tab in homepage
Then Verify login form contain username, password field & login button available


Scenario: Verify the login functionality with valid credentials 
Given Launch camp "<URL>" application
Then Click on login tab in homepage
Then Enter valid username  
Then Enter valid password  
Then Click login button
Then Verify user has logged in successfully
Then Click log out button 


Scenario: Verify the Login feature functionality with invalid credentials 
Given Launch camp "<URL>" application
Then Click on login tab in homepage
Then Enter invalid username
Then Enter invalid password
Then Click login button
Then Verify user can not login successfully with no user exist comment




Scenario: Verify the Login feature functionality with valid username and invalid password
Given Launch camp "<URL>" application
Then Click on login tab in homepage
Then Enter valid username  
Then Enter invalid password
Then Click login button
Then Verify user can not login successfully with wrong pass comment


Scenario: Verify the Login feature functionality with invalid username and valid password  
Given Launch camp "<URL>" application
Then Click on login tab in homepage
Then Enter invalid username
Then Enter valid password  
Then Click login button
Then Verify user can not login successfully with no user exist comment



Scenario: Verify the Login feature functionality with empty credentials 
Given Launch camp "<URL>" application
Then Click on login tab in homepage
Then Keep user name field empty
Then Keep password field empty
Then Click login button
Then Verify user Can not login successfully with no fill out comment
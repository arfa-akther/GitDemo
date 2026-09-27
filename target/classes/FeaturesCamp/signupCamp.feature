Feature: This is a user sign up functionality

Scenario: Verify Signup form is displayed
Given Launch camp "<URL>" application
Then Click on Signup tab in Homepage
Then Verify Signup form contains user name and password field and Signup button available


Scenario: Verify the Signup functionality with new user name and any password successfully 
Given Launch camp "<URL>" application
Then Click on Signup tab in Homepage
Then Enter a new username
Then Enter any password
Then Click Signup button
Then Verify user signed up successfully with Sign up successful comment


Scenario: Verify the Signup functionality without any credentials
Given Launch camp "<URL>" application
Then Click on Signup tab in Homepage
Then Keep the user name field empty 
Then Keep the password field empty
Then Click Signup button
Then Verify user cannot signup successfully with Fill out comment


Scenario: Verify the Signup functionality with an existing user name and a new password
Given Launch camp "<URL>" application
Then Click on Signup tab in Homepage
Then Enter an existing username
Then Enter any new password
Then Click Signup button
Then Verify user cannot signup successfully with comment user exists




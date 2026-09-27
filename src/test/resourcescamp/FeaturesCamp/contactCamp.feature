Feature: This is to validate Contact functionality


Scenario: Verify Contact form is displayed in Homepage	

Given Launch camp "<URL>" application
Then  Click on Contact tab in Homepage
Then  Verify Contact form contains Contact Email, Contact name and Message fields, Send Message and Close buttons available


Scenario: Verify user can send message with complete form
Given Launch camp "<URL>" application
Then Click on Contact tab in Homepage
Then Enter a valid email ID 
Then Enter a valid Contact name 
Then Enter Message
Then Click Send Message button
Then Verify user send message successfully


Scenario: Verify user can not send message with incomplete form
Given Launch camp "<URL>" application
Then Click on Contact tab in Homepage
Then Keep Contact email ID field blank 
Then Keep Contact name field blank
Then Keep Message field blank
Then Click Send Message button
Then Verify user can not send message with incomplete form
Feature: This is to validate About us functionality

Scenario: Verify video is displayed in About us page
Given Launch camp "<URL>" application
Then Click on About Us button in Homepage
Then Verify video is displayed in About us page


Scenario: Verify video plays successfully
Given Launch camp "<URL>" application
Then Click on About Us button in Homepage
Then Click on Play video button to play the video
Then Click on Pause button to pause the video
Then Click on the close button to close the video
Then Verify the video closes successfully


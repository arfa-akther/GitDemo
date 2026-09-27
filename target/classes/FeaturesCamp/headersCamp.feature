Feature: This is to validate Homepage Headers functionality


Scenario: Verify Home link tab in the Homepage is available to access Home page
Given Launch camp "<URL>" application
Then Click on Home button in Homepage
Then Verify Home page is accessible to the user


Scenario: Verify Contact link tab in the Homepage is available to access Login page
Given Launch camp "<URL>" application
Then Click on Contact button in Homepage
Then Verify Contact page is accessible to the user


Scenario: Verify About us link tab in the Homepage is available to access About us page
Given Launch camp "<URL>" application
Then Click on About Us button in Homepage
Then Verify About Us page is accessible to the user


Scenario: Verify Cart link tab in the Homepage is available to access Cart page
Given Launch camp "<URL>" application
Then Click on Cart button in Homepage
Then Verify Cart page is accessible to the user


Scenario: Verify Login link tab in the Homepage is available to access Login page
Given Launch camp "<URL>" application
Then Click on Log In button in Homepage
Then Verify Log in page is accessible to the user


Scenario: Verify Signup link tab in the Homepage is available to access Signup page
Given Launch camp "<URL>" application
Then Click on Sign Up button in Homepage
Then Verify Sign Up page is accessible to the user
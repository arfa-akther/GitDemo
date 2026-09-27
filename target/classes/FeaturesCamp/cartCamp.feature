Feature: This is to validate the cart functionality

Scenario: Verify Product description and Product price are displayed
Given Launch camp "<URL>" application
Then Click on Galaxy Ssix in Homepage
Then Click item add to Cart button
Then Click Cart link tab 
Then Verify product description and product price are displayed in Cart page


Scenario: Verify Place Order button is added
Given Launch camp "<URL>" application
Then Click on Galaxy Ssix in Homepage
Then Click item add to Cart button
Then Click Cart link tab 
Then Click on Place Order button 
Then Verify Place Order window is displayed in Cart page
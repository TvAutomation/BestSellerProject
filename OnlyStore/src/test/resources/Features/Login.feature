Feature: Login User functionality

Background:
    Given User open browser and redirects to Best Seller Website
    When User accept cookies
    

Scenario: Verify that user is successfully login with valid credentials
   
    And User hover profile icon and click on login button
    And User enter username and password
    And User clicks on Login button
    Then User logged in successfully
    

    
@Smoke    
Scenario: Verify that order place successfully with guest customer
    
    And User clicks on Shop Now button on landing page
    And User selects product from listing page
    And User selects size and clicks on add to bag button
    And User clicks on Bag Icon
    And User clicks on Guest Checkout button
    And User fill billing details
    And User Save delivery options
    And User accepts terms and condition checkbox
    And User enters CC card details
    And User clicks on place order buton
    Then User redirects to Success page
    
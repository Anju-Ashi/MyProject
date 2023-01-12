#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@FunctionalTest
Feature: Ecommerce application
 

  @SmokeTest
  Scenario: Succesful login
    Given This is login test
    

  @RegressionTest
  Scenario: Unsuccesfil login
    Given This is a unscuccesful login test
    
    
  @SmokeTest  @RegressionTest
  Scenario: Add a product to cart
    Given This is add to cart test
  
  
  @SmokeTest  @RegressionTest
  Scenario: Add multiple product to cart
    Given This is multiple product addtocart test
    
  
  Scenario: Remove a product from the  cart
    Given This removing  product from cart test  
  
    
  @EndtoEndTest
  Scenario: Remove product quantity from bag page
    Given This product quantity from bag  test  
    
    
  @SmokeTest  @EndtoEndTest
  Scenario: Decrease product quantity from bag page
    Given This Decrease product quantity from bag test  
    
    
  @EndtoEndTest  @SmokeTest
  Scenario: Buy a product with cash payment
    Given This is buy a product with cash payment bag test  
    
    
  Scenario: Buy a product with CC payment
    Given This is buy a product with CC payment  test  
    
    
  @EndtoEndTest  @RegressionTest
  Scenario: Payment declined
    Given This is Payment declined  test  
    
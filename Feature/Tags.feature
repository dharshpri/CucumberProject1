
Feature: ECommerce Application

@SmokeTest @RegressionTest
Scenario: Successful Login
Given Login test

@RegressionTest
Scenario: UnSuccessful Login
Given Login fail

@SmokeTest 
Scenario: Add a product to bag
Given product add

Scenario: Add multiple product to bag
Given multi products

@MagentoForgetPasswordPageModule
Feature: Forgot Password functionality

  Background: 
    Given I am on the homepage
    When I click on the Sign In button in Homepage
    Given I am on the "Customer Login" page
    When I click on the Forgot Password link

  Scenario Outline: Navigating to Forgot Password Page
    Then I should be redirected to the Forgot Password page and validate the title "Forgot Your Password?"
    And I should see all the fields in Forget Password Page

  Scenario Outline: Resetting Password with Email
    Given I am on the "Forgot Your Password?" page
    When I enter "<Email>" in the Email Address field in forgot password
    And I click on the Reset My Password button
    Then I should be redirected to the Customer Login page and Validate "Customer Login"

    Examples: 
      | Email                     |
      | jebastarakesh98@gmail.com |

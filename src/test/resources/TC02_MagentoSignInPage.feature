@MagentoSignPageModule
Feature: Customer login functionality

  Background: 
    Given I am on the homepage
    When I click on the Sign In button in Homepage

  Scenario Outline: Navigating to Customer Login Page
    Then I should be redirected to the Customer Login page and Validate title "Customer Login"
    And I should see all the fields in Customer Login Page

  Scenario Outline: Successfully logging in with valid credentials
    Given I am on the Customer "Customer Login" page
    When I enter "<Email>" in the Email Address field
    And I enter "<Password>" in the Password field in Customer Login Page
    And I click on the Submit Sign In button in Customer Login Page
    Then I should be redirected to my account dashboard and verify the title "Home Page"
    And I should see a welcome message with my name "<FirstName> <LastName>"

    Examples: 
      | Email                     | Password         | FirstName | LastName |
      | jebastarakesh98@gmail.com | jebastarakesh12. | jebasta   | Rakesh   |

  Scenario Outline: Logging in with invalid email
    Given I am on the Customer "Customer Login" page
    When I enter "<Email>" in the Email Address field
    And I enter "<Password>" in the Password field in Customer Login Page
    And I click on the Submit Sign In button in Customer Login Page
    Then I should see an error message "<ErrorMessage>" for Invalid Email field

    Examples: 
      | Email           | Password         | ErrorMessage                                                 |
      | jebastarakesh98 | jebastarakesh12. | Please enter a valid email address (Ex: johndoe@domain.com). |

  Scenario Outline: Leaving password field empty
    Given I am on the Customer "Customer Login" page
    When I enter "<Email>" in the Email Address field
    And I leave "<Password>" in the Password field
    And I click on the Submit Sign In button in Customer Login Page
    Then I should see an error message "<ErrorMessage>" in password Field

    Examples: 
      | Email                     | Password | ErrorMessage              |
      | jebastarakesh98@gmail.com |          | This is a required field. |

@MagentoCreateAccountPage
Feature: User creates a new customer account

  Background: 
    Given I am on the homepage
    When I click on Create an Account

  Scenario Outline: Navigating to "Create New Customer Account" page
    Then I should be redirected to the "Create New Customer Account" page
    And I should see all the fields

  Scenario Outline: Successfully creating a new account with valid details
    Given I am on the "Create New Customer Account" page
    When I enter "<FirstName>" in the First Name field
    And I enter "<LastName>" in the Last Name field
    And I enter "<Email>" in the Email field
    And I enter "<Password>" in the Password field
    And I enter "<ConfirmPassword>" in the Confirm Password field
    And I click on the Submit Sign In button
    Then I should get the Error Message "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account."

    Examples: 
      | FirstName | LastName | Email                     | Password         | ConfirmPassword  | ErrorMessage |
      | jebasta   | Rakesh   | jebastarakesh98@gmail.com | jebastarakesh12. | jebastarakesh12. |              |

  Scenario Outline: Displaying an error when passwords do not match
    Given I am on the "Create New Customer Account" page
    When I enter "<FirstName>" in the First Name field
    And I enter "<LastName>" in the Last Name field
    And I enter "<Email>" in the Email field
    And I enter "<Password>" in the Password field
    And I enter "<ConfirmPassword>" in the Confirm Password field
    And I click on the Submit Sign In button
    Then I should see an error message "<ErrorMessage>" for password do not match

    Examples: 
      | FirstName | LastName | Email                     | Password         | ConfirmPassword | ErrorMessage                       |
      | jebasta   | Rakesh   | jebastarakesh98@gmail.com | jebastarakesh12. | jebasta         | Please enter the same value again. |

  Scenario Outline: Displaying an error when an invalid email is entered
    Given I am on the "Create New Customer Account" page
    When I enter "<FirstName>" in the First Name field
    And I enter "<LastName>" in the Last Name field
    And I enter "<Email>" in the Email field
    And I enter "<Password>" in the Password field
    And I enter "<ConfirmPassword>" in the Confirm Password field
    And I click on the Submit Sign In button
    Then I should see an error message "<ErrorMessage>" for invalid Email

    Examples: 
      | FirstName | LastName | Email           | Password         | ConfirmPassword  | ErrorMessage                                                 |
      | jebasta   | Rakesh   | jebastarakesh98 | jebastarakesh12. | jebastarakesh12. | Please enter a valid email address (Ex: johndoe@domain.com). |

  Scenario Outline: Displaying an error when a required field is left empty
    Given I am on the "Create New Customer Account" page
    When I leave "<FirstName>" in the First Name field
    And I enter "<LastName>" in the Last Name field
    And I enter "<Email>" in the Email field
    And I enter "<Password>" in the Password field
    And I enter "<ConfirmPassword>" in the Confirm Password field
    And I click on the Submit Sign In button
    Then I should see an error message "<ErrorMessage>" for missing field

    Examples: 
      | FirstName | LastName | Email                     | Password         | ConfirmPassword  | ErrorMessage              |
      |           | Rakesh   | jebastarakesh98@gmail.com | jebastarakesh12. | jebastarakesh12. | This is a required field. |

  Scenario Outline: Displaying an error when the password does not meet security criteria
    Given I am on the "Create New Customer Account" page
    When I enter "<FirstName>" in the First Name field
    And I enter "<LastName>" in the Last Name field
    And I enter "<Email>" in the Email field
    And I enter "<Password>" in the Password field
    And I enter "<ConfirmPassword>" in the Confirm Password field
    And I click on the Submit Sign In button
    Then I should see an error message "<ErrorMessage>" for password Security criteria

    Examples: 
      | FirstName | LastName | Email                     | Password | ConfirmPassword | ErrorMessage                                                                                                       |
      | jebasta   | Rakesh   | jebastarakesh98@gmail.com | jeba1    | jeba1           | Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored. |

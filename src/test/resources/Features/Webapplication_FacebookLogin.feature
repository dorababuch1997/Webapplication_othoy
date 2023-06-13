#Author: dorababu5424@gmail.com
@BBD_UI
Feature: Facebook login functionality

  Scenario Outline: Verify successful login
    Given Open the url "https://www.facebook.com/"
    When Enter valid "<username>" and "<password>".
    And click on the login button
    Then Verify that the user is successfully logged in and redirected to the home page

    Examples: 
      | username               | password     |
      | dorababu5424@gmail.com | Dorababu1234 |

  Scenario Outline: Verify Unsuccessful login
    Given Open the url "https://www.facebook.com/"
    When Enter valid "<username>" and "<password>".
    And click on the login button
    Then Verify that an error message is displayed indicating that the login was unsuccessful.

    Examples: 
      | username               | password     |
      | dorababu5424@gmail.com | Dorababu1234 |

Feature: login functionality

  @Login
  Scenario: scenario login

    Given user on "https://automationexercise.com/"
    When  user click LoginSign button
    And   user login with the following credentials
      | username | atezgider@gmail.com |
      | password | ahmet123            |
    Then  login should be successfull



  @Register
  Scenario: Register User
    Given user on "https://automationexercise.com/"
    When  user click LoginSign button
    And   user enter name and email address and click Signup button
    Then  verify that ENTER ACCOUNT INFORMATION is visible
    And   user fill details: Title, Name, Email, Password, Date of birth and click Create Account button
    Then  verify that ACCOUNT CREATED! is visible
    And   user click Continue button
    Then  verify that Logged in as username is visible
    And   user click Delete Account button
    Then  verify that ACCOUNT DELETED! is visible and click Continue button

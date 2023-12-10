Feature: Check login funtionality with valid and invalid credentials

  Background: 
    Given user is on the website home page
    And user click on get started button
    When user is navigated to the login home page
    Then user clicks on the sign in button

  @signin1
  Scenario: Check login funtionality with valid username and password
    Given user enters valid username and password
    When user clicks on the login button
    Then user is navigated to the portal home page
    And after reaching to portal home page user clicks on the logout button

  @signin2
  Scenario: invalid username and valid password
    Given user enters invalid username and valid password
    When click on login button
    Then System should alert user

  @signin3
  Scenario: valid username and invalid password
    Given user enters valid username and invalid password
    When click on login button
    Then System should alert user

  @signin4
  Scenario: invalid username and invalid password
    Given user enters invalid username and invalid password
    When click on login button
    Then System should alert user

@stack
Feature: Check funtionality for Stack

  Background: 
    Given user is on the website page and click on get started button
    When user is navigated to the login page now user clicks on sign in button
    Then user enters username and password and click login button
    And user is on the home page and click on Stack get started button

  Scenario: Operations in Stack
    Given user scroll downs and click on the Operations in Stack link
    And user scrolls down and clicks on TRY HERE button
    When user redirected to page tryeditor with  Run button to test
    Then after writing code in tryeditor, user click on RUN button to check result
    And user close the window

  Scenario: Implementation
    Given user scroll downs and click on the Implementation link
    And user scrolls down and clicks on TRY HERE button
    When user redirected to page tryeditor with  Run button to test
    Then after writing code in tryeditor, user click on RUN button to check result
    And user close the window

  Scenario: Applications
    Given user scroll downs and click on the applications link
    And user scrolls down and clicks on TRY HERE button
    When user redirected to page tryeditor with  Run button to test
    Then after writing code in tryeditor, user click on RUN button to check result
    And user close the window

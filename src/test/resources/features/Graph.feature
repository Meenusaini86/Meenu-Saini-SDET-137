@graph
Feature: Check funtionality for Graph

  Background: 
    Given user is on the website page and click on get started button
    When user is navigated to the login page now user clicks on sign in button
    Then user enters username and password and click login button
    And user is on the home page and scroll down click on graph get started button

  Scenario: Graph
    Given user scroll downs and click on the graph link
    And now scrolls down and clicks on TRY HERE button
    When redirected to page tryeditor and write text in it
    Then user click on RUN button to check result
    And user close the window

  Scenario: Graph Representations
    Given user scroll downs and click on the Graph Representations link
    And now scrolls down and clicks on TRY HERE button
    When redirected to page tryeditor and write text in it
    Then user click on RUN button to check result
    And user close the window

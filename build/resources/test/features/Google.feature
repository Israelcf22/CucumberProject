Feature: Test Google Search functionality

  Scenario: As an user I enter a search criteria in google
    Given I am on the Google search page
    When I enter a search criteria
    And Click on the search button
    Then The results match the criteria

Feature: successful login

  Scenario: perform a successful login
    Given I as a user need to enter the page
    When I enter the data
      | username      | password     |
      | standard_user | secret_sauce |
    Then successful entry

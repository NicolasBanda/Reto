Feature: As a user of the service, I need to validate if the
  filter option works to validate that the first item that
  appears is the one with the highest price.

  Scenario: check filter button
    Given I as a user need to enter the page
    When I enter the data
      | username      | password     |
      | standard_user | secret_sauce |
      And select the filter option
    Then we select largest to smallest
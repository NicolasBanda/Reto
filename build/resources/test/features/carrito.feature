Feature: As a user of the service, I need to operate with the
  products to check the operation of the shopping cart.

  Scenario: validate cart operation
    Given I as a user need to enter the page
    When I enter the data
      | username      | password     |
      | standard_user | secret_sauce |
      And we select the products
    Then We enter the shopping cart to see the products
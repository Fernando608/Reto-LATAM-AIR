@story
Feature: as an administrator of the opencart online store, I want to consult the orders in the sales area.

    I as administrator
    want to search for orders in sales
    to visualize their information
  @scenario1
    Scenario: orders by customer
      Given I want to search for orders by customer
      When I filter by customer name
      Then  displays the orders in your name

  @scenario2
  Scenario: orders by date
    Given I want to search for orders by date added
    When filtering by date added
    Then  displays the orders by the date added

  @scenario3
  Scenario: orders by ID
    Given I want to search for orders by Id
    When filtering by order Id
    Then  displays the orders by order Id
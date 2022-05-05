@story
Feature: as an administrator of the opencart online store, I want to consult the orders in the sales area.

    I as administrator
    want to search for orders in sales
    to visualize their information

  @scenario
  Scenario: login and filter sales orders
    Given I want to log in to the opencart site
    When I enter my credentials
    |username|password|
    |demo    |demo    |
    And filter orders by customer
    |customer   |
    |David Singh|
    And filtering by date added
      |date_added  |
      |2022-05-05  |
    Then  filtered sales orders are displayed
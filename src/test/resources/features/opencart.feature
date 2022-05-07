@story
Feature: as an administrator of the opencart online store, I want to consult the orders in the sales area.

    I as administrator
    want to search for orders in sales
    to visualize their information

  Background: User is Logged In
    Given I navigate to the login page
    And I submit username and password
      |username|password|
      |demo    |demo    |
  @scenario1
    Scenario: Validate is Logged In
    Then this element Sales is clikeable

  @scenario2
  Scenario: search orders by customer in sales
    When filter orders by customer and date added
    |customer   |date_added  |
    |David Singh|2022-05-05  |
    Then  filtered sales orders are displayed David Singh

  @scenario3
  Scenario: Add Gift Vouchers for users
    When add new gift voucher
    |code|from_name|from_email      |to_name|to_email           |amount|
    |1234|JCuper   |jcuper@email.com|Alberto|alberto28@email.com|20000|
    Then view to message Warning: You do not have permission to modify vouchers!




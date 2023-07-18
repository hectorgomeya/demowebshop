Feature: delete cart page
  Scenario: Delete cart page
    Given Go to login button
    Then Insert user "hectorgomeya@gmail.com" and password "1qaz2wsx" and "correcto"
    And Find product "Computing and Internet" and category "Books"
    And Buy a product
    And Find product "Fiction" and category "Books"
    And Buy a product
    And Go to cart
    And Delete a buy
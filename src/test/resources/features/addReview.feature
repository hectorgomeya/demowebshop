Feature: add review to product
  Scenario: add review to product
    Given Go to login button
    Then Insert user "hectorgomeya@gmail.com" and password "1qaz2wsx" and "correcto"
    And Find product "Computing and Internet" and category "Books"
    And Review a product "Prueba"  "Test"  "4"
Feature: Add review
  Scenario: Add review
    Given I test scenario name
    Then Go to login button
    And Insert user "hectorgomeya@gmail.com" and password "1qaz2wsx" and "correcto"
    And Find product "Computing and Internet" and category "Books"
    And Review a product "Prueba"  "Test"  "4"
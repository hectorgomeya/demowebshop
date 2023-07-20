Feature: Navigation
  Scenario: Comprobamos que si vamos a la cartera y no aceptamos los criterios salta un mensaje
    Given Go to login button
    Then Insert user "hectorgomeya@gmail.com" and password "1qaz2wsx" and "correcto"
    And Find product "Computing and Internet" and category "Books"
    And Buy a product
    And Go to cart
    And Go to check out without accept terms

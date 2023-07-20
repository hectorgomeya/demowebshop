Feature: BUY PATH
  Scenario: BUY PATH
    Given Go to login button
    Then Insert user "hectorgomeya@gmail.com" and password "1qaz2wsx" and "correcto"
    And Find product "Computing and Internet" and category "Books"
    And Buy a product
    And Find product "Fiction" and category "Books"
    And Buy a product
    And Go to cart
    And Estimate a shipping
    And Go to checkout
    And Set data check out Name: "Hector" Second Name "Gomez" Country "Spain" City "Valencia" and postal code "44521" and number "1234456789" and direccion "prueba"


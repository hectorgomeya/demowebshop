Feature: Navigation
  Scenario: Navigation books
    Given Go to login button
    Then Insert user "hectorgomeya@gmail.com" and password "1qaz2wsx" and "correcto"
    And Find product "Computing and Internet" and category "Books"
    And Buy a product
    And Find product "Fiction" and category "Books"
    And Buy a product
    And Go to cart
    And Estimate a shipping
    And Go to checkout
    And Set data check out

  Scenario: Navigation Desktops
    Then Check than we can navigate to ComputersDesktops


  Scenario: Navigation Notebooks
    Then Check than we can navigate to Notebooks

  Scenario: Navigation Accesoires
    Then Check than we can navigate to accessories


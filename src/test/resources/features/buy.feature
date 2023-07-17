Feature: Navigation
  Scenario: Navigation books
    Given Go to login button
    Then Insert user "hectorgomeya@gmail.com" and password "1qaz2wsx" and "correcto"
    Then Check than we can navigate to Books
    And Buy a book
    And Check than we can navigate to shoes
    And Buy a shoes
    And Go to cart
    And Delete a buy

  Scenario: Navigation Desktops
    Then Check than we can navigate to ComputersDesktops


  Scenario: Navigation Notebooks
    Then Check than we can navigate to Notebooks

  Scenario: Navigation Accesoires
    Then Check than we can navigate to accessories


Feature: Login Test Cases


  Scenario: login correct and log_out
Given Go to login button
Then Insert user "hectorgomeya@gmail.com" and password "1qaz2wsx" and "correcto"
    And Log out from demowebshop

  Scenario: login incorrect
    Given Go to login button
    Then Insert user "hectorgomeya@gmail.com" and password "121sa121" and "incorrect"

  Scenario: bad email
    Given Go to login button
    Then Insert user "hectorgomeya" and password "null" and "mailincorrecto"
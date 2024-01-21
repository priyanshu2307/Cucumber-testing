Feature: Greeting API

  Scenario: Test greeting with default name
    Given the greeting endpoint is available
    When I request the greeting with name "World"
    Then the response should contain "Hello, World!"


  Scenario: Get a tailored greeting
    Given the greeting endpoint is available
    When I request the greeting with name "Spring Community"
    Then the response should contain "Hello, Spring Community!"
    
Feature: Random joke validation

  As a user
  I want to retrieve a random joke
  So that I can share it

  Background:
    Given the joke service is available

  @ScenarioC
  Scenario: Retrieve a random joke and verify response patterns
    When the user requests a random joke
    Then the response status should be 200
    And the joke fields should match the following patterns:
      | field     | pattern    |
      | type      | ^.+$       |
      | setup     | ^.+$       |
      | punchline | ^.+$       |
      | id        | ^[1-9]\d*$ |
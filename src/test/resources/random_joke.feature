Feature: Random Joke retrieval

  As a user
  I want to retrieve a random joke
  So that I can share it

  @ScenarioA @Positive
  Scenario: Retrieve a random joke and verify response structure
    Given the joke service is available
    When the user requests a random joke
    Then the response status should be 200
    And the response should contain type property
    And the response should contain setup property
    And the response should contain punchline property
    And the response should contain id property
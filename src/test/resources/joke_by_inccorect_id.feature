Feature: Joke retrieval with incorrect  id

  As a user
  I want to receive proper feedback when a joke does not exist
  So that I understand why attempt failed

  @ScenarioD @Negative
  Scenario: Scenario: Attempt to retrieve a joke that does not exist
    Given the joke service is available
    When the user retrieves a specific joke by id 999
    Then the response status should be 404
    And the response should contain type property with "error" value
    And the response should contain message property with "joke not found" value
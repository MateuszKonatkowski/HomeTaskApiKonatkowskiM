Feature: Specific Joke retrieval

  As a user
  I want to retrieve a specific joke
  So that I can share it

  @ScenarioB
  Scenario Outline: Retrieve a specific joke by id
    Given the joke service is available
    When the user retrieves a specific joke by id <jokeId>
    Then the response status should be 200
    And the response should contain type property with "<typeValue>" value
    And the response should contain setup property with "<setupValue>" value
    And the response should contain punchline property with "<punchlineValue>" value
    And the response should contain id property with <idValue> value
    Examples:
      | jokeId | typeValue   | setupValue                                               | punchlineValue          | idValue |
      | 1      | general     | What did the fish say when it hit the wall?              | Dam.                    | 1       |
      | 5      | general     | Why can't bicycles stand on their own?                   | They are two tired      | 5       |
      | 12     | knock-knock | Knock knock. \n Who's there? \n Cows go. \n Cows go who? | No, cows go moo.        | 12      |
      | 32     | programming | Which song would an exception sing?                      | Can't catch me - Avicii | 32      |
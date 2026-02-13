Project Goal:

Create simple test automation framework to test Joke Api using Rest assured nad Cucumber


## Testing Approach

- Verification of HTTP status codes
- Validation of response structure
- Field-level assertions
- Dynamic validation using Scenario Outline
- Flexible validation using DataTables

The primary focus was on functional API validation:
- Happy path scenarios (valid joke retrieval)
- ID-based joke validation
- Response structure consistency


### Development process
Step 1 - Setup
- Create Maven Project
- Add dependencies
- Create basic folder tree
- configure cucumber
- Create hooks

Step 2 - Scenario A

- Create feature file
- Create cucumber scenario A
- Add stepdefinitons steps

Step 3 - Scenario B

- Create feature file
- Create cucumber scenario B
- Add stepdefinitons steps

Step 4 - Scenario C

- Create feature file
- Create cucumber scenario C
- Add stepdefinitons steps


Step 5 - Finising
- Add readme file
- Add devlog file

## Technical Decisions

- Used TestNG because Cucumber does not natively support JUnit 5 without additional configuration.
- Created separate `.feature` files to improve readability and maintainability.
- Used Hooks to configure the base URI and avoid boilerplate code in step definitions.
- Left the `Given` step implementation minimal because the tested API does not require authentication.
  In real-world scenarios, this step would typically include authorization or environment setup.
- Used Scenario Outline to validate multiple joke IDs dynamically.
- Implemented DataTable for flexible field validation without hardcoding assertions.
- Kept the framework minimal to focus on clarity and maintainability.
- Chose RestAssured because of its strong integration with Java and readable DSL for API validation.

## AI Usage
- Suggest regular expression patterns for response validation.
- Provide guidance on handling regex validation within step definitions.
- Improve documentation formatting and structure.
- Enhance readability of `.feature` files.
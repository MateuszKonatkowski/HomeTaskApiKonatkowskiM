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
- Negative path scenario (valid non-existing joke retrieval)
- ID-based joke validation
- Response structure consistency

### Development process

I started by creating a Maven project and configuring:

Step 1 - Setup

- Create Maven Project
- Add dependencies
- Create basic folder tree
- configure cucumber
- Create hooks

I separated the structure into runners, step definitions, hooks and feature files to keep responsibilities clear.

Hooks were added to centralize configuration (base URI) and avoid repeating setup code.

Step 2 - Scenario "Retrieve a random joke and verify response structure" (plain text)

The first scenario validates retrieving a random joke.

- Create feature file
- Create cucumber scenario A
- Add stepdefinitons steps

Why?
Because it verifies:

- API availability
- Basic response structure
- Required JSON fields

This confirms that the core endpoint works as expected.

Step 3 - Scenario "Retrieve a specific joke by id" (Scenario Outline)

Next, I implemented a Scenario Outline to validate joke retrieval by ID.

- Create feature file
- Create cucumber scenario B
- Add stepdefinitons steps

Why?
To demonstrate:

- Parameterization
- Data-driven testing
- Dynamic value validation

This shows the framework can handle multiple inputs without duplicating scenarios.

Step 4 - Scenario "Retrieve a random joke and verify response patterns"(DataTable + Regex)

This scenario focuses on validating response using regular expression.

- Create feature file
- Create cucumber scenario C
- Add stepdefinitons steps

Why?
To show:

- Flexible validation
- Regex usage

It demonstrates more advanced but still readable validation.

Step 5 - Scenario "Attempt to retrieve a joke that does not exist" (Negative scenario)

I added a negative test case to verify behavior when requesting a non-existing joke ID.

- Create feature file
- Create cucumber scenario D
- Add stepdefinitons steps

Why?
Proper error handling is as important as successful responses

Step 6 - Finising

At the end, I added a README.md file with the project structure and instructions on how to run the tests.  
I also created a DEVLOG.md file to describe my development process and explain my approach and decision-making.

- Add readme file
- Add devlog file

Why?

Documentation helps others understand how to use the framework and provides insight into the creator’s thought process
and technical decisions.

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
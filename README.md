## Official Joke API – Test Automation Framework

### Description
Simple rest api autoamtion project created to test Joke Api using Rest assured nad Cucumber

### Tech Stack
- Maven

- Java 17

- Rest Assured

- TestNg

- Cucumber

- Hamcrest

## How to clone repo
Clone repo
```
git clone https://github.com/MateuszKonatkowski/official-joke-api-tests.git
```
Change directory
```
cd official-joke-api-tests
```
### How to run tests
Run all tests
```
mvn clean test
```
Run tests by tag

```
mvn test -Dcucumber.filter.tags="@ScenarioA"
```
Run scenario by name
```
mvn test -Dcucumber.filter.name="Retrieve a random joke"
```
### Project Structure
```
📦 src
├─ mian/java
└─ test/java
   ├─  runners
   ├─ stepdefinitions 
   └─ hooks
└─ test/resources
   └─ features
pom.xml
README.md
DEVLOG.md
```


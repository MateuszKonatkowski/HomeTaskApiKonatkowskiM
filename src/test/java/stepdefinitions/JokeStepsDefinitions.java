package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class JokeStepsDefinitions {
    private Response response;
    private final String PATH = "/jokes";

    @Given("the joke service is available")
    public void theJokeServiceIsAvailable() {

    }

    @When("the user requests a random joke")
    public void theUserRequestsARandomJoke() {
        response = given()
                .when()
                .get(PATH + "/random");

    }

    @When("the user retrieves a specific joke by id {int}")
    public void theUserRetrieveASpecificJokeByIdJokeId(int jokeId) {
        response = given()
                .when()
                .get(PATH + "/" + jokeId);
    }

    @Then("the response status should be {int}")
    public void theResponseStatusShouldBe(int status) {
        response.then().statusCode(status);
    }

    @And("the response should contain type property")
    public void theResponseShouldContainTypeProperty() {
        response.then()
                .body("type", not(emptyOrNullString()))
                .body("type", instanceOf(String.class));

    }

    @And("the response should contain setup property")
    public void theResponseShouldContainSetupProperty() {
        response.then()
                .body("setup", not(emptyOrNullString()))
                .body("setup", instanceOf(String.class));
    }

    @And("the response should contain punchline property")
    public void theResponseShouldContainPunchlineProperty() {
        response.then()
                .body("punchline", not(emptyOrNullString()))
                .body("punchline", instanceOf(String.class));
    }

    @And("the response should contain id property")
    public void theResponseShouldContainIdProperty() {
        response.then()
                .body("id", not(emptyOrNullString()))
                .body("id", instanceOf(Integer.class))
                .body("id", greaterThan(0));
    }

    @And("the response should contain type property with {string} value")
    public void theResponseShouldContainTypePropertyWithValue(String typeValue) {
        response.then()
                .body("type", equalTo(typeValue));
    }

    @And("the response should contain setup property with {string} value")
    public void theResponseShouldContainSetupPropertyWithValue(String setupValue) {
        response.then()
                .body("setup", equalTo(setupValue));
    }

    @And("the response should contain punchline property with {string} value")
    public void theResponseShouldContainPunchlinePropertyWithValue(String punchlineValue) {
        response.then()
                .body("punchline", equalTo(punchlineValue));
    }

    @And("the response should contain id property with {int} value")
    public void theResponseShouldContainIdPropertyWithIdValueValue(int idValue) {
        response.then()
                .body("id", equalTo(idValue));
    }

    @And("the joke fields should match the following patterns:")
    public void theJokeFieldsShouldMatchTheFollowingPatterns(DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        for (Map<String, String> row : rows) {
            String field = row.get("field");
            String pattern = row.get("pattern");
            String value = response.jsonPath().getString(field);
            assertThat(value, matchesPattern(pattern));
        }
    }

}

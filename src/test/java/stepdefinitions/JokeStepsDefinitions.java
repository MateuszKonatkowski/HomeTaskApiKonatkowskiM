package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
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

}

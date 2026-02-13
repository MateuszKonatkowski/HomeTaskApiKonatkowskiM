package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;

public class Hooks {


    @Before
    public void setUp(Scenario scenario) {
        RestAssured.baseURI = "https://official-joke-api.appspot.com";
    }

    @After
    public void tearDown(Scenario scenario) {
        RestAssured.reset();
    }
}

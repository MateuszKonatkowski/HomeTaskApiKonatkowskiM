package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"stepdefinitions", "hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class JokeRunner extends AbstractTestNGCucumberTests {
}

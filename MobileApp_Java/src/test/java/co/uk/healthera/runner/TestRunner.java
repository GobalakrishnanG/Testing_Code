package co.uk.healthera.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/co/uk/healthera/features/01_validEmailLogin.feature",
        //tags = {"@p1"},
        glue = {"co/uk/healthera/steps", "co/uk/healthera/hooks"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

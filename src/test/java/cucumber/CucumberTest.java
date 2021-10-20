package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/cucumber",
        glue = {"cucumber", "runner"},
        plugin = {"pretty"})
public class CucumberTest extends AbstractTestNGCucumberTests {
}

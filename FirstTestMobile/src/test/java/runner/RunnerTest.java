package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty", "html:target/report-html"}, monochrome = true,
        features = "src/test/resources",
        glue = "stepsDefinitions")
@Test
public class RunnerTest extends AbstractTestNGCucumberTests {

}

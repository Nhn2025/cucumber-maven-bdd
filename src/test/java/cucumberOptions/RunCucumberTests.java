package cucumberOptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)
//cm

@Test
public class RunCucumberTests extends AbstractTestNGCucumberTests {

}
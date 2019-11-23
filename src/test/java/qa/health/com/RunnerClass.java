package qa.health.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",dryRun =false,strict = true,tags = "@SmokeTestCase",
        plugin = {"json:target/cucumber.json-report","pretty","html:target/cucumber.html-report","junit:target/cucumber.xml-report"
                ,"pretty:target/cucumber.txt-report"})

public class RunnerClass {
}

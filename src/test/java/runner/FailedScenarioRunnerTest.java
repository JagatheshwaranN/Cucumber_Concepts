package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed_scenario.txt", glue = {"steps"},
        plugin = { "pretty",
        "json:target/cucumber/report/report.json", "junit:target/cucumber/report/report.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/failed_scenario.txt"},
        publish = true, monochrome = true)
public class FailedScenarioRunnerTest extends AbstractTestNGCucumberTests {

}

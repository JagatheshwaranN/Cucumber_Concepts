package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/", tags = "@hooksTagDemo" , glue = {"steps"},
        plugin = { "pretty",
        "json:target/cucumber/report/report.json", "junit:target/cucumber/report/report.xml"},
        publish = true, monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {


}

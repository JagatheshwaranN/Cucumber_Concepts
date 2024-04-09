package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/", tags = "@cart and not @logout and not @login" , glue = "concepts/steps",
        plugin = { "pretty",
        "json:target/cucumber/report/report.json", "junit:target/cucumber/report/report.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
        publish = true, monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {


}

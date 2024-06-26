package junit.parallel;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/parallel/", glue = {"parallel.steps"},
        plugin = { "pretty",
                "json:target/cucumber/report/report.json", "junit:target/cucumber/report/report.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "timeline:target/test-output-thread/"},
        publish = true, monochrome = true
)
public class ParallelRunJunitTest {


}

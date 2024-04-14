package parallel.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/parallel/LoginPage.feature", glue = {"parallel.steps"},
        plugin = { "pretty"},
        publish = true, monochrome = true)
public class SerenityRunnerTest {

}



/*
 * Serenity Aggregate Report is not generated automatically. We need to execute the tests first
 * using mvn verify command. Then, to generate the report, we need to run mvn serenity:aggregate
 * command. But still, after execution of the above command, the report is generated but broken.
 * Need to debug it further.
 *
 * Issue Reference - https://github.com/serenity-bdd/serenity-junit-starter/issues/7
 *
 */

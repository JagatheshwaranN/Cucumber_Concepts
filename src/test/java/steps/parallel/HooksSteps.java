package steps.parallel;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HooksSteps {

    public WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        OrangeHRMTestSteps orangeHRMTestSteps = new OrangeHRMTestSteps(driver);
        NOPCommerceTestSteps nopCommerceTestSteps = new NOPCommerceTestSteps(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExtentReportTestSteps {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Given("User on Orange HRM login page")
    public void user_on_orange_hrm_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("Orange HRM dashboard page should display")
    public void orange_hrm_dashboard_page_should_display() {
        driver.findElement(By.xpath("//div[@class='oxd-topbar-header']//h6[text()='Dashboard']")).isDisplayed();
    }

    @Given("User on Orange HRM dashboard page")
    public void user_on_orange_hrm_dashboard_page() {
        driver.findElement(By.xpath("//div[@class='oxd-topbar-header']//h6[text()='Dashboard']")).isDisplayed();
    }

    @Given("Orange HRM dashboard page title should display")
    public void orange_hrm_dashboard_page_title_should_display() {
        driver.findElement(By.xpath("//div[@class='oxd-topbar-header']//h6[text()='Dashboard']")).isDisplayed();
    }

    @When("User clicks UserIcon drop down")
    public void user_clicks_user_icon_drop_down() {
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
    }

    @When("User clicks on Logout option")
    public void user_clicks_on_logout_option() {
        driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//li[position()=4]")).click();
    }

    @Then("Orange HRM should be logged out")
    public void orange_hrm_should_be_logged_out() {
        driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).isDisplayed();
    }

}

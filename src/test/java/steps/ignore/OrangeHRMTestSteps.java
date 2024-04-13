package steps.ignore;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHRMTestSteps {

    private final WebDriver driver;

    OrangeHRMTestSteps(WebDriver driver){
        this.driver = driver;
    }

    @Given("User on OHRM login page")
    public void user_on_orange_hrm_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("User enters OHRM username {string}")
    public void user_enters_username(String username) {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
    }

    @When("User enters OHRM password {string}")
    public void user_enters_password(String password) {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    }

    @When("User clicks OHRM login button")
    public void user_clicks_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("OHRM dashboard page should display")
    public void orange_hrm_dashboard_page_should_display() {
        driver.findElement(By.xpath("//div[@class='oxd-topbar-header']//h6[text()='Dashboard']")).isDisplayed();
    }

}

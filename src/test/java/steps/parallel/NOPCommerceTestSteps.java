package steps.parallel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NOPCommerceTestSteps {

    private final WebDriver driver;

    NOPCommerceTestSteps(WebDriver driver){
        this.driver = driver;
    }

    @Given("User on NOP Commerce login page")
    public void user_on_nop_commerce_login_page() {
        driver.get("https://admin-demo.nopcommerce.com/login");
    }

    @When("User enters NOP Commerce username {string}")
    public void user_enters_username(String username) {
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.clear();
        email.sendKeys(username);
    }

    @When("User enters NOP Commerce password {string}")
    public void user_enters_password(String passkey) {
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.clear();
        password.sendKeys(passkey);
    }

    @When("User clicks NOP Commerce login button")
    public void user_clicks_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("NOP Commerce dashboard page should display")
    public void nop_commerce_dashboard_page_should_display() {
        driver.findElement(By.xpath("//div[@class='content-header']//h1")).isDisplayed();
    }

}

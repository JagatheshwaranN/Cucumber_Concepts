package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import util.ExcelReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class AdvancedTestSteps {

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

    @Given("User is on contact us page")
    public void user_is_on_contact_us_page() {
        driver.get("http://www.automationpractice.pl/index.php?controller=contact");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("User fills the message from the sheet {string} with row number {string}")
    public void user_fills_the_message_from_the_sheet_with_row_number_row_num(String sheetName, String rowNum) throws IOException, InvalidFormatException {
        ExcelReader excelReader = new ExcelReader();
        int rowNumber = Integer.parseInt(rowNum);
        List<Map<String, String>> testData = excelReader.getData("src/test/resources/testData/ContactUs.xlsx", sheetName);
        String subject = testData.get(rowNumber).get("Subject");
        String email = testData.get(rowNumber).get("Email");
        String order = testData.get(rowNumber).get("Order");
        String message = testData.get(rowNumber).get("Message");
        contactUsMessageFill(subject, email, order, message);
    }

    @When("User clicks send button")
    public void user_clicks_send_button() {
        driver.findElement(By.id("submitMessage")).click();
    }

    @Then("success message {string} should display")
    public void success_message_should_display(String expectedMessage) {
        String actualMessage = driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    private void contactUsMessageFill(String subject, String email, String order, String msg){
        WebElement dropDown = driver.findElement(By.id("id_contact"));
        WebElement emailId = driver.findElement(By.id("email"));
        WebElement orderId = driver.findElement(By.id("id_order"));
        WebElement message = driver.findElement(By.id("message"));
        Select select = new Select(dropDown);
        select.selectByVisibleText(subject);
        emailId.sendKeys(email);
        orderId.sendKeys(order);
        message.sendKeys(msg);
    }

    @When("User fills the message with details {string} {string} {string} and {string}")
    public void user_fills_the_message_with_details_and(String subject, String email, String order, String msg) {
        WebElement dropDown = driver.findElement(By.id("id_contact"));
        WebElement emailId = driver.findElement(By.id("email"));
        WebElement orderId = driver.findElement(By.id("id_order"));
        Select select = new Select(dropDown);
        select.selectByVisibleText(subject);
        emailId.sendKeys(email);
        orderId.sendKeys(order);
        WebElement message = driver.findElement(By.id("message1"));
        message.sendKeys(msg);
    }
}

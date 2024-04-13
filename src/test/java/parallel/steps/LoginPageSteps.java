package parallel.steps;

import parallel.action.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import parallel.pages.LoginPage;

public class LoginPageSteps {

    private static String title;
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    @Given("User is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
    }

    @When("User verify the title of the page")
    public void user_verify_the_title_of_the_page() {
        title = loginPage.getLoginPageTitle();
        System.out.println("Login Page Title Is : " + title);
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String expectedTitleName) {
        Assert.assertTrue(title.contains(expectedTitleName));
    }

    @Then("Forgot your password link should be displayed")
    public void forgot_your_password_link_should_be_displayed() {
        Assert.assertTrue(loginPage.isForgotPasswordLinkExists());
    }

    @When("User enters email {string}")
    public void user_enters_email(String emailId) {
        loginPage.enterEmailId(emailId);
    }

    @When("User enters passkey {string}")
    public void user_enters_passkey(String password) {
        loginPage.enterPassword(password);
    }

    @When("User clicks on signin button")
    public void user_clicks_on_signin_button() {
        loginPage.clickOnSignInButton();
    }

}

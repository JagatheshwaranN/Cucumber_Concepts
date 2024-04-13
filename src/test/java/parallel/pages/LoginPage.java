package parallel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;


    private final By emailId = By.id("email");
    private final By password = By.id("passwd");
    private final By signInButton = By.id("SubmitLogin");
    private final By forgotPasswordLink = By.linkText("Forgot your password?12");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean isForgotPasswordLinkExists() {
        return driver.findElement(forgotPasswordLink).isDisplayed();
    }

    public void enterEmailId(String mailId) {
        driver.findElement(emailId).sendKeys(mailId);
    }

    public void enterPassword(String passkey) {
        driver.findElement(password).sendKeys(passkey);
    }

    public void clickOnSignInButton() {
        driver.findElement(signInButton).click();
    }

    public AccountPage doLogin(String mailId, String passkey) {
        System.out.println("Login with => " + mailId + " and " + passkey);
        enterEmailId(mailId);
        enterPassword(passkey);
        clickOnSignInButton();
        return new AccountPage(driver);
    }

}

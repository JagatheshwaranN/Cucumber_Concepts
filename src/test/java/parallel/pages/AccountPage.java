package parallel.pages;

import org.openqa.selenium.WebDriver;

public class AccountPage {

    private final WebDriver driver;

    AccountPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAccountPageTitle() {
        return driver.getTitle();
    }
}

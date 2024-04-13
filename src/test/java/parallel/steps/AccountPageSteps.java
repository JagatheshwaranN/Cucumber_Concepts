package parallel.steps;

import parallel.action.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import parallel.pages.AccountPage;
import parallel.pages.LoginPage;

import java.util.List;
import java.util.Map;

public class AccountPageSteps {

    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private AccountPage accountPage;

    @Given("user has logged in to application")
    public void user_has_logged_in_to_application(DataTable loginDetailsTable) {
        List<Map<String, String>> loginDetails = loginDetailsTable.asMaps();
        String emailId = loginDetails.get(0).get("username");
        String password = loginDetails.get(0).get("password");
        DriverFactory.getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        accountPage = loginPage.doLogin(emailId, password);
    }

    @Given("User is on account page")
    public void user_is_on_account_page() {
        String title = accountPage.getAccountPageTitle();
        System.out.println("Account Page Title Is : " + title);
    }

}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class TestSteps {

    @Given("I am on the shopping website")
    public void i_am_on_the_shopping_website() {
        System.out.println("User landed on the shopping website");
    }

    @Given("I have logged in as a registered user")
    public void i_have_logged_in_as_a_registered_user() {
        System.out.println("User login to the shopping website");
    }

    @Given("I have logged out as a registered user")
    public void i_have_logged_out_as_a_registered_user() {
        System.out.println("User logout from the shopping website");
    }

    @When("I search for {string}")
    public void i_search_for(String mobile) {
        System.out.println("User search for the " + mobile);
    }

    @When("I add the first item to the cart")
    public void i_add_the_first_item_to_the_cart() {
        System.out.println("User added the item to the cart");
    }

    @Then("the item should be added successfully")
    public void the_item_should_be_added_successfully() {
        System.out.println("User added item should be available on the shopping cart");
    }

    @When("I go to my shopping cart")
    public void i_go_to_my_shopping_cart() {
        System.out.println("User navigated to the shopping cart");
    }

    @When("I remove the first item from the cart")
    public void i_remove_the_first_item_from_the_cart() {
        System.out.println("User removed the item from the shopping cart");
    }

    @Then("the item should be removed successfully")
    public void the_item_should_be_removed_successfully() {
        System.out.println("User removed item should not be available on the shopping cart");
    }

    @Given("student on the Upskill website")
    public void student_on_the_upskill_website() {
        System.out.println("Student landed on the shopping website");
    }

    @When("student enter the {string}")
    public void student_enter_the(String loginDetails) {
        System.out.println("Student enter the " + loginDetails);
    }

    @When("click the login button")
    public void click_the_login_button() {
        System.out.println("Student clicks the login button");
    }

    @Then("the student should be logged in successfully to Upskill portal")
    public void the_student_should_be_logged_in_successfully_to_upskill_portal() {
        System.out.println("Student has logged in successfully into the Upskill portal");
    }

    @When("student enter the username {string}")
    public void student_enter_the_username(String username) {
        System.out.println("Student enter the username " + username);
    }

    @When("student enter the password {string}")
    public void student_enter_the_password(String password) {
        System.out.println("Student enter the password " + password);
    }

    @Given("customer is on user registration page")
    public void customer_is_on_user_registration_page() {
        System.out.println("Customer landed on the user registration page");
    }

    @When("customer enters the following details")
    public void customer_enters_the_following_details(DataTable dataTable) {
        List<List<String>> userData = dataTable.asLists(String.class);
        for (List<String> user : userData) {
            System.out.println(user);
        }
    }

    @Then("customer registration should be successful")
    public void customer_registration_should_be_successful() {
        System.out.println("Customer registration is Successful");
    }

    @When("customer enters the following details with headers")
    public void customer_enters_the_following_details_with_headers(DataTable dataTable) {
        List<Map<String, String>> userDataMap = dataTable.asMaps(String.class, String.class);
        userDataMap.forEach(System.out::println);
    }

    @Given("Shopping application have search bar")
    public void shopping_application_have_search_bar() {
        System.out.println("Login to online shopping platform and on search bar");
    }

    @When("User search for a product {string} with price {int}")
    public void user_search_for_a_product_with_price(String product, Integer price) {
        System.out.println("User search for product" + product + " with " + price + " on the online shopping platform");
    }

    @Then("Product with title {string} should be displayed")
    public void product_with_title_should_be_displayed(String title) {
        System.out.println("Search product with title " + title + " is displayed");
    }

    @Then("Product should be added to cart and checkout")
    public void product_should_be_added_to_cart_and_checkout() {
        System.out.println("Product should be added to the cart and checked out");
    }

    @Then("Order Id is {int} and username is {string}")
    public void order_id_is_and_username_is(Integer orderId, String username) {
        System.out.println("Product is placed with order id " + orderId + " and username " + username);
    }

    @When("^User search for a mobile \"([^\"]+)\" with price (\\d+)$")
    public void user_search_for_a_mobile_with_price(String product, Integer price) {
        System.out.println("User search for mobile " + product + " with " + price + " on the online shopping platform");
    }

}

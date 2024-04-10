package steps;

import io.cucumber.java.*;
import io.cucumber.messages.types.Tag;

public class HooksTestSteps {

//    @Before
//    public void setup() {
//        System.out.println("Open the browser");
//    }
//
//    @After
//    public void tearDown() {
//        System.out.println("Close the browser");
//    }

    @Before("@smoke")
    public void setup() {
        System.out.println("Open the browser");
    }

    @After("@smoke")
    public void tearDown() {
        System.out.println("Close the browser");
    }

//    @Before(order = 1)
//    public void setupBrowser(Scenario scenario) {
//        System.out.println("Open the browser");
//        System.out.println(scenario.getName());
//    }
//
//    @After(order = 1)
//    public void tearDownBrowser(Scenario scenario) {
//        System.out.println("Close the browser");
//        System.out.println(scenario.getName());
//    }
//
//    @Before(order = 2)
//    public void setupApp() {
//        System.out.println("Login to the online shopping platform");
//    }
//
//    @After(order = 2)
//    public void tearDownApp() {
//        System.out.println("Logout from the online shopping platform");
//    }

    @BeforeStep
    public void takeScreenShot() {
        System.out.println("Before Step Demo");
    }

    @AfterStep
    public void refreshPage() {
        System.out.println("After Step Demo");
    }


}

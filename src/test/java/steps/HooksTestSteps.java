package steps;

import io.cucumber.java.*;
import io.cucumber.messages.types.Tag;
import org.junit.Assume;

public class HooksTestSteps {

    /*
      ====================
      Using simple Hooks
      ====================
    */
//    @Before
//    public void setup() {
//        System.out.println("Open the browser");
//    }
//
//    @After
//    public void tearDown() {
//        System.out.println("Close the browser");
//    }

    /*
      ===============================
      Using Hooks with specific Tag
      ===============================
    */
//    @Before("@smoke")
//    public void setup() {
//        System.out.println("Open the browser");
//    }
//
//    @After("@smoke")
//    public void tearDown() {
//        System.out.println("Close the browser");
//    }

    /*
      ==========================================
      Using Hooks with Order and Scenario Param
      ==========================================
    */
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

    /*
       =================================
       Using Before & After Steps Hooks
       =================================
    */
//    @BeforeStep
//    public void takeScreenShot() {
//        System.out.println("Before Step Demo");
//    }
//
//    @AfterStep
//    public void refreshPage() {
//        System.out.println("After Step Demo");
//    }

    /*
      ========================================================
      Using Hooks with specific Tag to skip scenario execution
      ========================================================
    */
    @Before(value = "@skipScenario", order = 0)
    public void setup(Scenario scenario) {
        System.out.println("Skipped Scenario : " + scenario.getName());
        Assume.assumeTrue(false);
    }

}
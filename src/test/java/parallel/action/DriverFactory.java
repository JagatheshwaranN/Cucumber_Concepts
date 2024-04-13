package parallel.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {

    public static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    String browser = "Chrome";

    public WebDriver initializeDriver() {
        if (browser.equalsIgnoreCase("Chrome")) {
            webDriverThreadLocal.set(new ChromeDriver());
        } else if (browser.equalsIgnoreCase("Firefox")) {
            webDriverThreadLocal.set(new FirefoxDriver());
        } else {
            System.out.println("Please provide the correct browser value: " + browser);
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return getDriver();
    }

    public static synchronized WebDriver getDriver() {
        return webDriverThreadLocal.get();
    }
}

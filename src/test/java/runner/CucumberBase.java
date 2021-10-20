package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CucumberBase {

    private static WebDriver driver;

    protected static void loginWeb() {
        driver.get("https://www.saucedemo.com/");
    }

    @Before
    public static void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginWeb();
        getDriver().manage().window().maximize();
    }

    @After
    public static void after() {
        getDriver().quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {
    private static WebDriver driver;
    private final String URL = "https://happy-desert-0f05d560f.1.azurestaticapps.net/";


    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void driverQuit(){
        if (driver!= null)
            driver.close();
    }

    public WebDriver getDriver() {
        return driver;

    }
}

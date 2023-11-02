package Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverInitiate {
    WebDriver driver;

    public WebDriver webDriver(String url) {
        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
            return driver;
        } catch (Exception e) {
            System.out.println("Error" + e);
            return driver;
        }
    }
}

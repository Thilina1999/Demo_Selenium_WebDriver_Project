package Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebdriverInitiate {

    int maxWaitTime;

    public WebdriverInitiate(int maxWaitTime){
        this.maxWaitTime = maxWaitTime;
    }

    public WebDriver webDriverChrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public WebDriverWait webDriverWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));
    }
}

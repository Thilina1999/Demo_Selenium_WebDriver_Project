package Pages;

import RecordWatcher.RecordWatcher;
import Webdriver.WebdriverInitiate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestOrangeHrm extends RecordWatcher {
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp() {
        driver = new WebdriverInitiate().webDriver("https://opensource-demo.orangehrmlive.com");
        int maxWaitTime = 10;
        wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));
    }

    @After
    public void cleanUp() throws Exception {
        Thread.sleep(10000);
        driver.quit();
    }

    public void Login() {
        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
        username.click();
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        password.sendKeys("admin123");

        WebElement logButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        logButton.click();
    }

    @Test
    public void OrangeHRMTest1() {
        Login();

        WebElement adminPanelButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")));
        adminPanelButton.click();

        WebElement addButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")));
        addButton.click();
    }

    @Test
    public void OrangeHRMTest2() {
        Login();

        WebElement adminPanelButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")));
        adminPanelButton.click();

        WebElement addButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")));
        addButton.click();
    }
}

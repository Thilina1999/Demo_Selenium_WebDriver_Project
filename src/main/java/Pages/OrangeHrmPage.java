package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmPage {
    WebDriver driver;
    WebDriverWait wait;

    By username = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
    By password = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
    By click_logButton = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    By sideBarTimeButton = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a");
    By adminPanelButton = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");

    public OrangeHrmPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void setUsername(String text) {
        wait.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys(text);
    }

    public void setPassword(String text) {
        driver.findElement(password).sendKeys(text);
    }

    public void setClick_logButton() {
        driver.findElement(click_logButton).click();
    }

    public void setSideBarTimeButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(sideBarTimeButton)).click();
    }

    public void setAdminPanelButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(adminPanelButton)).click();
    }
}

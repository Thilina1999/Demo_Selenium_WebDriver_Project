package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcademyBugsCartPage {
    WebDriver driver;
    WebDriverWait wait;
    By increaseCartBox = By.xpath("//input[contains(@id, 'ec_quantity_')]\n");
    By updateButton = By.xpath("//div[contains(@id, 'ec_cartitem_update_') and contains(@onclick, 'ec_cartitem_update') and text()='UPDATE']");

    public AcademyBugsCartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void setIncreaseCartBox(String number) {
        wait.until(ExpectedConditions.presenceOfElementLocated(increaseCartBox)).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(increaseCartBox)).sendKeys(number);
    }

    public void setUpdateButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(updateButton)).click();
    }
}

package Pages;

import Data.ProductPagePathData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class AcademyBugsProductPage {
    WebDriver driver;
    WebDriverWait wait;

    By addCartYellowShoes = By.xpath(ProductPagePathData.addCartYellowShoes);
    By addDarkGreyJeans = By.xpath(ProductPagePathData.addDarkGreyJeans);
    By clickViewCartButton = By.xpath(ProductPagePathData.clickViewCartButton);
    By clickBlueHoodie = By.xpath(ProductPagePathData.clickBlueHoodie);
    By acceptCookies = By.xpath(ProductPagePathData.acceptCookies);
    By pageNumberItem_10 = By.xpath(ProductPagePathData.pageNumberItem_10);
    By pageNumberItem_25 = By.xpath(ProductPagePathData.pageNumberItem_25);

    public AcademyBugsProductPage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.wait = webDriverWait;
    }

    public void setAddCartYellowShoes() {
        wait.until(ExpectedConditions.presenceOfElementLocated(addCartYellowShoes)).click();
    }

    public void setAddDarkGreyJeans() {
        wait.until(ExpectedConditions.elementToBeClickable(addDarkGreyJeans)).click();
    }

    public void setClickViewCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(clickViewCartButton)).click();
    }

    public void setClickBlueHoodie() {
        wait.until(ExpectedConditions.elementToBeClickable(clickBlueHoodie)).click();
    }

    public void setAcceptCookies() {
        wait.until(ExpectedConditions.elementToBeClickable(acceptCookies)).click();
    }

    public void setPageNumberItem_10() {
        wait.until(ExpectedConditions.elementToBeClickable(pageNumberItem_10)).click();
    }

    public String getPageNumberItem_10Color() {
        WebElement element = driver.findElement(pageNumberItem_10);
        return element.getCssValue("background-color");
    }

    public String getPageNumberItem_25Color() {
        WebElement element = driver.findElement(pageNumberItem_25);
        return element.getCssValue("background-color");
    }
}

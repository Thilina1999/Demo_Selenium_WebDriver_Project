package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcademyBugsPage {
    WebDriver driver;
    WebDriverWait wait;

    By addCartYellowShoes = By.xpath("//*[@id=\"ec_add_to_cart_5\"]");
    By addDarkGreyJeans = By.xpath("//*[@id=\"ec_add_to_cart_4\"]");
    By clickViewCartButton = By.xpath("//*[@id=\"ec_product_page\"]/div[2]/a");
    By increaseCartYellowShoes = By.xpath("//input[contains(@id, 'ec_quantity_')]\n");
    By updateButtonYellowShoesButton = By.xpath("//div[contains(@id, 'ec_cartitem_update_') and contains(@onclick, 'ec_cartitem_update') and text()='UPDATE']");


    public AcademyBugsPage(WebDriver driver, WebDriverWait webDriverWait){
        this.driver = driver;
        this.wait = webDriverWait;
    }

    public void setAddCartYellowShoes() {
        wait.until(ExpectedConditions.presenceOfElementLocated(addCartYellowShoes)).click();
    }
    public void setAddDarkGreyJeans(){
        wait.until(ExpectedConditions.elementToBeClickable(addDarkGreyJeans)).click();
    }

    public void setClickViewCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(clickViewCartButton)).click();
    }

    public void setIncreaseCartYellowShoes(String number) {
        wait.until(ExpectedConditions.presenceOfElementLocated(increaseCartYellowShoes)).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(increaseCartYellowShoes)).sendKeys(number);
    }

    public void setUpdateButtonYellowShoesButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(updateButtonYellowShoesButton)).click();
    }

}

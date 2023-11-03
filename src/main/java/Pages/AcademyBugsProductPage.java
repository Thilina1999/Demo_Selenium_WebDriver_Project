package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcademyBugsProductPage {
    WebDriver driver;
    WebDriverWait wait;

    By addCartYellowShoes = By.xpath("//*[@id=\"ec_add_to_cart_5\"]");
    By addDarkGreyJeans = By.xpath("//*[@id=\"ec_add_to_cart_4\"]");
    By clickViewCartButton = By.xpath("//*[@id=\"ec_product_page\"]/div[2]/a");
    By clickBlueHoodie = By.xpath("//*[@id=\"ec_product_image_effect_3381370\"]/a");
    By acceptCookies = By.xpath("//*[@id=\"cc-window\"]/div/a[2]");

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
}

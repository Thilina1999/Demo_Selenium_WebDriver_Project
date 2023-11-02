package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcademyBugsPage {
    WebDriver driver;
    WebDriverWait wait;

    By addCartYellowShoes = By.xpath("//*[@id=\"ec_add_to_cart_5\"]");


    public AcademyBugsPage(WebDriver driver, WebDriverWait webDriverWait){
        this.driver = driver;
        this.wait = webDriverWait;
    }

    public void setAddCartYellowShoes() {
        wait.until(ExpectedConditions.presenceOfElementLocated(addCartYellowShoes)).click();
    }
}

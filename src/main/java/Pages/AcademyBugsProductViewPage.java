package Pages;

import Data.ProductViewPathData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcademyBugsProductViewPage {
    WebDriver driver;
    WebDriverWait wait;

    By postComment = By.xpath(ProductViewPathData.postComment);
    By commentAuthor = By.xpath(ProductViewPathData.commentAuthor);
    By commentEmail = By.xpath(ProductViewPathData.commentEmail);
    By commentWebsite = By.xpath(ProductViewPathData.commentWebsite);
    By postCommentButton = By.xpath(ProductViewPathData.postCommentButton);
    By allItemButton = By.xpath(ProductViewPathData.allItemButton);
    By currencyChangeButton = By.xpath(ProductViewPathData.currencyChangeButton);
    By dbpCurrencyType = By.xpath(ProductViewPathData.dbpCurrencyType);


    public AcademyBugsProductViewPage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.wait = webDriverWait;
    }

    public void setPostComment(String comment) {
        wait.until(ExpectedConditions.presenceOfElementLocated(postComment)).sendKeys(comment);
    }

    public void setCommentAuthor(String author) {
        wait.until(ExpectedConditions.presenceOfElementLocated(commentAuthor)).sendKeys(author);
    }

    public void setCommentEmail(String email) {
        wait.until(ExpectedConditions.presenceOfElementLocated(commentEmail)).sendKeys(email);
    }

    public void setCommentWebsite(String website) {
        wait.until(ExpectedConditions.presenceOfElementLocated(commentWebsite)).sendKeys(website);
    }

    public void setPostCommentButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(postCommentButton)).click();
    }

    public void setAllItemButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(allItemButton)).click();
    }

    public String getSelectedCurrencyType() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(currencyChangeButton));
        return element.getAttribute("value");
    }

    public String getOptionCurrencyType() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(dbpCurrencyType));
        return element.getAttribute("value");
    }

    public void setCurrencyChangeButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(currencyChangeButton)).click();
    }

    public void selectCurrencyTypeGBP() {
        wait.until(ExpectedConditions.presenceOfElementLocated(dbpCurrencyType)).click();
    }

}

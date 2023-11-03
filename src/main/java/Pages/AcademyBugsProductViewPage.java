package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcademyBugsProductViewPage {
    WebDriver driver;
    WebDriverWait wait;

    By postComment = By.xpath("//*[@id=\"comment\"]");
    By commentAuthor = By.xpath("//*[@id=\"author\"]");
    By commentEmail = By.xpath("//*[@id=\"email\"]");
    By commentWebsite = By.xpath("//*[@id=\"url\"]");
    By postCommentButton = By.xpath("//*[@id=\"academy-comment-submit\"]");


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
}

package Test;

import Constants.Constants;
import Constants.PageUrl;
import Data.AcademyBugsTestData;
import Pages.AcademyBugsCartPage;
import Pages.AcademyBugsProductViewPage;
import Pages.AcademyBugsProductPage;
import RecordWatcher.RecordWatcher;
import Webdriver.WebdriverInitiate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAcademyBugs extends RecordWatcher {
    WebDriver driver;
    WebDriverWait wait;
    AcademyBugsProductPage academyBugsProductPage;
    AcademyBugsCartPage academyBugsCartPage;
    AcademyBugsProductViewPage academyBugsProductViewPage;
    PageUrl pageUrl = new PageUrl();
    Constants constants = new Constants();

    public void setUp(String url) {
        WebdriverInitiate webdriverInitiate = new WebdriverInitiate(constants.getMaxWaitTime());
        driver = webdriverInitiate.webDriverChrome();
        driver.get(url);
        wait = webdriverInitiate.webDriverWait(driver);
        academyBugsProductPage = new AcademyBugsProductPage(driver, wait);
        academyBugsCartPage = new AcademyBugsCartPage(driver, wait);
        academyBugsProductViewPage = new AcademyBugsProductViewPage(driver, wait);
    }

    @After
    public void cleanUp() throws Exception {
        Thread.sleep(constants.getThreadWaitTime());
        driver.quit();
    }

    @Test
    public void TEST_UI_PRODUCT_PO_001() {
        setUp(pageUrl.getAcademyBugUrl());

        String expectedColor = academyBugsProductPage.getPageNumberItem_25Color();
        academyBugsProductPage.setPageNumberItem_10();
        Assert.assertEquals(expectedColor, academyBugsProductPage.getPageNumberItem_10Color());
    }

    @Test
    public void TEST_UI_CART_PO_002() {
        setUp(pageUrl.getAcademyBugUrl());

        academyBugsProductPage.setAcceptCookies();
        academyBugsProductPage.setAddCartYellowShoes();
        academyBugsProductPage.setClickViewCartButton();
    }

    @Test
    public void TEST_UI_CART_PO_003() throws Exception {
        setUp(pageUrl.getAcademyBugUrl());

        academyBugsProductPage.setAcceptCookies();
        academyBugsProductPage.setAddDarkGreyJeans();
        academyBugsProductPage.setClickViewCartButton();
        academyBugsCartPage.setIncreaseCartBox(AcademyBugsTestData.cartBoxValue);
        academyBugsCartPage.setUpdateButton();
        Thread.sleep(constants.getWaitTime());
        Assert.assertEquals(AcademyBugsTestData.cartBoxValue, academyBugsCartPage.getIncreaseCartBoxValue());
    }

    @Test
    public void TEST_UI_VIEW_PO_004() {
        setUp(pageUrl.getAcademyBugUrl());

        academyBugsProductPage.setAcceptCookies();
        academyBugsProductPage.setClickBlueHoodie();
        academyBugsProductViewPage.setPostComment(AcademyBugsTestData.comment);
        academyBugsProductViewPage.setCommentAuthor(AcademyBugsTestData.author);
        academyBugsProductViewPage.setCommentEmail(AcademyBugsTestData.email);
        academyBugsProductViewPage.setCommentWebsite(AcademyBugsTestData.website);
        academyBugsProductViewPage.setPostCommentButton();
    }
}

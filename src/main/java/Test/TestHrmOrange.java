package Test;

import Constants.Constants;
import Constants.PageUrl;
import Pages.OrangeHrmPage;
import RecordWatcher.RecordWatcher;
import Webdriver.WebdriverInitiate;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestHrmOrange extends RecordWatcher {
    WebDriver driver;
    WebDriverWait wait;

    PageUrl pageUrl = new PageUrl();
    Constants constants = new Constants();

    public void setUp(String url) {
        WebdriverInitiate webdriverInitiate = new WebdriverInitiate(constants.getMaxWaitTime());
        driver = webdriverInitiate.webDriverChrome();
        driver.get(url);
        wait = webdriverInitiate.webDriverWait(driver);
    }

    @After
    public void cleanUp() throws Exception {
        Thread.sleep(constants.getThreadWaitTime());
        driver.quit();
    }

    @Test
    public void OrangeHRMTest1() {
        setUp(pageUrl.getOrangeHrmUrl());
        OrangeHrmPage orangeHrmPage = new OrangeHrmPage(driver, wait);

        orangeHrmPage.setUsername("Admin");
        orangeHrmPage.setPassword("admin123");
        orangeHrmPage.setClick_logButton();
        orangeHrmPage.setAdminPanelButton();
        orangeHrmPage.setSideBarTimeButton();
    }

    @Test
    public void OrangeHRMTest2() {
        setUp(pageUrl.getOrangeHrmUrl());
        OrangeHrmPage orangeHrmPage = new OrangeHrmPage(driver, wait);

        orangeHrmPage.setUsername("Admin");
        orangeHrmPage.setPassword("admin123");
        orangeHrmPage.setClick_logButton();
    }
}

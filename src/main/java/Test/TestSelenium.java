package Test;

import Pages.BasePage;
import Pages.OrangeHrmPage;
import RecordWatcher.RecordWatcher;
import Webdriver.WebdriverInitiate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelenium extends RecordWatcher {
    WebDriver driver;
    WebDriverWait wait;

    BasePage basePage = new BasePage();
    WebdriverInitiate webdriverInitiate = new WebdriverInitiate();

    @Before
    public void setUp() {
        driver = webdriverInitiate.webDriver();
        driver.get(basePage.getOrangeHrmUrl());
        wait = webdriverInitiate.webDriverWait(driver);
    }

    @After
    public void cleanUp() throws Exception {
        Thread.sleep(basePage.getThreadWaitTime());
        driver.quit();
    }

    @Test
    public void OrangeHRMTest1() {
        OrangeHrmPage orangeHrmPage = new OrangeHrmPage(driver, wait);

        orangeHrmPage.setUsername("Admin");
        orangeHrmPage.setPassword("admin123");
        orangeHrmPage.setClick_logButton();
        orangeHrmPage.setAdminPanelButton();
        orangeHrmPage.setSideBarTimeButton();
    }

    @Test
    public void OrangeHRMTest2() {
        OrangeHrmPage orangeHrmPage = new OrangeHrmPage(driver, wait);

        orangeHrmPage.setUsername("Admin");
        orangeHrmPage.setPassword("admin123");
        orangeHrmPage.setClick_logButton();

    }
}

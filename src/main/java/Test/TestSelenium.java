package Test;

import Pages.AcademyBugsPage;
import Pages.BasePage;
import Pages.OrangeHrmPage;
import RecordWatcher.RecordWatcher;
import Webdriver.WebdriverInitiate;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelenium extends RecordWatcher {
    WebDriver driver;
    WebDriverWait wait;

    BasePage basePage = new BasePage();

    public void setUp(String url) {
        WebdriverInitiate webdriverInitiate = new WebdriverInitiate();
        driver = webdriverInitiate.webDriverChrome();
        driver.get(url);
        wait = webdriverInitiate.webDriverWait(driver);
    }

    @After
    public void cleanUp() throws Exception {
        Thread.sleep(basePage.getThreadWaitTime());
        driver.quit();
    }

    @Test
    public void OrangeHRMTest1() {
        setUp(basePage.getOrangeHrmUrl());
        OrangeHrmPage orangeHrmPage = new OrangeHrmPage(driver, wait);

        orangeHrmPage.setUsername("Admin");
        orangeHrmPage.setPassword("admin123");
        orangeHrmPage.setClick_logButton();
        orangeHrmPage.setAdminPanelButton();
        orangeHrmPage.setSideBarTimeButton();
    }

    @Test
    public void OrangeHRMTest2() {
        setUp(basePage.getOrangeHrmUrl());
        OrangeHrmPage orangeHrmPage = new OrangeHrmPage(driver, wait);

        orangeHrmPage.setUsername("Admin");
        orangeHrmPage.setPassword("admin123");
        orangeHrmPage.setClick_logButton();
    }

    @Test
    public void AcademyBugsTest1() {
        setUp(basePage.getAcademyBugUrl());
        AcademyBugsPage academyBugsPage = new AcademyBugsPage(driver, wait);

        academyBugsPage.setAddCartYellowShoes();
        academyBugsPage.setClickViewCartButton();
    }
    @Test
    public void AcademyBugsTest2() {
        setUp(basePage.getAcademyBugUrl());
        AcademyBugsPage academyBugsPage = new AcademyBugsPage(driver, wait);

        academyBugsPage.setAddDarkGreyJeans();
        academyBugsPage.setClickViewCartButton();
        academyBugsPage.setIncreaseCartYellowShoes("5");
        academyBugsPage.setUpdateButtonYellowShoesButton();
    }
}

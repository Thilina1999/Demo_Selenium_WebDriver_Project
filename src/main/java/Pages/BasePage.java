package Pages;

public class BasePage {

    private int ThreadWaitTime = 5000;
    private String OrangeHrmUrl = "https://opensource-demo.orangehrmlive.com";
    private String AcademyBugUrl = "https://academybugs.com/find-bugs";

    public int getThreadWaitTime() {
        return ThreadWaitTime;
    }

    public String getOrangeHrmUrl() {
        return OrangeHrmUrl;
    }

    public String getAcademyBugUrl() {
        return AcademyBugUrl;
    }
}

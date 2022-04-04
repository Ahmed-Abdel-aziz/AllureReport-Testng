package TestRunnerClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;


public class Runner {

    @BeforeTest
    public void OpenBrowser() {
        TestBase.BrowserTarget();
    }

    @AfterTest
    public void CloseBrowser() {
        TestBase.CloseTarget();
    }


}

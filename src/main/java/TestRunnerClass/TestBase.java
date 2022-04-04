package TestRunnerClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;


public class TestBase {

    public static WebDriver driver ;
    private static String TargetURL = "https://www.saucedemo.com/";
    private static String TargetURL1 = "https://bkdemos.ml/jeweler/";

    public static void BrowserTarget() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get(TargetURL);
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        WebDriverManager.chromedriver().setup();

//        DesiredCapabilities caps = new DesiredCapabilities();

//        caps.setAcceptInsecureCerts(true);

        ChromeOptions chromeoption = new ChromeOptions();

//        chromeoption.merge(caps);
//        chromeoption.addArguments("--disable-extensions");
//        chromeoption.addArguments("--disable-notifications");
        chromeoption.addArguments("start-maximized");
        chromeoption.setPlatformName("Windows 10");

//        chromeoption.addArguments("--incognito");
//        chromeoption.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
//        chromeoption.setCapability(CapabilityType.BROWSER_NAME,"TestNgProject");
//        chromeoption.setCapability(CapabilityType.PLATFORM_NAME,"Windows 10");

//        chromeoption.setAcceptInsecureCerts(true);
//        chromeoption.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);

        driver = new ChromeDriver(chromeoption);

        driver.get(TargetURL);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }



    public static void CloseTarget(){

            driver.close();
            driver.quit();

    }


}

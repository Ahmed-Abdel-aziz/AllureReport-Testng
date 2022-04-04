package LoginScenario;

import LoginPage.LoginLocators;
import TestRunnerClass.Runner;
import TestRunnerClass.TestAllureListener;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class RunLoginScenario extends Runner {

    @Test(priority = 1, groups = {"Login"}, description = "user enter invalid username/password")
    @Severity(SeverityLevel.CRITICAL)
    @TmsLink("Test Case : 125")
    @Description("Test Scenario: user enter invalid username/password")
    public void InvalidLoginScenario() {

        LoginLocators.InValidLoginForm("sta", "s");
    }

    @Test(priority = 2, groups = {"Login"}, description = "user Clear and enter valid username/password")
    @Severity(SeverityLevel.NORMAL)
    @TmsLink("Test Case : 405")
    @Description("Test Scenario: user Clear and enter valid username/password")
    public void validLoginScenario() {

        LoginLocators.validLoginForm("standard_user", "standard_user");

    }


}




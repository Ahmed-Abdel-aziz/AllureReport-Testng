package LoginPage;

import TestRunnerClass.TestBase;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class LoginLocators {

    @Step("User enter Invalid Username: {0} ,Valid Password: {1}")
    public static void InValidLoginForm(String UserName, String Password) {
        TestBase.driver.findElement(By.id("user-name")).sendKeys(UserName);
        TestBase.driver.findElement(By.id("password")).sendKeys(Password);
        TestBase.driver.findElement(By.id("login-button")).click();
    }

    @Step("User enter  valid Username: {0} ,Invalid Password: {1}")
    public static void validLoginForm(String UserName, String Password) {
        TestBase.driver.findElement(By.id("user-name")).clear();
        TestBase.driver.findElement(By.id("password")).clear();

        TestBase.driver.findElement(By.id("user-name")).sendKeys(UserName);
        TestBase.driver.findElement(By.id("password")).sendKeys(Password);

        /**
         * Error in locator login-button
         * */
        TestBase.driver.findElement(By.id("login-but")).click();
    }




}

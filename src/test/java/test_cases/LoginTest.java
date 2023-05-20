package test_cases;

import driver.BaseDrive;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseDrive {

    @Test
    public void login_test(){
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }

}

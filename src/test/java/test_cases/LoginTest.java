package test_cases;

import driver.BaseDrive;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import resource.TestData;

public class LoginTest extends BaseDrive {

    @Test(dataProvider = "login_data", dataProviderClass = TestData.class)
    public void login_test(String username, String password){
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        loginPage.login_btn_css();

    }

}

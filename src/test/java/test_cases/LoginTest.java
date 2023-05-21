package test_cases;

import driver.BaseDrive;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseDrive {

    @Test
    public void login_test(){
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("", "");
        String class_value = loginPage.error_container_class();
        Assert.assertTrue(class_value.contains("error"));
        Assert.assertEquals(5, 6);

    }

}

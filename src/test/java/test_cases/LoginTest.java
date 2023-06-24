package test_cases;

import driver.BaseDrive;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAppPage;

public class LoginTest extends BaseDrive {

    @Test
    public void login_test() {
        HomePage homePage = new HomePage(driver);
        MyAppPage myAppPage = new MyAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.cancelNotificationAccess();
        homePage.goToMyAppPage();
        myAppPage.goToLoginPage();

        String email = "sakibulislam285@gmail.com";
        String password = "Sakib985064";
        loginPage.login(email, password);

    }

}

package test_cases;

import driver.BaseDrive;
import org.testng.annotations.Test;
import pages.AppSettingsPage;
import pages.HomePage;
import pages.MyAppPage;

public class AppSettingsTest extends BaseDrive {

    @Test
    public void resize_text_big() {
        HomePage homePage = new HomePage(driver);
        MyAppPage myAppPage = new MyAppPage(driver);
        AppSettingsPage appSettingsPage = new AppSettingsPage(driver);

        homePage.cancelNotificationAccess();
        homePage.goToMyAppPage();
        myAppPage.goToAppSettingsPage();
        appSettingsPage.resizeText(2);
    }

}

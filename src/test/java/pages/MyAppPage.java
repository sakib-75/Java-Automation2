package pages;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MyAppPage extends BasePage {

    public MyAppPage(AndroidDriver driver) {
        super(driver);
    }

    By loginButton = By.id("user_profile_element_holder_btn_sign_in");
    By myAppMenuOption = By.id("my_app_option_element_holder_tv_name");

    @Step("Go to login page")
    public void goToLoginPage() {
        clickOnElement(loginButton);
    }

    @Step("Go to app settings page")
    public void goToAppSettingsPage() {
        clickOnElement(getElements(myAppMenuOption).get(1));
    }


}

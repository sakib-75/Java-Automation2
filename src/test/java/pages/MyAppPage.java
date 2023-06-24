package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MyAppPage extends BasePage {

    public MyAppPage(AndroidDriver driver) {
        super(driver);
    }

    By loginButton = By.id("user_profile_element_holder_btn_sign_in");

    public void goToLoginPage(){
        clickOnElement(loginButton);
    }


}

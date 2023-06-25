package pages;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    By button2 = By.id("android:id/button2");
    By myApp = By.id("action_my_app");

    @Step("Go to my app page")
    public void goToMyAppPage() {
        clickOnElement(myApp);
    }

    @Step("Cancel notification access")
    public void cancelNotificationAccess() {
        if (getTotalElementCount(button2) == 1) {
            clickOnElement(button2);
        } else {
            System.out.println("Notification access modal not found!");
        }
    }

}



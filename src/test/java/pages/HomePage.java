package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    By button2 = By.id("android:id/button2");
    By myApp = By.id("action_my_app");

    public void goToMyAppPage() {
        clickOnElement(myApp);
    }

    public void cancelNotificationAccess() {
        if (getTotalElementCount(button2) == 1) {
            clickOnElement(button2);
        } else {
            System.out.println("Notification access modal not found!");
        }
    }

}



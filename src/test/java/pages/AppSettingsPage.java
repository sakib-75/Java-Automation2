package pages;

import driver.BaseDrive;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class AppSettingsPage extends BasePage {

    public AppSettingsPage(AndroidDriver driver) {
        super(driver);
    }

    By settingsOption = By.id("my_app_option_element_holder_tv_name");
    By textResizeOption = By.cssSelector(".android.widget.RadioButton");
    By textResizeApply = By.id("resize_text_apply_button");

    @Step("Resize text")
    public void resizeText(int resize_type_index) {
        clickOnElement(getElements(settingsOption).get(0));
        clickOnElement(getElements(textResizeOption).get(resize_type_index));
        clickOnElement(textResizeApply);
    }


}

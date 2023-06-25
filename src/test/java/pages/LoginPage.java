package pages;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    By loginEmailInp = By.id("fragment_login_tet_email");
    By loginPasswordInp = By.id("fragment_login_tet_password");
    By loginContinueBtn = By.id("fragment_registration_btn_continue");

    @Step("Login to App")
    public void login(String email, String password) {
        sendText(loginEmailInp, email);
        sendText(loginPasswordInp, password);
        clickOnElement(loginContinueBtn);
    }


}

package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.TakeScreenshot.screenshotForAllure;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

//    public LoginPage(WebDriver driver){
//        PageFactory.initElements(driver, this);
//    }
//
//    @FindBy(id = "user-name")
//    WebElement user_name_input;
//
//    @FindBy(id = "password")
//    WebElement password_input;
//
//    @FindBy(id = "login-button")
//    WebElement login_button;
//
//    public void login(String user_name, String password){
//        user_name_input.sendKeys(user_name);
//        password_input.sendKeys(password);
//        login_button.click();
//    }

    By user_name_input = By.id("user-name");
    By password_input = By.id("password");
    By login_button = By.id("login-button");
    By error_container = By.cssSelector(".error-message-container");

    @Step("Login")
    public void login(String user_name, String password) {
        sendText(user_name_input, user_name);
        sendText(password_input, password);
        clickOnElement(login_button);
        screenshotForAllure("login page screenshot");
    }


    public String error_container_class() {
        return getAttribute(error_container, "class");
    }

    public void login_btn_css() {
        System.out.println(getCssValue(login_button, "background-color"));
        System.out.println(getCssValue(login_button, "color"));
        System.out.println(getCssValue(login_button, "font-size"));
    }


}

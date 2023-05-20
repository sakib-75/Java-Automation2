package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
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

    public void login(String user_name, String password){
        driver.findElement(user_name_input).sendKeys(user_name);
        driver.findElement(password_input).sendKeys(password);
        driver.findElement(login_button).click();
    }


}

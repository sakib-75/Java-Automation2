package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }

    public void sendText(By locator, String value){
        WebElement element = getElement(locator);
        element.clear();
        element.sendKeys(value);
    }

    public void clickOnElement(By locator) {
        WebElement element = getElement(locator);
        element.click();
    }

    public String getAttribute(By locator, String attribute){
        WebElement element = getElement(locator);
        return element.getAttribute(attribute);
    }

}

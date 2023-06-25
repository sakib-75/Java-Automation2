package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

    AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    public int getTotalElementCount(By locator) {
        return getElements(locator).size();
    }

    public void sendText(By locator, String value) {
        WebElement element = getElement(locator);
        element.clear();
        element.sendKeys(value);
    }

    public void clickOnElement(By locator) {
        WebElement element = getElement(locator);
        element.click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public String getAttribute(By locator, String attribute) {
        WebElement element = getElement(locator);
        return element.getAttribute(attribute);
    }

    public String getText(By locator) {
        return getElement(locator).getText().trim();
    }

    public ArrayList<String> getListOfText(By locator) {
        ArrayList<String> text_list = new ArrayList<>();
        for (WebElement element : getElements(locator)) {
            text_list.add(element.getText().trim());
        }
        return text_list;
    }

    public void waitForVisibilityOfElement(By locator, int... maxWait) {
        int waitTime = (maxWait.length > 0) ? maxWait[0] : 30;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForVisibilityOfElements(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void waitForInvisibilityOfElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void waitForInvisibilityOfElements(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForTextToBePresentInElement(By locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    public boolean isElementVisible(By locator) {
        try {
            waitForVisibilityOfElement(locator, 5);
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }


}
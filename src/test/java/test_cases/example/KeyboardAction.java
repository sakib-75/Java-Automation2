package test_cases.example;

import driver.BaseDrive;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAction extends BaseDrive {

    @Test
    public void tc1() throws InterruptedException {
        driver.get("https://letcode.in/edit");
        WebElement input2 = driver.findElement(By.id("join"));
        WebElement input3 = driver.findElement(By.id("getMe"));

        Actions actions = new Actions(driver);
        actions.moveToElement(input2).click().
                keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build().perform();

        actions.moveToElement(input3).click().
                keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .build().perform();

        Thread.sleep(5000);
    }
}

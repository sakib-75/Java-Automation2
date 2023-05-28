package test_cases.example;

import driver.BaseDrive;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertWindow extends BaseDrive {

    @Test
    public void alertWindow() throws InterruptedException {
        driver.get("https://letcode.in/alert");

        WebElement alert_btn = driver.findElement(By.id("prompt"));

        alert_btn.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("alert text");
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

    }
}

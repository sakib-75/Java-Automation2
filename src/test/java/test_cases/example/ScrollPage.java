package test_cases.example;

import driver.BaseDrive;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollPage extends BaseDrive {

    @Test
    public void tc1() throws InterruptedException {
        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scroll to bottom
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);

        // scroll to top
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        Thread.sleep(3000);

        // scroll to element
        WebElement element = driver.findElement(By.cssSelector("h2.selenium"));
        js.executeScript("arguments[0].scrollIntoView()", element);
        Thread.sleep(3000);

    }
}

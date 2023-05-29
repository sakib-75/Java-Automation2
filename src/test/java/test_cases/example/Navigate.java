package test_cases.example;

import driver.BaseDrive;
import org.testng.annotations.Test;

public class Navigate extends BaseDrive {
    @Test
    public void tc1() throws InterruptedException {
        driver.get("https://letcode.in/dropdowns");
        Thread.sleep(2000);

        driver.navigate().to("https://www.google.com/");

        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.navigate().refresh();

        Thread.sleep(2000);

    }
}

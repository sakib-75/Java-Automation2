package test_cases.example;

import driver.BaseDrive;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropdown extends BaseDrive {

    @Test
    public void tc1() throws InterruptedException {
        driver.get("https://letcode.in/dropdowns");

        WebElement select_element = driver.findElement(By.id("fruits"));
        Select select = new Select(select_element);
        select.selectByIndex(1);
        //select.selectByValue("");
        //select.selectByVisibleText("Banana");
        Thread.sleep(3000);

        WebElement multi_select_element = driver.findElement(By.id("superheros"));
        Select multi_select = new Select(multi_select_element);

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .click(multi_select.getOptions().get(1))
                .click(multi_select.getOptions().get(3))
                .click(multi_select.getOptions().get(4))
                .keyUp(Keys.CONTROL).build().perform();

        multi_select.deselectByIndex(3);
        multi_select.deselectAll();


    }
}

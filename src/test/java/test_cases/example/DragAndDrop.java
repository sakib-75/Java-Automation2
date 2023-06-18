package test_cases.example;

import driver.BaseDrive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.BasePage;

public class DragAndDrop extends BaseDrive {

    @Test
    public void tc1() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");

        BasePage basePage = new BasePage(driver);

        basePage.switchFrame(By.cssSelector(".demo-frame"));

        By source_locator = By.id("draggable");
        By target_locator = By.id("droppable");

        basePage.dragAndDrop(source_locator, target_locator);

        basePage.switchToDefaultContent();
        Thread.sleep(5000);

    }

}

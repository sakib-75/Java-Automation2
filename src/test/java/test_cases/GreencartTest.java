package test_cases;

import driver.BaseDrive;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GreenkartHomePage;

public class GreencartTest extends BaseDrive {

    @Test
    public void tc1() {
        driver.get("https://rahulshettyacademy.com/seleniumPractise");
        GreenkartHomePage greenkartHomePage = new GreenkartHomePage(driver);
        String[] product_names = {"Cucumber", "Carrot", "Brinjal"};
        for (String product_name : product_names) {
            greenkartHomePage.addToCart(product_name);
        }

        greenkartHomePage.expandCartPreview();

        for (int i = 0; i < greenkartHomePage.getAddedItemsNameInCart().size(); i++) {
            Assert.assertEquals(product_names[i], greenkartHomePage.getAddedItemsNameInCart().get(i));
        }
    }


}

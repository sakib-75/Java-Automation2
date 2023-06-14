package test_cases;

import driver.BaseDrive;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GreencartCheckoutPage;
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

    @Test
    public void test_invalid_promo_code_alert() {
        GreenkartHomePage greenkartHomePage = new GreenkartHomePage(driver);
        GreencartCheckoutPage greencartCheckoutPage = new GreencartCheckoutPage(driver);

        greenkartHomePage.proceedToCheckout();
        greencartCheckoutPage.applyPromoCode("abc");

        String expected_invalid_promo_alert = "Invalid code ..!";
        String actual_invalid_promo_alert = greencartCheckoutPage.getPromoAlert();
        Assert.assertEquals(actual_invalid_promo_alert, expected_invalid_promo_alert);

    }


}

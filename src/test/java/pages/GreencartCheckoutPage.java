package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GreencartCheckoutPage extends BasePage {

    public GreencartCheckoutPage(WebDriver driver) {
        super(driver);
    }

    By promoCodeInput = By.className("promoCode");
    By promoButton = By.className("promoBtn");
    By promoInfo = By.className("promoInfo");

    @Step("Apply promo code")
    public void applyPromoCode(String promo_code) {
        sendText(promoCodeInput, promo_code);
        clickOnElement(promoButton);
    }

    @Step("Get promo code alert")
    public String getPromoAlert() {
        waitForVisibilityOfElement(promoInfo);
        return getText(promoInfo);
    }


}

package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class GreenkartHomePage extends BasePage {

    public GreenkartHomePage(WebDriver driver) {
        super(driver);
    }

    By allProductTitle = By.cssSelector("h4.product-name");
    By allAddToCartButton = By.cssSelector(".product-action button");
    By cartIcon = By.cssSelector("a.cart-icon");
    By cartPreview = By.cssSelector(".cart-preview");
    By addedItemsNameInCart = By.cssSelector("div[class='cart-preview active'] .product-name");
    By checkOutButton = By.xpath("//button[text()='PROCEED TO CHECKOUT']");


    @Step("Add product to cart")
    public void addToCart(String product_name) {
        for (int i = 0; i < getElements(allProductTitle).size(); i++) {
            String productName = getElements(allProductTitle).get(i).getText().split("-")[0].trim();
            if (productName.equals(product_name)) {
                getElements(allAddToCartButton).get(i).click();
            }
        }
    }

    @Step("Expand cart preview window")
    public void expandCartPreview() {
        if (getAttribute(cartPreview, "class").contains("active")) {
            System.out.println("Cart preview already open");
        } else {
            clickOnElement(cartIcon);
        }
    }

    @Step("Get added items name in cart")
    public List<String> getAddedItemsNameInCart() {
        List<String> added_product_title = getListOfText(addedItemsNameInCart);
        List<String> added_product_name = new ArrayList<>();
        for (String title : added_product_title) {
            added_product_name.add(title.split("-")[0].trim());
        }
        return added_product_name;
    }



}

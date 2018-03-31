package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> allProduct() {
        List<WebElement> productList = driver.findElements(By.cssSelector("#shopping-cart-table > tbody > tr"));
        return productList;
    }

    public int productCountInCart() {
        return allProduct().size();
    }

    public String productNameWithIndex(int index) {
        WebElement product = allProduct().get(index);
        String productName = product.findElement(By.cssSelector(".product-name > a")).getText();
        return productName;
    }

    public boolean isProductExistInCart(String name) {
        int productCount = productCountInCart();
        for(int i = 0; i < productCount; i++) {
            if(productNameWithIndex(i).contains(name)) {
                return true;
            }
        }
        return false;
    }
}

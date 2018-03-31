package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductDetailPage extends BasePage{
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public WebElement addToCartButton() {
        return driver.findElement(By.cssSelector("#js_registBtn"));
    }
}

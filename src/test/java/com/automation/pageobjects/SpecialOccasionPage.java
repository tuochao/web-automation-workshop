package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SpecialOccasionPage extends BasePage {
    public SpecialOccasionPage(WebDriver driver) {
        super(driver);
    }

    public WebElement productWithName(String name) {
        List<WebElement> productLinks = driver.findElements(By.cssSelector(".category_product ul li .c_name > a"));
        for(WebElement link : productLinks) {
            if(link.getText().contains(name)) {
                return link;
            }
        }
        System.out.println("Error: can't find product with " + name);
        return null;
    }

    public WebElement signInLink() {
        return driver.findElement(By.cssSelector("#js_isNotLogin > a"));
    }

}
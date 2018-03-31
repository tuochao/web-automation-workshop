package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;

    //Constructor
    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getWebDriver() {
        return driver;
    }
    public WebElement findElement(String locator){
        return driver.findElement(By.cssSelector(locator));
    }
}

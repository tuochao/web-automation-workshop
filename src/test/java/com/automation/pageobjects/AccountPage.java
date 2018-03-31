package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class AccountPage extends BasePage{
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String welcomeLabel() {
        return driver.findElement(By.cssSelector("#welcome")).getText();
    }

    public void checkUserName(String username) {
        assertEquals("log in failed", true, welcomeLabel().contains(username));
    }

}

package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement inputUsernameField() {
        return driver.findElement(By.cssSelector("#email"));
    }

    public WebElement inputPasswordField() {
        return driver.findElement(By.cssSelector("#pass"));
    }

    public WebElement signInButton() {
        return driver.findElement(By.cssSelector("#js_registBtn"));
    }

    public void loginAction(String username, String password) {
        inputUsernameField().sendKeys(username);
        inputPasswordField().sendKeys(password);
        signInButton().click();
    }

}

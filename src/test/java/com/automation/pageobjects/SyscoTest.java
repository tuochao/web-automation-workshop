package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SyscoTest {
    private static WebDriver driver;

    public SyscoTest() {
        System.out.println("enter constructor");
    }

    public static void main(String args[]) throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("http://localhost:3000");
        driver.findElements(By.cssSelector(".portion-room-row")).get(0).click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        action.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        driver.quit();
    }

}

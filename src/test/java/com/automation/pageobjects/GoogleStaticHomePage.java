package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class GoogleStaticHomePage {
    public static WebElement element = null;

    public static WebElement searchInputLable(String search, WebDriver driver){

        return element = driver.findElement(By.name("q"));

    }
    public  static void searchForSomeThing(String search,WebDriver driver){
        searchInputLable(search, driver).sendKeys(search);
        searchInputLable(search, driver).submit();
    }

    public static void checkTitle(String title, WebDriver driver) {
        assertEquals("title is not correct", true, driver.getTitle().contains(title));
    }


}

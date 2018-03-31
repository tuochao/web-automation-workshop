package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class GoogleHomePage extends BasePage {
    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchInputField(){
//        WebElement element = driver.findElement(By.name("q"));
//        WebElement element = driver.findElement(By.id("lst-ib"));
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
        WebElement element = driver.findElement(By.cssSelector("#lst-ib"));
        return element;
    }

    public void searchForSomeThing(String text){
        this.searchInputField().sendKeys(text);
        this.searchInputField().submit();
    }

    public WebElement searchButton() {
        WebElement element = driver.findElement(By.cssSelector(".jsb center input[type=\"submit\"]"));
        return element;
    }

    public void checkTitle(String title) {
        assertEquals("title is not correct", true, driver.getTitle().contains(title));
    }

}

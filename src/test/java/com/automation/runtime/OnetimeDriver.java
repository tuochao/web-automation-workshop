package com.automation.runtime;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class OnetimeDriver {
    private WebDriver driver;

    public OnetimeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void beforeScenario() {
        System.out.println("enter before hook");
    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}

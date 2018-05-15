package com.automation.runtime;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class GlobalDriver extends EventFiringWebDriver {
    private static WebDriver REAL_DRIVER;
    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            REAL_DRIVER.quit();
        }
    };

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        REAL_DRIVER = new ChromeDriver(chromeOptions);
        REAL_DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    public GlobalDriver() {
        super(REAL_DRIVER);
    }

    @Before
    public void beforeScenario() {
        System.out.println("enter before");
        manage().deleteAllCookies();
    }

    @After
    public void afterScenario() {

    }
}

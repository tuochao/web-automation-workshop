package com.automation.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.automation.runtime.GlobalDriver;
import com.automation.pageobjects.GoogleHomePage;
import com.automation.pageobjects.GoogleStaticHomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicStepDefs {
    private WebDriver driver;
    private GoogleHomePage googleHomePage;

    public BasicStepDefs() {
        System.out.println("enter constructor");
        driver = new GlobalDriver();
        googleHomePage = new GoogleHomePage(driver);
    }

    /*
    Basic feature steps
    */
    @Given("^\"([^\"]*)\" use Cucumber Main class to run tests$")
    public void I_use_Cucumber_Main_class_to_run_tests(String testString) throws Throwable {
        System.out.println("Hello cucumber jvm " + testString);
    }

    @Then("^Gradle should report \"([^\"]*)\"$")
    public void Gradle_should_report() throws Throwable {
        throw new PendingException();
    }

    /*
    Google feature steps
    */
    @Given("^open page \"(.*?)\"$")
    public void the_page_is_open(String page) throws Throwable {
        driver.get(page);
    }

    @When("^I search for \"(.*?)\"$")
    public void I_search_for(String text) throws Throwable {
//        googleHomePage.searchInputField().sendKeys(text);
//        googleHomePage.searchButton().click();

        googleHomePage.searchForSomeThing(text);

//        GoogleStaticHomePage.searchForSomeThing(search, driver);
    }

    @Then("^the browser title should contain \"(.*?)\"$")
    public void a_browser_title_should_contain(String text) throws Throwable {
        Thread.sleep(1000);
        googleHomePage.checkTitle(text);
//        GoogleStaticHomePage.checkTitle(text, driver);
    }

    @When("^click search configure$")
    public void click_search_configure() {
        driver.findElement(By.cssSelector("#u1 > a.pf")).click();
        driver.findElement(By.cssSelector("#wrapper .bdpfmenu > a.setpref")).click();
        driver.findElement(By.cssSelector("#se-settting-2 > label:nth-child(4)")).click();
    }

//    @Before
//    public void beforeScenario() {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        googleHomePage = new GoogleHomePage(driver);
//    }
//
//    @After
//    public void afterScenario() {
//        driver.quit();
//    }
}

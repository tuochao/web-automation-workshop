package com.automation.stepdefs;

import com.automation.pageobjects.*;
import com.automation.runtime.GlobalDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class FecShopDefs {
    private WebDriver driver;
    private SpecialOccasionPage specialOccasionPage;
    private ProductDetailPage productDetailPage;
    private CartPage cartPage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    public FecShopDefs() {
        driver = new GlobalDriver();
        specialOccasionPage = new SpecialOccasionPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        cartPage = new CartPage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
    }

    @When("^I click sign in link$")
    public void click_sign_in_link() {
        specialOccasionPage.signInLink().click();
    }

    @Then("^input email \"(.*?)\"$")
    public void input_username(String email) {
        loginPage.inputUsernameField().sendKeys(email);
    }

    @And("^input password \"(.*?)\"$")
    public void input_password(String password) {
        loginPage.inputPasswordField().sendKeys(password);
    }

    @And("^click Sign In button$")
    public void click_sign_in_button() {
        loginPage.signInButton().click();
    }

    @Then("^I should be logged in as \"(.*?)\"$")
    public void logged_in(String username) {
        accountPage.checkUserName(username);
    }

    @When("^user select product which contains \"(.*?)\"$")
    public void select_product_with_text(String name) {
        specialOccasionPage.productWithName(name).click();
    }

    @And("^add it to cart$")
    public void add_product_to_cart() {
        productDetailPage.addToCartButton().click();
    }

    @Then("should see product which contains \"(.*?)\" in cart")
    public void check_product_with_name_in_cart(String name) throws InterruptedException{
        assertTrue(cartPage.isProductExistInCart(name));
        sleep(5000);
    }

}

package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xpath.operations.String;
import org.junit.Assert;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("I am on login page")
    public void i_am_on_login_page() {
        Driver.getDriver().get("https://login2.nextbasecrm.com/");

    }
    @When("I enter valid {string} and {string}")
    public void i_enter_valid_and(String username, String password) {
        loginPage.inputUsername.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);

    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.loginButton.click();
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expected = "(46) Portal";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals("FAIL!",expected,actual);
    }
}

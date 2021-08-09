package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();


    @Given("user am on login page")
    public void i_am_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enter valid {string} and {string} and click login button")
    public void i_enter_valid_and(String username, String password) {
        username = ConfigurationReader.getProperty("username");
        loginPage.inputUsername.sendKeys(username);
        password = ConfigurationReader.getProperty("password");
        loginPage.inputPassword.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("user should land home page")
    public void dashboard_should_be_displayed() {
        String expected = "(46) Portal";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals("FAIL!",expected,actual);
    }
}

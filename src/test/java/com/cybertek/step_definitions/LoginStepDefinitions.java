package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user am on login page")
    public void i_am_on_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }
    @When("user enter valid {string} and {string}")
    public void i_enter_valid_and(String username, String password) {
        username = ConfigurationReader.getProperty("username");
        BrowserUtils.sleep(2);
        loginPage.inputUsername.sendKeys(username);
        BrowserUtils.sleep(2);
        password = ConfigurationReader.getProperty("password");
        loginPage.inputPassword.sendKeys(password);
    }
    @When("user click login button")
    public void i_click_login_button() {
        loginPage.signInButton.click();

    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expected = "(46) Portal";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals("FAIL!",expected,actual);
    }


}

package com.cybertek.step_definitions;

import com.cybertek.pages.ClockOutPage;
import com.cybertek.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ClockOut_Definitions {

    ClockOutPage clockOutPage = new ClockOutPage();


    @Then("user clicks on clock button")
    public void user_clicks_on_clock_button() {
      clockOutPage.clockButton.click();
   }
    @Then("user clicks on continue working day button")
    public void user_clicks_on_continue_working_day_button() throws InterruptedException {
        clockOutPage.continueWorkingDay.click();

    }
    @Then("user clicks on clock out button")
    public void user_clicks_on_clock_out_button() throws InterruptedException {
       clockOutPage.clockOutButton.click();

    }
    @Then("user verifies clocked out is displayed")
    public void user_verifies_clocked_out_is_displayed() throws InterruptedException {


        String actualResult = clockOutPage.expectedTitle.getText();

        String expectedResult = "Clocked out";
        BrowserUtils.sleep(2);
        Assert.assertEquals(actualResult,expectedResult);


    }
    }

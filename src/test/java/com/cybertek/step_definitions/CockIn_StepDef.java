package com.cybertek.step_definitions;

import com.cybertek.pages.ClockInPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.omg.PortableServer.THREAD_POLICY_ID;

public class CockIn_StepDef {

    ClockInPage clockIn = new ClockInPage();

    @When(": user navigate  clock in button")
    public void user_navigate_clock_in_button() {
        clockIn.navigateTime.click();
    }

    @When(": user start time track by clicking clock in button")
    public void user_start_time_track_by_clicking_clock_in_button() throws InterruptedException {
        clockIn.ClockInButton.click();
        Thread.sleep(2);
    }

    @Then(": Verify that user start time")
    public void verify_that_user_start_time()  {

        String actualText = "Change clock-out time";
        String expectedText = clockIn.expectedText.getText();

        Assert.assertEquals(actualText, expectedText);

    }

}

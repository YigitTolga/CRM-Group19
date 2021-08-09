package com.cybertek.step_definitions;

import com.cybertek.pages.WorkingDayDurationWindow;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class WorkEditDatStepDef {
    WorkingDayDurationWindow workingDayDurationWindow = new WorkingDayDurationWindow();


    @Then("user click clock")
    public void user_click_clock() throws InterruptedException {

       WebElement clock =  workingDayDurationWindow.clock;
       clock.click();

    }
    @Then("user click edit \\(pencil icon)")
    public void user_click_edit_pencil_icon() {
        workingDayDurationWindow.edit.click();
    }
}

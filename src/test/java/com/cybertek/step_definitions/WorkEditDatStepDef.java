package com.cybertek.step_definitions;

import com.cybertek.pages.WorkingDayDurationWindow;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class WorkEditDatStepDef {
    WorkingDayDurationWindow workingDayDurationWindow = new WorkingDayDurationWindow();


    @Then("user click clock")
    public void user_click_clock() throws InterruptedException {

        WebElement clock = workingDayDurationWindow.clock;
        clock.click();

    }

    @Then("user click edit \\(pencil icon)")
    public void user_click_edit_pencil_icon() {
        workingDayDurationWindow.edit.click();
    }

    @Then("user click Start hour field and set hour {string} and set minutes {string} and choose {string}")
    public void user_click_start_hour_field_and_set_hour_and_set_minutes_and_choose(String editStartHour
            , String editStartMin, String editStartAmPm) {
        workingDayDurationWindow.hourStart.sendKeys(editStartHour);
        workingDayDurationWindow.minStart.sendKeys(editStartMin);
        String actualAmPm = workingDayDurationWindow.startAmPm.getText();

        if (!editStartAmPm.equals(actualAmPm)) {
            workingDayDurationWindow.startAmPm.click();

        }
    }

    @Then("user click End hour field and set hour {string} and set minutes {string} and choose {string}")
    public void user_click_end_hour_field_and_set_hour_and_set_minutes_and_choose(String editEndHour, String editEndMin, String editEndAmPm) {
        workingDayDurationWindow.hourEnd.sendKeys(editEndHour);
        workingDayDurationWindow.minEnd.sendKeys(editEndMin);
        String actualAmPm = workingDayDurationWindow.endAmPm.getText();
        if (!editEndAmPm.equals(actualAmPm)) {
            workingDayDurationWindow.startAmPm.click();
        }
    }

    @Then("User click Reason mandatory text field and enter letters, number and characters {string}")
    public void user_click_reason_mandatory_text_field_and_enter_letters_number_and_characters(String reason) {
        workingDayDurationWindow.reason.sendKeys(reason);
    }

    @Then("user click Save button.")
    public void user_click_save_button() {
        workingDayDurationWindow.save.click();
    }

    @Then("user should see working day duration total hours, minutes, and second on Working Day Duration pop-up")
    public void user_should_see_working_day_duration_total_hours_minutes_and_second_on_working_day_duration_pop_up() {
        Assert.assertTrue(workingDayDurationWindow.displayClock.isDisplayed());
    }
}

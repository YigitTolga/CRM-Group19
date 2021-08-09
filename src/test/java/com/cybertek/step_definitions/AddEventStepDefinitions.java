package com.cybertek.step_definitions;

import com.cybertek.pages.EventPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xpath.operations.String;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddEventStepDefinitions {
    EventPage eventPage = new EventPage();
    Actions actions = new Actions(Driver.getDriver());
    WebElement setHour;
    WebElement setMinute;
    WebElement setAM;
    WebElement setPM;
    WebElement eventBox;
    WebElement submitEvent;


    @When("user click on time container")
    public void i_click_on_time_container() {
        eventPage.timeContainerButton.click();
    }

    @When("user click time boxes")
    public void i_click_time_boxes() {
        eventPage.eventStartTimeBox.click();
    }

    @When("user set up start hour {string} and minute {string}")
    public void user_set_up_start_hour_and_minute(String startHour, String startMinute) throws InterruptedException {
        setHour = Driver.getDriver().findElement(By.xpath("//input[@title='Hours']"));
        setMinute = Driver.getDriver().findElement(By.xpath("//input[@title='Minutes']"));
        actions.doubleClick(setHour);
        actions.perform();
        Thread.sleep(1000);
        setHour.sendKeys(startHour);
        Thread.sleep(1000);

        actions.doubleClick(setMinute);
        actions.perform();
        Thread.sleep(1000);
        setMinute.sendKeys(startMinute);
    }

    @When("choose {string} then click select")
    public void choose_then_click_select(String linkAMorPM) throws InterruptedException {
        setAM = Driver.getDriver().findElement(By.xpath("//span[@title='a.m.']"));
        if (linkAMorPM.equalsIgnoreCase("AM")) {
            eventPage.selectButton.click();
        } else {
            setAM.click();
            Thread.sleep(1000);
            eventPage.selectButton.click();
        }

    }

    @When("user end hour {string} and minute {string}")
    public void user_end_hour_and_minute(String endHour, String endMinute) throws InterruptedException {
        actions.doubleClick(setHour);
        actions.perform();
        Thread.sleep(1000);
        setHour.sendKeys(endHour);
        Thread.sleep(1000);
        actions.doubleClick(setMinute);
        actions.perform();
        Thread.sleep(1000);
        setMinute.sendKeys(endMinute);

    }

    @When("choose {string} then click select button")
    public void choose_then_click_select_button(String linkAMorPM) throws InterruptedException {
        setPM = Driver.getDriver().findElement(By.xpath("//span[@title='p.m.']"));
        if (linkAMorPM.equalsIgnoreCase("PM")) {
            eventPage.selectButton.click();
        } else {
            setPM.click();
            Thread.sleep(1000);
            eventPage.selectButton.click();
        }

    }

    @When("user enter {string} and click plus button")
    public void i_enter_and_click_plus_button(String eventName) {
        eventBox = Driver.getDriver().findElement(By.xpath("//input[@class='tm-popup-event-form-textbox_am_pm']"));
        eventBox.sendKeys(eventName);
        submitEvent = Driver.getDriver().findElement(By.xpath("//span[@class='tm-popup-event-form-submit']"));
        submitEvent.click();
    }

    @Then("{string} should be displayed")
    public void should_be_displayed(String eventName) {
        String expectedResult = eventName;
        String actualResult = Driver.getDriver().findElement(By.xpath("//span[.='Birthday Party']")).getText();
        Assert.assertTrue(actualResult.equalsIgnoreCase(expectedResult));
    }


}
//Three problems here. one of them is bug. 0-12 problems. Another one if is there more than one birthday
//party how to can I assert it. last problem is setting time zone. it means change am to pm and pm to am.


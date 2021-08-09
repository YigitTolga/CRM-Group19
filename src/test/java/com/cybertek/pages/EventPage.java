package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EventPage {
    public EventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='bx-time']")
    public WebElement timeContainerButton;

    @FindBy(xpath = "//input[@class='tm-popup-event-start-time-textbox_am_pm']")
    public WebElement eventStartTimeBox;

    @FindBy(xpath = "//span[.='Select']")
    public WebElement selectButton;

    @FindBy(xpath = "//input[@class='tm-popup-event-form-textbox_am_pm']")
    public WebElement newEventBox;

    @FindBy(xpath = "//span[@class='tm-popup-event-form-submit']")
    public WebElement plusButton;
}



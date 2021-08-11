package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClockOutPage {
    public ClockOutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@class='time-hours']")
    public WebElement clockButton;

    @FindBy(xpath = "//*[@class='webform-small-button-text']")
    public WebElement continueWorkingDay;

    @FindBy(xpath = "//*[@class='webform-small-button-text']")
    public WebElement clockOutButton;

    @FindBy(xpath = "//span[@id='timeman-status']")
    public WebElement expectedTitle;
}

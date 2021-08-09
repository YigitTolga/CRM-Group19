package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClockInPage {

    public ClockInPage () {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id='timeman-block']")
    public WebElement navigateTime;

    @FindBy(xpath = "//*[@class ='webform-small-button-text']")
    public WebElement ClockInButton;


    @FindBy(xpath = "//span[.='Change clock-out time']")
    public WebElement expectedText;

}

package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkingDayDurationWindow {
    public WorkingDayDurationWindow() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='timeman-timer']")
    public WebElement clock;
    @FindBy(xpath = "//span[@class='tm-popup-notice-pencil']")
    public WebElement edit;
    @FindBy(xpath = "(//input[@class='bxc-cus-sel'])[1]")
    public WebElement hourStart;
    @FindBy(xpath = "(//input[@class='bxc-cus-sel'])[2]")
    public WebElement minStart;
    @FindBy(xpath = "(//input[@class='bxc-cus-sel'])[3]")
    public WebElement hourEnd;
    @FindBy(xpath = "//input[@class='bxc-cus-sel'])[4]")
    public WebElement minEnd;
    @FindBy (xpath = "//div[text()='Reason']/following-sibling::textarea")
    public WebElement reason;
    @FindBy (id = "Save")
    public WebElement save;
    @FindBy (xpath = "(//span[@class='bxc-am-pm'])[1]")
    public WebElement startAmPm;
    @FindBy (xpath = "(//span[@class='bxc-am-pm'])[2]")
    public WebElement endAmPm;
    @FindBy (xpath = "(//span[@style='display: block;'])[1]")
    public WebElement displayClock;
}

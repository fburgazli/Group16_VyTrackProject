package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetManagementPage {
    public FleetManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#main-menu > ul > li:nth-child(1) > a > span")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[text()='Vehicles']")
    public WebElement vehiclesButton;

    @FindBy(xpath = "//a[@title='Grid Settings']/..//preceding::a[@title='Reset']")
    public WebElement gridSetOnRightOfReset;



}


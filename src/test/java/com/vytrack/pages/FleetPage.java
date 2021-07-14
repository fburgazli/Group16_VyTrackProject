package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetPage {
    public FleetPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath ="//span[.='Vehicles']" )
    public WebElement vehicles;

    @FindBy(xpath = "//div[@class='pull-left grid-toolbar-mass-actions']")
    public WebElement exportGridbox;

    @FindBy(xpath = "// a[@title='Grid Settings']")
    public WebElement gridSettingsBtn;

    @FindBy(xpath ="//h1[.='Cars']" )
    public WebElement CarsText;


    @FindBy(xpath = "(//a[@title='Refresh'])[1]")
    public WebElement refreshBtn;

    @FindBy(xpath = "//a[@title='Grid Settings']/..//preceding::a[@title='Reset']")
    public WebElement gridSetOnRightOfReset;
}

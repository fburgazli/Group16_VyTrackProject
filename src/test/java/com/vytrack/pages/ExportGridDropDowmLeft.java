package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vytrack.utilities.Driver;



public class ExportGridDropDowmLeft {


    public ExportGridDropDowmLeft(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "prependedInput")
    public WebElement inputUsername;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy(id = "_submit")
    public WebElement logInButton;

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement fleet;

    @FindBy(xpath ="//span[.='Vehicles']" )
    public WebElement vehicles;

    @FindBy(xpath = "//div[@class='pull-left grid-toolbar-mass-actions']")
    public WebElement exportGridbox;







}

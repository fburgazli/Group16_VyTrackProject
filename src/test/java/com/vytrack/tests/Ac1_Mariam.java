package com.vytrack.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.vytrack.utilities.Driver;




public class Ac1_Mariam {
    public Ac1_Mariam(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement Username;

    @FindBy(id = "prependedInput2")
    public WebElement Password;

    @FindBy(xpath ="//*[@id=\"_submit\"]" )
    public WebElement LOGIN;

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement fleetBtn;

    @FindBy(xpath = "//span[@class='title title-level-2'][1]")
    public WebElement vehicleBtn;

    @FindBy(xpath = "//h1[.='Cars']")
    public WebElement carsText;


    @FindBy(xpath = "(//a[@title='Refresh'])[1]")
    public WebElement refreshBtn;

    @FindBy(xpath = "(//div[@class='loader-mask shown'])[1]")
    public WebElement loaderMask;



}

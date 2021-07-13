package com.vytrack.mariamPages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MariamLoginPage {
    public MariamLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "prependedInput")
    public WebElement Username;

    @FindBy(id = "prependedInput2")
    public WebElement Password;

    @FindBy(id = "_submit" )
    public WebElement LOGIN;

   // @FindBy(xpath = "//h1[.='Quick Launchpad']")
  //  public WebElement quickLunchPad;

    @FindBy(xpath ="(//span[@class = 'title title-level-1'])[1]")
    public WebElement fleetDropdown;

    @FindBy(xpath ="//span[.='Vehicles']")
    public WebElement vehiclesBtn;

    @FindBy(xpath ="//h1[.='Cars']" )
    public WebElement CarsText;

  //  @FindBy(xpath = "//label[.='Total of 4555 records']")
  //  public WebElement totalRecords;

    @FindBy(xpath = "(//a[@title='Refresh'])[1]")
    public WebElement refreshBtn;


}

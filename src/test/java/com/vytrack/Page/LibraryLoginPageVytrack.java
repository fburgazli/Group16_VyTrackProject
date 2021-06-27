package com.vytrack.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vytrack.utilities.Driver;
public class LibraryLoginPageVytrack {

public LibraryLoginPageVytrack(){

    PageFactory.initElements(Driver.getDriver(), this); }
    @FindBy(id = "prependedInput")
    public WebElement inputUserName;
    @FindBy(id="prependedInput2")
    public WebElement inputPassword;
    @FindBy(id="_submit")
    public WebElement loginBtn;
    @FindBy(xpath="//span[@class='title title-level-1']")
    public WebElement fleetBtn;
    @FindBy(xpath = "//div[@id='container']")
    public WebElement vehiclesBtn;
    @FindBy(xpath = "//a[@title='With this button you will export the content of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']")
    public WebElement exportGridBtn;
    @FindBy(xpath = "//a[@class='action btn refresh-action mode-text-only']")
    public WebElement refreshBtn;
    @FindBy(xpath = "//a[@class='action btn reset-action mode-text-only']")
    public WebElement resetBtn;


}
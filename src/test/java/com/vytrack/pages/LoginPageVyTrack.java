package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageVyTrack {
    public LoginPageVyTrack(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id ="prependedInput")
    public WebElement inputEmail;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy(id="_submit")
    public WebElement logInButton;

    @FindBy(linkText="Invalid user name or password.")
    public WebElement invalidEmailError;

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement fleetBtn;

    @FindBy(xpath ="//span[@class='title title-level-2'][1]" )
    public  WebElement vehicleBtn;

    @FindBy(xpath = "// a[@title='Grid Settings']")
    public WebElement gridSettingsBtn;
}

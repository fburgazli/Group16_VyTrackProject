package com.vytrack.pages;

import com.vytrack.tests.LoginTest01;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement inputUsername;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(linkText="Invalid user name or password.")
    public WebElement invalidEmailError;

    public void loginMethod(String username,String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        inputUsername.sendKeys(ConfigurationReader.getProperty(username));
        inputPassword.sendKeys(ConfigurationReader.getProperty(password));
        loginButton.click();
    }

}

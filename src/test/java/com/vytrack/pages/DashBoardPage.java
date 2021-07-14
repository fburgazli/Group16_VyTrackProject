package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class DashBoardPage {
    public DashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='#'])[3]")
    public WebElement fleetTabButton;

    @FindBy(xpath = "//span[.='Vehicles']/..")
    public WebElement vehiclesButton;


    public void actions_clicks(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabButton).perform();
        element.click();
    }
}

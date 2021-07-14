package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FleetPage {
    public FleetPage(){
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

    public static class AC1_Mariam_VyTruck {
        public AC1_Mariam_VyTruck(){
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
}

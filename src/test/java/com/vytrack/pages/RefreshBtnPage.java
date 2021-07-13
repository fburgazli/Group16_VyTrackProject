package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RefreshBtnPage {
    public RefreshBtnPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//h1[.='Cars']" )
    public WebElement CarsText;


    @FindBy(xpath = "(//a[@title='Refresh'])[1]")
    public WebElement refreshBtn;


}

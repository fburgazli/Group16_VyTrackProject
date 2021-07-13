package com.vytrack.tests;

import com.vytrack.pages.ExportGridDropDowmLeft;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vytrack.utilities.Driver;

public class ExportGridDropDownLeftObject {
    @Test
    public void ExportGridDropDownLeftTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtils.sleep(3);
        ExportGridDropDowmLeft logIn=new ExportGridDropDowmLeft();
        logIn.inputUsername.sendKeys("user47");
        logIn.inputPassword.sendKeys("UserUser123");
        logIn.logInButton.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(logIn.fleet).perform();
        actions.moveToElement(logIn.vehicles).click().perform();
        String expectedText="pull-left";
        String actualText=logIn.exportGridbox.getAttribute("class");

        Assert.assertTrue(actualText.contains(expectedText));




    }
}
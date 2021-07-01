package com.vytrack.tests;

import com.vytrack.pages.FleetPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GridSettingsButtonTest {

    @Test
    public void grid_settings_button_test(){
        //
        LoginPage loginPage = new LoginPage();
        loginPage.loginMethod(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));


        FleetPage fleetPage = new FleetPage();
        fleetPage.actions_clicks(fleetPage.vehiclesButton);

        WebElement actionsPanel= Driver.getDriver().findElement(By.xpath("//a[@title = 'Grid Settings']/../../.."));
        String expectedText = "right";
        String actualText = actionsPanel.getAttribute("class");
        Assert.assertTrue(actualText.contains(expectedText));

    }

    @AfterMethod
    public void teardown(){
        //Driver.closeDriver();
    }
}

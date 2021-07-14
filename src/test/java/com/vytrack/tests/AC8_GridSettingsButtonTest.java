package com.vytrack.tests;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AC8_GridSettingsButtonTest {

    @Test
    public void grid_settings_button_test(){
        //
        LoginPage loginPage = new LoginPage();
        loginPage.loginMethod(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));

        DashBoardPage dashBoardPage = new DashBoardPage();
        dashBoardPage.actions_clicks(dashBoardPage.vehiclesButton);

        WebElement actionsPanel= Driver.getDriver().findElement(By.xpath("//a[@title = 'Grid Settings']/../../.."));
        String expectedText = "right";
        String actualText = actionsPanel.getAttribute("class");
        Assert.assertTrue(actualText.contains(expectedText));

    }

    @AfterMethod
    public void teardown(){

    }
}

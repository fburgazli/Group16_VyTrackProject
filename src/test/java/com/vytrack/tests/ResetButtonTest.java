package com.vytrack.tests;

import com.vytrack.pages.*;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class ResetButtonTest {
    @Test
    public void  resetBtn(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(3);

        FleetPage fleetPage=new FleetPage();

        LoginPage loginPage=new LoginPage();

        DashBoardPage dashBoardPage=new DashBoardPage();
        loginPage.loginMethod("user","password");

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(dashBoardPage.fleetTabButton).perform();
        actions.moveToElement(dashBoardPage.vehiclesButton).click().perform();

        fleetPage.resetBtn.click();


    }
}

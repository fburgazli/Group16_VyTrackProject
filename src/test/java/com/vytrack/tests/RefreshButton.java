package com.vytrack.tests;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RefreshButton {
    @Test(priority = 1)
    public void login() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(3);

        LoginPage loginPage = new LoginPage();

        DashBoardPage dashBoardPage = new DashBoardPage();
        loginPage.loginMethod("user", "password");


        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(dashBoardPage.fleetTabButton).perform();
        actions.moveToElement(dashBoardPage.vehiclesButton).click().perform();
        Thread.sleep(2);

    }


        @Test(priority = 2)
    public void refreshBtn(){
            DashBoardPage dashBoardPage1 = new DashBoardPage();
            dashBoardPage1.refreshButton.click();
            Assert.assertTrue(dashBoardPage1.refreshButton.isEnabled());



        }



    }


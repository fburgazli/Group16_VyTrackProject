package com.vytrack.tests;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.FleetPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ExportGridDropDownObjectTest {
        @Test
        public void ExportGridDropDownLeft(){
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            BrowserUtils.sleep(3);
            FleetPage fleetPage=new FleetPage();
            LoginPage loginPage=new LoginPage();
            DashBoardPage dashBoardPage=new DashBoardPage();
            loginPage.loginMethod("user","password");
            Actions actions=new Actions(Driver.getDriver());
            actions.moveToElement(dashBoardPage.fleetTabButton).perform();
            actions.moveToElement(dashBoardPage.vehiclesButton).click().perform();
            String expectedText="pull-left";
            String actualText=fleetPage.exportGridbox.getAttribute("class");
            Assert.assertTrue(actualText.contains(expectedText));


        }
    }



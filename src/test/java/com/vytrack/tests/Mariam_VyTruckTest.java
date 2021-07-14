package com.vytrack.tests;

import com.vytrack.pages.FleetPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mariam_VyTruckTest {
    @Test
    public void login_test() {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        FleetPage.AC1_Mariam_VyTruck vtPageLogin = new FleetPage.AC1_Mariam_VyTruck();
        vtPageLogin.Username.sendKeys("user47");
        BrowserUtils.sleep(2);
        vtPageLogin.Password.sendKeys("UserUser123");
        vtPageLogin.LOGIN.click();

        vtPageLogin.fleetBtn.click();

        vtPageLogin.vehicleBtn.click();

        BrowserUtils.sleep(2);

        String expectedCarText = "Cars";
        Assert.assertEquals(vtPageLogin.carsText.getText(), expectedCarText);
        BrowserUtils.sleep(2);


        vtPageLogin.refreshBtn.click();
        BrowserUtils.sleep(1);
        Assert.assertTrue(vtPageLogin.refreshBtn.isEnabled());
        vtPageLogin.refreshBtn.click();
        Assert.assertTrue(vtPageLogin.loaderMask.isDisplayed());
        BrowserUtils.sleep(1);


    }
    }

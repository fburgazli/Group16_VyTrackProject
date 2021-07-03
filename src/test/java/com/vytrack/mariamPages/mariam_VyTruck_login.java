package com.vytrack.mariamPages;

import com.vytrack.tests.Ac1_Mariam;
import com.vytrack.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vytrack.utilities.Driver;



public class mariam_VyTruck_login {
    @Test
    public void login_test() {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        Ac1_Mariam vtPageLogin = new Ac1_Mariam();
        vtPageLogin.Username.sendKeys("user47");
        BrowserUtils.sleep(2);
        vtPageLogin.Password.sendKeys("UserUser123");
        vtPageLogin.LOGIN.click();

        vtPageLogin.fleetBtn.click();

        vtPageLogin.vehicleBtn.click();

        BrowserUtils.sleep(2);

        String expectedCarText = "Cars";
        Assert.assertEquals(vtPageLogin.carsText.getText(),expectedCarText);
        BrowserUtils.sleep(2);


        vtPageLogin.refreshBtn.click();
        BrowserUtils.sleep(1);
        Assert.assertTrue(vtPageLogin.refreshBtn.isEnabled());
        vtPageLogin.refreshBtn.click();
        Assert.assertTrue(vtPageLogin.loaderMask.isDisplayed());
        BrowserUtils.sleep(1);







    }
}


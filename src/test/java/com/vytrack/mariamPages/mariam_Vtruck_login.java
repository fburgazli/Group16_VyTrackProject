package com.vytrack.mariamPages;

import com.vytrack.tests.Ac1_Mariam;
import com.vytrack.utilities.BrowserUtils;
import org.testng.annotations.Test;
import com.vytrack.utilities.Driver;



public class mariam_Vtruck_login {
    @Test
    public void login_test() {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
       Ac1_Mariam vtPageLogin = new Ac1_Mariam();
        vtPageLogin.Username.sendKeys("user47");

        BrowserUtils.sleep(2);

        //3- Enter incorrect password
        vtPageLogin.Password.sendKeys("UserUser123");

        //click to sign in button
        vtPageLogin.LOGIN.click();

        vtPageLogin.fleetBtn.click();

        vtPageLogin.vehicleBtn.click();

        vtPageLogin.refreshBtn.click();

    }
}


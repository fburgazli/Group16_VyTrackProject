package com.vytrack.tests;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.CarsPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ObjectForVyTrack {
    @Test
    public void vy_Track_Login_Page() {

        LoginPage login = new LoginPage();
        DashBoardPage dashBoardPage = new DashBoardPage();
        CarsPage carsPage = new CarsPage();
        Actions act = new Actions(Driver.getDriver());

        login.loginMethod("username", "password");
        act.moveToElement(dashBoardPage.fleetTabButton).perform();
        BrowserUtils.sleep(3);

        dashBoardPage.vehiclesButton.click();
        carsPage.gridSettingsBtn.click();


           Assert.assertTrue(carsPage.gridSettingsBtn.isDisplayed());

    }
}

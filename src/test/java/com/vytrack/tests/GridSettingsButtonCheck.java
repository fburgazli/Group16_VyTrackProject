package com.vytrack.tests;

import com.vytrack.pages.FleetPage;
import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GridSettingsButtonCheck {

    //  AC-7. Verify that Grid Settings should be on the right side of the Reset button
    //  //a[@title='Grid Settings']/..//preceding::a[@title='Reset']

    @Test
    public void gridOnRightSide() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginMethod("user", "password");
        DashBoardPage fleetLibrary = new DashBoardPage();
        FleetPage fleetPage = new FleetPage();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetLibrary.fleetTabButton).perform();
        actions.moveToElement(fleetLibrary.vehiclesButton).click().perform();
        BrowserUtils.sleep(1);

        Assert.assertTrue(fleetPage.gridSetOnRightOfReset.isDisplayed());

    }

}

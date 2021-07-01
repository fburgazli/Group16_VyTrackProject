package com.vytrack.tests;

import com.vytrack.pages.FleetManagementPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VyTrackUtils;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GridSettingsButtonCheck {

    //  AC-7. Verify that Grid Settings should be on the right side of the Reset button
    //  //a[@title='Grid Settings']/..//preceding::a[@title='Reset']

    @Test
    public void gridOnRightSide() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        FleetManagementPage fleetLibrary = new FleetManagementPage();
        VyTrackUtils.getEnvironment();
        VyTrackUtils.loginTruckDriver();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetLibrary.fleetButton).perform();
        actions.moveToElement(fleetLibrary.vehiclesButton).click().perform();
        BrowserUtils.sleep(1);

        Assert.assertTrue(fleetLibrary.gridSetOnRightOfReset.isDisplayed());
        VyTrackUtils.tearDown();





    }

}

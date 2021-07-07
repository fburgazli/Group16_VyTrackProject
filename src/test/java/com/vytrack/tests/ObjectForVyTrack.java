package com.vytrack.tests;

import com.vytrack.pages.VyTrackLoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ObjectForVyTrack {
    @Test
    public void vy_Track_Login_Page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));


        VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();

        vyTrackLoginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("username"));

        vyTrackLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        vyTrackLoginPage.logInButton.click();

        // BrowserUtils.sleep(3);
        //   vyTrackLoginPage.fleetBtn.click();
        Actions act = new Actions(Driver.getDriver());
        act.moveToElement(vyTrackLoginPage.fleetBtn).perform();
        BrowserUtils.sleep(3);

//         Actions actVeh =new Actions(Driver.getDriver());
//   actVeh.moveToElement(vyTrackLoginPage.vehicleBtn).click().perform();
        vyTrackLoginPage.vehicleBtn.click();

        vyTrackLoginPage.gridSettingsBtn.click();


        //   Assert.assertTrue(vyTrackLoginPage.gridSettingsBtn.isDisplayed());

    }
    }

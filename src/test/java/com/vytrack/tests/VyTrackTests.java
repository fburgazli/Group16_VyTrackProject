package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.VyTrackUtils;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTrackTests extends  TestBase {

   @Test (priority = 1)
    public void loginTest(){
       VyTrackUtils.loginToVyTrack(driver);
       VyTrackUtils.vehicleUnderFleetTest(driver);
       BrowserUtils.sleep(5);
       VyTrackUtils.generalCarInfoTest(driver);
       BrowserUtils.sleep(10);
       VyTrackUtils.addEventTest(driver);
   }

}


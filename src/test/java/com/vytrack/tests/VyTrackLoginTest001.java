package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.VyTrackUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VyTrackLoginTest001 {
    WebDriver driver;
   @Test
    public void loginTest(){
       VyTrackUtils.setupForVyTrack(driver);
       //BrowserUtils.sleep(10);
       //VyTrackUtils.loginToVyTrack(driver);
   }
}

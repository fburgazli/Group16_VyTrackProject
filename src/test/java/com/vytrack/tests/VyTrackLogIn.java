package com.vytrack.tests;

import com.vytrack.pages.FleetManagementPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VyTrackUtils;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class VyTrackLogIn {

    @Test
    public static void positiveLogInUser45() {
        VyTrackUtils.getEnvironment();
        VyTrackUtils.loginTruckDriver();
        VyTrackUtils.tearDown();
    }

    @Test
    public static void positiveLogInStoreManager81() {
        VyTrackUtils.getEnvironment();
        VyTrackUtils.loginStoreManager();
        VyTrackUtils.tearDown();
    }

    @Test
    public static void positiveLogInSalesManager146(){
        VyTrackUtils.getEnvironment();
        VyTrackUtils.loginSalesManager();
        VyTrackUtils.tearDown();
    }

}

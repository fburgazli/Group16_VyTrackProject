package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {


        @BeforeMethod
        public void setupForVyTrack() {
            Driver.getDriver().get(ConfigurationReader.getProperty("browser"));
            BrowserUtils.sleep(3);
            Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Driver.getDriver().manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            Driver.getDriver().manage().window().maximize();
            Driver.getDriver().manage().deleteAllCookies();
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            BrowserUtils.sleep(3);

    }
        @AfterMethod
        public void tearDown(){
                Driver.closeDriver();
        }
}

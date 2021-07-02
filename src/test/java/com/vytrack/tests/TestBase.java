package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public  class TestBase {
        WebDriver driver;

        @BeforeMethod
        public void setupForVyTrack() {

            driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
            BrowserUtils.sleep(3);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(ConfigurationReader.getProperty("url"));
            BrowserUtils.sleep(3);

    }
        @AfterMethod
        public void tearDown(){
                //driver.quit();
        }
}

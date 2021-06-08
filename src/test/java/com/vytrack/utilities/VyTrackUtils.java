package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VyTrackUtils {
    WebDriver driver;

    public static void setupForVyTrack(WebDriver driver) {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
       // driver.get("https://qa3.vytrack.com/user/login");
        loginToVyTrack(driver);
    }

        public static void loginToVyTrack(WebDriver driver) {

            //driver.get(ConfigurationReader.getProperty("env"));
            driver.get("https://qa3.vytrack.com/user/login");
            //BrowserUtils.sleep(10);
            driver.findElement(By.name("_username")).sendKeys(ConfigurationReader.getProperty("username"));
            driver.findElement(By.name("_password")).sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
            // driver.findElement(By.id("_submit")).click();
        }
}

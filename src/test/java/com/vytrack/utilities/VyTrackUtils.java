package com.vytrack.utilities;

import com.vytrack.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VyTrackUtils {

    public static void getEnvironment() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public static void tearDown() {
        Driver.getDriver().close();
    }

    public static void loginTruckDriver() {
        LoginPage loginPage = new LoginPage();
        loginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("userTruckDriver"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.logInButton.click();
    }

    public static void loginStoreManager() {
        LoginPage loginPage = new LoginPage();
        loginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("userStoreManager"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.logInButton.click();
    }

    public static void loginSalesManager() {
        LoginPage loginPage = new LoginPage();
        loginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("userSalesManager"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.logInButton.click();

    }
}

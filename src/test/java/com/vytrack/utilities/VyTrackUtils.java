package com.vytrack.utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VyTrackUtils {

        public static void loginToVyTrack(WebDriver driver) {
            driver.findElement(By.name("_username")).sendKeys(ConfigurationReader.getProperty("username"));
            driver.findElement(By.name("_password")).sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
            //driver.findElement(By.id("_submit")).click();
            String expectedTitle = "Dashboard";
            BrowserUtils.sleep(3);
            Assert.assertEquals(driver.getTitle(), expectedTitle);
        }

        public static void vehicleUnderFleetTest(WebDriver driver){
            WebElement fleetButton = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
            Actions action = new Actions(driver);
            action.moveToElement(fleetButton).perform();
            driver.findElement(By.xpath("//span[text()='Vehicles']/..")).click();

            String expectedTitle ="Car - Entities - System - Car - Entities - System";
            BrowserUtils.sleep(3);
            Assert.assertEquals(driver.getTitle(),expectedTitle);
        }

        public static void generalCarInfoTest(WebDriver driver){
            driver.findElement(By.xpath("//tr[@class='grid-row row-click-action']")).click();
            String expectedHeader = "General Information";
            String actualHeader = driver.findElement(By.xpath("//span[.='General Information']")).getText();
            Assert.assertEquals(actualHeader, expectedHeader);
        }

        public static void addEventTest(WebDriver driver){

            driver.findElement(By.xpath("//a[@data-id='127']")).click();
            Faker faker = new Faker();
            driver.findElement(By.xpath("//input[contains(@id,'form_title')]")).sendKeys(faker.lorem().fixedString(10));

            WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@id,'form_description')]"));
            driver.switchTo().frame(iframe);
            driver.findElement(By.id("tinymce")).sendKeys(faker.lorem().sentence(30));
            driver.switchTo().parentFrame();
            driver.findElement(By.xpath("//input[contains(@id,'organizerDisplayName')]")).sendKeys(faker.name().fullName());

            driver.findElement(By.xpath("//input[contains(@id,'organizerEmail')]")).sendKeys(faker.internet().emailAddress());
            driver.findElement(By.xpath("//button[.='Save']")).click();

            BrowserUtils.sleep(5);



        }
}

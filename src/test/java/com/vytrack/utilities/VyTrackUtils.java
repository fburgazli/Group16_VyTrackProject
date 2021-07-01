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

        public static void loginToVyTrack() {
            Driver.getDriver().findElement(By.name("_username")).sendKeys(ConfigurationReader.getProperty("username"));
            Driver.getDriver().findElement(By.name("_password")).sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
            //driver.findElement(By.id("_submit")).click();

        }

        public static void vehicleUnderFleetTest(){
            WebElement fleetButton = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
            Actions action = new Actions(Driver.getDriver());
            action.moveToElement(fleetButton).perform();
            Driver.getDriver().findElement(By.xpath("//span[text()='Vehicles']/..")).click();

        }

        public static void generalCarInfoTest(){
            Driver.getDriver().findElement(By.xpath("//tr[@class='grid-row row-click-action']")).click();
            String expectedHeader = "General Information";
            String actualHeader = Driver.getDriver().findElement(By.xpath("//span[.='General Information']")).getText();
            Assert.assertEquals(actualHeader, expectedHeader);
        }

        public static void addEventTest(WebDriver driver){

            Driver.getDriver().findElement(By.xpath("//a[@data-id='127']")).click();
            Faker faker = new Faker();
            Driver.getDriver().findElement(By.xpath("//input[contains(@id,'form_title')]")).sendKeys(faker.lorem().fixedString(10));

            WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[contains(@id,'form_description')]"));
            Driver.getDriver().switchTo().frame(iframe);
            Driver.getDriver().findElement(By.id("tinymce")).sendKeys(faker.lorem().sentence(30));
            Driver.getDriver().switchTo().parentFrame();
            Driver.getDriver().findElement(By.xpath("//input[contains(@id,'organizerDisplayName')]")).sendKeys(faker.name().fullName());

            Driver.getDriver().findElement(By.xpath("//input[contains(@id,'organizerEmail')]")).sendKeys(faker.internet().emailAddress());
            Driver.getDriver().findElement(By.xpath("//button[.='Save']")).click();

            BrowserUtils.sleep(5);



        }
}

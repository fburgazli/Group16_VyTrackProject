package com.vytrack.tests;

import com.vytrack.mariamPages.MariamLoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MariamVyTruckTest {
    MariamLoginPage login = new MariamLoginPage();
    @Test
    public void login_test() {

        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        login.Username.sendKeys("user47");
        BrowserUtils.sleep(2);
        login.Password.sendKeys("UserUser123");
        login.LOGIN.click();

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(1);
        actions.moveToElement(login.fleetDropdown).perform();
        login.vehiclesBtn.click();


        BrowserUtils.sleep(1);
         String expectedCarsText = "Cars";
         Assert.assertEquals(login.CarsText.getText(),expectedCarsText);
          //  String expectedTotalRecord = "Total of 4555 Records";
          //  Assert.assertEquals(loginPage1.totalRecords.getText(),expectedTotalRecord);
         BrowserUtils.sleep(1);

         BrowserUtils.sleep(1);
         Assert.assertTrue(login.refreshBtn.isEnabled());
         login.refreshBtn.click();
         BrowserUtils.sleep(1);

            }
            @AfterMethod
         public void tearDown(){
         BrowserUtils.sleep(3);
         Driver.closeDriver();
            }








        }


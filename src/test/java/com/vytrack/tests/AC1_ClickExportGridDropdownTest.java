package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import org.testng.annotations.Test;

public class AC1_ClickExportGridDropdownTest {
/**
 Step 1- I  Go to VyTrack login page https://qa3.vytrack.com/user/login
 Step 2- I Login as an Truck Driver, Enter correct user name
 Step 3- I Enter correct password
 Step 4- I Click login button
 Step 5- Fleet Management page should show in the 	screen
 Step 6- I Click Fleet button
 Step 7- A dropdown  list should show then I click Vehicles button
 Step 8- A new page should show in the screen
 Step 9- I Click on the Export Grid dropdown button
 Step 10- I should see the ExportGrid button dropdown shows two options
 *
 */
@Test
public void clickable_Export_Grid_Dropdown_Button(){
    Driver.getDriver().get("https://qa3.vytrack.com/user/login");

    LibraryLoginPageVytrack loginPage = new LibraryLoginPageVytrack();
    loginPage.inputUserName.sendKeys("user45");
    loginPage.inputPassword.sendKeys("UserUser123");
    loginPage.loginBtn.click();
    loginPage.fleetBtn.click();
    loginPage.vehiclesBtn.click();
    loginPage.exportGridBtn.click();




}

}

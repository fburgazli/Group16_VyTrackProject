package com.vytrack.tests;

//import com.vytrack.pages.RefreshBtnPage;
import com.sun.xml.internal.bind.v2.TODO;
import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RefreshBtnTest {
    @Test
    public void login_test() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginMethod(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));

        DashBoardPage dashBoardPage = new DashBoardPage();
//        dashBoardPage.actions_clicks(dashBoardPage.vehiclesButton);


//        RefreshBtnPage refreshBtnPage = new RefreshBtnPage();
//        BrowserUtils.sleep(1);
//         String expectedCarsText = "Cars";
//         Assert.assertEquals(refreshBtnPage.CarsText.getText(),expectedCarsText);
//          //  String expectedTotalRecord = "Total of 4555 Records";
//          //  Assert.assertEquals(loginPage1.totalRecords.getText(),expectedTotalRecord);
//         BrowserUtils.sleep(1);
//
//         BrowserUtils.sleep(1);
//         Assert.assertTrue(refreshBtnPage.refreshBtn.isEnabled());
//         refreshBtnPage.refreshBtn.click();
//         BrowserUtils.sleep(1);


    }

    @AfterMethod
    public void tearDown() {
        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }
}


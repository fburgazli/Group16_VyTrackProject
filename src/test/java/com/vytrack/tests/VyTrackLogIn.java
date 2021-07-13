package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import org.testng.annotations.*;

public class VyTrackLogIn {

    @Test
    public static void positiveLogInUser45() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginMethod("user", "password");

    }

    @Test
    public static void positiveLogInStoreManager81() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginMethod("userStoreManager", "password");

    }

    @Test
    public static void positiveLogInSalesManager146(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginMethod("userSalesManager", "password");

    }

}

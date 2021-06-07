package com.vytrack.utilities;

public class BrowserUtils {
    /*
    method accepts integer and wait for given second duration
     */
    public static void sleep(int second) {
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

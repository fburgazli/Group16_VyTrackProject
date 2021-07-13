package com.vytrack.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    // we are calling the below method in another class (task5BasicLoginAuthentication) in main method by the below steps
    //WebDriverManager.chromedriver().setup();
    //WebDriver driver = WebDriverFactory.getDriver("chrome");

    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            System.out.println("Given browser type is not supported. Driver = null");
            return null;


        }
    }
}

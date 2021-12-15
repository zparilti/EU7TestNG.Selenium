package com.cybertek.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    //task:
    // write a static method that takes a string parameter name: brawserType
    //based on the value of parameter
    //it will setup the browser and the method will return chromedriver
    // or firefoxdriver object
    //name of the method: getDriver

    public static WebDriver getDriver(String browsertype){
        WebDriver driver = null;

        switch(browsertype.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

        }

       return driver;
    }

}

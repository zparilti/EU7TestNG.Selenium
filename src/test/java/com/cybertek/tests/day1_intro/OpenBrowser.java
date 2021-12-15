package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {
//        //we have to enter this line every time we want to open chrome
//        //hey webdrivermanager, can you make chrome ready for me for automation.
        //WebDriverManager.chromedriver().setup();
//
//
//        //webdriver reperesent the browser
//        //we are creating driver for chrome browser
       //new Chromedriver() --- this part will open chrome browser
        //WebDriver driver = new ChromeDriver();

       //.get (url) method used for navigation to page
      //  driver.get("https://cybertekschool.com");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");




    }
}

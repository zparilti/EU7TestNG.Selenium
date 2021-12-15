package com.cybertek.tests.Review.Week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cybertek.Utilities.WebDriverFactory;

public class T02_CybertekUrlTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.navigate().to("http://practice.cybertekschool.com");
        String expectedUrlTest = "Cybertek";
        String ActualUrl = driver.getCurrentUrl();

        System.out.println("ActualUrl = " + ActualUrl.contains(expectedUrlTest));
        System.out.println("driver = " + driver.getTitle().equalsIgnoreCase("Practice"));

        driver.close();

//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get( "https://www.google.com");
//
//        driver.navigate().to("http://practice.cybertekschool.com");
//
//        String getUrlCond = driver.getCurrentUrl();
//
//        String title = driver.getTitle();
//        if (getUrlCond.contains("cybertekschool")) {
//            System.out.println("Current url is contains 'cybertekschool and Title is " + title);
        //driver.close();
//
//        }

    }
}

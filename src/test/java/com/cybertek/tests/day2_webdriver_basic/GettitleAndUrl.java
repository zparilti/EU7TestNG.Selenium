package com.cybertek.tests.day2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettitleAndUrl {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get( "https://www.google.com");

        driver.navigate().to("http://practice.cybertekschool.com");

        //System.out.println(driver.getTitle());

        //get title with selenium
        //
        String title = driver.getTitle();

        //soutv +enter to print variable name and value
        System.out.println("title = " + title);


        //getCurrentUrl() ---> get thr url from browser
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        //getPageSource() ---> gets the source of the page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);



    }
}

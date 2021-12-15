package com.cybertek.tests.Review.Week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_YahooPractice {

    public static void main(String[] args) throws InterruptedException {
        // setUp browser type
        WebDriverManager.chromedriver().setup();

        // how can I open a new page, this statement opens an empty page
        WebDriver driver = new ChromeDriver();

        // go to the page
        driver.get("https://www.yahoo.com/");

        String expectedTitle = "Yahoo";

        String actualTitle = driver.getTitle();

        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.yahoo.com/%22");

//          String expectedTitle = "Yahoo";

//        if(driver.getTitle().equalsIgnoreCase(expectedTitle)){
//            System.out.println("Titles are matching");
//        }else{
//            System.out.println("Titles are  not matching");
//        }
        Thread.sleep(3000);
        driver.close();
    }
}

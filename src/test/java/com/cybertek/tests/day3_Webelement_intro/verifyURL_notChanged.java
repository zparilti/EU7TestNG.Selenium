package com.cybertek.tests.day3_Webelement_intro;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyURL_notChanged {

    public static void main(String[] args) throws InterruptedException {

        /*Verify URL not changed
        -open chrome browser
        - go to http://practice.cybertekschool.com/forgot_password links to an external site
        -click on Retrieve password
        -verify that url did not change
         */


        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // go to link
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save expected url before clicking button
        String expectedurl = driver.getCurrentUrl();


        //click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //save actual url after clicking button
        String actualurl = driver.getCurrentUrl();


        //verify that url did not change
        if(expectedurl.equals(actualurl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        Thread.sleep(2000);

        driver.quit();



    }
}

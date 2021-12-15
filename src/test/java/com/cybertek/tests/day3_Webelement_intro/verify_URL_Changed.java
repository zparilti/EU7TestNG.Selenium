package com.cybertek.tests.day3_Webelement_intro;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verify_URL_Changed {
    public static void main(String[] args) throws InterruptedException {
        /* Verify URL changed
            open browser
            go to http://practice.cybertekschool.com/forgot_password links to an external site
            enter any email
            click an retrieve password
            verify that url changed to http://practice.cybertekschool.com/email_sent

         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // go to url
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));
        //sendkeys()--> send keyboard
        emailInputBox.sendKeys("sevki_oksuz@hotmail.com");


        //click retrieve password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //TASK
        // verify that url changed to http://practice.cybertekschool.com/email_sent
        //creat ecpectedurl

        String expectedUrl = "http://practice.cybertekschool.com/email_sent";

        //saving actual url from browser after we enter any email and click retrieve password button
        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedUrl = "+ expectedUrl);
            System.out.println("actualUrl = "+ actualUrl);
        }



        Thread.sleep(3000);

        driver.quit();

    }
}

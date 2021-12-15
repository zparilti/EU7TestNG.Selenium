package com.cybertek.tests.day3_Webelement_intro;

import com.cybertek.Utilities.WebDriverFactory;
import com.google.gson.stream.JsonToken;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) throws InterruptedException {
         /*Verify confirmation message
            open browser
            go to http://practice.cybertekschool.com/forgot_password link to an external site
            enter any email
            verify that email is displayed in the input box
            click on Retrieve password
            verify that confirmation message was
         */
        
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // go to url
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));

        String expectedEmail = "sevki_oksuz@hotmail.com";
        //sendkeys()--> send keyboard
        emailInputBox.sendKeys(expectedEmail);


        //somehow we should get text from web element
        //two main ways to get txt from webelement
        //1.getText()--> it will work %99 and it will return string
        //2. getAttribute("value")--> second waf of getting text especially input box


        String actualEmail = emailInputBox.getAttribute("value");
        System.out.println("actualEmail= "+actualEmail);

        //verify trhat email is display in the input box
        if (expectedEmail.equals(actualEmail)) {

            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        //click on retrieve password
        WebElement retreivePasswordButton = driver.findElement(By.id("form_submit"));
        retreivePasswordButton.click();

        //verify that confirmation message says 'Your eamil's been sent
        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));

        System.out.println(actualConfirmationMessage.getText());

        //save expected message
        String expectedMessage = "Your e-mail's been sent!";
        //save actual message to variable
        String actualMessage = actualConfirmationMessage.getText();

        if(expectedMessage.equals(actualMessage)){
            System.out.println("Pass");

        }else{
            System.out.println("Fail");
            System.out.println("expectedMessage= "+ expectedMessage);
            System.out.println("actualMessage= "+ actualMessage);
        }


        Thread.sleep(2000);

        driver.quit();


    }

}

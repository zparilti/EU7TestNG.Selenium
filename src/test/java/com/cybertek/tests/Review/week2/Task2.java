package com.cybertek.tests.Review.week2;

import com.cybertek.Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.print.DocFlavor;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        /*
        go to https://www.demoblaze.com/index.html#
        Navigate to Laptops Category
        Then Sony vaio i7 laptop
        Verify the product price is 790 Dollars
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.demoblaze.com/index.html");

        // Navigate to Laptops Category

        driver.findElement(By.linkText("Laptops")).click();

        Thread.sleep(1000);

        // Then Sony vaio i7 laptop

        driver.findElement(By.partialLinkText("Sony vaio i7")).click();

        Thread.sleep(2000);

        int expectedPrice = 790;

        WebElement priceTextElement = driver.findElement(By.tagName("h3")); // locate price element

        String priceText = priceTextElement.getText();  // get the text of price element

        System.out.println("priceText = " + priceText);
        // priceText = $790 *includes tax

        String [] arr = priceText.split(" "); // top get the numbers I am dividing the text to pieces
        // arr[0] = $790
        int actualPrice = Integer.parseInt(arr[0].substring(1)); // Wrapper class to cast my String into integer

        // Assertion : Verification ---- TestNG comes with assertion methods
        System.out.println("Actual and Expected Price is same : "+(expectedPrice==actualPrice));

        if(expectedPrice==actualPrice){
            System.out.println("Actual and Expected Price is same");
        }else{
            System.out.println("Test Failed, price is not same");
        }


        Thread.sleep(5000);
        driver.quit();

    }
}

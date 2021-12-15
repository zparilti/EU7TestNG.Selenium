package com.cybertek.tests.day4_Basic_Locators;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class name_Locators_Test {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser full screen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.name("full_name"));

        fullName.sendKeys("Mike Smith");

        //put some email and click sign up button

        //proper way
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@smith.com");

        //lazy way
        //driver.findElement(By.name("eamil")).sendKeys("mike@smith.com");


        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        //lazy way
        //driver.findElement(By.name("wooden_spoon")).click();


        Thread.sleep(2000);

        driver.quit();



    }
}

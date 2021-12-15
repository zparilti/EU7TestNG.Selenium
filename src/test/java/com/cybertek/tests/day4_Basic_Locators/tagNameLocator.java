package com.cybertek.tests.day4_Basic_Locators;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //maximize the window
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.tagName("input"));

        fullName.sendKeys("Mike smith with Tagname");

        //sendskey to email

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("mike@smith.com");
        //lazy way
        driver.findElement(By.tagName("button")).click();



        Thread.sleep(3000);
        driver.quit();
    }
}

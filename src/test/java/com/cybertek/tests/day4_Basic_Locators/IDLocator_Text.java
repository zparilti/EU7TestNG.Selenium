package com.cybertek.tests.day4_Basic_Locators;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocator_Text {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //click don't click button
        WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));

        dontClickButton.click();


        Thread.sleep(2000);

        driver.quit();

    }
}

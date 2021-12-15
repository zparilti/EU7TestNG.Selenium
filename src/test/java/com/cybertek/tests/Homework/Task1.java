package com.cybertek.tests.Homework;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {

    /*
    Task
    go to amazon.com
    search for selenium
    click search button
    verify 1-48 of 360 results for "selenium"
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com/");

        WebElement searchInputBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchInputBox.click();
        searchInputBox.sendKeys("selenium");
        WebElement search1 = driver.findElement(By.id("nav-search-submit-button"));
        search1.click();

        String expectedResult = "1-48 of 190 results for Selenium";
        System.out.println(expectedResult);

        Thread.sleep(3000);

        driver.quit();








    }
}

package com.cybertek.tests.Homework;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2_eBay_Selenium {
    /*
    Test case 2
    Go to Ebay
    search Selenium
    click on search button
    verify title contains Selenium
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.ebay.com/");

        WebElement searchInputBox = driver.findElement(By.id("gh-ac"));
        searchInputBox.click();
        searchInputBox.sendKeys("selenium");
        WebElement search1 = driver.findElement(By.id("gh-btn"));
        search1.click();

        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.quit();
    }
}

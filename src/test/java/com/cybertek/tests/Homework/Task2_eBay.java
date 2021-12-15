package com.cybertek.tests.Homework;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2_eBay {

    /*Go to Ebay
    enter search term
    click on search button
    print number of results

     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.ebay.com/");

        WebElement searchInputBox = driver.findElement(By.id("gh-ac"));
        searchInputBox.click();
        searchInputBox.sendKeys("Car");
        WebElement search1 = driver.findElement(By.id("gh-btn"));
        search1.click();

        System.out.println(driver.findElement(By.className("srp-controls__count-heading")).getText());

        Thread.sleep(3000);

        driver.quit();
    }
}

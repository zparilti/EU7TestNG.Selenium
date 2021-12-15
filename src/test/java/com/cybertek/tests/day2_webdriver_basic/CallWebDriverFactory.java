package com.cybertek.tests.day2_webdriver_basic;

import com.cybertek.Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");

        String title = driver.getTitle();

        System.out.println("title = " + title);

        Thread.sleep(3000);

        driver.quit();

    }






}

package com.cybertek.tests.Review.week2;

import com.cybertek.Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locatorHM {

    public static void main(String[] args) throws InterruptedException {
        /*
        Test case
        go to Ebay
        search Selenium
        click on search button
        print number of results
        verify titlr contains Selenium
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.ebay.com/");

        //WebElement searchBox = driver.findElement(By.id("gh-ac")); //with id
       // WebElement searchBox = driver.findElement(By.name("_nkw")); //with name
        //WebElement searchBox = driver.findElement(By.className("gh-tb ui-autocomplete-input")); //with name
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));


        String expectedSearchItem = "Selenium";
        searchBox.sendKeys(expectedSearchItem);

        WebElement SearchButton = driver.findElement(By.id("gh-btn"));//locate the element
                                                                        //apply action
        SearchButton.click();
        WebElement searchResultElement = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading]"));

        String searchResultText = searchResultElement.getText();

        String [] arr = searchResultText.split(" ");
        System.out.println("Number of search results = "+ arr[0]);

        Thread.sleep(3000);
        driver.quit();
    }
}

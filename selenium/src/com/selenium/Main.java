package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.security.Key;

public class Main {

    public static void main(String[] args) {
	    // Opening Chrome
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Go to google
        driver.get("https://www.google.com");

        try {
            //typing into google search bar
            WebElement gsearch = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
            gsearch.sendKeys("ninjarome");
            gsearch.sendKeys(Keys.RETURN);
        } catch (Exception e){
            System.out.println("Loser Loser");
        }
        // Close chrome
        driver.close();
    }
}

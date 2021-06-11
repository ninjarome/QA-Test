package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Gmail_login {
    public static void main(String[] args) {
        // Opening Chrome
        System.setProperty("webdriver.gecko.driver", "D://selenium jars and drivers//drivers//firefoxdriver/geckodriver.exe");
        //System.setProperty("webdriver.chrome.whitelistedIps", "");
        WebDriver driver = new FirefoxDriver();

        //going to google
        driver.get("https://www.newgrounds.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //try {
            //Clicking log in
            WebElement login = driver.findElement(By.id("passport_login"));
            login.click();

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            //entering username
            WebElement username = driver.findElement(By.name("username"));
            username.sendKeys("qatesterjerome");

            //entering password
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("qatestpassword1998");
            password.sendKeys(Keys.RETURN);

        //} catch (Exception e){
        //    System.out.println("Loser Loser");
     //   }
        // Close chrome
        driver.close();
    }
}

package org.ait.qa25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenSiteTest2 {

    WebDriver driver;

    @BeforeMethod

    public void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    @Test

    public void demoWebShop() {
        System.out.println("Hello!");
    }

    @Test
    public void findElementByCss() {
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector("#ui-id-1"));

        driver.findElement(By.cssSelector(".master-wrapper-page"));
        driver.findElement(By.cssSelector(".master-wrapper-content"));
        driver.findElement(By.cssSelector(".close"));

        driver.findElement(By.cssSelector("[name='generator']"));
        driver.findElement(By.cssSelector("[name='keywords']"));
        driver.findElement(By.cssSelector("[name='description']"));
    }
    @Test
    public void findElementByXpath() {
        driver.findElement(By.xpath("//input[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//input[@id='bar-notification']"));
        driver.findElement(By.xpath("//input[@id='dialog-notifications-error']"));
        driver.findElement(By.xpath("//input[@id='ui-id-1']"));

        driver.findElement(By.xpath("//label[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//label[@class='master-wrapper-content']"));
        driver.findElement(By.xpath("//label[@class='close']"));

        driver.findElement(By.xpath("//label[@class='generator']"));
        driver.findElement(By.xpath("//label[@class='keywords']"));
        driver.findElement(By.xpath("//label[@class='description']"));
    }

        public void tearDown() { driver.quit(); }
    }


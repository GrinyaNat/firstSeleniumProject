package org.ait.qa25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenSiteTest2 {

    WebDriver driver2;

    @BeforeMethod

    public void setUp(){
        driver2 = new ChromeDriver();
        driver2.navigate().to("https://demowebshop.tricentis.com/");
        driver2.navigate().back();
        driver2.navigate().forward();
        driver2.navigate().refresh();
    }

    @Test

    public void demoWebShop() {
        System.out.println("Hello!");
    }

    @AfterMethod

    public void tearDown(){
        driver2.quit();

    }

}


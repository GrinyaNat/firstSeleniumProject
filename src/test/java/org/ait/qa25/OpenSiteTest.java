package org.ait.qa25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenSiteTest {

    WebDriver driver;

    // before - setUp (method)
    @BeforeMethod
    public void setUp(){
        //ШАГИ

        driver = new ChromeDriver();
        //driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");//with history
        driver.navigate().back();//возвращаемся назад
        driver.navigate().forward();
        driver.navigate().refresh();//обновление

    }

    // tests


    @Test
    public void openGoogleTest() {
        System.out.println("Site opened!");
    }

    // after - tearDown(method)

    @AfterMethod
    public void tearDown(){
        driver.quit();//закрывает браузер(все вкладки)
        driver.close();//закрывает только одну вкладку

    }


}
;
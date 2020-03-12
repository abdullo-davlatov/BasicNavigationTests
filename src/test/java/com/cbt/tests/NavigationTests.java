package com.cbt.tests;

import com.cbt.utilties.BrowsUtils;
import com.cbt.utilties.BrowserFactory;
import com.cbt.utilties.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) throws Exception{
        chromeTest();
        fireFoxTest();
        // edgeTest();
    }
    public static void chromeTest(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        BrowsUtils.wait(2);
        String title=driver.getTitle();
        BrowsUtils.wait(2);
        driver.navigate().to("https://etsy.com");
        BrowsUtils.wait(2);
        String etsyTitle=driver.getTitle();
        BrowsUtils.wait(2);
        driver.navigate().back();
        StringUtility.verifyEquals(title,etsyTitle);
        driver.quit();
    }
    public static void fireFoxTest(){
        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        BrowsUtils.wait(2);
        String title=driver.getTitle();
        BrowsUtils.wait(2);
        driver.navigate().to("https://etsy.com");
        BrowsUtils.wait(2);
        String etsyTitle=driver.getTitle();
        BrowsUtils.wait(2);
        driver.navigate().back();
        StringUtility.verifyEquals(title,etsyTitle);
        driver.quit();
    }
    public static void edgeTest() {
        WebDriver driver= BrowserFactory.getDriver("edge");
        driver.get("http://google.com");
        String title=driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String etsyTitle=driver.getTitle();
        BrowsUtils.wait(2);
        driver.navigate().back();
        StringUtility.verifyEquals(title,etsyTitle);
        driver.quit();
    }
}




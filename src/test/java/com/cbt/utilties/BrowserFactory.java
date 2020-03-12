package com.cbt.utilties;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {


    public static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().version("79.0").setup();
            return new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            //  WebDriverManager.edgedriver().version("44.2").setup();
            return new EdgeDriver();
        } else {
            return null;
        }

    }

    }

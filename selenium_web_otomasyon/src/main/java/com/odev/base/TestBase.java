package com.odev.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public static WebDriver driver;
    public static Properties properties;

    public TestBase() {
        propertySetup();
    }

    public void propertySetup() {
        try {
            properties = new Properties();
            FileInputStream ip = new FileInputStream("src/main/java/com/odev/config/config.properties");
            properties.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //todo: timeouts
        driver.get(properties.getProperty("url"));
    }
}

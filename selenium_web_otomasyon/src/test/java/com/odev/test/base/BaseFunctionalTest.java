package com.odev.test.base;

import com.odev.utils.PropertyUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BaseFunctionalTest {
    protected static WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("BaseFunctionalTest - setup() - @BeforeClass");
        System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(PropertyUtils.instance().getProperty("url"));
    }

    @After
    public void tearDown() {
        System.out.println("BaseFunctionalTest - tearDown() - @AfterClass");
        driver.manage().deleteAllCookies();
        driver.close();
    }
}

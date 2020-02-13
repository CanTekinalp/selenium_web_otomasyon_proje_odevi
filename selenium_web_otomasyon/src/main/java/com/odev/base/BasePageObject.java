package com.odev.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageObject {
    protected WebDriver driver;

    public BasePageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        System.out.println(driver.getTitle());
        return driver.getTitle();
    }
}

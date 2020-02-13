package com.odev.pages;

import com.odev.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    public final String EXPECTED_TITLE = "Giriş Yap - n11.com";

    @FindBy(id = "email")
    WebElement emailTextField;

    @FindBy(id = "password")
    WebElement passwordTextField;

    @FindBy(id = "loginButton")
    WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public HomePage clickLoginButton() {
        emailTextField.sendKeys(properties.getProperty("username"));
        passwordTextField.sendKeys(properties.getProperty("password"));
        loginButton.click();
        return new HomePage();
    }

}

package com.odev.pages;

import com.odev.base.BasePageObject;
import com.odev.utils.PropertyUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageObject {
    public final String EXPECTED_TITLE = "Giriş Yap - n11.com";

    @FindBy(id = "email")
    WebElement emailTextField;

    @FindBy(id = "password")
    WebElement passwordTextField;

    @FindBy(id = "loginButton")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickLoginButton() {
        emailTextField.sendKeys(PropertyUtils.instance().getProperty("username"));
        passwordTextField.sendKeys(PropertyUtils.instance().getProperty("password"));
        loginButton.click();
        return new HomePage(driver);
    }

}

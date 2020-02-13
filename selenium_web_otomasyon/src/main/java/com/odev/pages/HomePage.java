package com.odev.pages;

import com.odev.base.BasePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePageObject {

    public final String EXPECTED_TITLE = "n11.com - Alışverişin Uğurlu Adresi";

    @FindBy(className = "btnSignIn")
    WebElement signInButton;

    @FindBy(className = "searchBtn")
    WebElement searchButton;

    @FindBy(id = "searchData")
    WebElement searchBar;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickSignInButton() {
        signInButton.click();
        return new LoginPage(driver);
    }

    public SearchResultsPage search(String searchText) {
        searchBar.sendKeys(searchText);
        searchButton.click();
        return new SearchResultsPage(driver);
    }
}

package com.odev.pages;

import com.odev.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    public final String EXPECTED_TITLE = "n11.com - Alışverişin Uğurlu Adresi";

    @FindBy(className = "btnSignIn")
    WebElement signInButton;

    @FindBy(className = "searchBtn")
    WebElement searchButton;

    @FindBy(id = "searchData")
    WebElement searchBar;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public LoginPage clickSignInButton() {
        signInButton.click();
        return new LoginPage();
    }

    public SearchResultsPage search(String searchText) {
        searchBar.sendKeys(searchText);
        searchButton.click();
        return new SearchResultsPage();
    }
}

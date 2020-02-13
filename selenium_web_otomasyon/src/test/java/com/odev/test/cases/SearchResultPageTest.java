package com.odev.test.cases;

import com.odev.pages.HomePage;
import com.odev.pages.LoginPage;
import com.odev.pages.SearchResultsPage;
import com.odev.test.base.BaseFunctionalTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

public class SearchResultPageTest extends BaseFunctionalTest {
    SearchResultsPage searchResultsPage;

    public SearchResultPageTest() {
        super();
    }

    @Before
    public void setup() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSignInButton();
        homePage = loginPage.clickLoginButton();
        searchResultsPage = homePage.search("bilgisayar");
    }

    @Test
    public void navigateToSecondPageTest() {
        searchResultsPage = searchResultsPage.clickPageTwoButton();
        Assert.assertEquals("Bilgisayar - n11.com - 2/50", searchResultsPage.getPageTitle());
    }
}

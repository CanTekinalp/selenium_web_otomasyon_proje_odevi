package com.odev.test.cases;

import com.odev.pages.HomePage;
import com.odev.pages.LoginPage;
import com.odev.pages.SearchResultsPage;
import com.odev.test.base.BaseFunctionalTest;
import org.junit.*;

public class HomePageSearchTest extends BaseFunctionalTest {

    HomePage homePage;
    SearchResultsPage searchResultsPage;

    public HomePageSearchTest() {
        super();
    }

    @Before
    public void setup() {
        homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSignInButton();
        homePage = loginPage.clickLoginButton();
    }

    @Test
    public void searchTest() {
        searchResultsPage = homePage.search("bilgisayar");
        Assert.assertEquals("Bilgisayar - n11.com", searchResultsPage.getPageTitle());
    }
}

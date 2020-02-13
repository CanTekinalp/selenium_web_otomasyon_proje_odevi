package com.odev.testcases;

import com.odev.base.TestBase;
import com.odev.pages.HomePage;
import com.odev.pages.LoginPage;
import com.odev.pages.SearchResultsPage;
import org.junit.*;

public class HomePageSearchTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    SearchResultsPage searchResultsPage;

    public HomePageSearchTest() {
        super();
    }

    @Before
    public void setup() {
        init();
        homePage = new HomePage();
        loginPage = homePage.clickSignInButton();
        homePage = loginPage.clickLoginButton();
    }

    @Test
    public void navigateToSecondPage() {
        searchResultsPage = homePage.search("bilgisayar");
        searchResultsPage = searchResultsPage.clickPageTwoButton();
        String expectedTitle = "Bilgisayar - n11.com - 2/50";
        Assert.assertEquals(expectedTitle, searchResultsPage.getPageTitle());
    }

    @Test
    public void searchButtonTest() {
        searchResultsPage = homePage.search("bilgisayar");
        String expectedTitle = "Bilgisayar - n11.com";
        Assert.assertEquals(expectedTitle, searchResultsPage.getPageTitle());
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}

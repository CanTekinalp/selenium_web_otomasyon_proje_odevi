package com.odev.testcases;

import com.odev.base.TestBase;
import com.odev.pages.HomePage;
import com.odev.pages.LoginPage;
import com.odev.pages.ProductPage;
import com.odev.pages.SearchResultsPage;
import org.junit.*;

import java.io.IOException;

public class ProductPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;

    public ProductPageTest() {
        super();
    }

    @Before
    public void setup() {
        init();
        homePage = new HomePage();
        //loginPage = homePage.clickSignInButton();
        //homePage = loginPage.clickLoginButton();
        searchResultsPage = homePage.search("bilgisayar");
        //searchResultsPage = searchResultsPage.clickPageTwoButton();
        productPage = searchResultsPage.clickRandomProduct();
    }

    @Test
    public void navigateToShopList() {
        productPage.clickAddBasketButton();
        //productPage.clickMyBasketButton();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}

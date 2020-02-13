package com.odev.test.cases;

import com.odev.pages.*;
import com.odev.test.base.BaseFunctionalTest;
import org.junit.*;
import java.util.concurrent.TimeUnit;

public class ProductPageTest extends BaseFunctionalTest {
    ProductPage productPage;

    public ProductPageTest() {
        super();
    }

    @Before
    public void setup() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSignInButton();
        homePage = loginPage.clickLoginButton();
        SearchResultsPage searchResultsPage = homePage.search("bilgisayar");
        searchResultsPage = searchResultsPage.clickPageTwoButton();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        productPage = searchResultsPage.clickRandomProduct();
    }

    @Test
    public void addProductAndNavigateToShoppingList() {
        productPage.clickAddBasketButton();
        String productPagePrice = productPage.getProductPrice();
        MyBasketPage myBasketPage = productPage.clickGoToBasketButton();
        Assert.assertEquals("Sepetim - n11.com", myBasketPage.getPageTitle());
        String myBasketPrice = myBasketPage.getProductPrice();
        Assert.assertEquals(productPagePrice, myBasketPrice);
        myBasketPage.clickIncProductCountSpinner();
        Assert.assertEquals("2", myBasketPage.getProductCount());
        myBasketPage.clickDeleteProductSpan();
        Assert.assertTrue(myBasketPage.isBasketEmpty());
    }

}

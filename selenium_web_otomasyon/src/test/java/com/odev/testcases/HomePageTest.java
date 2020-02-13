package com.odev.testcases;

import com.odev.base.TestBase;
import com.odev.pages.HomePage;
import com.odev.pages.LoginPage;
import com.odev.pages.SearchResultsPage;
import org.junit.*;

public class HomePageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    SearchResultsPage searchResultsPage;

    public HomePageTest() {
        super();
    }

    @Before
    public void setup() {
        init();
        homePage = new HomePage();
    }

    @Test
    public void navigateLoginPageTest() {
        loginPage = homePage.clickSignInButton();
        String title = loginPage.getPageTitle();
        Assert.assertEquals(loginPage.EXPECTED_TITLE, title);
    }

    @Test
    public void homePageTitleTest() {
        String title = homePage.getPageTitle();
        Assert.assertEquals(homePage.EXPECTED_TITLE, title);
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}

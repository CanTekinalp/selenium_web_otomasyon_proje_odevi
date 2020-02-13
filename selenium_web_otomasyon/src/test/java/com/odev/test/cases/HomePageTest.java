package com.odev.test.cases;

import com.odev.pages.HomePage;
import com.odev.pages.LoginPage;
import com.odev.pages.SearchResultsPage;
import com.odev.test.base.BaseFunctionalTest;
import org.junit.*;

public class HomePageTest extends BaseFunctionalTest {
    HomePage homePage;
    LoginPage loginPage;

    public HomePageTest() {
        super();
    }

    @Before
    public void setup() {
        System.out.println("HomePageTest - setup() - @Before");
        homePage = new HomePage(driver);
    }

    @Test
    public void navigateLoginPageTest() {
        System.out.println("HomePageTest - navigateLoginPageTest - @Test");
        loginPage = homePage.clickSignInButton();
        String title = loginPage.getPageTitle();
        Assert.assertEquals(loginPage.EXPECTED_TITLE, title);
    }

    @Test
    public void homePageTitleTest() {
        System.out.println("HomePageTest - homePageTitleTest() - @Test");
        Assert.assertEquals(homePage.EXPECTED_TITLE, homePage.getPageTitle());
    }
}

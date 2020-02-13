package com.odev.test.cases;

import com.odev.pages.HomePage;
import com.odev.pages.LoginPage;
import com.odev.test.base.BaseFunctionalTest;
import org.junit.*;


public class LoginPageTest extends BaseFunctionalTest {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
    }

    @Before
    public void setup() {
        homePage = new HomePage(driver);
        loginPage = homePage.clickSignInButton();
    }

    @Test
    public void loginPageLoginTest() {
        homePage = loginPage.clickLoginButton();
        String title = homePage.getPageTitle();
        Assert.assertEquals(homePage.EXPECTED_TITLE, title);
    }

    @Test
    public void loginPageTitleTest() {
        String title = loginPage.getPageTitle();
        Assert.assertEquals(loginPage.EXPECTED_TITLE, title);
    }

}

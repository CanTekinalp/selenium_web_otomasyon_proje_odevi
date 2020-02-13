package com.odev.testcases;

import com.odev.base.TestBase;
import com.odev.pages.HomePage;
import com.odev.pages.LoginPage;
import org.junit.*;


public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
    }

    @Before
    public void setup() {
        init();
        homePage = new HomePage();
        loginPage = homePage.clickSignInButton();
    }

    @Test
    public void loginPageLoginTest() {
        System.out.println(10);
        homePage = loginPage.clickLoginButton();
        String title = homePage.getPageTitle();
        Assert.assertEquals(homePage.EXPECTED_TITLE, title);
    }

    @Test
    public void loginPageTitleTest() {
        String title = loginPage.getPageTitle();
        Assert.assertEquals(loginPage.EXPECTED_TITLE, title);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

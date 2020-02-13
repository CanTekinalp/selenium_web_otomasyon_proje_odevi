package com.odev.pages;

import com.odev.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultsPage extends TestBase {

    @FindBy(xpath = "//div[@class='pagination']/a[text()='2']")
    WebElement pageTwoButton;

    WebElement product = null;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public SearchResultsPage clickPageTwoButton() {
        pageTwoButton.click();
        return new SearchResultsPage();
    }

    //
    public ProductPage clickRandomProduct() {
        List<WebElement> allProducts = driver.findElements(By.xpath("//div[@id='view']/ul/li"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).findElement(By.xpath(".//a")).click();
        return new ProductPage();
    }
}

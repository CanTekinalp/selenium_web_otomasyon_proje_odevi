package com.odev.pages;

import com.odev.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class SearchResultsPage extends BasePageObject {

    @FindBy(xpath = "//div[@class='pagination']/a[text()='2']")
    WebElement pageTwoButton;

    //WebElement product = null;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultsPage clickPageTwoButton() {
        pageTwoButton.click();
        return new SearchResultsPage(driver);
    }

    public ProductPage clickRandomProduct() {
        List<WebElement> allProducts = driver.findElements(By.xpath("//div[@id='view']/ul/li"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        WebElement randomElement = allProducts.get(randomProduct).findElement(By.xpath(".//a/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(randomElement);
        actions.perform();
        randomElement.click();
        return new ProductPage(driver);
        /*
        Actions actions = new Actions(driver);
actions.moveToElement(element);
actions.perform();
         */
    }
}

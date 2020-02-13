package com.odev.pages;

import com.odev.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ProductPage extends BasePageObject {

    @FindBy(xpath = "//a[contains(@title,'Sepete Ekle')]")
    WebElement addBasketButton;

    @FindBy(className = "myBasket")
    WebElement myBasketButton;

    @FindBy(xpath = ".//div[@class='price-cover']//ins")
    WebElement productPriceText;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddBasketButton() {
        addBasketButton.click();
    }

    public WebElement goToBasketButton() {
        return this.driver.findElement(By.xpath("//div[@class='myBasketList otherListTemplate']//a[@title='Sepete Git']"));
    }

    public MyBasketPage clickGoToBasketButton() {
        goToBasketButton().click();
        return new MyBasketPage(driver);
    }

    public String getProductPrice() {
        return productPriceText.getText();
    }
}

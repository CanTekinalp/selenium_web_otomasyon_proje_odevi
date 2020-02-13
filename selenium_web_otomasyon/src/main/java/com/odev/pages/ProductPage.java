package com.odev.pages;

import com.odev.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductPage extends TestBase {

    @FindBy(xpath = "//a[contains(@title, 'Sepete Ekle')]")
    WebElement addBasketButton;

    @FindBy(className = "myBasket")
    WebElement myBasketButton;

    //WebElement product yerine, Product diye sınıf oluşturulabilir, constructerda alınır.

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickAddBasketButton() {
        addBasketButton.click();
    }

    public MyBasketPage clickMyBasketButton() {
        myBasketButton.click();
        return new MyBasketPage();
    }
}

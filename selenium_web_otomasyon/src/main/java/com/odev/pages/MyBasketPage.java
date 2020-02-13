package com.odev.pages;

import com.odev.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyBasketPage extends BasePageObject {

    @FindBy(xpath = "//table[@class='productGroup'][1]//div[@class='priceArea']//span")
    WebElement productPriceSpan;

    @FindBy(xpath = "//table[@class='productGroup'][1]//div[@class='spinnerFieldContainer']/span[1]")
    WebElement incProductCountSpinner;

    @FindBy(xpath = "//table[@class='productGroup'][1]//div[@class='spinnerField ']/input")
    WebElement productCountText;

    @FindBy(xpath = "//table[@class='productGroup'][1]//span[@title='Sil']")
    WebElement deleteProductSpan;

    public MyBasketPage(WebDriver driver) {
        super(driver);
    }

    public WebElement basketEmptyElement() {
        return this.driver.findElement(By.xpath("//div[@class='cartEmptyText']/h2"));
    }

    public String getProductPrice() {
        return productPriceSpan.getText();
    }

    public void clickIncProductCountSpinner() {
        incProductCountSpinner.click();
    }

    public void clickDeleteProductSpan() {
        deleteProductSpan.click();
    }

    public String getProductCount() {
        return productCountText.getAttribute("value");
    }

    public boolean isBasketEmpty() {
        WebElement element = basketEmptyElement();
        if(element != null) {
            return true;
        }
        return false;
    }
}

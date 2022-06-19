package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
public WebDriver driver;
    By verifySearch = By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/span");
    By monitorImage =By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img");
    By AddtoCartBtn =By.id("add-to-cart-button");
    public String verifyItem(WebDriver driver){
        this.driver = driver;
        return driver.findElement(verifySearch).getText();
    }

    public SearchPage ClickProduct(WebDriver driver){
        driver.findElement(monitorImage).click();

        return this;
    }

    public Cart ClickAddToCart(WebDriver driver){
        this.driver = driver;
        driver.findElement(AddtoCartBtn).click();
        return  new Cart();
    }

}

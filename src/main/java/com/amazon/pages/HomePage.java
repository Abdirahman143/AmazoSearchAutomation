package com.amazon.pages;

import com.amazon.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;
By logo = By.id("nav-logo");
By searchFld = By.id("twotabsearchtextbox");




    public  boolean verifyLogo(WebDriver driver){
        this.driver =driver;

        return driver.findElement(logo).isDisplayed();
    }

    public SearchPage searchProduct(WebDriver driver, String searchItem){
        driver.findElement(searchFld).sendKeys(searchItem);
        driver.findElement(searchFld).click();
        return new SearchPage();
    }
}

package com.amazonTest.pages;

import com.amazon.pages.HomePage;
import com.amazon.pages.SearchPage;
import com.amazonTest.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    HomePage homePage =new HomePage();
    SearchPage searchPage = new SearchPage();

    @Test
    public void SearchProduct(){

        searchPage = homePage.searchProduct(driver,"Monitor");
    }

    public void verify(){
        String actual = searchPage.verifyItem(driver);
        String Expected ="RESULTS";
        Assert.assertEquals(actual,Expected);
    }
@Test(priority = 2)
    public  void ClickMonitor(){
        searchPage.ClickProduct(driver);
    }
}

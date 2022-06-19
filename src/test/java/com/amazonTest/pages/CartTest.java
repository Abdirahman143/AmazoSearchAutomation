package com.amazonTest.pages;

import com.amazon.pages.Cart;
import com.amazon.pages.SearchPage;
import com.amazonTest.base.BaseTest;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    SearchPage searchPage = new SearchPage();
    Cart cart =new Cart();
@Test(priority = 3)
    public void ClickCart(){
        cart =searchPage.ClickAddToCart(driver);
    }
}

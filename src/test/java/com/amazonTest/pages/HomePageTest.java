package com.amazonTest.pages;

import com.amazon.pages.HomePage;
import com.amazonTest.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest  extends BaseTest {
    HomePage homePage = new HomePage();
    @Test(priority = -1)
    public void verify(){
        Assert.assertTrue(
                homePage.verifyLogo(driver)
        );
    }
}

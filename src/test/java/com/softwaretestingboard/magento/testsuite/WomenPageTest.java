package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenPageTest extends BaseTest {
    WomenPage womenPage = new WomenPage();

    @Test

    public void verifyTheSortByProductNameFilter(){

        womenPage.mouseHoverOnWomenMenu();
       // womenPage.mouseHoverOnTop();
        womenPage.clickOnJackets();
        womenPage.selectSortByFilterProductName();
        womenPage.sortProductAToZ();
    }

    @Test
    public void verifyTheSortByPriceFilter(){

        womenPage.mouseHoverOnWomenMenu();

      //  womenPage.mouseHoverOnTop();
        womenPage.clickOnJackets();
        womenPage.selectSortByFilterPriceName();
        womenPage.sortProductLowToHighPrice();
    }
}
package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearPageTest extends BaseTest {
    GearPage gearpage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){

        gearpage.mouseHoverOnGearMenu();
        gearpage.clickOnBags();
        gearpage.clickOnOvernightDuffle();
        gearpage.verifyTextOvernightDuffle();
        gearpage.changeQty3();
        gearpage.clickOnAddToCart();
        gearpage.verifyTheText();
        gearpage.clickOnShoppingCart();
        gearpage.verifyProductNameOverNightDuffle();

        //* Verify the Qty is ‘3’ need to complete the step
        gearpage.verifyTheQty3();

        gearpage.verifyProductPrice$135();
        gearpage.changeQtyTo5();
        gearpage.clickOnUpdateShoppingCart();
        gearpage.verifyProductPrice$225();
    }
}
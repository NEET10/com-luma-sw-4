package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenPageTest extends BaseTest {
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart()  {
        menPage.mouseHoverOnMenMenu();


      // menPage.mouseHoverOnBottomMenu();


        menPage.mouseHoverOnPantsMenu();
        menPage.mouseHoverAndClickCronusYoga32();
        menPage.mouseHoverAndClickCronusYogaBlack();

        menPage.clickOnAddToCart();

        explicitWait();
        menPage.verifyTheText();


        menPage.clickOnShoppingCart();
        menPage.verifyCronusYogaPant();
        menPage.verifyProductSize32();
        menPage.verifyProductColourBlack();
    }
}
package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    //* Mouse Hover on Men Menu
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    public void mouseHoverOnMenMenu(){ mouseHoverToElementToAnotherElement(menMenu,bottomsMenu);
    }
    //* Mouse Hover on Bottoms
    By bottomsMenu = By.xpath("//a[@id='ui-id-18']");
    public void mouseHoverOnBottomMenu(){ mouseHover(bottomsMenu);}
    //* Click on Pants
    By pantsMenu = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    public void mouseHoverOnPantsMenu() {clickOnElement(pantsMenu);}
    //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
    By productSize32 = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    public void mouseHoverAndClickCronusYoga32(){mouseHoverToElementAndClick(productSize32);}
    //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
    By productColourBlack = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]");
    public void mouseHoverAndClickCronusYogaBlack(){mouseHoverToElementAndClick(productColourBlack);}
       //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
    By addToCart = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]");
    public void clickOnAddToCart(){mouseHoverToElementAndClick(addToCart);}
    //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    By verifyText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public void verifyTheText(){
        verifyExpectedAndActual(verifyText,"You added Cronus Yoga Pant to your");}
    //* Click on ‘shopping cart’ Link into message
    By shoppingCart = (By.linkText("shopping cart"));
    public void clickOnShoppingCart(){clickOnElement(shoppingCart);}
    //* Verify the text ‘Shopping Cart.’
    By verifyShoppingCart = By.xpath("//body/div[1]/main[1]/div[1]/h1[1]/span[1]");
    public void verifyTextShoppingCart(){
    verifyExpectedAndActual(verifyShoppingCart,"Shopping Cart");}
    //* Verify the product name ‘Cronus Yoga Pant’
    By verifyPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    public void verifyCronusYogaPant(){
        verifyExpectedAndActual(verifyPant,"Cronus Yoga Pant");    }
    //* Verify the product size ‘32’
    By verifySize32 = By.xpath("//dd[contains(text(),'32')]");
    public void verifyProductSize32(){
        verifyExpectedAndActual(verifySize32,"32");}
    //* Verify the product colour ‘Black’
    By verifyBlackColour = By.xpath("//dd[contains(text(),'Black')]");
    public void verifyProductColourBlack(){
        verifyExpectedAndActual(verifyBlackColour,"Black");
    }
}

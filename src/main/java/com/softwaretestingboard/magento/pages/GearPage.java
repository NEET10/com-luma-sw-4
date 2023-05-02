package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    //Mouse Hover on Gear Menu
    By gearMenu = By.xpath("//span[contains(text(),'Gear')]");

    public void mouseHoverOnGearMenu() {
        explicitWait();
        mouseHover(gearMenu);}
    //* Click on Bags
    By bags = By.xpath("//span[normalize-space()='Bags']");
    public void clickOnBags(){
        explicitWait();
        mouseHover(bags)
        ;}
    //* Click on Product Name ‘Overnight Duffle’
    By overnightDuffle = By.xpath("//a[contains(text(),'Overnight Duffle')]");
    public void clickOnOvernightDuffle(){clickOnElement(overnightDuffle);}
    //* Verify the text ‘Overnight Duffle’
    By verifyOvernightDuffle = By.xpath("//span[contains(text(),'Overnight Duffle')]");
    public void verifyTextOvernightDuffle(){
        verifyExpectedAndActual(verifyOvernightDuffle,"Overnight Duffle");}
    //* Change Qty 3
    By qty3 = By.id("qty");
    public void changeQty3(){clearTextAndSendKey(qty3,"3");}
    //* Click on ‘Add to Cart’ Button.
    By addToCart = By.xpath("//span[contains(text(),'Add to Cart')]");
    public void clickOnAddToCart(){clickOnElement(addToCart);}
    //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
    By verifyText = By.xpath("//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    public void verifyTheText(){
        verifyExpectedAndActual(verifyText,"You added Overnight Duffle to your shopping cart.");}
    //* Click on ‘shopping cart’ Link into message
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    public void clickOnShoppingCart(){clickOnElement(shoppingCart);}
    //* Verify the product name ‘Overnight Duffle’
    By verifyNameOverNightDuffle = By.linkText("Overnight Duffle");
    public void verifyProductNameOverNightDuffle(){
        verifyExpectedAndActual(verifyNameOverNightDuffle,"Overnight Duffle");}
    //* Verify the Qty is ‘3’
    By verifyText2 = By.xpath("//input[@value = '3']");

    public void verifyTheQty3() {
        verifyExpectedAndActual(verifyText2, "3");
    }

    //* Verify the product price ‘$135.00’
    By verifyPrice$135 = By.xpath("//tbody/tr[1]/td[4]/span[1]/span[1]/span[1]");
    public void verifyProductPrice$135(){
        verifyExpectedAndActual(verifyPrice$135,"$135.00");}
    //* Change Qty to ‘5’
    By changeQty5 = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]");
    public void changeQtyTo5(){
        clearTextAndSendKey(changeQty5,"5");}
    //* Click on ‘Update Shopping Cart’ button
    By updateShoppingCart = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    public void clickOnUpdateShoppingCart(){clickOnElement(updateShoppingCart);}
    //* Verify the product price ‘$225.00’
    By verifyPrice$225 = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/span[1]/span[1]/span[1]");
    public void verifyProductPrice$225(){
        verifyExpectedAndActual(verifyPrice$225,"$225.00");}
}

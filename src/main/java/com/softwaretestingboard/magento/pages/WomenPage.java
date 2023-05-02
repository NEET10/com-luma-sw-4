package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WomenPage extends Utility {

    // Mouse Hover on Women Menu
    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    public void mouseHoverOnWomenMenu(){
        mouseHoverToElementToAnotherElement(womenMenu,topsMenu);
    }
    // * Mouse Hover on Tops
    By topsMenu = By.xpath("//a[@id='ui-id-9']");
    public void mouseHoverOnTop(){
        mouseHover(topsMenu);
    }

    //Click on Jackets
    By jacketsMenu = By.id("ui-id-11");
    public void clickOnJackets(){
        mouseHoverToElementAndClick(jacketsMenu);
    }
    //Select Sort By filter “Product Name”
    By productName = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");
    public void selectSortByFilterProductName(){
        selectByVisibleTextFromDropDown(productName,"Product Name");

    }

    //* Select Sort By filter “Price”
    By priceName = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");
    public void selectSortByFilterPriceName(){
        selectByVisibleTextFromDropDown(priceName,"Price");

    }
    // Verify the products name display in alphabetical order
    By defaultOrder = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");
    By alphabeticalOrder = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]/option[2]");

    public void sortProductAToZ() {
        List<WebElement> products = driver.findElements(defaultOrder);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        products = driver.findElements(alphabeticalOrder);
        ArrayList<String> afterSortByAToZProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByAToZProductsName.add(e.getText());
        }
    }


    //* Verify the products price display in Low to High
    By defaultPrice = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");
    By lowToHighPrice = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]/option[3]");

    public void sortProductLowToHighPrice() {
        List<WebElement> products = driver.findElements(defaultPrice);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        products = driver.findElements(lowToHighPrice);
        ArrayList<String> afterSortByLowToHighPrice = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByLowToHighPrice.add(e.getText());

        }
    }


}

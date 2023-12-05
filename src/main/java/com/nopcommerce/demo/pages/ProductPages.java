package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPages extends Utility {
    //2.5 Verify the Text "Build your own computer
    By buildYourOwnComputer = By.cssSelector("div[class='product-name'] h1");
    By selectOnHdd = By.id("product_attribute_3_7");
    By selectOnOs = By.id("product_attribute_4_9");
    By selectMicrosoft$50 = By.id("product_attribute_5_10");
    By selectTotalCommander$5 = By.id("product_attribute_5_12");

    By verifyPrice$14745 = By.xpath("//span[text()='$1,475.00']");
    By addToCartProduct = By.id("add-to-cart-button-1");
    By closeBarClickOnCrossButton = By.xpath("//span[@title='Close']");

    By mouseHoverShoppingCart = By.xpath("//label[normalize-space()='400 GB\"//span[@class='cart-label']\"undefined");

    By clickGoToCart = By.xpath("//button[@class='button-1 cart-button']");

    public String VerifyTheTextBuildYourOwnComputer() {
        return getTextFromElement(buildYourOwnComputer);

    }

    public void dropDownOfBuildYourOwnComputerProcessor() {
        WebElement dropDown = driver.findElement(By.name("2.2 GHz Intel Pentium Dual-Core E2200"));
        Select select = new Select(dropDown);
        select.selectByIndex(0);
    }

    public void dropdownOfBuildYourComputerRam() {
        WebElement dropdown = driver.findElement(By.id("product_attribute_2"));
        Select select = new Select(dropdown);
        select.selectByIndex(2);
    }

    public void selectHdd() {
        clickOnElement(selectOnHdd);
    }

    public void selectOs() {
        clickOnElement(selectOnOs);

    }

    public void selectOnMicrosoftOffice$50() {
        clickOnElement(selectMicrosoft$50);

    }

    public void selectOnTotalCommanderWorth$5() {
        clickOnElement(selectTotalCommander$5);
    }

    public String verifyThePrice$1475(){
        return getTextFromElement(verifyPrice$14745);

    }

    public void addToCartBuildProduct() {
        clickOnElement(addToCartProduct);
    }

    public void closeBarClickingOnCrossButton() {
        clickOnElement(closeBarClickOnCrossButton);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(mouseHoverShoppingCart);
    }

    public void clickOnGoToCartButton() {
        clickOnElement(clickGoToCart);
    }


}

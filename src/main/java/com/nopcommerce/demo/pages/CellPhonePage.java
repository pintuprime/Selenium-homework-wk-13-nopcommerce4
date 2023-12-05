package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {


    By verifyTextCellPhone = By.xpath("//h1[normalize-space()='Cell phones']");
    By nokiaLumia1020Link = By.linkText("Nokia Lumia 1020");
    By verifyNokiaLumia = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/h1[1]");
    By verifyPrice$349 = By.xpath("//span[@id='price-value-20']");

    By changeQty = (By.xpath("//input[@id='product_enteredQuantity_20']"));
    By clickUpdateShoppingCart = (By.xpath("//input[@id='product_enteredQuantity_20']"));
    By clickCart = By.xpath("//button[@class='button-1 add-to-cart-button']");
    By verifyProductAddedToShoppingCart = By.xpath("//div[@class='bar-notification success']/p");
    By clickCrossButton = By.xpath("//div[@class='bar-notification success']/span");
    By mouseHoverShoppingCart = By.xpath("//span[@class='cart-label']");
    By clickCartButton =  By.xpath("//button[@class='button-1 cart-button']");
    By verify2Qty = By.xpath("//div[@class='page-title']/h1");
    By verify$698 = By.xpath("//tbody/tr[1]/td[6]/span[1]");
    By clickIAgreeTerms = By.xpath("//input[@id='termsofservice']");
    By clickCheckOut = By.xpath("//button[@id='checkout']");
    By verifyWelcomeSignIn = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By clickRegister = By.xpath("//button[contains(text(),'Register')]");
    By verifyRegister = By.xpath("//h1[text()='Register']");
By listView = By.xpath("//a[@class='viewmode-icon list']");

    By quantityCheck = By.xpath("//input[@class ='qty-input']");

    public String VerifyTextCellPhone() {
        return getTextFromElement(verifyTextCellPhone);
    }

    public void clickOnNokiaLumia() {
        clickOnElement(nokiaLumia1020Link);
    }

    public String verifyTextNokiaLumia() {
        return getTextFromElement(verifyNokiaLumia);
    }

    public String verifyThePrice$349() {
        return getTextFromElement(verifyPrice$349);
    }

    public void addQtyAndUpdateShoppingCart() {
        deleteTextOnElement(changeQty);
        sendTextToElement(changeQty, "2");
        clickOnElement(clickUpdateShoppingCart);
    }
    public void clickOnCart(){
        clickOnElement(clickCart);
    }
    public String verifyTheProductHasBeenAddedToShoppingCart(){
        return  getTextFromElement(verifyProductAddedToShoppingCart);
    }
    public void clickOnCrossButtonToClose(){
        clickOnElement(clickCrossButton);
    }
    public void mouseHoverOnShoppingCart(){
        clickOnElement(mouseHoverShoppingCart);
    }
    public void clickOnGoToCartButton(){
        clickOnElement(clickCartButton);
    }
    public String verifyTheQuantity2(){
        return getTextFromElement(verify2Qty);
    }
    public String verifyTotal$698(){
        return getTextFromElement(verify$698);
    }
    public void clickOnCheckBoxForAgreeTermsOfService(){
        clickOnElement(clickIAgreeTerms);
    }
    public void clickOnCheckOut(){
        clickOnElement(clickCheckOut);
    }
    public String verifyWelcomePleaseSignIn(){
        return getTextFromElement(verifyWelcomeSignIn);
    }
    public void clickRegisterTab(){
        clickOnElement(clickRegister);
    }
    public String verifyRegisterText(){
        return getTextFromElement(verifyRegister);
    }

    public void clickOnListView(){
        clickOnElement(listView);
    }
    public String getQuantity(){
        return getAttributeFromElement(quantityCheck,"value");
    }



}

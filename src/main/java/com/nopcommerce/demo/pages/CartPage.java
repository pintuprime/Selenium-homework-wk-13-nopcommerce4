package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {
    By selectOnQty = (By.xpath("//input[@class='qty-input']"));
    By clickUpdateShoppingCart = (By.xpath("//button[@class='button-2 update-cart-button']"));
    By clickCheckBoxTermsOfServices =  (By.xpath("//input[@name='termsofservice']"));
    By changeQty = (By.xpath("//button[@class='button-2 update-cart-button']"));

    By clickCheckOut= (By.xpath("//button[@name='checkout']"));

    public void clickOnQty(){
        clickOnElement(selectOnQty);

    }

    public void clickToUpdateShoppingCart(){
        clickOnElement(clickUpdateShoppingCart);
    }
    public void addQtyAndUpdateShoppingCart(){
        deleteTextOnElement(changeQty);
        sendTextToElement(changeQty, "2");
        clickOnElement(clickUpdateShoppingCart);
    }
    public void clickOnCheckBoxOfIAgreeTermsOfServices(){
        clickOnElement(clickCheckBoxTermsOfServices);
    }
    public void clickOnCheckOut(){
        clickOnElement(clickCheckOut);
    }

}

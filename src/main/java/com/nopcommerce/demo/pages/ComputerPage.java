package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    //1.2 Click on Desktop
    By desktop = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");

    //1.3 Select Sort By position and 2.3
    By sortBy = By.xpath("//select[@id='products-orderby']");

    //2.4 Click on "Add To Cart
    By addToCart = By.xpath("//div[@data-productid='1']//button[text()='Add to cart']");




    public void clickOnDesktop() {
        clickOnElement(desktop);
    }

    public void selectSortByPositionZToA() {
        selectByIndexFromDropDown(sortBy, 2);
    }

    //------------------***************************************pending
    public void VerifyProductArrangeInDescendingOrder(){

    }

    public void selectSortByPositionAToZ(){
        selectByIndexFromDropDown(sortBy,1);
    }

    public void addToCart(){
        clickOnElement(addToCart);
    }


}

package com.nopcommerce.demo.testsuite;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    //object of computer page
    ComputerPage computerPage = new ComputerPage();
    ProductPages productPages = new ProductPages();
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        //1.1 Click on Computer Menu
        homePage.clickOnComputers();
        //1.2 Click on Desktop
        computerPage.clickOnDesktop();
        //1.3 Select Sort By position "Name: Z to A
        computerPage.selectSortByPositionZToA();

        //1.4 Verify the Product will arrange in Descending order.


    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() {
        //2.1 Click on Computer Menu.
        homePage.clickOnComputers();
        //2.2 Click on Desktop
        computerPage.clickOnDesktop();
        //2.3 Select Sort By position "Name: A to Z"
        computerPage.selectSortByPositionAToZ();
        //2.4 Click on "Add To Cart"
        computerPage.addToCart();

        //2.5 Verify the Text "Build your own computer
        String actualText = productPages.VerifyTheTextBuildYourOwnComputer();
        //define expected text
        String expectedText = "Build your own computer";
        //get actual text
        Assert.assertEquals(actualText, expectedText, "Not on Build your own computer page");

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        productPages.dropDownOfBuildYourOwnComputerProcessor();
        //2.7.Select "8GB [+$60.00]" using Select class.
        productPages.dropdownOfBuildYourComputerRam();
        //2.8 Select HDD radio "400 GB [+$100.00]"
        productPages.selectHdd();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        productPages.selectOs();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        //[+$5.00]"
        productPages.selectOnMicrosoftOffice$50();
        productPages.selectOnTotalCommanderWorth$5();

        //2.11 Verify the price "$1,475.00
        String actualText1 = productPages.verifyThePrice$1475();
        String expectedPrice = "$1,475.00";
        Assert.assertEquals(actualText1, expectedPrice);

        //2.12 Click on "ADD TO CARD" Button
        productPages.addToCartBuildProduct();

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green bar
        //get actual
        String actualMessage = checkOutPage.verifyProductAddedToCart();
        String expectedMessage = "The product has been added to your shopping cart";
        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(actualMessage, expectedMessage, "Not added successfully");


        //After that close the bar clicking on the cross button.
        productPages.closeBarClickingOnCrossButton();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        productPages.mouseHoverOnShoppingCart();
        productPages.clickOnGoToCartButton();


        //2.15 Verify the message "Shopping cart"
        String actualTextShoppingCart = checkOutPage.verifyShoppingCart();
        String expectedTextShoppingCart = "Shopping cart";
        Assert.assertEquals(actualTextShoppingCart, expectedTextShoppingCart, "not on shopping cart");


        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        cartPage.addQtyAndUpdateShoppingCart();

        //2.17 Verify the Total"$2,950.00"
        String actualTotal = checkOutPage.verifyTotal$2950();
        String expectedTotal = "$2,950.00";
        Assert.assertEquals(actualTotal, expectedTotal, "Total not $2,950.00");

        //2.18 click on checkbox “I agree with the terms of service”
        cartPage.clickOnCheckBoxOfIAgreeTermsOfServices();
        //2.19 Click on “CHECKOUT”
        cartPage.clickOnCheckOut();


        //2.20 Verify the Text “Welcome, Please Sign In!
        //get actual text
        String actualWelcome = checkOutPage.verifyTextWelcomePleaseSignIn();
        //define expected text
        String expectedWelcome = "Welcome, Please Sign In!";
        //Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(actualWelcome, expectedWelcome, "Not on sign in page");

        //2.21Click on “CHECKOUT AS GUEST” Tab
        checkOutPage.ClickCheckOutAsAGuest();


        //2.22 Fill the all mandatory field
        checkOutPage.enterFirstName("Xyz");
        checkOutPage.enterLastName("Patel");
        checkOutPage.enterEmailId("abcxyz@gmail.com");
        checkOutPage.enterCountry("UK");
        checkOutPage.enterCity("London");
        checkOutPage.enterBillingAddress("10 Downing Sterrt");
        checkOutPage.zipPostal("ec11ar");
        checkOutPage.enterPhoneNumber("0123456789");

        //2.23 Click on “CONTINUE”
        checkOutPage.clickOnContinue();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkOutPage.clickOnRadioNextDayAir();
        //2.25 Click on “CONTINUE
        checkOutPage.clickToContinue();
        //2.26 Select Radio Button “Credit Card
        checkOutPage.clickRadioButtonCreditCard();
        checkOutPage.clickContinue();
        //2.27 Select “Master card” From Select credit card dropdown
        checkOutPage.selectMasterCardFromDropDown();
        //2.28 Fill all the details
        checkOutPage.clickOnCardHolderName("Mr Only");
        checkOutPage.enterCardNumber("5100 0000 0000 0011");
        checkOutPage.expMonth("01");
        checkOutPage.expYear("2000");
        checkOutPage.enterCardCode("111");

        //2.29 Click on “CONTINUE”
        checkOutPage.clickContinueTo();

        //2.30 Verify “Payment Method” is “Credit Card”
        String actualPaymentMethod = checkOutPage.verifyPaymentMethodIsCreditCard();
        String expectedPaymentMethod = "Credit Card";
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod, "not credit card");

        // 2.32 Verify “Shipping Method” is “Next Day Air”
        String actualShippingMethod = checkOutPage.verifyShippingMethodIsNextDayAir();
        String expectedShippingMethod = "Next Day Air";
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "not next day air");

        //2.33 Verify Total is “$2,950.00”
        String actualTotalAmount = checkOutPage.verifyTotalIs2950();
        String expectedTotalAmount = "$2,950.00";
        Assert.assertEquals(actualTotalAmount, expectedTotalAmount, "Total amount does not match.");

        //2.34 Click on “CONFIRM”
        checkOutPage.clickOnConfirm();

        //2.35 Verify the Text “Thank You”
        String actualThankYou = checkOutPage.verifyTextThankYou();
        String expectedThankYou = "Thank you";
        Assert.assertEquals(actualThankYou, expectedThankYou, "Thank you not displayed");

        // 2.36 Verify the message “Your order has been successfully processed!”
        String actualSuccessfullyProcessed = checkOutPage.verifyYourOrderHasBeenSuccessfullyProcessed();
        String expectedSuccessfullyProcessed = "Your order has been successfully processed!";
        Assert.assertEquals(actualSuccessfullyProcessed, expectedSuccessfullyProcessed, "Not processed");

        // 2.37 Click on “CONTINUE”
        checkOutPage.clickContinueToGo();

        // 2.37 Verify the text “Welcome to our store”
        String actualWelcomeMessage = checkOutPage.VerifyWelcomeToOuuStore();
        String expectedWelcomeMessage = "Welcome to our store";
        Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage, "Not successfully processed");

    }


}

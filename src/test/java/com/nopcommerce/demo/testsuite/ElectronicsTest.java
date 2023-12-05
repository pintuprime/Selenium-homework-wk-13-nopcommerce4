package com.nopcommerce.demo.testsuite;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    RegisterPage registerPage = new RegisterPage();
    CartPage cartPage = new CartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //1.1 Mouse Hover on “Electronics”Tab
        homePage.mouseHoverOnElectronicsTab();
        //1.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhone();

        //  1.3 Verify the text “Cell phones”
        String actualCellPhonesText = cellPhonePage.VerifyTextCellPhone();
        String expectedCellPhoneText = "Cell phones";
        Assert.assertEquals(actualCellPhonesText, expectedCellPhoneText, "not on cell phones tab");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {

        //2.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicsTab();

        // 2.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhone();

        //2.3 Verify the text “Cell phones”
        String actualCellPhonesText = cellPhonePage.VerifyTextCellPhone();
        String expectedCellPhoneText = "Cell phones";
        Assert.assertEquals(actualCellPhonesText, expectedCellPhoneText, "not on cell phones tab");

        // 2.4 Click on List View Tab
        cellPhonePage.clickOnListView();

        // 2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonePage.clickOnNokiaLumia();

        //2.6 Verify the text “Nokia Lumia 1020”
        String actualNokia = cellPhonePage.verifyTextNokiaLumia();
        String expectedNokia = "Nokia Lumia 1020";
        Assert.assertEquals(actualNokia, expectedNokia, "not on nokia");

        //2.7 Verify the price “$349.00”
        String actualNokiaPrice = cellPhonePage.verifyThePrice$349();
        String expectedNokiaPrice = "$349.00";
        Assert.assertEquals(actualNokiaPrice, expectedNokiaPrice, "Nokia price not $349.00");

        //2.8 Change quantity to 2
        cellPhonePage.addQtyAndUpdateShoppingCart();

        // 2.9 Click on “ADD TO CART” tab
        cellPhonePage.clickOnCart();

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top
        //green Bar
        String actualShoppingCartAdd = cellPhonePage.verifyTheProductHasBeenAddedToShoppingCart();
        String expectedShoppingCartAdd = "The product has been added to your shopping cart";
        Assert.assertEquals(actualShoppingCartAdd, expectedShoppingCartAdd, "not added");

        //After that close the bar clicking on the cross button
        cellPhonePage.clickOnCrossButtonToClose();

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        cellPhonePage.mouseHoverOnShoppingCart();
        cellPhonePage.clickOnGoToCartButton();

        //2.12 Verify the message "Shopping cart"
        String actualTextShoppingCart = cellPhonePage.verifyTheQuantity2();
        String expectedTextShoppingCart = "Shopping cart";
        Assert.assertEquals(actualTextShoppingCart, expectedTextShoppingCart, "not on shopping cart");

        //2.13 Verify the quantity is 2
        String actualText = "2";
        String expectedText = cellPhonePage.getQuantity();
        Assert.assertEquals(actualText,expectedText);


        //2.14 Verify the Total $698.00
        String actualTotal = cellPhonePage.verifyTotal$698();
        String expectedTotal = "$698.00";
        Assert.assertEquals(actualTotal, expectedTotal, "not $698.00");

        //2.15 click on checkbox “I agree with the terms of service”
        cellPhonePage.clickOnCheckBoxForAgreeTermsOfService();

        //2.16 Click on “CHECKOUT”
        cellPhonePage.clickOnCheckOut();

        //2.17 Verify the Text “Welcome, Please Sign In!”
        String actualWelcome = cellPhonePage.verifyWelcomePleaseSignIn();
        String expectedWelcome = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcome, expectedWelcome, "Not on sign in page");

        //2.18 Click on “REGISTER” tab
        cellPhonePage.clickRegisterTab();

        //2.19 Verify the text “Register”
        String actualRegister = cellPhonePage.verifyRegisterText();
        String expectedRegister = "Register";
        Assert.assertEquals(actualRegister, expectedRegister, "Not registered");

        //2.20 Fill the mandatory fields
        registerPage.enterFirstName("Xyz");
        registerPage.enterLastName("Joy");
        registerPage.enterDate("01");
        registerPage.enterMonth("May");
        registerPage.enterYear("1990");
        registerPage.enterEmail("abx@gmail.com");
        registerPage.enterPassword("asdf1234");
        registerPage.confirmPassword("asdf1234");

        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegister();

        //2.22 Verify the message “Your registration completed”
        String actualRegistration = registerPage.verifyRegistrationComplete();
        String expectedRegistration = "Your registration completed";
        Assert.assertEquals(actualRegistration, expectedRegistration, "not registered");

        //2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueTab();


        //2.24 Verify the text “Shopping card”
        String actualShoppingCart = registerPage.verifyTextShoppingCard();
        String expectedShoppingCart = "Shopping cart";
        Assert.assertEquals(actualTextShoppingCart, expectedTextShoppingCart, "not on shopping cart");


        //2.25 click on checkbox “I agree with the terms of service”
        cartPage.clickOnCheckBoxOfIAgreeTermsOfServices();

        //2.26 Click on “CHECKOUT”
        cartPage.clickOnCheckOut();

        //2.27 Fill the Mandatory fields
        checkOutPage.enterFirstName("Xyz");
        checkOutPage.enterLastName("Patel");
        checkOutPage.enterEmailId("abcxyz@gmail.com");
        checkOutPage.enterCountry("UK");
        checkOutPage.enterCity("London");
        checkOutPage.enterBillingAddress("10 Downing Sterrt");
        checkOutPage.zipPostal("ec11ar");
        checkOutPage.enterPhoneNumber("0123456789");

        //2.28 Click on “CONTINUE”
        checkOutPage.clickOnContinue();

        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkOutPage.clickOnRadioNextDayAir();

        //2.30 Click on “CONTINUE”
        checkOutPage.clickToContinue();

        //2.31 Select Radio Button “Credit Card”
        checkOutPage.clickRadioButtonCreditCard();
        checkOutPage.clickContinue();

        //2.32 Select “Visa” From Select credit card dropdown
        checkOutPage.selectVisaFromCreditCardDropDown();

        //2.33 Fill all the details
        checkOutPage.clickOnCardHolderName("Mr Only");
        checkOutPage.enterCardNumber("4543 2222 3434 5656");
        checkOutPage.expMonth("01");
        checkOutPage.expYear("2000");
        checkOutPage.enterCardCode("111");

        //2.34 Click on “CONTINUE”
        checkOutPage.clickContinueTo();

        //2.35 Verify “Payment Method” is “Credit Card”
        String actualPaymentMethod = checkOutPage.verifyPaymentMethodIsCreditCard();
        String expectedPaymentMethod = "Credit Card";
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod, "not credit card");

        //2.36 Verify “Shipping Method” is “2nd Day Air”

        //2.37 Verify Total is “$698.00”
        //2.38 Click on “CONFIRM”
        //2.39 Verify the Text “Thank You”
        //2.40 Verify the message “Your order has been successfully processed!”
        //2.41 Click on “CONTINUE”
        //2.42 Verify the text “Welcome to our store
        //2.43 Click on “Logout” link
        //2.44 Verify the URL is “https://demo.nopcommerce.com/"

    }


}

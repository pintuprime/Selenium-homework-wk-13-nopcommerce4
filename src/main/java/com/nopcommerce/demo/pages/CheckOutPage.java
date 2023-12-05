package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By clickCheckOutAsGuest = (By.xpath("//button[@class='button-1 checkout-as-guest-button']"));
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By emailId = By.id("BillingNewAddress_Email");
    By countryField = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityField = By.id("BillingNewAddress_City");
    By billingAddressField = By.id("BillingNewAddress_Address1");
    By zipPostalCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By clickContinue = By.xpath("//div[@id='billing-buttons-container']/button[@class='button-1 new-address-next-step-button']");
    By clickRadioButtonNextDayAir = By.xpath("//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']");
    By clickOnContinue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By radioButtonCreditCard = By.xpath("//input[@id='paymentmethod_1']");
    By clickContinue1 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By masterCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By clickContinue2 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By productAddedToShoppingBasket = By.xpath("//div[@class='bar-notification success']/p");
    By verifyMessageShoppingCart = By.xpath("//div[@class='page-title']/h1");
    By verify$2950 = By.xpath("//td[@class='subtotal']/span[text()='$2,950.00']");
    By verifyTextWelcomeSignIn = By.xpath("//div[@class='page-title']/h1");
    By selectMasterCard = By.xpath("//select[@id='CreditCardType']");
    By selectVisaCard = By.xpath("//select[@id='CreditCardType']");
    By paymentMethodCreditCard = By.xpath("//li[@class='payment-method']/span[@class='value']");
    By shippingNextDayAir = By.xpath("//li[@class='shipping-method']/span[@class='value']");
    By totalAmount2950 = By.xpath("//span[@class='product-subtotal']");
    By clickConfirm = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By verifyThankYou = By.xpath("//div[@class='page-title']/h1");
    By orderSuccessfully = By.xpath("//div[@class='section order-completed']/div[@class='title']/strong");
    By clickContinue3 = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    By welcomeToStore = By.xpath("//div[@class='topic-block-title']/h2");
    By enterExpMonth = By.xpath("//select[@id='ExpireMonth']");
    By enterExpYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By shippingMethod2Day = By.id("shippingoption_2");

    public void ClickCheckOutAsAGuest() {
        clickOnElement(clickCheckOutAsGuest);
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String name) {
        sendTextToElement(lastName, name);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailId, email);
    }

    public void enterCountry(String country) {
        sendTextToElement(countryField, country);
    }

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    public void enterBillingAddress(String address) {
        sendTextToElement(billingAddressField, address);
    }

    public void zipPostal(String postCode) {

        sendTextToElement(zipPostalCode, postCode);
    }

    public void enterPhoneNumber(String number) {
        sendTextToElement(phoneNumber, number);
    }

    public void clickOnContinue() {
        clickOnElement(clickContinue);
    }

    public void clickOnRadioNextDayAir() {
        clickOnElement(clickRadioButtonNextDayAir);
    }

    public void clickToContinue() {
        clickOnElement(clickOnContinue);
    }

    public void clickRadioButtonCreditCard() {
        clickOnElement(radioButtonCreditCard);
    }

    public void clickContinue() {
        clickOnElement(clickContinue1);
    }

    public void clickOnCardHolderName(String name) {
        sendTextToElement(cardHolderName, name);
    }

    public void enterCardNumber(String number) {
        sendTextToElement(cardNumber, number);
    }

    public void expMonth(String num){
        sendTextToElement(enterExpMonth,num);
    }
    public void expYear(String numb){
        sendTextToElement(enterExpYear,numb);
    }
    public void enterCardCode(String number1){
        sendTextToElement(cardCode,number1);
    }

    public void clickContinueTo() {
        clickOnElement(clickContinue2);

    }

    public String verifyProductAddedToCart() {
        return getTextFromElement(productAddedToShoppingBasket);
    }

    public String verifyShoppingCart() {
        return getTextFromElement(verifyMessageShoppingCart);
    }

    public String verifyTotal$2950() {
        return getTextFromElement(verify$2950);
    }

    public String verifyTextWelcomePleaseSignIn() {
        return getTextFromElement(verifyTextWelcomeSignIn);
    }

    public void selectMasterCardFromDropDown() {
        selectByValueFromDropDown(selectMasterCard, "Master card");
    }
    public void selectVisaFromCreditCardDropDown(){
        selectByValueFromDropDown(selectVisaCard,"Visa");
    }

    public String verifyPaymentMethodIsCreditCard() {
        return getTextFromElement(paymentMethodCreditCard);
    }


    public String verifyShippingMethodIsNextDayAir() {
        return getTextFromElement(shippingNextDayAir);
    }


    public String verifyTotalIs2950() {
        return getTextFromElement(totalAmount2950);

    }

    public void clickOnConfirm() {
        clickOnElement(clickConfirm);
    }

    public String verifyTextThankYou() {
        return getTextFromElement(verifyThankYou);
    }

    public String verifyYourOrderHasBeenSuccessfullyProcessed() {
        return getTextFromElement(orderSuccessfully);
    }

    public void clickContinueToGo() {
        clickOnElement(clickContinue3);
    }

    public String VerifyWelcomeToOuuStore() {
        return getTextFromElement(welcomeToStore);
    }
    public void clickOnShippingMethod2ndDay(){
        clickOnElement(shippingMethod2Day);
    }


}

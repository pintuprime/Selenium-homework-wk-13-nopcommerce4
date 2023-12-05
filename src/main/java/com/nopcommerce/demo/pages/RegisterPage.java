package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By date = By.xpath("//select[@name='DateOfBirthDay']");
    By month = By.xpath("//select[@name='DateOfBirthMonth']");
    By year = By.xpath("//select[@name='DateOfBirthYear']");
    By continueTab = By.xpath("//a[contains(text(),'Continue')]");

    By clickToRegister = By.id("register-button");
    By registrationComplete = By.xpath("//div[contains(text(),'Your registration completed')]");
    By verifyShoppingCard = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By emailText = By.id("Email");
    By passwordText = By.id("Password");
    By confirmPasswordText = By.id("ConfirmPassword");



    public void enterFirstName(String name){
        sendTextToElement(firstName,name);
    }
    public void enterLastName(String name){
        sendTextToElement(lastName,name);
    }
    public void enterDate(String number){
        sendTextToElement(date,number);
    }
    public void enterMonth(String number){
        sendTextToElement(month,number);
    }
    public void enterYear(String number){
        sendTextToElement(year,number);
    }
    public void clickOnRegister(){
        clickOnElement(clickToRegister);
    }
    public String verifyRegistrationComplete(){
        return getTextFromElement(registrationComplete);
    }
    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }
    public String verifyTextShoppingCard(){
        return getTextFromElement(verifyShoppingCard);
    }
    public void enterEmail(String email){
        sendTextToElement(emailText,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordText,password);
    }
    public void confirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordText,confirmPassword);
    }

}

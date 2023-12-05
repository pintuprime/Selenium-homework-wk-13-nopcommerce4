package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    // 1.1 Click on Computer Menu
    By computers = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By electronicTab = By.xpath("//ul[@class='top-menu notmobile']/li/a[text()='Electronics ']");
    By clickCellPhone = By.xpath("//ul[@class='top-menu notmobile']/li/ul[@class='sublist first-level']/li/a[text()='Cell phones ']");
    By getAllTopManu = By.xpath("//ul[@class='top-menu notmobile']//li");

    public void clickOnComputers() {
        mouseHoverToElementAndClick(computers);
    }

    public void clickOnCellPhone() {
        mouseHoverToElementAndClick(clickCellPhone);
    }

    public void mouseHoverOnElectronicsTab() {
        mouseHoverToElement(electronicTab);
    }
    public List<WebElement> getAllTopManuName (){
        List<WebElement> getListOfElements = driver.findElements(getAllTopManu);
        return getListOfElements;
    }
}

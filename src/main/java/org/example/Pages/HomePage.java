package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies(){
        waitForElement(Locators.acceptCookiesButton);
        driver.findElement(Locators.acceptCookiesButton).click();
    }

    public String getBlockNameText(){
        return driver.findElement(Locators.blockName).getText();
    }

    public boolean arePaymentSystemLogosDisplayed(){
        return driver.findElement(Locators.visaLogo).isDisplayed() &&
                driver.findElement(Locators.verifiedByVisaLogo).isDisplayed() &&
                driver.findElement(Locators.masterCardLogo).isDisplayed() &&
                driver.findElement(Locators.masterCardSecureCodeLogo).isDisplayed() &&
                driver.findElement(Locators.belcardLogo).isDisplayed();
    }

    public void clickAboutServiceLink(){
        driver.findElement(Locators.aboutServiceLink).click();
    }

    public void setPhoneNumber(String phoneNumber){
        driver.findElement(Locators.connectionPhone).sendKeys(phoneNumber);
    }

    public void setSum(String sum){
        driver.findElement(Locators.connectionSum).sendKeys(sum);
    }

    public void clickContinueButton() {
        waitForElement(Locators.continueButton);
        driver.findElement(Locators.continueButton).click();
        waitForElement(Locators.paymentIframe);
        driver.switchTo().frame(driver.findElement(Locators.paymentIframe));
    }

    public boolean isPaymentFieldDisplayed() {
        waitForElement(Locators.creditCardNumberField);
        return driver.findElement(Locators.creditCardNumberField).isDisplayed();
    }

    public void selectInternetPayForm(){
        driver.findElement(Locators.payFormSelect).click();
        driver.findElement(Locators.internetOption).click();
    }

    public void selectInstalmentPayForm(){
        driver.findElement(Locators.payFormSelect).click();
        driver.findElement(Locators.instalmentOption).click();
    }

    public void selectArrearsPayForm(){
        driver.findElement(Locators.payFormSelect).click();
        driver.findElement(Locators.arrearsOption).click();
    }

    public String getPlaceholder(By locator) {
        return  driver.findElement(locator).getDomAttribute("placeholder");
    }

    public List<String> getConnectionPlaceholders() {
        List<String> placeholders = new ArrayList<>();
        waitForElement(Locators.connectionPhone);
        placeholders.add(getPlaceholder(Locators.connectionPhone));
        placeholders.add(getPlaceholder(Locators.connectionSum));
        placeholders.add(getPlaceholder(Locators.connectionEmail));
        return placeholders;
    }

    public List<String> getInternetPlaceholders() {
        List<String> placeholders = new ArrayList<>();
        waitForElement(Locators.internetPhone);
        placeholders.add(getPlaceholder(Locators.internetPhone));
        placeholders.add(getPlaceholder(Locators.internetSum));
        placeholders.add(getPlaceholder(Locators.internetEmail));
        return placeholders;
    }

    public List<String> getInstalmentPlaceholders() {
        List<String> placeholders = new ArrayList<>();
        waitForElement(Locators.instalmentScore);
        placeholders.add(getPlaceholder(Locators.instalmentScore));
        placeholders.add(getPlaceholder(Locators.instalmentSum));
        placeholders.add(getPlaceholder(Locators.instalmentEmail));
        return placeholders;
    }

    public List<String> getArrearsPlaceholders() {
        List<String> placeholders = new ArrayList<>();
        waitForElement(Locators.arrearsScore);
        placeholders.add(getPlaceholder(Locators.arrearsScore));
        placeholders.add(getPlaceholder(Locators.arrearsSum));
        placeholders.add(getPlaceholder(Locators.arrearsEmail));
        return placeholders;
    }

    public List<String> getPaymentPlaceholders(){
        List<String> placeholders = new ArrayList<>();
        waitForElement(Locators.cardNumber);
        placeholders.add(driver.findElement(Locators.cardNumber).getText());
        placeholders.add(driver.findElement(Locators.cardDate).getText());
        placeholders.add(driver.findElement(Locators.cardCvc).getText());
        placeholders.add(driver.findElement(Locators.cardHolder).getText());
        return placeholders;
    }

    public boolean arePaymentSystemLogosDisplayedInPaymentFrame(){
        waitForElement(Locators.visaPaymentLogo);
        return driver.findElement(Locators.visaPaymentLogo).isDisplayed() &&
                driver.findElement(Locators.masterCardPaymentLogo).isDisplayed() &&
                driver.findElement(Locators.belcardPaymentLogo).isDisplayed() &&
                driver.findElement(Locators.otherPaymentLogo).isDisplayed();
    }

    public String getPaymentDescriptionText(){
        waitForElement(Locators.payDescription);
        return driver.findElement(Locators.payDescription).getText();
    }

    public String getPaymentSubmitText(){
        waitForElement(Locators.paymentSubmit);
        return driver.findElement(Locators.paymentSubmit).getText();
    }

    public String getPaymentCostText(){
        waitForElement(Locators.paymentCost);
        return driver.findElement(Locators.paymentCost).getText();
    }
}

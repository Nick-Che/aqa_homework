package org.example.Pages;

import org.openqa.selenium.By;

public class Locators {
    public static final By acceptCookiesButton = By.xpath("//button[@id='cookie-agree']");
    public static final By blockName = By.xpath("//div[@class='pay__wrapper']//h2");
    public static final By visaLogo = By.xpath("//img[@alt='Visa']");
    public static final By verifiedByVisaLogo = By.xpath("//img[@alt='Verified By Visa']");
    public static final By masterCardLogo = By.xpath("//img[@alt='MasterCard']");
    public static final By masterCardSecureCodeLogo = By.xpath("//img[@alt='MasterCard Secure Code']");
    public static final By belcardLogo = By.xpath("//img[@alt='Белкарт']");
    public static final By aboutServiceLink = By.xpath("//div[@class='pay__wrapper']//a");
    public static final By connectionPhone = By.xpath("//*[@id='connection-phone']");
    public static final By connectionSum = By.xpath("//*[@id='connection-sum']");
    public static final By connectionEmail = By.xpath("//*[@id='connection-email']");
    public static final By internetPhone = By.xpath("//*[@id='internet-phone']");
    public static final By internetSum = By.xpath("//*[@id='internet-sum']");
    public static final By internetEmail = By.xpath("//*[@id='internet-email']");
    public static final By instalmentScore = By.xpath("//*[@id='score-instalment']");
    public static final By instalmentSum = By.xpath("//*[@id='instalment-sum']");
    public static final By instalmentEmail = By.xpath("//*[@id='instalment-email']");
    public static final By arrearsScore = By.xpath("//*[@id='score-arrears']");
    public static final By arrearsSum = By.xpath("//*[@id='arrears-sum']");
    public static final By arrearsEmail = By.xpath("//*[@id='arrears-email']");
    public static final By payFormSelect = By.xpath("//div[@class='select']");
    public static final By internetOption = By.xpath("//*[@id='pay-section']//li[2]/p");
    public static final By instalmentOption = By.xpath("//*[@id='pay-section']//li[3]/p");
    public static final By arrearsOption = By.xpath("//*[@id='pay-section']//li[4]/p");
    public static final By continueButton = By.xpath("//*[@id='pay-connection']/button");
    public static final By paymentIframe = By.className("bepaid-iframe");
    public static final By creditCardNumberField = By.xpath("//*[@id='cc-number']");
    public static final By payDescription = By.xpath("//*[@class='pay-description__text']");
    public static final By paymentCost = By.xpath("//div[@class='pay-description__cost']");
    public static final By cardNumber = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label");
    public static final By cardDate = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label");
    public static final By cardCvc = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label");
    public static final By cardHolder = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label");
    public static final By visaPaymentLogo = By.xpath("//*[@src='assets/images/payment-icons/card-types/visa-system.svg']");
    public static final By masterCardPaymentLogo = By.xpath("//*[@src='assets/images/payment-icons/card-types/mastercard-system.svg']");
    public static final By belcardPaymentLogo = By.xpath("//*[@src='assets/images/payment-icons/card-types/belkart-system.svg']");
    public static final By otherPaymentLogo = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div");
    public static final By paymentSubmit = By.xpath("//*[@class='colored disabled']");

}

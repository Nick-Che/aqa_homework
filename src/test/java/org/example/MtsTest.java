package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MtsTest {

    WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='cookie-agree']")));
        WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[@id='cookie-agree']"));
        acceptCookiesButton.click();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    public void testBlockName() {
        WebElement blockName = driver.findElement(By.xpath("//div[@class='pay__wrapper']//h2"));
        assertEquals("Онлайн пополнение\nбез комиссии", blockName.getText());
    }

    @Test
    public void testPaymentSystemLogos() {
        WebElement logo1 = driver.findElement(By.xpath("//img[@alt='Visa']"));
        WebElement logo2 = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        WebElement logo3 = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        WebElement logo4 = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        WebElement logo5 = driver.findElement(By.xpath("//img[@alt='Белкарт']"));

        assertTrue(logo1.isDisplayed());
        assertTrue(logo2.isDisplayed());
        assertTrue(logo3.isDisplayed());
        assertTrue(logo4.isDisplayed());
        assertTrue(logo5.isDisplayed());
    }

    @Test
    public void testAboutServiceLink(){
        WebElement aboutServiceLink = driver.findElement(By.xpath("//div[@class='pay__wrapper']//a"));
        aboutServiceLink.click();
        assertEquals("Порядок оплаты и безопасность интернет платежей", driver.getTitle());
    }

    @Test
    public void testContinueButton() throws InterruptedException {
        WebElement phoneField = driver.findElement(By.xpath("//*[@id='connection-phone']"));
        phoneField.sendKeys("297777777");

        WebElement sumField = driver.findElement(By.xpath("//*[@id='connection-sum']"));
        sumField.sendKeys("20");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        continueButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bepaid-iframe")));

        WebElement iframe = driver.findElement(By.className("bepaid-iframe"));
        driver.switchTo().frame(iframe);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cc-number']")));

        WebElement payment = driver.findElement(By.xpath("//*[@id='cc-number']"));
        assertTrue(payment.isDisplayed());
    }
}

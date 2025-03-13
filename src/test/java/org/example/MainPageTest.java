package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Pages.HomePage;
import org.example.Pages.Locators;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest {
    WebDriver driver;
    HomePage homePage;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://www.mts.by/");
        homePage.acceptCookies();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверка названия блока \"Пополнение без комиссии\"")
    public void testBlockName() {
        assertEquals("Онлайн пополнение\nбез комиссии", homePage.getBlockNameText());
    }

    @Test
    @DisplayName("Проверка наличия логотипов платёжных систем")
    public void testPaymentSystemLogos() {
        assertTrue(homePage.arePaymentSystemLogosDisplayed());
    }

    @Test
    @DisplayName("Проверка работы ссылки \"Подробнее о сервисе\"")
    public void testAboutServiceLink() {
        homePage.clickAboutServiceLink();
        assertEquals("Порядок оплаты и безопасность интернет платежей", driver.getTitle());
    }

    @Test
    @DisplayName("Проверка кнопки \"Продолжить\"")
    public void testContinueButton() {
        homePage.setPhoneNumber("297777777");
        homePage.setSum("20");
        homePage.clickContinueButton();
        assertTrue(homePage.isPaymentFieldDisplayed());
    }

    @Test
    @DisplayName("Проверка плейсхолдеров формы \"услуги связи\"")
    public void testConnectionFormPlaceholders(){
        List<String> connectionPlaceholders = homePage.getConnectionPlaceholders();

        homePage.selectInternetPayForm();
        List<String> internetPlaceholders = homePage.getInternetPlaceholders();

        homePage.selectInstalmentPayForm();
        List<String> instalmentPlaceholders = homePage.getInstalmentPlaceholders();

        homePage.selectArrearsPayForm();
        List<String> arrearsPlaceholders = homePage.getArrearsPlaceholders();

        assertAll("Плейсхолдеры \"Домашний интернет\"",
                () -> assertEquals("Номер телефона", connectionPlaceholders.get(0)),
                () -> assertEquals("Сумма",connectionPlaceholders.get(1)),
                () -> assertEquals("E-mail для отправки чека", connectionPlaceholders.get(2)),
                () -> assertEquals("Номер абонента", internetPlaceholders.get(0)),
                () -> assertEquals("Сумма", internetPlaceholders.get(1)),
                () -> assertEquals("E-mail для отправки чека", internetPlaceholders.get(2)),
                () -> assertEquals("Номер счета на 44", instalmentPlaceholders.get(0)),
                () -> assertEquals("Сумма", instalmentPlaceholders.get(1)),
                () -> assertEquals("E-mail для отправки чека", instalmentPlaceholders.get(2)),
                () -> assertEquals("Номер счета на 2073", arrearsPlaceholders.get(0)),
                () -> assertEquals("Сумма", arrearsPlaceholders.get(1)),
                () -> assertEquals("E-mail для отправки чека", arrearsPlaceholders.get(2)));
    }

    @Test
    @DisplayName("Проверка окна оплаты")
    public void testPaymentPage(){
        homePage.setPhoneNumber("297777777");
        homePage.setSum("20");
        homePage.clickContinueButton();

        List<String> placeholders = homePage.getPaymentPlaceholders();
        assertAll("Проверка окна оплаты",
                () -> assertEquals("Оплатить 20.00 BYN", homePage.getPaymentSubmitText()),
                () -> assertEquals("20.00 BYN", homePage.getPaymentCostText()),
                () -> assertEquals("Оплата: Услуги связи Номер:375297777777", homePage.getPaymentDescriptionText()),
                () -> assertTrue(homePage.arePaymentSystemLogosDisplayedInPaymentFrame()),
                () -> assertEquals("Номер карты", placeholders.get(0)),
                () -> assertEquals("Срок действия", placeholders.get(1)),
                () -> assertEquals("CVC", placeholders.get(2)),
                () -> assertEquals("Имя держателя (как на карте)", placeholders.get(3)));
    }
}

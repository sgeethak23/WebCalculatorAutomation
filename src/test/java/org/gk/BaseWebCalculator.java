package org.gk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseWebCalculator {
    String driverPath = "chromedriver.exe";

    public static WebDriver webDriver;

    @FindBy(xpath = "//input[@id='zero']")
    public static WebElement ZERO;

    @FindBy(xpath = "//input[@id='one']")
    @CacheLookup
    public static WebElement ONE;

    @FindBy(xpath = "//input[@id='two']")
    public
    static WebElement TWO;

    @FindBy(xpath = "//input[@id='three']")
    public
    static WebElement THREE;

    @FindBy(xpath = "//input[@id='four']")
    public
    static WebElement FOUR;

    @FindBy(xpath = "//input[@id='five']")
    public
    static WebElement FIVE;

    @FindBy(xpath = "//input[@id='six']")
    public
    static WebElement SIX;

    @FindBy(xpath = "//input[@id='seven']")
    public
    static WebElement SEVEN;

    @FindBy(xpath = "//input[@id='eight']")
    public
    static WebElement EIGHT;

    @FindBy(xpath = "//input[@id='nine']")
    public
    static WebElement NINE;

    @FindBy(xpath = "//input[@id='divide']")
    public
    static WebElement DIVIDE;

    @FindBy(xpath = "//input[@id='multiply']")
    public
    static WebElement MULTIPLY;

    @FindBy(xpath = "//input[@id='subtract']")
    public
    static WebElement SUBTRACT;

    @FindBy(xpath = "//*[@value='+']")
    public
    static WebElement ADD;

    @FindBy(xpath = "//input[@id='equals']")
    public
    static WebElement EQUALS;

    @FindBy(xpath = "//*[@value='.']")
    public
    static WebElement DOT;

    @FindBy(xpath = "//*[@id='display']//div")
    public
    static WebElement RESULT;

    @FindBy(xpath = "//input[@id='clear']")
    public
    static WebElement CLEAR;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        webDriver = new ChromeDriver();
        webDriver.navigate().to("https://duffmanns.github.io/calc-test/calculator/app/index.html");
        webDriver.manage().window().maximize();
        PageFactory.initElements(webDriver, this);
    }

    @AfterTest
    public static void cleanup() {
        try {
            if (webDriver != null) {
                webDriver.quit();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void calculate(String equation) {

        for (char character : equation.trim().toCharArray()) {
            switch (character) {
                case '0':
                    ZERO.click();
                    sleep();
                    break;
                case '1':
                    ONE.click();
                    sleep();
                    break;
                case '2':
                    TWO.click();
                    sleep();
                    break;
                case '3':
                    THREE.click();
                    sleep();
                    break;
                case '4':
                    FOUR.click();
                    sleep();
                    break;
                case '5':
                    FIVE.click();
                    sleep();
                    break;
                case '6':
                    SIX.click();
                    sleep();
                    break;
                case '7':
                    SEVEN.click();
                    sleep();
                    break;
                case '8':
                    EIGHT.click();
                    sleep();
                    break;
                case '9':
                    NINE.click();
                    sleep();
                    break;
                case '+':
                    ADD.click();
                    sleep();
                    break;
                case '-':
                    SUBTRACT.click();
                    sleep();
                    break;
                case '.':
                    DOT.click();
                    sleep();
                    break;
                case '*':
                case 'x':
                    MULTIPLY.click();
                    sleep();
                    break;
                case '÷':
                case '/':
                    DIVIDE.click();
                    sleep();
                    break;
            }
        }
    }
}

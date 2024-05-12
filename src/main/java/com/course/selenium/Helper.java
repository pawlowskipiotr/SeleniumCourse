package com.course.selenium;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class Helper {

    private static final By BUTTON_SEARCHSUBMIT = By.id("search_room_submit");
    private static final By BUTTON_HOTEL = By.id("hotel_location");
    private static final By BUTTON_EMAIL = By.id("newsletter-input");

    private static final By BUTTON_SIGN_IN = By.xpath("//a[@title='Log in to your customer account']");

    public static WebDriver initializeDriver(String webdriver) {
        switch (webdriver) {
            case "CHROME": {
                WebDriver driver = new ChromeDriver();
                return driver;
            }
            case "FIREFOX": {
                WebDriver driver = new FirefoxDriver();
                return driver;
            }
            default:
                throw new WebDriverException("Browser name not found! Cannot initialize browser driver");
        }

    }

    public static void setUp(WebDriver driver, String url) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }
}


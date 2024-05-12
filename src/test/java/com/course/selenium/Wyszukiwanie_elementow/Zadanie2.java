package com.course.selenium.Wyszukiwanie_elementow;

import com.course.selenium.Helper;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Zadanie2 {

    WebDriver driver = Helper.initializeDriver("FIREFOX");

    @Test

    public void hotelPage() {
        Helper.setUp(driver, "https://hotel-testlab.coderslab.pl/en/");
        WebElement elementhotellocation = driver.findElement(By.name("hotel_location"));
        elementhotellocation.sendKeys("Warsaw");
        WebElement fillemail = driver.findElement(By.name("email"));
        fillemail.sendKeys("test@test.com");
        WebElement submitNewsletter = driver.findElement(By.name("submitNewsletter"));
        WebElement elementsearchnow = driver.findElement(By.name("search_room_submit"));
        elementsearchnow.submit();
    }
    @After
    public void tearDown(){driver.quit();}
}


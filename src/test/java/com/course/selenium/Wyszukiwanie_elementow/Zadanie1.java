package com.course.selenium.Wyszukiwanie_elementow;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Zadanie1 {

    WebDriver driver = new FirefoxDriver();


    @Test
    public void hoteltestlab_test(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://hotel-testlab.coderslab.pl");
    WebElement elementsearchnow = driver.findElement(By.id("search_room_submit"));
    WebElement elementhotel = driver.findElement(By.id("hotel_location"));
    elementhotel.sendKeys("Warsaw");
    WebElement elementmail = driver.findElement(By.id("newsletter-input"));
    elementmail.sendKeys("test@test.com");

    //Assert.assertEquals("Data is incorrect","test@test.pl",elementmail.getCssValue);
    //Assert.assertEquals("Data is incorrect","Warsaw",elementhotel.getText());
}
@After
public void tearDown(){
    driver.quit();
    }

}

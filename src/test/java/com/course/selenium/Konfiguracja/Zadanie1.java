package com.course.selenium.Konfiguracja;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zadanie1 {
WebDriver driver = new FirefoxDriver();


@Test
    public void googlesearchtest(){
driver.manage().window().maximize();
driver.get("http://www.google.com");
    WebElement button = driver.findElement(By.id("W0wltc"));
    button.click();
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("LinkedIn");
    element.submit();

    Assert.assertEquals("Page is incorrect","Google",driver.getTitle());


}
@After
    public void tearDown(){
    driver.quit();
    }
}

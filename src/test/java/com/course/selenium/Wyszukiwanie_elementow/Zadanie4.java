package com.course.selenium.Wyszukiwanie_elementow;

import com.course.selenium.Helper;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Zadanie4 {

    WebDriver driver = Helper.initializeDriver("FIREFOX");


    @Test
    public void hoteltestlab_test() {
        Helper.setUp(driver, "https://hotel-testlab.coderslab.pl/en/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement signinbutton = driver.findElement(By.xpath("//span[@class='hide_xs']"));
        signinbutton.click();
        Faker fakeValuesService = new Faker();
        String randomEmail = fakeValuesService.bothify("?????######@gmail.com");
        WebElement inputEmailAddress = driver.findElement(By.xpath("//input[@name='email_create']"));
        WebElement createAnAccountButton = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        inputEmailAddress.sendKeys(randomEmail);
        createAnAccountButton.submit();

        WebElement inputfirstname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        WebElement inputlastname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        WebElement inputpassword = driver.findElement(By.xpath("//input[@id='passwd']"));
        WebElement registerNewAccountButton = driver.findElement(By.xpath("//button[@id='submitAccount']"));

        inputfirstname.sendKeys("piotr");
        inputlastname.sendKeys("p");
        inputpassword.sendKeys("12345");
        registerNewAccountButton.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}




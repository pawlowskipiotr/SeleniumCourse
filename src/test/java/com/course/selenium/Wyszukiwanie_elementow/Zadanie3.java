package com.course.selenium.Wyszukiwanie_elementow;

import com.course.selenium.Helper;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class Zadanie3 {
    WebDriver driver = Helper.initializeDriver("FIREFOX");
    String randomEmail;
    FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en_GB"), new RandomService());

    @Test
    public void searchByClass() {
        Helper.setUp(driver, "https://hotel-testlab.coderslab.pl");
        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();
        WebElement fillinputemailaddress = driver.findElement(By.cssSelector(".is_required.validate.account_input.form-control"));
        randomEmail = fakeValuesService.bothify("?????######@gmail.com");
        fillinputemailaddress.sendKeys(randomEmail);
        WebElement createAnAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAnAccountButton.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

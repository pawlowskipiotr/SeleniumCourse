package com.course.selenium.Konfiguracja;


import com.course.selenium.Helper;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Zadanie3 {
    WebDriver driver = Helper.initializeDriver("FIREFOX");

    @Test
    public void forwardingpages() {
        Helper.setUp(driver, "https://www.google.com");
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

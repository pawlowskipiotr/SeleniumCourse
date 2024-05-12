package com.course.selenium.Konfiguracja;


import com.course.selenium.Helper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Zadanie2 {
    WebDriver driver = Helper.initializeDriver("FIREFOX");

    @Test
    public void forwardingpages() {
        Helper.setUp(driver,"https://coderslab.pl/pl");
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.get("https://hotel-testlab.coderslab.pl/en/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

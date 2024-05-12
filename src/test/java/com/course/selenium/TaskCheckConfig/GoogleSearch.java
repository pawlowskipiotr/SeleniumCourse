package com.course.selenium.TaskCheckConfig;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleSearch {
    WebDriver driver = new FirefoxDriver();

    @Test
    public void googlesearchconfig_test() {
        //System.setProperty("webdriver.chrome.driver",
        //        "src/main/resources/drivers/chromedriver.exe");
// wskazanie drivera Firefox
        System.setProperty("webdriver.firefox.driver", "src/main/resources/drivers/geckodriver.exe");

        driver.manage().window().maximize();
        driver.get("http://www.google.com");

        //WebElement elementCookiesWindow = driver.findElement(By.xpath("//button/*[contains(text(),'Zaakceptuj')]"));
        //elementCookiesWindow.click();

        WebElement button = driver.findElement(By.id("W0wltc"));
        button.click();
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
        Assert.assertEquals("Title is incorrect", "Gohogle",driver.getTitle());
    }
@After
    public void tearDown(){
    driver.quit();

}
}


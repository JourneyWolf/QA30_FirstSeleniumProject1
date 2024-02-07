package com_ait_qa30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Home_Work_Find_10_Elements {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByCssSelector() {
        driver.findElement(By.cssSelector(".flyout-cart"));
        driver.findElement(By.cssSelector("#topcartlink"));
        driver.findElement(By.cssSelector(".search-box"));
        driver.findElement(By.cssSelector("h2"));
        driver.findElement(By.cssSelector("#mob-menu-button"));
        driver.findElement(By.cssSelector("[href='/login']"));
        driver.findElement(By.cssSelector("[class='currency-selector']"));
        driver.findElement(By.cssSelector("[type='submit']"));
        driver.findElement(By.cssSelector("[href='/register']"));
        driver.findElement(By.cssSelector("[class='top-menu-triangle']"));
    }

    public void findElementByXpathSelector() {
        driver.findElement(By.xpath("//*[@class='flyout-cart']"));
        driver.findElement(By.xpath("//*[@id='topcartlink']"));
        driver.findElement(By.xpath("//*[@class='search-box']"));
        driver.findElement(By.xpath("//h2"));
        driver.findElement(By.xpath("//*[@id='mob-menu-button']"));
        driver.findElement(By.xpath("//*[@href='/login']"));
        driver.findElement(By.xpath("//*[@class='currency-selector']"));
        driver.findElement(By.xpath("//*[@type='submit']"));
        driver.findElement(By.xpath("//*[@href='/register']"));
        driver.findElement(By.xpath("//*[@class='top-menu-triangle']"));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();

    }
}

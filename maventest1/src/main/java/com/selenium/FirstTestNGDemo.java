package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Yangfengfan
 * @DATE 2020/05/17
 */
public class FirstTestNGDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        WebElement inputBox = driver.findElement(By.id("kw"));
        //Assert.assertTrue(inputBox.isDisplayed());
        inputBox.sendKeys("杨风帆");
        driver.findElement(By.id("su")).click();
        //关闭浏览器
        driver.quit();



    }
}

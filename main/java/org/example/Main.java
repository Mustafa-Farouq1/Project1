package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        WebElement first = driver.findElement(By.id("btn1"));
        first.click();
        Wait<WebDriver> wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait1.until(d-> driver.findElement(By.id("txt1")).isDisplayed());
        driver.findElement(By.id("txt1")).sendKeys("Mustafa");
        WebElement second = driver.findElement(By.id("btn2"));
        second.click();
        Wait<WebDriver> wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(d-> driver.findElement(By.id("txt2")).isDisplayed());
        driver.findElement(By.id("txt2")).sendKeys("Farouq");

        
        /*WebElement second = driver.findElement(By.id("btn2"));
        second.click();
        Wait<WebDriver> wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement txtOne = driver.findElement(By.id("txt1"));
        wait1.until(d-> txtOne.isDisplayed());
        txtOne.sendKeys("Mustafa");
        WebElement txtTwo = driver.findElement(By.id("txt2"));
        wait2.until(d-> txtTwo.isDisplayed());
        txtTwo.sendKeys("Farouq");*/


    }
}
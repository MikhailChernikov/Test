package com.Amazon;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    @Test
    public void test1(){

        System.setProperty("webdriver.chrome.driver", "/users/user/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
        //driver.findElement(By.id("nav-hamburger-menu")).click();
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("twotabsearchtextbox")).submit();
        driver.findElement(By.xpath("//*[@id=\"p_89/HP\"]/span/a/div/label/i")).click();
       // driver.findElement(By.linkText("$50 to $100")).click();
        // driver.quit();



    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Auto_Complete {

    WebDriver driver;

    @BeforeSuite
    public void Setup()

    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABRAR2105\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");

        driver = new ChromeDriver();
    }

    @BeforeClass
    public void Get_url()
    {
        driver.get("https://www.amazon.sa");
        driver.manage().window().maximize();
    }

    @Test
    public void Auto_complete(){

        driver.findElement(By.xpath("//a[@href='/newsearchserviceneed']")).click();

        driver.findElement(By.xpath("//input[@id='autocomplete']")).click();



    }
}

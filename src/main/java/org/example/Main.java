package org.example;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static String calculate(String firstValue, String secondValue) {
        //Set up web driver (chrome, firefox,...)
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Usuario\\Documents\\Ingenieria_de_Sotfware_II\\Laboratorio_05\\geckodriver.exe");

        WebDriver driver = new ChromeDriver();
        //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch website
        driver.navigate().to("http://www.calculator.net/");

        //Maximize the browser
        driver.manage().window().maximize();

        // Click on Math Calculators
        driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();

        // Click on Percent Calculators
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();

        // Enter value 10 in the first number of the percent Calculator
        driver.findElement(By.id("cpar1")).sendKeys(firstValue);
        driver.findElement(By.id("cpar2")).sendKeys(secondValue);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

        String result = driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();

        driver.close();

        return result;
    }
}
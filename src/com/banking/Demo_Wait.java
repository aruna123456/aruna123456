package com.banking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_Wait {
	
	
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	driver.get("https://www.youtube.com/");
	
	//explict wait
	
	WebElement sign = driver.findElement(By.id("search"));
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(sign));
	sign.sendKeys("ghost movie");
	
	
	
}

}

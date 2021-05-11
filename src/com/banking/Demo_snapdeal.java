package com.banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_snapdeal {
	
	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("9790282840");
		
		
		
		
		WebElement cont = driver.findElement(By.id("checkUser"));
		cont.click();
		
		Thread.sleep(12000);
		
		WebElement otp = driver.findElement(By.id("loginUsingOtp"));
		otp.click();
		
		
				}
}

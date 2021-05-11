package com.banking;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("https://www.facebook.com/");
		
		WebElement crt_btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
			crt_btn.click();
			Thread.sleep(5000);
			WebElement fname = driver.findElement(By.xpath("//input[@name='firstname' ]"));
			fname.sendKeys("aruna");
			Thread.sleep(2000);
			WebElement day = driver.findElement(By.id("day"));
			Select s=new Select(day);
			s.selectByValue("22");
			WebElement month = driver.findElement(By.id("month"));
			Select s1=new Select(month);
			s1.selectByVisibleText("Oct");
			WebElement year = driver.findElement(By.name("birthday_year"));
			Select s2=new Select(year);
			s2.selectByIndex(20);
			
			
	}

	
	}
	
	
	
	
	
	
	
	
	
	



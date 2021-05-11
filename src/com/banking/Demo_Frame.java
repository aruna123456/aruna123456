package com.banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Frame {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//iframe
		
		WebElement iframe = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(iframe);
		WebElement iframeinput = driver.findElement(By.xpath("//input[@type='text']"));
		iframeinput.sendKeys("TESTER");
		
		Thread.sleep(3000);
		
		//to get back from the frame
		
		driver.switchTo().defaultContent();
		
		//nested frame
		
		WebElement nestedframe = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		nestedframe.click();
		
		Thread.sleep(3000);
		
		WebElement oframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(oframe);
		WebElement innframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innframe);
		WebElement nested = driver.findElement(By.xpath("//input[@type='text']"));
		nested.sendKeys("nested frame");
		
		driver.switchTo().defaultContent();
		
		WebElement btn = driver.findElement(By.xpath("//a[@href='Widgets.html']"));
		btn.click();
		
		
		
		
	}

}

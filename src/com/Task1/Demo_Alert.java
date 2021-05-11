package com.Task1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Alert {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simple.click();
		Thread.sleep(5000);
		Alert salert = driver.switchTo().alert();
		salert.accept();
		Thread.sleep(5000);
		//confirm alert
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		
		WebElement conbtn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		conbtn.click();
		Thread.sleep(5000);
		Alert calert = driver.switchTo().alert();
		calert.accept();
		Thread.sleep(5000);
		
		//prompt
		
		WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prompt.click();
		Thread.sleep(5000);
		WebElement prtbtn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		prtbtn.click();
		
		Alert prtalert = driver.switchTo().alert();
		prtalert.sendKeys("TESTER");
		prtalert.accept();
		prtbtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}

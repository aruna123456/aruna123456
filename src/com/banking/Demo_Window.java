package com.banking;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Demo_Window {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions ac=new Actions(driver);
		Robot r=new Robot();
		WebElement mob = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		ac.contextClick(mob).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement tdydeal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		ac.contextClick(tdydeal).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fashion = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		ac.contextClick(fashion).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement bestseller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		ac.contextClick(bestseller).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//windows handling
		
	Set<String> windowHandles = driver.getWindowHandles();

	for (String allId : windowHandles) {
		
		String title=driver.switchTo().window(allId).getTitle();
		System.out.println(title);
		
		
	}
	String actualtitle="Amazon.in Today's Deals: Great Savings. Every Day." ; 
			
			for (String actualId : windowHandles) {
		if (driver.switchTo().window(actualId).getTitle().equals(actualtitle)) {
			break;
			
		}
		
	driver.close();
		
	}
	
	
			
		}
		
		
	
	
	
	
	
				
				
				
			}
			
		
		
		
		
		
		


		
		
		
	



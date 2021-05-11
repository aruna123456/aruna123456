package com.banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Move1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		Thread.sleep(3000);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		//move to element
		Actions ac=new Actions(driver);
		ac.moveToElement(women).build().perform();
		WebElement blouse = driver.findElement(By.xpath("//a[@title='Blouses']"));
		ac.click(blouse).build().perform();
		
	}

}

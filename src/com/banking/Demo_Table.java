package com.banking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Table {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		Thread.sleep(3000);
		
		//All datas
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("*******all data*********");
		
		for (WebElement datas : alldata) {
			
			String text = datas.getText();
			System.out.println(text);
			
			
		}
		
		//row data
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		System.out.println("@@@@@@row data@@@@@@@@@");
		for (WebElement row : rowdata) {
			
			String text = row.getText();
			System.out.println(text);
			
			
		}
		
		//column data
		//particular value
		
		WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[5]/td[5]"));
		System.out.println("$$$$$$$$$$column data$$$$$$$$$");
		System.out.println(particular.getText());
		
	}

}

package com.banking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Drop1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement multiple = driver.findElement(By.id("multi-select"));
		Select s=new Select(multiple);
		boolean multiple2 = s.isMultiple();
		System.out.println("is multiple?:"+multiple2);
		System.out.println("************All Options*************");
		List<WebElement> options = s.getOptions();
		
		for (WebElement alloptions : options) {
			String text = alloptions.getText();
			System.out.println(text);
		}
			int size = options.size();
			System.out.println("size:"+size);
			for (int i = 0; i <=size; i++) {
				if (i==1||i==2||i==5) {
					s.selectByIndex(i);
				}
			}
			
					List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
					for (WebElement webElement : allSelectedOptions) {
						
						System.out.println(webElement.getText());
						
						
					}
					
					WebElement fsoption = s.getFirstSelectedOption();
					System.out.println(fsoption.getText());
			}
		}
				
				
				
			
			
		
		
		
		
		
		
		
		
		
		
	



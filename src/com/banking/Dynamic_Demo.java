package com.banking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Demo {
	
	
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirt");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		List<WebElement> all_prize = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		List<Integer>prize_list=new ArrayList<Integer>();
		for (int i = 0; i < all_prize.size(); i++) {
			
			String prize = all_prize.get(i).getText().replace("Rs. ", "");
			int value = Integer.parseInt(prize);
			prize_list.add(value);
			
		}
			System.out.println(prize_list);
			int size = prize_list.size();
			System.out.println("size:"+size);
			System.out.println("minimum value:"+Collections.min(prize_list));
			
		
		
		
		
	
		
		
		
		
	}

}

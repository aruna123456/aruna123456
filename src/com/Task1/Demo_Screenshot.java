package com.Task1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//takesScreenshot
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//sourceFile
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		//destination
		
		File destination = new File("C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\screenshot\\fb.png");
		
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

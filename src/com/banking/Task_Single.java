package com.banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_Single {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fname.sendKeys("aruna");
		WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lname.sendKeys("jothi");
		WebElement addr = driver.findElement(By.xpath("//textarea[@rows='3']"));
		addr.sendKeys("34,ramaswamy street arcot");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("aruna123@gmail.com");
		WebElement mobile = driver.findElement(By.xpath("//input[@type='tel']"));
		mobile.sendKeys("9790282840");
		//WebElement gender = driver.findElement(By.xpath("(//label[@class='col-md-3 col-xs-3 col-sm-3 control-label'])[5]"));
		//gender.click();
		Thread.sleep(5000);
		//WebElement language = driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
		//Select s=new Select(language);
		//s.selectByVisibleText("English");
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s1=new Select(skills);
		s1.selectByVisibleText("Java");
		WebElement country = driver.findElement(By.xpath("(//select[@type='text'])[2]"));
		Select s2=new Select(country);
		s2.selectByVisibleText("India");
		
		//WebElement country1 = driver.findElement(By.id("select2-country-container"));
		//Select s3=new Select(country1);
		//s3.selectByVisibleText("India");
		
		WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		Select s4=new Select(day);
		s4.selectByValue("22");
		WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select s5=new Select(month);
		s5.selectByVisibleText("October");
		WebElement year = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
		Select s6=new Select(year);
		s6.selectByIndex(25);
		WebElement pwd = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		pwd.sendKeys("1234");
		WebElement pwd1 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pwd1.sendKeys("1245");
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}

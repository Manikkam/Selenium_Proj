package com.xpath;

import java.io.File;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractise {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.instagram.com/accounts/login/?hl=en";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
//		WebElement email = driver.findElement(By.name("username"));
//		
//		email.sendKeys("123456");
		
		Thread.sleep(6000);
		
		WebElement em = driver.findElement(By.xpath("//input[@name = 'username']"));
		
		em.sendKeys("9965747548");

		WebElement pass = driver.findElement(By.xpath("//input[@name = 'password']"));
		
		pass.sendKeys("9965747548");
		
		WebElement click = driver.findElement(By.xpath("//div[text()='Log In']"));
		
		click.click();
				
	}

}

package com.Screenshot;

import java.io.File;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrrenshotPractise {
	
	public static void main(String[] args) throws InterruptedException {
	
	String url = "https://www.facebook.com/";
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	
	driver.get("https://www.google.com");
	
	driver.manage().window().maximize();
	
	driver.get(url);
	
	WebElement email = driver.findElement(By.xpath("//input[@name = 'email']"));
	
	email.sendKeys("8015891720");
	
	WebElement pass = driver.findElement(By.xpath("//input[@id = 'pass']"));
	
	pass.sendKeys("Java2022");
	
	WebElement click = driver.findElement(By.xpath("//button[@type = 'submit']"));
	
	click.click();
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	
	File des = new File("C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\Screenshot\\Screenshot_1.png");
	


	
	}


}

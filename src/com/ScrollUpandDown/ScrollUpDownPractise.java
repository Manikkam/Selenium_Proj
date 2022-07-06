package com.ScrollUpandDown;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollUpDownPractise {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String url = "https://www.amazon.in/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\badri\\SeliniumCourse\\"
				+ "SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		je.executeScript("window.scrollBy(0,2500);");
		
		Thread.sleep(3000);
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		File src = sc.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\"
				+ "Screenshot\\Screenshot_1.png");
		
		FileHandler.copy(src, des);

		JavascriptExecutor jev = (JavascriptExecutor) driver;
		
		jev.executeScript("window.scrollBy(0,-2500);");
		

	
	}

}

package com.browserlaunch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchTesting {
	
	public static void main(String[] args) {
		
		String url = "https://www.redbus.in/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.get(url);

		
//		driver.navigate().to("https://www.instagram.com");
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
//				
//		String tit = driver.getTitle();
//		
//		System.out.println(tit);
//		
//		String URL = driver.getCurrentUrl();
//		
//		System.out.println(URL);
		
		WebElement email = driver.findElement(By.id("src"));
		
		email.sendKeys("Chennai");

		WebElement dest = driver.findElement(By.id("dest"));
		
		dest.sendKeys("Madurai");
		
		WebElement date = driver.findElement(By.id("onward_cal"));
		
		date.sendKeys("15-Apr-2022");
		
		
	}

}

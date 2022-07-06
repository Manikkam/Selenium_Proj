package com.testcasepractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasePracrise {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.instagram.com/accounts/login/?hl=en";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//input[@aria-required = 'true']"));
		
		login.sendKeys("9965747548");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name = 'password']"));
		
		pass.sendKeys("9965747548");
		
		WebElement click = driver.findElement(By.xpath("//div[text()='Log In']"));
		
		click.click();
		
		WebElement signup = driver.findElement(By.xpath("//span[text()='Sign up']"));
		
		signup.click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}

package com.project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class FaceBookProject {

	public static void main(String[] args) throws InterruptedException, IOException {

		String url = "https://www.facebook.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.get(url);
				
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		click.click();
		
		Thread.sleep(3000);
		
		WebElement FN = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		
		FN.sendKeys("Manik");

		WebElement LN = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		
		LN.sendKeys("P");
		
		WebElement mail = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		
		mail.sendKeys("manik110891@gmail.com");
		
		WebElement mail1 = driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']"));
		
		mail1.sendKeys("manik110891@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
		
		pass.sendKeys("9965747548");
		
		WebElement date = driver.findElement(By.xpath("//select[@title = 'Day']"));
		
		Select sc1 = new Select(date);
		
		sc1.selectByIndex(10);
		
		WebElement day = driver.findElement(By.xpath("//select[@title = 'Month']"));
		
		Select sc2 = new Select(day);
		
		sc2.selectByIndex(7);
		
		WebElement year = driver.findElement(By.xpath("//select[@title = 'Year']"));
		
		Select sc3 = new Select(year);
		
		sc3.selectByVisibleText("1991");
		
		WebElement gender = driver.findElement(By.xpath("//label[text() = 'Male']"));
		
		gender.click();
		
		WebElement sign = driver.findElement(By.xpath("//button[@name = 'websubmit']"));
		
		sign.click();
		
		Thread.sleep(8000);
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		File img = sc.getScreenshotAs(OutputType.FILE);
		
		File page = new File("C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\Screenshot\\Sc.png");
		
		FileHandler.copy(img, page);
			
	
	}

}

package com.secondproject;

import java.io.File;
import java.io.IOException;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AdactinWebsite {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		
		user.sendKeys("Manikkam");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type = 'password']"));
		
		pass.sendKeys("271FZ7");
		
		WebElement login = driver.findElement(By.xpath("//input[@name = 'login']"));
		
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		
		Select lc = new Select(location);
		
		lc.selectByIndex(3);
		
		WebElement hotels = driver.findElement(By.xpath("//select[@name = 'hotels']"));
		
		Select ht = new Select(hotels);
		
		ht.selectByIndex(3);

		WebElement room = driver.findElement(By.xpath("//select[@name = 'room_type']"));
		
		Select rm = new Select(room);
		
		rm.selectByVisibleText("Deluxe");
		
		WebElement search = driver.findElement(By.id("Submit"));
		
		search.click();
		
		WebElement clk = driver.findElement(By.xpath("//input[@type = 'radio']"));
		
		clk.click();
		
		WebElement cont = driver.findElement(By.xpath("//input[@value = 'Continue']"));
		
		cont.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@name = 'first_name']"));
		
		name.sendKeys("Manikkam");
		
		WebElement lname = driver.findElement(By.xpath("//input[@name = 'last_name']"));
		
		lname.sendKeys("Prabakaran");
		
		WebElement add = driver.findElement(By.xpath("//textarea[@name = 'address']"));
		
		add.sendKeys("Chennai");
		
		WebElement ccn = driver.findElement(By.xpath("//input[@name = 'cc_num']"));
		
		ccn.sendKeys("1234567899876543");
		
		WebElement cardtype = driver.findElement(By.xpath("//select[@name = 'cc_type']"));
		
		Select sl1 = new Select(cardtype);
		
		sl1.selectByVisibleText("VISA");
		
		WebElement exdate = driver.findElement(By.xpath("//select[@name = 'cc_exp_month']"));
		
		Select sl2 = new Select(exdate);
		
		sl2.selectByVisibleText("December");
		
		WebElement exyear = driver.findElement(By.xpath("//select[@name = 'cc_exp_year']"));
		
		Select sl3 = new Select(exyear);
		
		sl3.selectByVisibleText("2022");		

		WebElement cvv = driver.findElement(By.xpath("//input[@name = 'cc_cvv']"));
		
		cvv.sendKeys("123");
		
		WebElement book = driver.findElement(By.xpath("//input[@name = 'book_now']"));
		
		book.click();	
		
		Thread.sleep(5000);
	
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		File img = sc.getScreenshotAs(OutputType.FILE);
		
		File page = new File("C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\Screenshot\\Sc.png");
		
		FileHandler.copy(img, page);


	}

}

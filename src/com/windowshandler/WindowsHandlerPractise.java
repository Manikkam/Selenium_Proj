package com.windowshandler;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class WindowsHandlerPractise {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//ChromeDriver//chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement topoffers = driver.findElement(By.xpath("//a[text() = 'Best Sellers']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(topoffers).build().perform();
		
		Robot robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		WebElement mobiles = driver.findElement(By.xpath("//a[text() = 'Mobiles']"));
		
		act.contextClick(mobiles).build().perform();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);

		WebElement cs = driver.findElement(By.xpath("//a[text() = 'Customer Service']"));
		
		act.contextClick(cs).build().perform();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		WebElement td = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
		
		act.contextClick(td).build().perform();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		String pw = driver.getWindowHandle();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String cp : allwindows) {
			
		String tit = driver.switchTo().window(cp).getTitle();
		
		System.out.println(tit);
		}
		
		String tit3 = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		
		for (String cp: allwindows) {
			
			if(driver.switchTo().window(cp).getTitle().equals(tit3)) {
				
				break;
			}
		}		

		Thread.sleep(5000);	
	
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		File src = sc.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\"
				+ "Screenshot\\Screenshot_1.png");
		
		FileHandler.copy(src, des);
		

		String tit2 = "Amazon.in - Today's Deals";
			
			for (String cp: allwindows) {
				
				if(driver.switchTo().window(cp).getTitle().equals(tit2)) {
					
					break;
				}
				
			}
			
			Thread.sleep(5000);
			
			TakesScreenshot sc1 = (TakesScreenshot) driver;
			
			File src1 = sc1.getScreenshotAs(OutputType.FILE);
			
			File des1 = new File("C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\"
					+ "Screenshot\\Screenshot_2.png");
			
			FileHandler.copy(src1, des1);
			
			String tit1 = "Amazon.in Bestsellers: The most popular items on Amazon";
				
				for (String cp: allwindows) {
					
					if(driver.switchTo().window(cp).getTitle().equals(tit1)) {
						
						break;
					}

	}
				
				Thread.sleep(5000);
				
				TakesScreenshot sc2 = (TakesScreenshot) driver;
				
				File src2 = sc2.getScreenshotAs(OutputType.FILE);
				
				File des2 = new File("C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\"
						+ "Screenshot\\Screenshot_3.png");
				
				FileHandler.copy(src2, des2);				

				for (String cp : allwindows) {
					
					if(!cp.equals(pw)) {
						
						driver.switchTo().window(cp);
						
						driver.close();
					}
				}
		
	}		
}


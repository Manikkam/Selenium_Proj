package com.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramePractise {

	public static void main(String[] args) {
		
		String url = "http://demo.automationtesting.in/Frames.html";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id = 'singleframe']"));
		
		driver.switchTo().frame(iframe1);
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@type = 'text'])[1]"));
		
		textbox.sendKeys("Manikkam");
		
		driver.switchTo().defaultContent();
		
		WebElement multi = driver.findElement(By.xpath("(//a[@class = 'analystic'])[2]"));
		
		multi.click();
		
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@src= 'MultipleFrames.html']"));
		
		driver.switchTo().frame(iframe2);
		
		WebElement iframe3 = driver.findElement(By.xpath("(//iframe[@src= 'SingleFrame.html'])[1]"));
		
		driver.switchTo().frame(iframe3);
		
		WebElement textbox2 = driver.findElement(By.xpath("(//input[@type= 'text'])[1]"));
		
		textbox2.sendKeys("Manikkam");
		
		driver.switchTo().defaultContent();
		
		WebElement webtable = driver.findElement(By.xpath("//a[@href='WebTable.html']"));
		
		webtable.click();
		
		
		

	}

}

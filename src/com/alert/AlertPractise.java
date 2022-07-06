package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractise {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://demo.automationtesting.in/Alerts.html";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		WebElement alert1 = driver.findElement(By.xpath("//a[@href='#OKTab']"));
		
		alert1.click();
		
		WebElement button = driver.findElement(By.xpath("//button[@onclick = 'alertbox()']"));
		
		button.click();
		
		Thread.sleep(3000);
		
		Alert a1 = driver.switchTo().alert();
		
		a1.accept();
		
		WebElement alert2 = driver.findElement(By.xpath("//a[@href = '#CancelTab']"));
		
		alert2.click();
		
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick = 'confirmbox()']"));
		
		button1.click();
		
		Thread.sleep(3000);
		
		Alert a2 = driver.switchTo().alert();
		
		a2.dismiss();
		
		
		WebElement alert3 = driver.findElement(By.xpath("//a[@href = '#Textbox']"));
		
		alert3.click();
		
		WebElement button3 = driver.findElement(By.xpath("//button[@onclick = 'promptbox()']"));
		
		button3.click();
		
		Thread.sleep(3000);
		
		Alert a3 = driver.switchTo().alert();
		
		a3.accept();		
	}

}

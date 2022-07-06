package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropPractice {
		
		public static void main(String[] args) {
			
			String url = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\badri\\SeliniumCourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			driver.manage().window().maximize();
			
			driver.get(url);
			
			WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
			
			WebElement norway = driver.findElement(By.xpath("//div[text()='Norway']"));
			
			Actions act = new Actions(driver);
			
			act.dragAndDrop(oslo, norway).build().perform();
			
			WebElement Stockholm = driver.findElement(By.xpath("//div[contains(@id, 'box2')]"));
			
			WebElement Sweden = driver.findElement(By.xpath("//div[contains(@id, 'box102')]"));
			
			Actions act1 = new Actions(driver);
			
			act1.dragAndDrop(Stockholm, Sweden).build().perform();			

			WebElement Washington = driver.findElement(By.xpath("//div[@id='box3']"));
			
			WebElement US = driver.findElement(By.xpath("//div[contains(@id, 'box103')]"));
			
			Actions act2 = new Actions(driver);
			
			act2.dragAndDrop(Washington, US).build().perform();			

			WebElement Copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));
			
			WebElement Denmark = driver.findElement(By.xpath("//div[contains(@id, 'box104')]"));
			
			Actions act3 = new Actions(driver);
			
			act3.dragAndDrop(Copenhagen, Denmark).build().perform();			
			
			WebElement Seoul = driver.findElement(By.xpath("//div[@id='box5']"));
			
			WebElement SK = driver.findElement(By.xpath("//div[contains(@id, 'box105')]"));
			
			Actions act4 = new Actions(driver);
			
			act4.dragAndDrop(Seoul, SK).build().perform();			
			
			WebElement Rome = driver.findElement(By.xpath("//div[@id='box6']"));
			
			WebElement Italy = driver.findElement(By.xpath("//div[contains(@id, 'box106')]"));
			
			Actions act5 = new Actions(driver);
			
			act5.dragAndDrop(Rome, Italy).build().perform();			
			
			WebElement Madrid = driver.findElement(By.xpath("//div[@id='box7']"));
			
			WebElement Spain = driver.findElement(By.xpath("//div[contains(@id, 'box107')]"));
			
			Actions act6 = new Actions(driver);
			
			act6.dragAndDrop(Madrid, Spain).build().perform();			

			
			
	}

}
